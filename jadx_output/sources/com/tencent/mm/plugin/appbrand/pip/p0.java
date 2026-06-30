package com.tencent.mm.plugin.appbrand.pip;

/* loaded from: classes7.dex */
public enum p0 implements com.tencent.mm.plugin.appbrand.pip.k {
    INSTANCE;

    public final com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct a(com.tencent.mm.plugin.appbrand.pip.j jVar) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct weAppFloatingVideoStruct = new com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct();
        weAppFloatingVideoStruct.f62274d = weAppFloatingVideoStruct.b("AppId", jVar.f87498a, true);
        weAppFloatingVideoStruct.f62275e = weAppFloatingVideoStruct.b("PagePath", jVar.f87499b, true);
        weAppFloatingVideoStruct.f62276f = weAppFloatingVideoStruct.b("VideoUrl", jVar.f87500c, true);
        return weAppFloatingVideoStruct;
    }

    public void b(com.tencent.mm.plugin.appbrand.pip.j jVar, com.tencent.mm.plugin.appbrand.pip.n nVar) {
        com.tencent.mm.autogen.mmdata.rpt.WeAppFloatingVideoStruct a17 = a(jVar);
        int ordinal = nVar.ordinal();
        int i17 = 1;
        int i18 = ordinal != 0 ? ordinal != 1 ? 6 : 5 : 4;
        a17.f62277g = i18;
        if (6 == i18) {
            int ordinal2 = nVar.ordinal();
            if (ordinal2 != 2) {
                i17 = 3;
                if (ordinal2 == 3) {
                    i17 = 2;
                } else if (ordinal2 != 4) {
                    i17 = ordinal2 != 5 ? 0 : 4;
                }
            }
            a17.f62278h = i17;
        }
        a17.k();
    }
}
