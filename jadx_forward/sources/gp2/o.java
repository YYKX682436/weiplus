package gp2;

/* loaded from: classes3.dex */
public final class o implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355816a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f355817b;

    public o(gp2.l0 l0Var, long j17) {
        this.f355816a = l0Var;
        this.f355817b = j17;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        gp2.l0 l0Var = this.f355816a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.t(), "checkAutoPlayByOutside: liveId=" + this.f355817b + " charge_live liveFreeTimeManager callback freeTomeToWatch=" + info.m75939xb282bd08(1));
        if (info.m75939xb282bd08(1) <= 0) {
            c50.m0.b(l0Var, null, 1, null);
        }
    }
}
