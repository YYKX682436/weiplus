package te2;

/* loaded from: classes3.dex */
public final class s4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f499933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499934e;

    public s4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, te2.p8 p8Var) {
        this.f499933d = k0Var;
        this.f499934e = p8Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf != null && valueOf.intValue() == 3) {
            te2.p8 p8Var = this.f499934e;
            if (p8Var.A1.f499923a) {
                ml2.c3[] c3VarArr = ml2.c3.f408864d;
                p8Var.o7(5);
            } else {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.y2 y2Var = ml2.y2.f409790m;
                cl0.g gVar = new cl0.g();
                gVar.o("style_id", p8Var.f499862x0);
                java.lang.String str2 = p8Var.f499866y1;
                gVar.o("is_pic", ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar2 = gVar.toString();
                r45.h32 h32Var = p8Var.A1.f499924b;
                if (h32Var == null || (str = h32Var.m75945x2fec8307(3)) == null) {
                    str = "";
                }
                zy2.zb.qg(zbVar, y2Var, gVar2, str, null, 8, null);
            }
            pf5.e.m158344xbe96bc24(p8Var, null, null, new te2.o4(p8Var, null), 3, null);
        }
        this.f499933d.u();
    }
}
