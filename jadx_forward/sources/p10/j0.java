package p10;

/* loaded from: classes7.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 f432496d;

    public j0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1) {
        this.f432496d = activityC10542x4d3a27a1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBizEnv, container post, current activity state, isFinishing: ");
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10542x4d3a27a1 activityC10542x4d3a27a1 = this.f432496d;
        sb6.append(activityC10542x4d3a27a1.isFinishing());
        sb6.append(", isDestroyed: ");
        sb6.append(activityC10542x4d3a27a1.isDestroyed());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", sb6.toString());
        if (activityC10542x4d3a27a1.isFinishing() || activityC10542x4d3a27a1.isDestroyed()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", "initBizEnv, container post, start send create canvas event");
        activityC10542x4d3a27a1.f147370f = true;
        iq0.c cVar = activityC10542x4d3a27a1.f147372h;
        if (cVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", "initBizEnv, container post, start send create canvas event, bizHandle not null");
            float width = activityC10542x4d3a27a1.V6().getWidth();
            bf3.p0 p0Var = bf3.p0.f101178a;
            float a17 = width / p0Var.a();
            float height = r6.getHeight() / p0Var.a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsNirvanaUI", "show, width: " + a17 + ", height: " + height);
            try {
                str2 = activityC10542x4d3a27a1.f147378q;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MagicEcsNirvanaUI", "Failed to parse nativeExtraData as JSON, using original: " + e17);
                str = activityC10542x4d3a27a1.f147378q;
                if (str == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nativeExtraData");
                    throw null;
                }
            }
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("nativeExtraData");
                throw null;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (!jSONObject.has(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984)) {
                jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.util.UUID.randomUUID().toString());
            }
            jSONObject.put("isPreloadBiz", cVar.f375179c);
            str = jSONObject.toString();
            java.lang.String str3 = str;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            java.lang.String str4 = activityC10542x4d3a27a1.f147377p;
            if (str4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("initParams");
                throw null;
            }
            ((nq0.p) tVar).Ui(cVar, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.mb.p731x60b7c31.C10539xd6c03710(a17, height, 0, 0, str4, str3));
        }
    }
}
