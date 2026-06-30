package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class y9 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y9 f268215d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.y9();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        nw4.k kVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.Integer num;
        int intValue;
        java.lang.Object obj;
        java.lang.Integer num2;
        java.lang.Integer num3;
        java.lang.String str3;
        java.lang.String str4 = "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            java.lang.Object obj2 = msg.f422323a.get("businessType");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
                str = (java.lang.String) obj2;
            } catch (java.lang.Throwable th6) {
                oj.j.d("Matrix.Safe", th6, "", new java.lang.Object[0]);
                str = null;
            }
            str2 = str == null ? "" : str;
            java.lang.Object obj3 = msg.f422323a.get("finderJumpId");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                num = java.lang.Integer.valueOf(((java.lang.Integer) obj3).intValue());
            } catch (java.lang.Throwable th7) {
                oj.j.d("Matrix.Safe", th7, "", new java.lang.Object[0]);
                num = null;
            }
            intValue = num != null ? num.intValue() : 0;
            obj = msg.f422323a.get("commentScene");
        } catch (java.lang.Exception unused) {
            kVar = env;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPostFinderDanmuku", java.lang.String.valueOf(msg.f422323a));
            kVar.f422396d.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
        try {
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
                num2 = java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue());
            } catch (java.lang.Throwable th8) {
                oj.j.d("Matrix.Safe", th8, "", new java.lang.Object[0]);
                num2 = null;
            }
            int intValue2 = num2 != null ? num2.intValue() : 0;
            java.lang.Object obj4 = msg.f422323a.get("actionType");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.Int");
                num3 = java.lang.Integer.valueOf(((java.lang.Integer) obj4).intValue());
            } catch (java.lang.Throwable th9) {
                oj.j.d("Matrix.Safe", th9, "", new java.lang.Object[0]);
                num3 = null;
            }
            int intValue3 = num3 != null ? num3.intValue() : 0;
            java.lang.Object obj5 = msg.f422323a.get("content");
            try {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj5, "null cannot be cast to non-null type kotlin.String");
                str3 = (java.lang.String) obj5;
            } catch (java.lang.Throwable th10) {
                oj.j.d("Matrix.Safe", th10, "", new java.lang.Object[0]);
                str3 = null;
            }
            if (str3 != null) {
                str4 = str3;
            }
            jSONObject.put("businessType", str2);
            jSONObject.put("finderJumpId", intValue);
            jSONObject.put("commentScene", intValue2);
            jSONObject.put("actionType", intValue3);
            jSONObject.put("content", str4);
            jSONObject.put("eventType", 101);
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str5, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.C19454x59301041(jSONObject2), com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.w9.class, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x9(env, msg));
            return true;
        } catch (java.lang.Exception unused2) {
            kVar = env;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPostFinderDanmuku", java.lang.String.valueOf(msg.f422323a));
            kVar.f422396d.e(msg.f422546c, msg.f422552i + ":fail", null);
            return false;
        }
    }

    @Override // nw4.q2
    public int b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m.f34863x366c91de;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "callFinderBulletCommentHandler";
    }
}
