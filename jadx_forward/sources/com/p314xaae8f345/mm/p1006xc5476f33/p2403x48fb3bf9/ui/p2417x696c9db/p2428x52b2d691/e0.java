package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class e0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e0 f267578d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.e0();

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar;
        org.json.JSONObject jSONObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.util.HashMap hashMap2 = new java.util.HashMap();
        zg0.q2 a17 = env.a();
        java.lang.Object obj = a17 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) a17).f263477o : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 r1Var2 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.r1) obj : null;
        try {
            i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(env.f422393a);
            aVar = i0Var.f293354b;
            jSONObject = msg.f422547d;
            if (jSONObject.has(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28)) {
                aVar.f293242a = jSONObject.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            }
            if (jSONObject.has("titleDesc")) {
                aVar.f293244b = jSONObject.getString("titleDesc");
            }
            if (jSONObject.has("titleColor")) {
                java.lang.String string = jSONObject.getString("titleColor");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                aVar.O = android.graphics.Color.parseColor(string) | (-16777216);
            }
            if (jSONObject.has("titleMaxLine")) {
                aVar.P = jSONObject.getInt("titleMaxLine");
            }
            if (jSONObject.has("titleGravity")) {
                aVar.S = jSONObject.getInt("titleGravity");
            }
            if (jSONObject.has("msg")) {
                aVar.f293262s = jSONObject.getString("msg");
            }
            if (jSONObject.has("msgSubTitle")) {
                aVar.f293263t = jSONObject.getString("msgSubTitle");
            }
            if (jSONObject.has("msgSubDesc")) {
                aVar.f293264u = jSONObject.getString("msgSubDesc");
            }
            if (jSONObject.has("msgMaxLine")) {
                aVar.Q = jSONObject.getInt("msgMaxLine");
            }
            if (jSONObject.has("msgIconBase64")) {
                byte[] decode = android.util.Base64.decode(jSONObject.getString("msgIconBase64"), 0);
                int length = decode.length;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(length));
                arrayList.add(0);
                arrayList.add(decode);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
                yj0.a.e(obj2, decodeByteArray, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
                aVar.f293259p = decodeByteArray;
            } else if (jSONObject.has("msgIconUrl")) {
                android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(config);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(1);
                arrayList2.add(1);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj3, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList2.get(0)).intValue(), ((java.lang.Integer) arrayList2.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList2.get(2));
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiConfirmDialog", "handleMsg", "(Lcom/tencent/mm/plugin/webview/jsapi/JsApiEnv;Lcom/tencent/mm/plugin/webview/jsapi/MsgWrapper;)Z", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                aVar.f293259p = createBitmap;
            }
            if (jSONObject.has("contentDesc")) {
                aVar.f293246c = jSONObject.getString("contentDesc");
            }
            if (jSONObject.has("contentDescGravity")) {
                aVar.R = jSONObject.getInt("contentDescGravity");
            }
            if (jSONObject.has("confirmText")) {
                aVar.f293265v = jSONObject.getString("confirmText");
            }
            if (jSONObject.has("confirmTextColor")) {
                java.lang.String string2 = jSONObject.getString("confirmTextColor");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                aVar.W = android.graphics.Color.parseColor(string2) | (-16777216);
            }
            if (jSONObject.has("cancelText")) {
                aVar.f293266w = jSONObject.getString("cancelText");
            }
            if (jSONObject.has("cancelTextColor")) {
                java.lang.String string3 = jSONObject.getString("cancelTextColor");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                aVar.V = android.graphics.Color.parseColor(string3) | (-16777216);
            }
            if (jSONObject.has("cancelable")) {
                aVar.A = jSONObject.optBoolean("cancelable", false);
            }
            hashMap = hashMap2;
            r1Var = r1Var2;
        } catch (java.lang.Exception e17) {
            e = e17;
            hashMap = hashMap2;
            r1Var = r1Var2;
        }
        try {
            aVar.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.z(r1Var, env, msg, hashMap);
            aVar.H = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.a0(r1Var, env, msg, hashMap);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.b0(r1Var, env, msg, hashMap);
            aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.c0(r1Var, env, msg, hashMap);
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.d0(i0Var, jSONObject, "msgIconUrl", r1Var));
            return true;
        } catch (java.lang.Exception e18) {
            e = e18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiConfirmDialog", e, "doConfirmDialog", new java.lang.Object[0]);
            if (r1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) r1Var).O("err");
            }
            env.f422396d.e(msg.f422546c, msg.f422552i + ":err", hashMap);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return uc1.t1.f76916x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "confirmDialog";
    }
}
