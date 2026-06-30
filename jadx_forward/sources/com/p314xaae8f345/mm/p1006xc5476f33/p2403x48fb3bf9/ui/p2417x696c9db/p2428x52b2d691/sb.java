package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes5.dex */
public final class sb extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sb f268058d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.sb();

    @Override // nw4.q2
    public boolean a(nw4.k env, nw4.y2 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        nw4.g gVar = env.f422396d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        try {
            java.lang.Object obj = msg.f422323a.get("businessId");
            int D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj instanceof java.lang.String ? (java.lang.String) obj : null, 0);
            java.lang.Object obj2 = msg.f422323a.get("isBatchReport");
            int D12 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null, 0);
            java.lang.Object obj3 = msg.f422323a.get("infoList");
            java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null, "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSdkCgiReport", "bizId: " + D1 + ", isBatchReport: " + D12 + ", infoList: " + u17);
            if (D1 <= 0) {
                gVar.e(msg.f422546c, msg.f422552i + ":fail missing auguaments (cgiBizId)", null);
                return true;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                gVar.e(msg.f422546c, msg.f422552i + ":fail missing auguaments (infoList)", null);
                return true;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072 c5655x22761072 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5655x22761072();
            am.xh xhVar = c5655x22761072.f135981g;
            xhVar.f89911a = D1;
            xhVar.f89912b = D12 == 1;
            xhVar.f89913c = u17;
            c5655x22761072.e();
            gVar.e(msg.f422546c, msg.f422552i + ":ok", null);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiSdkCgiReport", e17, "JsApiSdkCgiReport handleMsg", new java.lang.Object[0]);
            gVar.e(msg.f422546c, msg.f422552i + ":fail auguaments crash", null);
            return true;
        }
    }

    @Override // nw4.q2
    public int b() {
        return 537;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "sdkCgiReport";
    }
}
