package mm2;

/* loaded from: classes3.dex */
public final class n1 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.s1 f410810d;

    public n1(mm2.s1 s1Var) {
        this.f410810d = s1Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        r45.z53 z53Var;
        r45.z53 z53Var2;
        r45.n73 n73Var = (r45.n73) obj;
        mm2.s1 s1Var = this.f410810d;
        java.lang.String str = s1Var.f410919f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#initPrepareData gameAppInfo collect: name=");
        sb6.append((n73Var == null || (z53Var2 = (r45.z53) n73Var.m75936x14adae67(1)) == null) ? null : z53Var2.m75945x2fec8307(1));
        sb6.append(" game_type=");
        sb6.append((n73Var == null || (z53Var = (r45.z53) n73Var.m75936x14adae67(1)) == null) ? null : new java.lang.Integer(z53Var.m75939xb282bd08(13)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (n73Var != null) {
            mm2.c1 c1Var = (mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class);
            r45.z53 z53Var3 = (r45.z53) n73Var.m75936x14adae67(1);
            c1Var.f410316b5 = z53Var3 != null ? z53Var3.m75945x2fec8307(0) : null;
            mm2.c1 c1Var2 = (mm2.c1) s1Var.m147920xbba4bfc0(mm2.c1.class);
            r45.z53 z53Var4 = (r45.z53) n73Var.m75936x14adae67(1);
            c1Var2.Y4 = z53Var4 != null && z53Var4.m75939xb282bd08(13) == 1;
            ((mm2.g1) s1Var.m147920xbba4bfc0(mm2.g1.class)).V6(n73Var);
        }
        s1Var.V6(n73Var);
        return jz5.f0.f384359a;
    }
}
