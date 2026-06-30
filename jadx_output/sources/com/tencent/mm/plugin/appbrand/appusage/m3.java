package com.tencent.mm.plugin.appbrand.appusage;

/* loaded from: classes7.dex */
public final class m3 extends com.tencent.mm.modelbase.i {
    public m3(java.util.List opList, int i17) {
        kotlin.jvm.internal.o.g(opList, "opList");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70665b = new r45.ht6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/updatestarrecord";
        lVar.f70667d = 1839;
        r45.gt6 gt6Var = new r45.gt6();
        gt6Var.f375530e.addAll(opList);
        gt6Var.f375529d = i17;
        lVar.f70664a = gt6Var;
        p(lVar.a());
    }
}
