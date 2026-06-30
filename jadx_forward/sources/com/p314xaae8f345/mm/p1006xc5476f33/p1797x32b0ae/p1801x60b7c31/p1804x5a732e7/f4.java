package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/jsapi/comms/f4;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class f4 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final void A(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2(str5, str2);
        g2Var.f270844d = str3;
        g2Var.f270843c = str4;
        g2Var.f270845e = j17;
        g2Var.f270846f = str;
        g2Var.f270848h = 3;
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        android.content.Context c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c17, "null cannot be cast to non-null type android.app.Activity");
        ((ht.a) vVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0((android.app.Activity) c17, g2Var, null);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        android.content.Context c18 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getContext(...)");
        ((gb0.n) kVar).wi(c18, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.e4(u0Var, this));
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        try {
            java.lang.String string = data.getString("messageSvrId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            long parseLong = java.lang.Long.parseLong(string);
            java.lang.String string2 = data.getString("chatName");
            java.lang.String optString = data.optString("extInfo", "");
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 l17 = pt0.f0.f439742b1.l(string2, parseLong);
            if (l17 == null) {
                throw new java.lang.IllegalStateException("msgInfo".toString());
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            if (optString.length() > 0) {
                jz5.f0 f0Var = null;
                java.lang.Object obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(l17.j(), "msg", null).get(".msg.appmsg.recorditem");
                if (obj == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
                r45.gp0 n17 = bt3.g2.n((java.lang.String) obj, optString);
                if (n17 != null) {
                    mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
                    java.lang.String Q0 = l17.Q0();
                    long m124847x74d37ac6 = l17.m124847x74d37ac6();
                    ((zs3.z) kVar).getClass();
                    java.lang.String t17 = bt3.g2.t(n17, Q0, m124847x74d37ac6, 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(t17, "getDataPath(...)");
                    java.lang.String str2 = n17.K;
                    if (str2 == null) {
                        throw new java.lang.IllegalStateException("fileExt".toString());
                    }
                    java.lang.String str3 = n17.f456937d;
                    if (str3 == null) {
                        throw new java.lang.IllegalStateException(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207.toString());
                    }
                    ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                    java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str2);
                    if (e17 == null) {
                        throw new java.lang.IllegalStateException("mimeType".toString());
                    }
                    long m124847x74d37ac62 = l17.m124847x74d37ac6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
                    A(m124847x74d37ac62, string2, t17, str2, str3, e17);
                    this.f224975e.d();
                    f0Var = jz5.f0.f384359a;
                }
                if (f0Var == null) {
                    throw new java.lang.RuntimeException("findFavDataItem failed");
                }
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d J0 = ((com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.e) ((kt.q0) ((lt.q0) i95.n0.c(lt.q0.class))).wi()).J0(l17.m124847x74d37ac6(), string2);
            if (J0 == null) {
                throw new java.lang.IllegalStateException("appAttachInfo".toString());
            }
            java.lang.String str4 = J0.f68099xfeae815;
            if (str4 == null) {
                throw new java.lang.IllegalStateException(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1.toString());
            }
            java.lang.String n18 = com.p314xaae8f345.mm.vfs.w6.n(str4);
            if (n18 == null) {
                throw new java.lang.IllegalStateException("fileExt".toString());
            }
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str4);
            java.lang.String str5 = a17.f294812f;
            if (str5 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str5, false, false);
                if (!str5.equals(l18)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l18, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str6 = a17.f294812f;
            int lastIndexOf = str6.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str6 = str6.substring(lastIndexOf + 1);
            }
            java.lang.String str7 = str6;
            if (str7 == null) {
                throw new java.lang.IllegalStateException(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207.toString());
            }
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            java.lang.String e18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(n18);
            if (e18 == null) {
                throw new java.lang.IllegalStateException("mimeType".toString());
            }
            long m124847x74d37ac63 = l17.m124847x74d37ac6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            A(m124847x74d37ac63, string2, str4, n18, str7, e18);
            this.f224975e.d();
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiOpenMessageFileToThirdApp", e19.getMessage() + ": " + jz5.a.b(e19));
            this.f224975e.a();
        }
    }
}
