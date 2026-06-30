package te2;

/* loaded from: classes.dex */
public final class ja implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f499679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f499680e;

    public ja(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, te2.hc hcVar) {
        this.f499679d = k0Var;
        this.f499680e = hcVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        java.lang.String m75945x2fec83073;
        java.lang.String m75945x2fec83074;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f499679d;
        java.lang.String str = "";
        te2.hc hcVar = this.f499680e;
        if (valueOf != null && valueOf.intValue() == 0) {
            te2.hc hcVar2 = this.f499680e;
            pf5.e.m158344xbe96bc24(hcVar2, null, null, new te2.pa(hcVar2, null), 3, null);
            java.util.HashMap hashMap = new java.util.HashMap();
            r45.h32 h32Var = hcVar.f499601J;
            if (h32Var != null && (m75945x2fec83074 = h32Var.m75945x2fec8307(4)) != null) {
                str = m75945x2fec83074;
            }
            hashMap.put("notice_id", str);
            hashMap.put("type", "1");
            i95.m c17 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.f409540y2, hashMap, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            te2.hc hcVar3 = this.f499680e;
            pf5.e.m158344xbe96bc24(hcVar3, null, null, new te2.qa(hcVar3, null), 3, null);
            java.util.HashMap hashMap2 = new java.util.HashMap();
            r45.h32 h32Var2 = hcVar.f499601J;
            if (h32Var2 != null && (m75945x2fec83073 = h32Var2.m75945x2fec8307(4)) != null) {
                str = m75945x2fec83073;
            }
            hashMap2.put("notice_id", str);
            hashMap2.put("type", "2");
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.f409540y2, hashMap2, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            te2.hc hcVar4 = this.f499680e;
            pf5.e.m158344xbe96bc24(hcVar4, null, null, new te2.ha(hcVar4, null), 3, null);
            java.util.HashMap hashMap3 = new java.util.HashMap();
            r45.h32 h32Var3 = hcVar.f499601J;
            if (h32Var3 != null && (m75945x2fec83072 = h32Var3.m75945x2fec8307(4)) != null) {
                str = m75945x2fec83072;
            }
            hashMap3.put("notice_id", str);
            hashMap3.put("type", "4");
            i95.m c19 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            zy2.zb.T8((zy2.zb) c19, ml2.t1.f409540y2, hashMap3, null, "200", null, null, false, 116, null);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            te2.hc hcVar5 = this.f499680e;
            pf5.e.m158344xbe96bc24(hcVar5, null, null, new te2.na(hcVar5, k0Var, null), 3, null);
            java.util.HashMap hashMap4 = new java.util.HashMap();
            r45.h32 h32Var4 = hcVar.f499601J;
            if (h32Var4 != null && (m75945x2fec8307 = h32Var4.m75945x2fec8307(4)) != null) {
                str = m75945x2fec8307;
            }
            hashMap4.put("notice_id", str);
            hashMap4.put("type", "3");
            i95.m c27 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c27, "getService(...)");
            zy2.zb.T8((zy2.zb) c27, ml2.t1.f409540y2, hashMap4, null, "200", null, null, false, 116, null);
        }
        k0Var.u();
    }
}
