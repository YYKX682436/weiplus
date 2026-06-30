package com.tencent.mm.plugin.appbrand.report.quality;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f88227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.report.quality.QualitySession f88228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC f88229f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC) {
        super(0);
        this.f88227d = i17;
        this.f88228e = qualitySession;
        this.f88229f = appBrandInitConfigWC;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String[] strArr = gm0.j1.f273205l;
        int i18 = 0;
        while (true) {
            i17 = this.f88227d;
            if (i18 >= 5) {
                break;
            }
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b + strArr[i18];
            if (!kotlin.jvm.internal.o.b(bm5.f1.a(), str)) {
                if (com.tencent.mm.sdk.platformtools.x2.o(str)) {
                    com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) com.tencent.mm.ipcinvoker.extension.l.b(str, com.tencent.mm.ipcinvoker.type.IPCVoid.f68407d, com.tencent.mm.plugin.appbrand.report.quality.k.class);
                    i17 = iPCInteger != null ? iPCInteger.f68404d : 0;
                } else {
                    i17 = -1;
                }
            }
            linkedList.addLast(java.lang.Integer.valueOf(i17));
            i18++;
        }
        com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct weAppQualityRuntimeStateStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppQualityRuntimeStateStruct();
        com.tencent.mm.plugin.appbrand.report.quality.QualitySession qualitySession = this.f88228e;
        weAppQualityRuntimeStateStruct.f62646d = weAppQualityRuntimeStateStruct.b("InstanceId", qualitySession.f88134d, true);
        weAppQualityRuntimeStateStruct.f62647e = weAppQualityRuntimeStateStruct.b("AppId", qualitySession.f88135e, true);
        weAppQualityRuntimeStateStruct.f62648f = qualitySession.f88139i;
        int i19 = qualitySession.f88136f;
        weAppQualityRuntimeStateStruct.f62649g = i19 != 1 ? i19 != 2 ? i19 != 3 ? null : cm.c0.demo : cm.c0.debug : cm.c0.release;
        weAppQualityRuntimeStateStruct.f62650h = qualitySession.f88137g;
        weAppQualityRuntimeStateStruct.f62651i = qualitySession.f88138h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if ((((java.lang.Number) obj).intValue() >= 0) != false) {
                arrayList.add(obj);
            }
        }
        weAppQualityRuntimeStateStruct.f62652j = arrayList.size() - (this.f88229f.f77296i2 ? 1L : 0L);
        weAppQualityRuntimeStateStruct.f62653k = i17;
        weAppQualityRuntimeStateStruct.f62654l = weAppQualityRuntimeStateStruct.b("distribution", u46.l.h(linkedList, "_"), true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.f193072b);
        sb6.append(":tools");
        weAppQualityRuntimeStateStruct.f62655m = com.tencent.mm.sdk.platformtools.x2.o(sb6.toString()) ? 1L : 0L;
        weAppQualityRuntimeStateStruct.k();
        return jz5.f0.f302826a;
    }
}
