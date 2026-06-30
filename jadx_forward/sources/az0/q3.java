package az0;

/* loaded from: classes5.dex */
public final class q3 extends qz5.l implements yz5.p {
    public q3(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.q3(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new az0.q3((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pp0.p0 p0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.l.f(null, new az0.p3(null), 1, null);
        az0.i5 i5Var = az0.i5.f97090a;
        float f17 = az0.i5.f97091b;
        if (f17 >= 0.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "device cpu score: " + f17);
            i5Var.q().t("kFAAnalysisCpuScore", java.lang.String.valueOf(f17));
        }
        float f18 = az0.i5.f97092c;
        if (f18 >= 0.0d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "device gpu score: " + f18);
            i5Var.q().t("kFAAnalysisGpuScore", java.lang.String.valueOf(f18));
        }
        if (((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20424x7989b13()) == 1) {
            i5Var.q().t("CSUseBeautyScript", "1");
        } else {
            i5Var.q().t("CSUseBeautyScript", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20428x25966502()) == 1) {
            i5Var.q().t("kBUEnableBeautyScriptDebug", "1");
        } else {
            i5Var.q().t("kBUEnableBeautyScriptDebug", "0");
        }
        int nj6 = ((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20430xb4706a60());
        int nj7 = ((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20431x53f51ddc());
        boolean z17 = f17 >= ((float) nj6) && f18 >= ((float) nj7);
        boolean z18 = ((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20429x307b4676()) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "[enableGanSmoothFromExpr] cpuScoreThreshold:" + nj6 + ", gpuScoreThreshold:" + nj7 + ", isDeviceOk:" + z17 + ", enable:" + z18);
        if (z17 && z18) {
            i5Var.q().t("CSEnableGanSmooth", "1");
            i5Var.q().t("GanGpuDevice", "1.0");
        } else {
            i5Var.q().t("CSEnableGanSmooth", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20426xf876fdae()) == 1) {
            i5Var.q().t("kCSEnableBeautySkinSeg", "1");
        } else {
            i5Var.q().t("kCSEnableBeautySkinSeg", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20425x95fdd7f6()) == 1) {
            i5Var.q().t("kCSEnableSeparatedOccForMakeup", "1");
        } else {
            i5Var.q().t("kCSEnableSeparatedOccForMakeup", "0");
        }
        if (((h62.d) i5Var.p()).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2545xe20e94ff.p2547xabf495af.C20421x6c35801()) == 1) {
            for (java.util.Map.Entry entry : ((java.util.HashMap) ((p05.v2) ((rh0.x) i95.n0.c(rh0.x.class))).Ai(rh0.z.f477151o)).entrySet()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "Device algo config: " + ((java.lang.String) entry.getKey()) + " = " + ((java.lang.String) entry.getValue()));
                i5Var.q().t((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
            }
        }
        az0.w2 w2Var = az0.w2.f97524d;
        if (!w2Var.d() || w2Var.a() == null) {
            az0.i5 i5Var2 = az0.i5.f97090a;
            p0Var = (az0.s9) p3325xe03a0797.p3326xc267989b.l.f(null, new az0.w3(null), 1, null);
            if (p0Var == null) {
                return null;
            }
            az0.i5.f97108s = p0Var;
        } else {
            az0.i5 i5Var3 = az0.i5.f97090a;
            p0Var = (az0.xb) p3325xe03a0797.p3326xc267989b.l.f(null, new az0.y3(null), 1, null);
            if (p0Var == null) {
                return null;
            }
            az0.i5.f97108s = p0Var;
        }
        return p0Var;
    }
}
