package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class he extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.he f267771d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.he();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String[] strArr;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        boolean z17 = env.f422393a instanceof android.app.Activity;
        nw4.g gVar = env.f422396d;
        if (!z17 || !(gVar instanceof nw4.n)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "context error!");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, context error", null);
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(gVar, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.jsapi.JsApiHandler");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = ((nw4.n) gVar).f422445z.f422330a;
        if (c0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "picker is null");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, picker view is null, please showMultiPicker firstly!", null);
            return false;
        }
        if (!c0Var.A) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMultiPickerView", "picker.isDisableLink = false");
            gVar.e(msg.f422546c, msg.f422552i + ":fail, update mod is not support for link", null);
            return false;
        }
        int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(java.lang.String.valueOf(((java.util.HashMap) msg.f422323a).get("column")), 0);
        java.lang.Object obj = ((java.util.HashMap) msg.f422323a).get("array");
        int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(java.lang.String.valueOf(((java.util.HashMap) msg.f422323a).get("current")), 0);
        if (obj != null) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(obj.toString());
                int length = jSONArray.length();
                strArr = new java.lang.String[length];
                for (int i17 = 0; i17 < length; i17++) {
                    strArr[i17] = jSONArray.get(i17);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiUpdateMultiPickerView", e17.getMessage());
                gVar.e(msg.f422546c, msg.f422552i + ":fail, json parse error", null);
                return false;
            }
        } else {
            strArr = 0;
        }
        if (D1 == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f79 = c0Var.f293789q;
            if (c22706xd568f79 != null) {
                c22706xd568f79.m82070x203ffbdd(strArr);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f792 = c0Var.f293789q;
            if (c22706xd568f792 != null) {
                c22706xd568f792.m82071x53d8522f(D12);
                c0Var.f293789q.c(D12);
            }
        } else if (D1 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f793 = c0Var.f293790r;
            if (c22706xd568f793 != null) {
                c22706xd568f793.m82070x203ffbdd(strArr);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f794 = c0Var.f293790r;
            if (c22706xd568f794 != null) {
                c22706xd568f794.m82071x53d8522f(D12);
                c0Var.f293790r.c(D12);
            }
        } else if (D1 != 2) {
            gVar.e(msg.f422546c, msg.f422552i + ":fail, index error", null);
        } else {
            if (!c0Var.f()) {
                gVar.e(msg.f422546c, msg.f422552i + ":fail, index error", null);
                return false;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f795 = c0Var.f293791s;
            if (c22706xd568f795 != null) {
                c22706xd568f795.m82070x203ffbdd(strArr);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22706xd568f79 c22706xd568f796 = c0Var.f293791s;
            if (c22706xd568f796 != null) {
                c22706xd568f796.m82071x53d8522f(D12);
                c0Var.f293791s.c(D12);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 449;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "updateMultiPickerView";
    }
}
