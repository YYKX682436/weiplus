package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public abstract class xe {
    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc, java.lang.String sourceInstanceId, java.lang.String migrateTargetAppId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c12362x460991bc, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceInstanceId, "sourceInstanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(migrateTargetAppId, "migrateTargetAppId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = c12362x460991bc.f166443o;
        boolean z17 = c12559xbdae8559 != null && c12559xbdae8559.f169325h == 1;
        if (c12559xbdae8559 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RuntimeMigrateRestartHelper", "resetForMigrateStart, sourceInstanceId:" + sourceInstanceId + ", migrateTargetAppId:" + migrateTargetAppId + ", missing statObj in old LaunchParcel");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
            c12362x460991bc.f166443o = c12559xbdae85592;
            c12559xbdae85592.f169323f = 1000;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str = c12362x460991bc.f166435e;
        if (str == null || str.length() == 0) {
            c12362x460991bc.f166435e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.e0.f(c12362x460991bc);
        }
        java.lang.String str2 = c12362x460991bc.f166435e;
        if (!(str2 == null || str2.length() == 0)) {
            java.lang.String appId = c12362x460991bc.f166435e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            hashMap.put("migrateSourceAppId", appId);
        }
        java.lang.String str3 = c12362x460991bc.f166439i;
        if (str3 == null) {
            str3 = "";
        }
        if (r26.n0.u0(str3).toString().length() > 0) {
            java.lang.String a17 = nf.z.a(c12362x460991bc.f166439i);
            java.lang.String n17 = u46.l.n(a17 != null ? a17 : "", ".html");
            java.lang.String g07 = kz5.n0.g0(((java.util.HashMap) nf.z.c(c12362x460991bc.f166439i)).entrySet(), "&", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.we.f172495d, 30, null);
            java.lang.String a18 = fp.s0.a(n17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "encode(...)");
            hashMap.put("migrateSourcePath", a18);
            java.lang.String a19 = fp.s0.a(g07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "encode(...)");
            hashMap.put("migrateSourceQuery", a19);
        }
        hashMap.put("migrateSourceScene", java.lang.String.valueOf(c12362x460991bc.f166443o.f169323f));
        hashMap.put("migrateSourceAppIdIsStared", z17 ? "1" : "0");
        c12362x460991bc.f166434d = null;
        c12362x460991bc.f166435e = migrateTargetAppId;
        c12362x460991bc.f166445p0 = true;
        c12362x460991bc.M = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1141xc84c5534.C12376xdd2459a1(sourceInstanceId, wg1.b.f527247g.h());
        c12362x460991bc.f166443o.f169323f = 1248;
        java.util.Set entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        c12362x460991bc.f166439i = "?".concat(kz5.n0.g0(entrySet, "&", null, null, 0, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ve.f172393d, 30, null));
    }
}
