package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f162991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f162994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 f162995h;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, java.lang.String str, int i17) {
        this.f162995h = v0Var;
        this.f162991d = y1Var;
        this.f162992e = e9Var;
        this.f162993f = str;
        this.f162994g = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f162991d.q();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var = this.f162995h;
        v0Var.f163036t = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "click tencent map: %s", java.lang.Boolean.valueOf(((java.util.HashMap) v0Var.f163027h).containsKey("com.tencent.map")));
        boolean H = v0Var.H();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162992e;
        if (H) {
            if (v0Var.f163031o.containsKey("tencent")) {
                v0Var.f163033q.f226127p = (java.lang.String) v0Var.f163031o.get("tencent");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "poiid:%s", v0Var.f163033q.f226127p);
            }
            ((za3.d) v0Var.f163035s).g(v0Var.f163033q, v0Var.f163034r, "com.tencent.map", false, false);
        } else {
            v0Var.getClass();
            gw4.f fVar = new gw4.f(e9Var.Z0());
            fVar.f357690b = "mmdownloadapp_JjNedmtv7FDUquSYR5";
            ((fw4.l) ((gw4.g) i95.n0.c(gw4.g.class))).wi(fVar, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12809, 25, this.f162993f, "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.E(v0Var, e9Var, this.f162994g, v0Var.o("ok"));
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
