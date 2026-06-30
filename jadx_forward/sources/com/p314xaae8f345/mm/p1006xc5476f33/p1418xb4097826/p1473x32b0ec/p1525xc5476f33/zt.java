package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class zt implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv f196910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f196911e;

    public zt(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar, yz5.a aVar) {
        this.f196910d = ivVar;
        this.f196911e = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.iv ivVar = this.f196910d;
        if (itemId != ivVar.f194552u) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = ivVar.f194547p1;
            if (k0Var != null) {
                k0Var.u();
                return;
            }
            return;
        }
        this.f196911e.mo152xb9724478();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = ivVar.f194547p1;
        if (k0Var2 != null) {
            k0Var2.u();
        }
        if (ivVar.f194548q.mo11219xd0598cf8() == 1) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.T.f409207u++;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.b3[] b3VarArr = ml2.b3.f408747d;
            java.lang.String valueOf = java.lang.String.valueOf(5);
            r45.xn1 xn1Var = ivVar.f194559y0;
            if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            jSONObject.put(valueOf, str);
            ml2.z4 z4Var = ml2.z4.f409889i;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            if (y4Var.W) {
                z4Var = ml2.z4.f409897n;
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, z4Var, jSONObject.toString(), null, 4, null);
        }
    }
}
