package df2;

/* loaded from: classes3.dex */
public final class yq implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ar f313422d;

    public yq(df2.ar arVar) {
        this.f313422d = arVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onTimerUpdate remainTime:");
        df2.ar arVar = this.f313422d;
        sb6.append(((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) arVar.f311275r).mo144003x754a37bb()).intValue());
        sb6.append(", statue = ");
        r45.lv1 lv1Var = arVar.f311279v;
        sb6.append(lv1Var != null ? java.lang.Integer.valueOf(lv1Var.m75939xb282bd08(6)) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(arVar.f311270m, sb6.toString());
        r45.lv1 lv1Var2 = arVar.f311279v;
        if (lv1Var2 != null && lv1Var2.m75939xb282bd08(6) == 1) {
            pm0.v.X(new df2.sq(arVar));
        } else {
            arVar.f311274q.d();
        }
        return true;
    }
}
