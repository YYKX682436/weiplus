package te2;

/* loaded from: classes3.dex */
public final class r4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f499912e;

    public r4(te2.p8 p8Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f499911d = p8Var;
        this.f499912e = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        te2.p8 p8Var = this.f499911d;
        if (valueOf != null && valueOf.intValue() == 0) {
            te2.p8 p8Var2 = this.f499911d;
            pf5.e.m158344xbe96bc24(p8Var2, null, null, new te2.x4(p8Var2, null), 3, null);
            if (!p8Var.A1.f499923a) {
                i95.m c17 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.y2 y2Var = ml2.y2.f409792o;
                cl0.g gVar = new cl0.g();
                gVar.o("type", 2);
                gVar.o("style_id", p8Var.f499862x0);
                java.lang.String str = p8Var.f499866y1;
                gVar.o("is_pic", ((str == null || str.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar2 = gVar.toString();
                r45.h32 h32Var = p8Var.A1.f499924b;
                zy2.zb.qg(zbVar, y2Var, gVar2, (h32Var == null || (m75945x2fec83072 = h32Var.m75945x2fec8307(3)) == null) ? "" : m75945x2fec83072, null, 8, null);
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            te2.p8 p8Var3 = this.f499911d;
            pf5.e.m158344xbe96bc24(p8Var3, null, null, new te2.y4(p8Var3, null), 3, null);
            if (!p8Var.A1.f499923a) {
                i95.m c18 = i95.n0.c(zy2.zb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.y2 y2Var2 = ml2.y2.f409792o;
                cl0.g gVar3 = new cl0.g();
                gVar3.o("type", 1);
                gVar3.o("style_id", p8Var.f499862x0);
                java.lang.String str2 = p8Var.f499866y1;
                gVar3.o("is_pic", ((str2 == null || str2.length() == 0) ? 1 : 0) ^ 1);
                java.lang.String gVar4 = gVar3.toString();
                r45.h32 h32Var2 = p8Var.A1.f499924b;
                zy2.zb.qg(zbVar2, y2Var2, gVar4, (h32Var2 == null || (m75945x2fec8307 = h32Var2.m75945x2fec8307(3)) == null) ? "" : m75945x2fec8307, null, 8, null);
            }
        } else if (valueOf != null && valueOf.intValue() == 2) {
            te2.p8 p8Var4 = this.f499911d;
            pf5.e.m158344xbe96bc24(p8Var4, null, null, new te2.n4(p8Var4, null), 3, null);
        }
        this.f499912e.u();
    }
}
