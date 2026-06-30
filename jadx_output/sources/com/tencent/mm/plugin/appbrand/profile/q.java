package com.tencent.mm.plugin.appbrand.profile;

/* loaded from: classes7.dex */
public final class q implements qk.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.profile.v f87703a;

    public q(com.tencent.mm.plugin.appbrand.profile.v vVar) {
        this.f87703a = vVar;
    }

    @Override // qk.u6
    public java.lang.String a() {
        com.tencent.mm.plugin.appbrand.profile.v vVar = this.f87703a;
        com.tencent.mm.plugin.appbrand.e9 e9Var = vVar.f87696e;
        if (e9Var != null) {
            kotlin.jvm.internal.o.d(e9Var);
            if (e9Var.getRuntime() != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.appbrand.e9 e9Var2 = vVar.f87696e;
                kotlin.jvm.internal.o.d(e9Var2);
                sb6.append(cf.c.a(e9Var2).f77279e);
                sb6.append('-');
                com.tencent.mm.plugin.appbrand.e9 e9Var3 = vVar.f87696e;
                kotlin.jvm.internal.o.d(e9Var3);
                sb6.append(e9Var3.getAppId());
                return sb6.toString();
            }
        }
        return "小程序预调试环境(调试冷启动需先连接)-" + vVar.f87707o;
    }

    @Override // qk.u6
    public void b(java.lang.String str) {
        qk.v6 v6Var = (qk.v6) ((jz5.n) this.f87703a.f87708p).getValue();
        if (v6Var != null) {
            ((xz1.k) v6Var).Di(this, str);
        }
    }

    @Override // qk.u6
    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageProfileManagerWC", this + " onOpen");
    }

    @Override // qk.u6
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.appbrand.jsruntime.t f147808e;
        java.lang.Boolean bool;
        boolean z17 = false;
        com.tencent.mm.plugin.appbrand.profile.v vVar = this.f87703a;
        if (str != null) {
            com.tencent.mm.plugin.appbrand.profile.e eVar = vVar.f87711s;
            if (eVar != null) {
                com.tencent.mm.plugin.appbrand.profile.u uVar = (com.tencent.mm.plugin.appbrand.profile.u) eVar;
                org.json.JSONObject jSONObject = new org.json.JSONObject(str);
                java.lang.String optString = jSONObject.optString(ya.b.METHOD, "");
                kotlin.jvm.internal.o.d(optString);
                if (r26.n0.B(optString, "HeapProfiler", false)) {
                    if (jSONObject.has(dm.i4.COL_ID)) {
                        uVar.f87706a.add(java.lang.Integer.valueOf(jSONObject.getInt(dm.i4.COL_ID)));
                    }
                    z17 = true;
                }
                bool = java.lang.Boolean.valueOf(z17);
            } else {
                bool = null;
            }
            z17 = kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE);
        }
        if (z17) {
            vVar.m(str);
            return;
        }
        kotlin.jvm.internal.o.d(str);
        vVar.getClass();
        if (vVar.f87695d) {
            java.lang.String format = java.lang.String.format(java.util.Locale.ENGLISH, "ProfileGlobal.onExternalInspectMessage('%s')", java.util.Arrays.copyOf(new java.lang.Object[]{com.tencent.mm.plugin.appbrand.utils.w2.a(str)}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            com.tencent.mm.plugin.appbrand.e9 e9Var = vVar.f87696e;
            if (e9Var == null || (f147808e = e9Var.getF147808e()) == null) {
                return;
            }
            f147808e.evaluateJavascript(format, new com.tencent.mm.plugin.appbrand.profile.t(str));
        }
    }

    @Override // qk.u6
    public java.lang.String description() {
        return a();
    }

    @Override // qk.u6
    public java.lang.String name() {
        return "MiniProgramEnvironment-" + this.f87703a.f87707o;
    }

    @Override // qk.u6
    public void onClose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageProfileManagerWC", this + " onClose");
    }
}
