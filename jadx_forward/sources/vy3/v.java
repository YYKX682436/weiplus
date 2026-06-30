package vy3;

/* loaded from: classes.dex */
public final class v extends wy3.c {

    /* renamed from: e, reason: collision with root package name */
    public static final vy3.v f523023e = new vy3.v();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.lang.String message;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.String str = (java.lang.String) msg.f422323a.get("emailAddr");
        if (str == null) {
            str = "";
        }
        java.lang.String obj = r26.n0.u0(str).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailAddr: " + obj);
        boolean z17 = obj == null || r26.n0.N(obj);
        nw4.g gVar = env.f422396d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail param is empty");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap);
            return true;
        }
        java.util.List f07 = r26.n0.f0(obj, new java.lang.String[]{";"}, false, 0, 6, null);
        if (f07.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailReceivers is empty");
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("ret", "1");
            gVar.e(msg.f422546c, msg.f422552i + ":param invalid", hashMap2);
            return true;
        }
        java.util.Iterator it = f07.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartSendMail", "ScanJsApi-Call doStartSendMail emailReceiver:" + ((java.lang.String) it.next()));
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
        intent.setData(android.net.Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", (java.lang.String[]) f07.toArray(new java.lang.String[0]));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        try {
            android.content.Context context = env.f422393a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/scanner/box/jsapi/JsApiStartSendMail", "doStartSendMail", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/scanner/box/jsapi/JsApiStartSendMail", "doStartSendMail", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            message = "ok";
            hashMap3.put("ret", "0");
        } catch (android.content.ActivityNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiStartSendMail", e17, "", new java.lang.Object[0]);
            db5.e1.m(env.f422393a, com.p314xaae8f345.mm.R.C30867xcad56011.i_n, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, vy3.u.f523022d);
            hashMap3.put("ret", "1");
            message = "no email app";
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiStartSendMail", e18, "", new java.lang.Object[0]);
            message = e18.getMessage();
            if (message == null) {
                message = "fail";
            }
            hashMap3.put("ret", "1");
        }
        gVar.e(msg.f422546c, msg.f422552i + ':' + message, hashMap3);
        return true;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "startSendMail";
    }
}
