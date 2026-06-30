package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes13.dex */
public class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map.Entry f162998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f163000h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f163001i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 f163002m;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var, int i17, java.lang.String str, java.util.Map.Entry entry, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i18, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f163002m = v0Var;
        this.f162996d = i17;
        this.f162997e = str;
        this.f162998f = entry;
        this.f162999g = e9Var;
        this.f163000h = i18;
        this.f163001i = y1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0 v0Var = this.f163002m;
        int size = ((java.util.HashMap) v0Var.f163027h).size();
        java.util.Map.Entry entry = this.f162998f;
        if (this.f162996d < size) {
            java.util.HashMap hashMap = v0Var.f163031o;
            java.lang.String str = this.f162997e;
            if (hashMap.containsKey(str)) {
                v0Var.f163033q.f226127p = (java.lang.String) v0Var.f163031o.get(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMapApp", "app: %s, poiId:%s", str, v0Var.f163031o.get(str));
            }
            ((za3.d) v0Var.f163035s).g(v0Var.f163033q, v0Var.f163034r, (java.lang.String) entry.getKey(), false, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162999g;
        g0Var.d(12809, 25, entry.getValue(), "", "", "", 4, java.lang.Integer.valueOf(v0Var.H() ? 1 : 0), e9Var.mo48798x74292566());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.v0.E(v0Var, e9Var, this.f163000h, v0Var.o("ok"));
        this.f163001i.q();
        v0Var.f163036t = false;
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/lbs/JsApiOpenMapApp$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
