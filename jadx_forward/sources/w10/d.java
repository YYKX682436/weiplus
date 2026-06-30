package w10;

/* loaded from: classes9.dex */
public final class d extends t10.c {

    /* renamed from: c, reason: collision with root package name */
    public final int f523498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f523498c = hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t10.c
    public boolean a(pq.a context, bw5.x7 jumpInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        g10.v vVar = (g10.v) ((c00.i4) i95.n0.c(c00.i4.class));
        vVar.getClass();
        if (jumpInfo.e() != null) {
            java.lang.String b17 = jumpInfo.e().b();
            if ((b17 == null || b17.length() == 0) == false) {
                java.lang.String b18 = jumpInfo.e().b();
                boolean z17 = jumpInfo.e().f114365n;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isBizPkgAvailable, bizName = " + b18 + ", forceUdrUpdate = " + z17);
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, force open");
                    return true;
                }
                boolean Ni = vVar.Ni(jumpInfo.e());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, isLatest = " + Ni);
                ((ku5.t0) ku5.t0.f394148d).h(new q10.o(jumpInfo.e(), bw5.d5.EcsNirvanaUdrPkgCheckResult, !Ni ? 1 : 0), "MicroMsg.EcsNirvanaReportUtil");
                if (!Ni) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, not latest, update async");
                    p3325xe03a0797.p3326xc267989b.l.d(vVar.f349085d, null, null, new g10.q(vVar, jumpInfo, null), 3, null);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "shouldOpenWithNirvana, isLatest = " + Ni);
                return Ni;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "isBizPkgAvailable, jumpInfo is invalid");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        java.lang.String b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String valueOf = java.lang.String.valueOf(context.f439088e);
        if (jumpInfo.e() == null) {
            callback.c("mbAppInfo is null");
            return;
        }
        java.lang.String b18 = jumpInfo.e().b();
        if ((b18 == null || b18.length() == 0) == true) {
            callback.c("mbAppInfo.bizName is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.MBApp", "handleOpen: " + jumpInfo.e().b());
        bw5.s7 e17 = jumpInfo.e();
        z20.e eVar = z20.e.f551076e;
        z20.b bVar = new z20.b();
        bVar.f551070a = eVar;
        bw5.q9 q9Var = new bw5.q9();
        q9Var.f113532d = "ecso_open";
        q9Var.f113546u[1] = true;
        q9Var.c(java.lang.System.currentTimeMillis());
        q9Var.b(2);
        bVar.f551071b = q9Var;
        bVar.f(valueOf);
        bVar.c("onOpen");
        bVar.b("mb_service");
        bVar.b("mb_page_start");
        bVar.b("mb_dart_load_start");
        bVar.b("mb_dart_load_end");
        bVar.e(kz5.c1.k(new jz5.l("bizName", e17.b()), new jz5.l("pageType", java.lang.String.valueOf(e17.f114359e)), new jz5.l("openType", java.lang.String.valueOf(e17.f114360f)), new jz5.l("startupParams", e17.c()), new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, java.lang.String.valueOf(e17.f114366o))));
        bw5.q9 q9Var2 = bVar.f551071b;
        q9Var2.f113543r = 1;
        q9Var2.f113546u[16] = true;
        bVar.a();
        if (e17.f114359e != 0) {
            callback.c("unknown page type");
            return;
        }
        byte[] mo14344x5f01b1f6 = e17.mo14344x5f01b1f6();
        bw5.e8 c17 = context.f439085b.c();
        if (c17 != null && (b17 = c17.b()) != null) {
            try {
                org.json.JSONObject jSONObject = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17) ? new org.json.JSONObject(b17) : new org.json.JSONObject();
                jSONObject.put("trackerId", valueOf);
                bw5.h8 h8Var = context.f439085b;
                bw5.e8 c18 = h8Var.c();
                if (c18 != null) {
                    c18.f108311d = jSONObject.toString();
                    c18.f108312e[1] = true;
                } else {
                    c18 = null;
                }
                h8Var.f109647h = c18;
                h8Var.f109649m[5] = true;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.Router.MBApp", "handleOpen exp:" + e18);
            }
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            org.json.JSONObject d17 = context.d();
            b00.p0 p0Var = b00.p0.f98280a;
            if (d17 != null) {
                org.json.JSONObject d18 = context.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d18);
                jSONObject2 = p0Var.f(jSONObject2, d18);
            }
            if (context.f439085b.c() != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(context.f439085b.c().b())) {
                jSONObject2 = p0Var.f(jSONObject2, new org.json.JSONObject(context.f439085b.c().b()));
            }
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ECS_O.Router.MBApp", e19, "nativeExtraData parse error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.MBApp", "[MBAppRouter] extraParamInfo: " + jSONObject2);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("mbAppInfo", mo14344x5f01b1f6);
        intent.putExtra("nativeExtraData", jSONObject2.toString());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.Router.MBApp", "startActivity");
        w10.c cVar = new w10.c(this, context);
        boolean z17 = context.c() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        int i17 = this.f523498c;
        if (z17) {
            android.content.Context c19 = context.c();
            j45.l.w(c19 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) c19 : null, "com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI", intent, i17, new w10.a(cVar));
        } else if (context.c() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            android.content.Context c27 = context.c();
            j45.l.x(c27 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) c27 : null, "com.tencent.mm.feature.ecs.nirvana.ui.MagicEcsNirvanaUI", intent, i17, new w10.b(cVar));
        }
        bw5.n8 n8Var = new bw5.n8();
        n8Var.f112076m = true;
        n8Var.f112077n[7] = true;
        callback.b(n8Var);
    }

    @Override // t10.c
    public void c(pq.a context, bw5.x7 jumpInfo, bw5.l8 l8Var, t10.d callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        g10.v vVar = (g10.v) ((c00.i4) i95.n0.c(c00.i4.class));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "enablePreloadBiz: " + ((java.lang.Number) ((jz5.n) vVar.f349086e).mo141623x754a37bb()).intValue());
        boolean z17 = true;
        if (!(((java.lang.Number) ((jz5.n) vVar.f349086e).mo141623x754a37bb()).intValue() > 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, not enable");
            return;
        }
        if (jumpInfo.e() != null) {
            java.lang.String b17 = jumpInfo.e().b();
            if (b17 != null && b17.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                boolean Ni = vVar.Ni(jumpInfo.e());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, isLatest = " + Ni);
                if (!Ni) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, not latest, update async, not preload");
                    p3325xe03a0797.p3326xc267989b.l.d(vVar.f349085d, null, null, new g10.n(vVar, jumpInfo, null), 3, null);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "preload, bizName = " + jumpInfo.e().b() + ", isMainProcess = " + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n());
                java.lang.String b18 = jumpInfo.e().b();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    pm0.v.X(new g10.o(b18, vVar, jumpInfo));
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaFeatureService", "doBizPreload ipc, bizName = " + b18);
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putByteArray("key_jump_info_bytes", jumpInfo.mo14344x5f01b1f6());
                com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(str, bundle, q10.m.class, null);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicEcsNirvanaFeatureService", "preload, jumpInfo is invalid");
    }
}
