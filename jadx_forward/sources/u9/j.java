package u9;

/* loaded from: classes13.dex */
public final class j implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {

    /* renamed from: h, reason: collision with root package name */
    public static final u9.j f507287h = new u9.j();

    /* renamed from: d, reason: collision with root package name */
    public volatile long f507288d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f507289e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Choreographer f507290f;

    /* renamed from: g, reason: collision with root package name */
    public int f507291g;

    public j() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper(), this);
        this.f507289e = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j17) {
        this.f507288d = j17;
        this.f507290f.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        int i17 = message.what;
        if (i17 == 0) {
            this.f507290f = android.view.Choreographer.getInstance();
            return true;
        }
        if (i17 == 1) {
            int i18 = this.f507291g + 1;
            this.f507291g = i18;
            if (i18 == 1) {
                this.f507290f.postFrameCallback(this);
            }
            return true;
        }
        if (i17 != 2) {
            return false;
        }
        int i19 = this.f507291g - 1;
        this.f507291g = i19;
        if (i19 == 0) {
            this.f507290f.removeFrameCallback(this);
            this.f507288d = 0L;
        }
        return true;
    }
}
