package pg3;

@j95.b
/* loaded from: classes2.dex */
public final class v extends i95.w implements n40.n {

    /* renamed from: e, reason: collision with root package name */
    public boolean f435760e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f435759d = "MicroMsg.LongVideoReddotService";

    /* renamed from: f, reason: collision with root package name */
    public final pg3.s f435761f = new pg3.s();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435759d, "LongVideo-Trace, startReddotObserver");
        pm0.v.X(new pg3.u(this));
        qg3.p1 p1Var = (qg3.p1) qg3.p1.f444376d.a();
        pg3.s listener = this.f435761f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        p3380x6a61f93.p3383xf5152754.C30543x21b0c8c8.m169771x21b854b7(p1Var.m105978x2737f10(), listener);
    }

    public void wi(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435759d, "LongVideo-Trace, invalid Reddot Observer: " + z17);
        this.f435760e = z17;
    }
}
