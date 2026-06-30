package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/h1;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class h1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String pid = jSONObject != null ? jSONObject.optString("pid") : null;
        java.lang.String detailBufStr = jSONObject != null ? jSONObject.optString("detailBufStr") : null;
        boolean z18 = true;
        if (!(pid == null || pid.length() == 0)) {
            if (detailBufStr != null && detailBufStr.length() != 0) {
                z18 = false;
            }
            if (!z18) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6 o6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.o6.class);
                android.content.Context c17 = c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getContext(...)");
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4 c4Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.c4) o6Var;
                c4Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pid, "pid");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detailBufStr, "detailBufStr");
                byte[] decode = android.util.Base64.decode(detailBufStr, 2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c4Var.f147740d, "openRewardCharts, pid=".concat(pid));
                r45.qj0 qj0Var = new r45.qj0();
                if (decode != null) {
                    try {
                        qj0Var.mo11468x92b714fd(decode);
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                    }
                }
                android.content.Intent intent = new android.content.Intent(c17, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v2.ActivityC13348x405f070b.class);
                intent.putExtra("extra_id", pid);
                intent.putExtra("extra_iconurl", qj0Var.f465566e);
                intent.putExtra("extra_name", qj0Var.f465567f);
                r45.v75 v75Var = qj0Var.E;
                if (v75Var != null) {
                    intent.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, v75Var.f469498e);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/feature/emoji/EmoticonJsApiService", "openRewardCharts", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                c17.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(c17, "com/tencent/mm/feature/emoji/EmoticonJsApiService", "openRewardCharts", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f224976f.d(false);
                return;
            }
        }
        this.f224976f.a("emoticonOpenRewardCharts:fail_missing arguments");
    }
}
