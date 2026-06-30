package jz3;

/* loaded from: classes12.dex */
public class a extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public a() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        java.lang.String str;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0 c5227x1de104c0 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5227x1de104c0) abstractC20979x809547d1;
        java.util.HashMap hashMap = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240658o;
        java.util.HashMap hashMap2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240659p;
        java.util.HashMap hashMap3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.q0.class)).f240660q;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2 p2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.p2) hashMap.get(java.lang.Integer.valueOf(c5227x1de104c0.f135560g.f89291b));
        if (p2Var != null && (str = p2Var.f240513f) != null && !str.isEmpty()) {
            e04.t2 t2Var = e04.t2.f327639a;
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ni(str);
        }
        am.r1 r1Var = c5227x1de104c0.f135560g;
        if (r1Var.f89290a != 1 || !hashMap.containsKey(java.lang.Integer.valueOf(r1Var.f89291b))) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CancelTranslationListener", "cancel translate sessionId %d", java.lang.Integer.valueOf(r1Var.f89291b));
        hashMap.remove(java.lang.Integer.valueOf(r1Var.f89291b));
        if (!hashMap2.containsKey(java.lang.Integer.valueOf(r1Var.f89291b)) || !hashMap3.containsKey(java.lang.Integer.valueOf(r1Var.f89291b))) {
            return true;
        }
        ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) hashMap2.get(java.lang.Integer.valueOf(r1Var.f89291b))).f141280f = 2L;
        ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) hashMap2.get(java.lang.Integer.valueOf(r1Var.f89291b))).f141283i = java.lang.System.currentTimeMillis() - ((java.lang.Long) hashMap3.get(java.lang.Integer.valueOf(r1Var.f89291b))).longValue();
        ((com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6797x4bb2039) hashMap2.get(java.lang.Integer.valueOf(r1Var.f89291b))).k();
        hashMap2.remove(java.lang.Integer.valueOf(r1Var.f89291b));
        hashMap3.remove(java.lang.Integer.valueOf(r1Var.f89291b));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CancelTranslationListener", "translationReports size %d, translationUpload size %d", java.lang.Integer.valueOf(hashMap2.size()), java.lang.Integer.valueOf(hashMap3.size()));
        return true;
    }
}
