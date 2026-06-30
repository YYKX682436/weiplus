package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f162987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f162988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 f162989h;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f162989h = v0Var;
        this.f162985d = str;
        this.f162986e = e9Var;
        this.f162987f = i17;
        this.f162988g = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var = this.f162989h;
        if (v0Var.f163031o.containsKey(v0Var.f163030n)) {
            v0Var.f163033q.f226127p = (java.lang.String) v0Var.f163031o.get(v0Var.f163030n);
            java.lang.String str = v0Var.f163030n;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "app: %s, poiId:%s", str, v0Var.f163031o.get(str));
        }
        ((za3.d) v0Var.f163035s).g(v0Var.f163033q, v0Var.f163034r, this.f162985d, false, false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.util.HashMap hashMap = (java.util.HashMap) v0Var.f163027h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162986e;
        g0Var.d(12809, 25, hashMap.get(this.f162985d), "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.E(v0Var, e9Var, this.f162987f, v0Var.o("ok"));
        this.f162988g.q();
        v0Var.f163036t = false;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
