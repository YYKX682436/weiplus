package zf0;

/* loaded from: classes12.dex */
public final class q0 implements xf0.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f554044d;

    public q0(zf0.v0 v0Var) {
        this.f554044d = v0Var;
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        zf0.v0 v0Var = this.f554044d;
        java.lang.Integer e17 = qi3.c.e(v0Var, false, 1, null);
        if (e17 != null) {
            e17.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " cancel download video");
            ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ai(event.f535699a.f535710e);
        }
    }
}
