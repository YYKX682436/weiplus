package xx4;

/* loaded from: classes.dex */
public final class a extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xx4.a f539558d = new xx4.a();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Integer num = (java.lang.Integer) msg.f422323a.get("enterScene");
        int intValue = num != null ? num.intValue() : 18;
        java.lang.String str = (java.lang.String) msg.f422323a.get("templateInfo");
        if (str == null) {
            str = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            jSONObject.put("enterScene", intValue);
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jSONObject.put("templateInfo", new org.json.JSONObject(str)));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        android.content.Intent intent = new android.content.Intent(env.f422393a, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, xx4.b.class);
        intent.putExtra("KEY_JSON_STRING", jSONObject.toString());
        android.content.Context context = env.f422393a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/JsApiOpenFinderCamera", "openFinderCameraView", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/finder/JsApiOpenFinderCamera", "openFinderCameraView", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiOpenFinderCamera", "openFinderCameraView json: " + jSONObject);
        return true;
    }

    @Override // nw4.q2
    public int b() {
        return 544;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "openFinderCamera";
    }
}
