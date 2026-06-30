package gp2;

/* loaded from: classes10.dex */
public final class l implements ne2.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f355771b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f355772c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f355773d;

    public l(gp2.l0 l0Var, int i17, long j17, android.view.View view) {
        this.f355770a = l0Var;
        this.f355771b = i17;
        this.f355772c = j17;
        this.f355773d = view;
    }

    @Override // ne2.d
    public void a(r45.q84 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        gp2.l0 l0Var = this.f355770a;
        java.lang.String t17 = l0Var.t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoPlay pos:");
        int i17 = this.f355771b;
        sb6.append(i17);
        sb6.append(" liveId=");
        sb6.append(this.f355772c);
        sb6.append(" charge_live liveFreeTimeManager callback freeTomeToWatch=");
        sb6.append(info.m75939xb282bd08(1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t17, sb6.toString());
        if (info.m75939xb282bd08(1) <= 0) {
            l0Var.L(i17);
            l0Var.h(i17, this.f355773d);
        }
    }
}
