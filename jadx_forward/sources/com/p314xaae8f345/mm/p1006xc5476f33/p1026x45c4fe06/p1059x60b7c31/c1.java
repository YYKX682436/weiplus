package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c1 f161687a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c1();

    public final boolean a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CheckIsThirdAppInstalledLogic", "checkByDeepLinkUrl, deepLinkUrl: " + str);
        if (str == null) {
            return false;
        }
        java.util.List w17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.w1(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(str)));
        return !(w17 == null || w17.isEmpty());
    }
}
