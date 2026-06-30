package pc;

/* loaded from: classes14.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public android.os.HandlerThread f434747a;

    /* renamed from: b, reason: collision with root package name */
    public volatile pc.n f434748b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f434749c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f434750d = "";

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f434751e;

    public o() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f434751e = linkedList;
        linkedList.clear();
    }

    public final void a() {
        if (this.f434748b == null) {
            return;
        }
        this.f434748b.removeMessages(1);
        this.f434748b = null;
        android.os.HandlerThread handlerThread = this.f434747a;
        if (handlerThread == null || !handlerThread.isAlive()) {
            return;
        }
        this.f434747a.quitSafely();
    }
}
