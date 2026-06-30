package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes7.dex */
public final class z2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f268231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f268232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f268233f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(android.app.Activity activity, nw4.k kVar, nw4.y2 y2Var) {
        super(0);
        this.f268231d = activity;
        this.f268232e = kVar;
        this.f268233f = y2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Rect m17;
        pw4.c cVar;
        yz5.a aVar;
        nw4.k env = this.f268232e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        android.app.Activity activity = this.f268231d;
        if (activity == null) {
            m17 = null;
        } else {
            zg0.q2 a17 = env.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17 : null;
            if (((r0Var == null || (cVar = r0Var.f263471l) == null || (aVar = cVar.f440262r) == null) ? null : (java.lang.Boolean) aVar.mo152xb9724478()) == java.lang.Boolean.TRUE) {
                android.util.DisplayMetrics A = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0.A(activity, false);
                android.view.View decorView = activity.getWindow().getDecorView();
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.g3 a18 = n3.b1.a(decorView);
                if (a18 != null) {
                    m17 = new android.graphics.Rect(0, 0, A.widthPixels, A.heightPixels);
                    e3.d a19 = a18.a(7);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "getInsets(...)");
                    m17.top = a19.f328578b;
                    m17.bottom -= a19.f328580d;
                }
            }
            m17 = com.p314xaae8f345.mm.ui.bk.m(activity);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22633x83752a59);
        float m81401x1f106092 = c22633x83752a59.m81401x1f106092();
        nw4.g gVar = env.f422396d;
        nw4.y2 y2Var = this.f268233f;
        if (m17 == null || m81401x1f106092 <= 0.0f) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getSafeAreaInsets fail, rect is null");
            sb6.append(m17 == null);
            sb6.append(", density=");
            sb6.append(m81401x1f106092);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiHandleDeviceInfo", sb6.toString());
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":fail invalid params", null);
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("left", java.lang.Float.valueOf(m17.left / m81401x1f106092));
            hashMap.put("top", java.lang.Float.valueOf(m17.top / m81401x1f106092));
            hashMap.put("right", java.lang.Float.valueOf(m17.right / m81401x1f106092));
            hashMap.put("bottom", java.lang.Float.valueOf(m17.bottom / m81401x1f106092));
            gVar.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiHandleDeviceInfo", "getSafeAreaInsets, rect=" + m17.toShortString() + ", density:" + m81401x1f106092);
        }
        return jz5.f0.f384359a;
    }
}
