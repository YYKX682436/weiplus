package vy3;

/* loaded from: classes.dex */
public final class g extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.g f523003e = new vy3.g();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("phoneNum");
        if (str == null) {
            str = "";
        }
        java.lang.String obj = r26.n0.u0(str).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doOpenDialPad phoneNum: " + obj);
        boolean z17 = false;
        boolean z18 = obj == null || r26.n0.N(obj);
        nw4.g gVar = env.f422396d;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenDialPad", "ScanJsApi-Call doOpenDialPad param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap);
        } else {
            android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
            intent.setFlags(268435456);
            intent.setData(android.net.Uri.parse("tel:" + obj));
            try {
                android.content.Context context = env.f422393a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiOpenDialPad", "doOpenDialPad", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiOpenDialPad", "doOpenDialPad", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                z17 = true;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiOpenDialPad", e17, "", new java.lang.Object[0]);
            }
            if (z17) {
                java.util.HashMap hashMap2 = new java.util.HashMap();
                hashMap2.put("ret", "0");
                gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap2);
            } else {
                java.util.HashMap hashMap3 = new java.util.HashMap();
                hashMap3.put("ret", "1");
                gVar.e(msg.f422546c, msg.f422552i + ":fail", hashMap3);
            }
        }
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openDialPad";
    }
}
