package vy3;

/* loaded from: classes12.dex */
public final class d extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.d f523000e = new vy3.d();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str2 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str4 = (java.lang.String) ((java.util.HashMap) msg.f422323a).get("content");
        if (str4 == null) {
            str4 = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiCollect", "ScanJsApi-Call:collect sessionId: %s, content: %s", str2, str4);
        if (str4.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiCollect", "ScanJsApi-Call collect content is empty");
        } else {
            jz5.g gVar = kz3.d.f395405a;
            kz3.a aVar = (kz3.a) kz3.d.f395406b.get(str2);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73();
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            jq0Var.g(27);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            am.c4 c4Var = c5303xc75d2f73.f135623g;
            c4Var.f87852e = str4;
            c4Var.f87848a = bq0Var;
            c4Var.f87850c = 1;
            r45.jq0 jq0Var2 = bq0Var.f452495d;
            if (jq0Var2 != null) {
                if (aVar != null && (str = aVar.f395397a) != null) {
                    str3 = str;
                }
                jq0Var2.e(str3);
            }
            android.content.Context context = env.f422393a;
            if (context instanceof android.app.Activity) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                c4Var.f87856i = (android.app.Activity) context;
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = env.f422397e;
            android.view.View view = (android.view.View) (c22633x83752a59 != null ? c22633x83752a59.getParent() : null);
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) (view != null ? view.getRootView() : null);
            c4Var.f87858k = viewGroup != null ? viewGroup.getChildAt(0) : null;
            c4Var.f87860m = 43;
            c5303xc75d2f73.e();
        }
        env.f422396d.e(msg.f422546c, msg.f422552i + ":ok", null);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "collect";
    }
}
