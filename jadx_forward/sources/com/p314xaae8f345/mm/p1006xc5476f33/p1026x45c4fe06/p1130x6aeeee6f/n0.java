package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f;

/* loaded from: classes7.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f165554a = {false};

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t a(android.content.Context context, int i17, boolean z17, java.lang.String str, boolean z18, byte[] bArr, java.lang.String str2, boolean z19, int i18, boolean z27, boolean z28, boolean z29, int i19, boolean z37, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.m mVar, cl.o oVar) {
        b();
        com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0 c5138xafbea1a0 = new com.p314xaae8f345.mm.p627x45c4fe06.v8.C5138xafbea1a0();
        c5138xafbea1a0.f135476a = str;
        c5138xafbea1a0.f135477b = str2;
        c5138xafbea1a0.f135478c = z19;
        c5138xafbea1a0.f135479d = bArr;
        c5138xafbea1a0.f135480e = i18;
        c5138xafbea1a0.f135481f = "1";
        c5138xafbea1a0.f135482g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_appbrand_jsbridge_function_direct_evaluate, true);
        c5138xafbea1a0.f135483h = z29;
        c5138xafbea1a0.f135484i = z27;
        c5138xafbea1a0.f135485j = z28;
        c5138xafbea1a0.f135489n = new java.lang.ref.WeakReference(mVar);
        c5138xafbea1a0.f135488m = z18;
        c5138xafbea1a0.f135487l = i19;
        c5138xafbea1a0.f135492q = oVar;
        if (z37) {
            c5138xafbea1a0.f135493r = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "[no-node] config.skipNode = true");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.o0(c5138xafbea1a0);
        int o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.AppBrandJsRuntimeFactory", 2, null).o("V8MinimalCodeLength", 1024);
        cl.a aVar = (cl.a) o0Var.f165501f;
        aVar.getClass();
        iz5.a.g(null, o17 >= 0);
        aVar.f124118r = o17;
        com.p159x477cd522.p160x333422.C1460x397c7778 c1460x397c7778 = aVar.f124101a;
        if (c1460x397c7778 != null) {
            c1460x397c7778.m15880xc7e91772(o17);
        }
        if (o0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(434L, 5L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandJ2V8BasedJsEngine");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(434L, 6L, 1L, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "Using AppBrandNodeJSBasedJsEngine");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(434L, 0L, 1L, false);
        return o0Var;
    }

    public static void b() {
        boolean z17;
        boolean[] zArr = f165554a;
        if (zArr[0]) {
            z17 = true;
        } else {
            synchronized (zArr) {
                z17 = zArr[0];
            }
        }
        if (z17) {
            return;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_v8_init_flag_v8_98, "--min_semi_space_size=4 --max_semi_space_size=8 --wasm_lazy_compilation", true);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        java.lang.String str2 = "--verify_snapshot_checksum";
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
            str2 = Zi + " --verify_snapshot_checksum";
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f2.f165519a.b()) {
            str2 = str2 + " " + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f2.f165521c;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_v8_enable_trap_handler, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandJsRuntimeFactory", "set v8 flag:%s trapHandler:%b", str2, java.lang.Boolean.valueOf(fj6));
        com.p159x477cd522.p160x333422.V8.m16097x52fbaf45(str2);
        com.p159x477cd522.p160x333422.V8.m16062xbbce01da(fj6);
        zArr[0] = true;
        cl.r3.f124288c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.m0();
    }

    public static void c(int i17) {
        if (i17 >= 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.N("MicroMsg.AppBrandJsRuntimeFactory", 2, null).A("V8MinimalCodeLength", i17);
        }
    }
}
