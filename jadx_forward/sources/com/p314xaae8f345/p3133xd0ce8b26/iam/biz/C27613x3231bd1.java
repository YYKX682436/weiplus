package com.p314xaae8f345.p3133xd0ce8b26.iam.biz;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.wechat.iam.biz.ZIDL_vXOGH7AM4KE */
/* loaded from: classes11.dex */
public class C27613x3231bd1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f299269a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: ZIDL_NI */
    private void m118211x1964d303(boolean z17, byte[] bArr, boolean z18, byte[] bArr2, boolean z19, byte[] bArr3) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f299269a;
        com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
            com.p314xaae8f345.p3133xd0ce8b26.p3174x39188a.C27711x2a8caa.a("IamBizServiceProxyManagerKE", "onBizPhotoEnableUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u1 u1Var = (com.p314xaae8f345.p3133xd0ce8b26.iam.biz.u1) entry.getValue();
            java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str2 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
            java.lang.String str3 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
            ((t01.d) u1Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "onMeTabPhotoEnableUpdatedEvent, enableBizPicNewName: " + z17 + ", enableBizPicNewNameValue: " + str + ", canViewEnable: " + z18 + ", canViewEnableValue: " + str2 + ", canCreateEnable: " + z19 + ", canCreateEnableValue: " + str3);
            if (!z19) {
                t01.i iVar = t01.m.f495932d;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 a17 = t01.i.a(iVar);
                java.lang.String str4 = t01.m.f495935g;
                java.lang.String u17 = a17.u(str4, "");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u17);
                if (u17.length() > 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb B0 = zy2.fa.B0(t01.i.c(iVar), "FinderMyTab", u17, false, false, 12, null);
                    if (B0 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "clean finder me tab redDot");
                        zy2.fa.J0(t01.i.c(iVar), B0, "FinderMyTab", true, null, 8, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb B02 = zy2.fa.B0(t01.i.c(iVar), "MyTabPhotoProfile", u17, false, false, 12, null);
                    if (B02 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "clean photo redDot");
                        zy2.fa.J0(t01.i.c(iVar), B02, "MyTabPhotoProfile", true, null, 8, null);
                    }
                    t01.i.a(iVar).D(str4, "");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalFinderRedDot", "tipsUuid is empty, skip clean redDot");
                }
            }
        }
    }
}
