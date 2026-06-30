package r10;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final r10.b f450107a = new r10.b();

    public final bw5.x7 a(org.json.JSONObject jumpInfoObj) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfoObj, "jumpInfoObj");
        try {
            bw5.x7 x7Var = new bw5.x7();
            boolean[] zArr = x7Var.f116517r;
            x7Var.f116506d = jumpInfoObj.optInt("jumpBizType");
            zArr[1] = true;
            x7Var.f116514o = jumpInfoObj.optBoolean("deliverGmsgId");
            zArr[9] = true;
            org.json.JSONArray optJSONArray = jumpInfoObj.optJSONArray("jumpPriority");
            if (optJSONArray != null) {
                x7Var.j(new java.util.LinkedList());
                int length = optJSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    x7Var.f116510h.add(optJSONArray.optString(i17));
                }
            }
            org.json.JSONObject optJSONObject = jumpInfoObj.optJSONObject("nativeInfo");
            if (optJSONObject != null) {
                bw5.v7 v7Var = new bw5.v7();
                boolean[] zArr2 = v7Var.f115719g;
                v7Var.f115716d = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optJSONObject.optString("native_uri")) ? optJSONObject.optString("native_uri") : optJSONObject.optString("nativeUri");
                zArr2[1] = true;
                v7Var.f115718f = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optJSONObject.optString("params_json")) ? optJSONObject.optString("params_json") : optJSONObject.optString("paramsJson");
                zArr2[3] = true;
                x7Var.f116511i = v7Var;
                zArr[6] = true;
            }
            org.json.JSONObject optJSONObject2 = jumpInfoObj.optJSONObject("mbAppInfo");
            if (optJSONObject2 != null) {
                bw5.s7 s7Var = new bw5.s7();
                boolean[] zArr3 = s7Var.f114372u;
                s7Var.f114358d = optJSONObject2.optString("bizName");
                zArr3[1] = true;
                s7Var.f114359e = optJSONObject2.optInt("pageType");
                zArr3[2] = true;
                s7Var.f114360f = optJSONObject2.optInt("openType");
                zArr3[3] = true;
                s7Var.e(optJSONObject2.optString("startupParams"));
                s7Var.f114362h = optJSONObject2.optInt("launchAnimationType");
                zArr3[5] = true;
                s7Var.f114363i = optJSONObject2.optBoolean("enableEdgeSlideToClose");
                zArr3[6] = true;
                s7Var.f114369r = optJSONObject2.optInt("bizPreloadType");
                zArr3[12] = true;
                s7Var.f114368q = optJSONObject2.optInt("bizAutoDestroyTime");
                zArr3[11] = true;
                s7Var.f114370s = optJSONObject2.optBoolean("enableDefaultBackground");
                zArr3[13] = true;
                org.json.JSONObject optJSONObject3 = optJSONObject2.optJSONObject("halfPageConfig");
                if (optJSONObject3 != null) {
                    bw5.r7 r7Var = new bw5.r7();
                    boolean[] zArr4 = r7Var.f113961g;
                    str2 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
                    r7Var.f113958d = optJSONObject3.optDouble("height");
                    zArr4[1] = true;
                    r7Var.f113959e = optJSONObject3.optBoolean("enableDragToClose");
                    zArr4[2] = true;
                    r7Var.f113960f = optJSONObject3.optBoolean("enableDragToFull");
                    zArr4[3] = true;
                    s7Var.f114364m = r7Var;
                    zArr3[7] = true;
                } else {
                    str2 = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
                }
                s7Var.f114365n = optJSONObject2.optBoolean("forceUdrUpdate");
                zArr3[8] = true;
                str = str2;
                s7Var.f114366o = optJSONObject2.optInt(str);
                zArr3[9] = true;
                org.json.JSONArray optJSONArray2 = optJSONObject2.optJSONArray("featureList");
                if (optJSONArray2 != null) {
                    e06.k m17 = e06.p.m(0, optJSONArray2.length());
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    kz5.x0 it = m17.iterator();
                    while (((e06.j) it).f327747f) {
                        org.json.JSONObject jSONObject = optJSONArray2.getJSONObject(it.b());
                        bw5.w7 w7Var = new bw5.w7();
                        boolean[] zArr5 = w7Var.f116132f;
                        w7Var.f116130d = jSONObject.optInt("featureId");
                        zArr5[1] = true;
                        w7Var.f116131e = jSONObject.optInt("minFeatureVersion");
                        zArr5[2] = true;
                        linkedList.add(w7Var);
                    }
                    s7Var.f114367p = linkedList;
                    zArr3[10] = true;
                }
                x7Var.f116515p = s7Var;
                zArr[10] = true;
            } else {
                str = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811;
            }
            org.json.JSONObject optJSONObject4 = jumpInfoObj.optJSONObject("miniAppInfo");
            if (optJSONObject4 != null) {
                bw5.u7 u7Var = new bw5.u7();
                u7Var.e(optJSONObject4.optString("appid"));
                u7Var.f115288e = optJSONObject4.optString("appUsername");
                u7Var.f115301u[2] = true;
                u7Var.f(optJSONObject4.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714));
                u7Var.g(optJSONObject4.optInt(str, 0));
                u7Var.i(optJSONObject4.optString("sceneNote"));
                u7Var.j(optJSONObject4.optInt("versionType", 0));
                x7Var.k(u7Var);
            }
            org.json.JSONObject optJSONObject5 = jumpInfoObj.optJSONObject("liteAppInfo");
            if (optJSONObject5 != null) {
                bw5.q7 q7Var = new bw5.q7();
                boolean[] zArr6 = q7Var.f113520o;
                q7Var.f113512d = optJSONObject5.optString("appid");
                zArr6[1] = true;
                q7Var.f113514f = optJSONObject5.optString("query");
                zArr6[3] = true;
                q7Var.f113513e = optJSONObject5.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                zArr6[2] = true;
                q7Var.f113515g = optJSONObject5.optString("default_url");
                zArr6[4] = true;
                x7Var.f116508f = q7Var;
                zArr[3] = true;
            }
            org.json.JSONObject optJSONObject6 = jumpInfoObj.optJSONObject("html5Info");
            if (optJSONObject6 != null) {
                bw5.o7 o7Var = new bw5.o7();
                o7Var.f112534d = optJSONObject6.optString("url");
                o7Var.f112539i[1] = true;
                x7Var.f116509g = o7Var;
                zArr[4] = true;
            }
            return x7Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsJumpUtil", "assembleEcsJumpInfoFromJson error:" + e17);
            return null;
        }
    }
}
