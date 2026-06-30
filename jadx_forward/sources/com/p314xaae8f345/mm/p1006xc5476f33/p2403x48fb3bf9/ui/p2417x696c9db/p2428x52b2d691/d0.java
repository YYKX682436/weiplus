package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f267553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f267554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 f267555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var, org.json.JSONObject jSONObject, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var) {
        super(0);
        this.f267553d = i0Var;
        this.f267554e = jSONObject;
        this.f267555f = r1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = this.f267553d.a();
        org.json.JSONObject jSONObject = this.f267554e;
        if (jSONObject.has("msgIconUrl")) {
            android.widget.ImageView imageView = a17.f293372t;
            n11.a b17 = n11.a.b();
            java.lang.String string = jSONObject.getString("msgIconUrl");
            o11.f fVar = new o11.f();
            fVar.f423611b = true;
            b17.h(string, imageView, fVar.a());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var = this.f267555f;
        if (r1Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) r1Var;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenWebView", "onJsApiConfirmDialogShow");
            int i17 = (((int) ((com.p314xaae8f345.mm.ui.bk.C() ? 0.8f : 0.5f) * 255)) << 24) | 0;
            android.view.View view = m1Var.f362935h;
            if (view != null) {
                view.setBackgroundColor(i17);
            }
            android.view.View view2 = m1Var.f362934g;
            if (view2 != null) {
                view2.setBackgroundColor(i17);
            }
            m1Var.F = true;
        }
        a17.show();
        return jz5.f0.f384359a;
    }
}
