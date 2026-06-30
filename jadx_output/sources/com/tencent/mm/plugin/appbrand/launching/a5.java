package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes4.dex */
public final class a5 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String[] f84486d = {l75.n0.getCreateSQLs(com.tencent.mm.plugin.appbrand.launching.z4.f85460s, "DevPkgLaunchExtInfo")};

    public a5(l75.k0 k0Var) {
        super(k0Var, com.tencent.mm.plugin.appbrand.launching.z4.f85460s, "DevPkgLaunchExtInfo", dm.l2.f238198h);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0096 -> B:26:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean D0(java.lang.String r11, int r12, java.lang.String r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.launching.a5.D0(java.lang.String, int, java.lang.String, boolean):boolean");
    }

    public java.lang.String y0(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        com.tencent.mm.plugin.appbrand.launching.z4 z4Var = new com.tencent.mm.plugin.appbrand.launching.z4();
        z4Var.field_appId = str;
        z4Var.field_versionType = i17;
        return super.get(z4Var, com.tencent.mm.plugin.appbrand.launching.z4.f85459r) ? z4Var.field_extJson : "";
    }

    public boolean z0(java.lang.String str, int i17, java.lang.String str2) {
        return D0(str, i17, str2, true);
    }
}
