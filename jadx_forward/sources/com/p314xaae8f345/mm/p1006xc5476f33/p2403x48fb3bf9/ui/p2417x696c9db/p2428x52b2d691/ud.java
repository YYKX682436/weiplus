package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class ud extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ud f268097d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.ud();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("array");
        boolean z17 = str == null || r26.n0.N(str);
        nw4.g gVar = env.f422396d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowPickerView", "showPickerView array is null");
            gVar.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
        android.content.Context context = env.f422393a;
        if (context == null || !(context instanceof android.app.Activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowPickerView", "context error!");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, context error", null);
            return false;
        }
        try {
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) msg.f422323a.get("current"), 0);
            org.json.JSONArray jSONArray = new org.json.JSONArray(str);
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShowPickerView", "showPickerView as selector, empty range");
                gVar.e(msg.f422546c, msg.f422552i + "fail", null);
                return true;
            }
            java.lang.String[] strArr = new java.lang.String[jSONArray.length()];
            int length = jSONArray.length();
            for (int i17 = 0; i17 < length; i17++) {
                strArr[i17] = jSONArray.getString(i17);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(context, strArr);
            try {
                c0Var.i(P);
                c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.td(c0Var, env, msg);
                java.lang.Object obj = msg.f422323a.get("headerText");
                java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmm, (android.view.ViewGroup) null);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.hp9);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(str2);
                    c0Var.g(inflate);
                }
                c0Var.l();
                return true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowPickerView", e17.getMessage());
                gVar.e(msg.f422546c, msg.f422552i + ":fail, index error", null);
                return false;
            }
        } catch (java.lang.Exception e18) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShowPickerView", "showPickerView exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e18));
            gVar.e(msg.f422546c, msg.f422552i + "fail", null);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 447;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "showPickerView";
    }
}
