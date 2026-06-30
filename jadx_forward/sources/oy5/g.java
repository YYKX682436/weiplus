package oy5;

/* loaded from: classes10.dex */
public final class g implements oy5.b {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f431628a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.HandlerThread f431629b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0 f431630c = new com.tme.p3259xc83515e4.p3262x153e1c29.C28067x2b2da9c0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f431631d = "pitch_Module";

    /* renamed from: e, reason: collision with root package name */
    public android.os.Handler f431632e;

    /* renamed from: f, reason: collision with root package name */
    public android.os.HandlerThread f431633f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f431634g;

    public g(yz5.l lVar, android.os.HandlerThread handlerThread) {
        this.f431628a = lVar;
        this.f431629b = handlerThread;
    }

    public int a() {
        boolean z17;
        com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65793x233c02ec.getClass();
        z17 = com.tme.p3259xc83515e4.p3262x153e1c29.C28072x8da3a6e0.f65794x141089db;
        if (!z17) {
            return -1000;
        }
        android.os.Handler handler = this.f431632e;
        if (handler == null) {
            return 0;
        }
        if (handler == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pitchHandler");
            throw null;
        }
        handler.removeCallbacksAndMessages(null);
        android.os.Handler handler2 = this.f431632e;
        if (handler2 != null) {
            handler2.post(new java.lang.Runnable() { // from class: oy5.g$$c
                @Override // java.lang.Runnable
                public final void run() {
                    oy5.g this$0 = oy5.g.this;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
                    this$0.f431630c.m122266xcdd7f349();
                    android.os.HandlerThread handlerThread = this$0.f431633f;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                }
            });
            return 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pitchHandler");
        throw null;
    }
}
