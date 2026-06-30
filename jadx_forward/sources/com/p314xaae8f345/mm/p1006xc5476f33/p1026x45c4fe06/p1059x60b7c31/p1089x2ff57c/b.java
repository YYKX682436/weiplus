package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c;

@j95.b
/* loaded from: classes7.dex */
public final class b extends i95.w implements ft.x3 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.tencent.mm.plugin.appbrand.appstorage.u1] */
    public java.lang.String Ai(java.lang.String str, java.lang.String str2) {
        k91.v5 k17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 j3Var;
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11693xc4fcf5fe d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.d(str, str2);
        if (d17 != null) {
            return d17.f157636e;
        }
        if (!(str == null || str.length() == 0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(str);
            if (b17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2 mo48802x59eafec1 = b17.mo48802x59eafec1();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo48802x59eafec1, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.file.AppBrandRuntimeFileSystemRegistry");
                j3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.f) mo48802x59eafec1).a("wxfile://usr");
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && (k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij().k1(str, "dynamicInfo")) != null) {
                long j17 = k17.v0().f387239a.f158954s;
                if (j17 <= 0) {
                    j17 = 10;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j3 i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1089x2ff57c.l2.i(gm0.j1.b().j(), str);
                i17.f157760f = j17;
                j3Var = i17;
            }
            if (j3Var == null && (mo49620x1d537609 = j3Var.mo49620x1d537609(str2)) != null) {
                return mo49620x1d537609.o();
            }
        }
        j3Var = null;
        return j3Var == null ? null : null;
    }

    public java.lang.String wi(java.lang.String str, com.p314xaae8f345.mm.vfs.r6 r6Var, java.lang.String str2, boolean z17) {
        if ((str == null || str.length() == 0) || r6Var == null || !r6Var.A() || !r6Var.m()) {
            return null;
        }
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.C11694xde197cf.b(str, r6Var.o(), str2, z17).f157635d;
    }
}
