package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes11.dex */
public class h0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f293806d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f293807e;

    /* renamed from: f, reason: collision with root package name */
    public int f293808f;

    /* renamed from: g, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f293809g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f293810h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f293811i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22708x9193a5d4 f293812m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.g0 f293813n;

    public h0(android.content.Context context) {
        this.f293806d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.d0m, null);
        this.f293807e = inflate;
        this.f293810h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.o7s);
        this.f293811i = (android.widget.LinearLayout) this.f293807e.findViewById(com.p314xaae8f345.mm.R.id.o7t);
        this.f293812m = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22708x9193a5d4(context);
        this.f293810h.removeAllViews();
        this.f293810h.setGravity(17);
        this.f293810h.addView(this.f293812m.m82072xfb86a31b(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        ((android.widget.Button) this.f293807e.findViewById(com.p314xaae8f345.mm.R.id.khs)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.d0(this));
        ((android.widget.Button) this.f293807e.findViewById(com.p314xaae8f345.mm.R.id.b5i)).setOnClickListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.e0(this));
        this.f293806d.setContentView(this.f293807e);
        this.f293808f = com.p314xaae8f345.mm.ui.zk.a(context, com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60881xdbee435);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f293807e.getParent());
        this.f293809g = A;
        if (A != null) {
            A.C(this.f293808f);
            this.f293809g.f125976p = false;
        }
        this.f293806d.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.f0(this));
    }

    public static void a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.h0 h0Var, boolean z17, java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.g0 g0Var = h0Var.f293813n;
        if (g0Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.cd cdVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.cd) g0Var;
            y9.i iVar = cdVar.f267550a.f293806d;
            if (iVar != null) {
                iVar.dismiss();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowDatePickerView", "time set hasSetResult=" + z17 + ", result=" + obj);
            nw4.k kVar = cdVar.f267551b;
            nw4.y2 y2Var = cdVar.f267552c;
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowDatePickerView", "time set cancel");
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":cancel", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            hashMap.put("selectTime", obj);
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
