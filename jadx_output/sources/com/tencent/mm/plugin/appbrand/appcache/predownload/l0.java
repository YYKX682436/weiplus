package com.tencent.mm.plugin.appbrand.appcache.predownload;

/* loaded from: classes7.dex */
public final class l0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.q6 f75866d;

    public l0(com.tencent.mm.plugin.appbrand.service.q6 q6Var) {
        this.f75866d = q6Var;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.service.r6 r6Var;
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        int i17 = 0;
        int i18 = iPCInteger != null ? iPCInteger.f68404d : 0;
        com.tencent.mm.plugin.appbrand.service.p6 p6Var = this.f75866d.f88756f;
        if (p6Var != null) {
            com.tencent.mm.plugin.appbrand.service.r6[] values = com.tencent.mm.plugin.appbrand.service.r6.values();
            int length = values.length;
            while (true) {
                if (i17 >= length) {
                    r6Var = com.tencent.mm.plugin.appbrand.service.r6.Unknown;
                    break;
                }
                r6Var = values[i17];
                if (r6Var.ordinal() == i18) {
                    break;
                } else {
                    i17++;
                }
            }
            p6Var.a(r6Var);
        }
    }
}
