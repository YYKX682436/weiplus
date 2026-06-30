package v10;

/* loaded from: classes9.dex */
public final class b extends t10.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        if (jumpInfo.d() == null) {
            return false;
        }
        java.lang.String m12798x74292946 = jumpInfo.d().m12798x74292946();
        return !(m12798x74292946 == null || m12798x74292946.length() == 0);
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (jumpInfo.d() == null) {
            callback.c("jumpInfo.liteAppInfo is null");
            return;
        }
        bw5.q7 d17 = jumpInfo.d();
        java.lang.String m12798x74292946 = d17.m12798x74292946();
        if (m12798x74292946 == null || m12798x74292946.length() == 0) {
            callback.c("jumpInfo.liteAppInfo.appid is null");
            return;
        }
        android.content.Context c17 = context.c();
        if (c17 == null) {
            callback.c("context.context is null");
            return;
        }
        boolean[] zArr = d17.f113520o;
        java.lang.String str = zArr[3] ? d17.f113514f : "";
        bw5.d8 b17 = context.f439085b.b();
        java.lang.String str2 = b17.f107908f[1] ? b17.f107906d : "";
        if (!(str2 == null || str2.length() == 0)) {
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            java.lang.String str3 = zArr[3] ? d17.f113514f : "";
            bw5.d8 b18 = context.f439085b.b();
            java.lang.String str4 = b18.f107908f[1] ? b18.f107906d : "";
            com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i iVar = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var;
            iVar.getClass();
            try {
                org.json.JSONObject Tj = iVar.Tj(str3);
                org.json.JSONObject Tj2 = iVar.Tj(str4);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                java.util.Iterator<java.lang.String> keys = Tj.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    jSONObject.put(next, Tj.get(next));
                }
                java.util.Iterator<java.lang.String> keys2 = Tj2.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    jSONObject.put(next2, Tj2.get(next2));
                }
                str = jSONObject.toString();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppFeatureService", "processQuery fail: " + e17.getMessage());
                str = "";
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            bw5.q7 d18 = jumpInfo.d();
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d18.f113520o[8] ? d18.f113519n : "");
            b00.p0 p0Var = b00.p0.f98280a;
            if (!K0) {
                bw5.q7 d19 = jumpInfo.d();
                jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(d19.f113520o[8] ? d19.f113519n : ""));
            }
            if (context.d() != null) {
                org.json.JSONObject d27 = context.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d27);
                jSONObject2 = p0Var.f(jSONObject2, d27);
            }
            if (context.f439085b.b() != null) {
                bw5.d8 b19 = context.f439085b.b();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b19.f107908f[2] ? b19.f107907e : "")) {
                    bw5.d8 b27 = context.f439085b.b();
                    jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(b27.f107908f[2] ? b27.f107907e : ""));
                }
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.Router.LiteApp", e18, "nativeExtraData parse error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.LiteApp", "[LiteAppRouter] extraParamInfo: " + jSONObject2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.LiteApp", "jumpLiteApp appid:" + d17.m12798x74292946() + " path:" + d17.m12799xfb83cc9b() + " query:" + str + ", nativeExtraData:" + jSONObject2);
        z20.e eVar = z20.e.f551076e;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "ecso_open";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.f(java.lang.String.valueOf(context.f439088e));
        bVar.c("open_lite_app");
        bVar.e(kz5.c1.k(new jz5.l("appId", d17.m12798x74292946()), new jz5.l(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, d17.m12799xfb83cc9b()), new jz5.l("query", str)));
        bVar.a();
        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.ECS;
        c3708xc1f46f80.f14309xf0df6fda = jSONObject2;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d17.m12798x74292946());
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, d17.m12799xfb83cc9b());
        bundle.putString("query", str);
        bundle.putParcelable("liteappReferrerInfo", c3708xc1f46f80);
        bundle.putLong("timeout", 30000L);
        bundle.putBoolean("withDownloadLoading", true);
        bundle.putBoolean(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13307xd51ecb63, d17.f113518m);
        if (d17.f113516h == 2) {
            bw5.p7 p7Var = zArr[6] ? d17.f113517i : new bw5.p7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34 c16190x27388f34 = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16190x27388f34();
            c16190x27388f34.f224950n = p7Var.f113015e;
            c16190x27388f34.f224944e = p7Var.f113014d / 100.0d;
            c16190x27388f34.f224948i = p7Var.f113017g;
            c16190x27388f34.f224947h = p7Var.f113016f;
            bundle.putParcelable("halfScreenConfig", c16190x27388f34);
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(c17, bundle, true, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s(), new v10.a(d17, c17));
        callback.d(null);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        callback.c("handlePreload not impl");
    }
}
