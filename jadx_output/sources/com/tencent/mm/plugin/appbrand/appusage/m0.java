package com.tencent.mm.plugin.appbrand.appusage;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.PluginAppBrand.class})
/* loaded from: classes7.dex */
public class m0 extends i95.w implements com.tencent.mm.plugin.appbrand.appusage.a6 {
    @Override // l75.l0
    public void add(l75.q0 q0Var) {
        add(q0Var, android.os.Looper.getMainLooper());
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x008e, code lost:
    
        r0 = (r45.hd7) new r45.hd7().parseFrom(r7.field_commonUseInfo);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a1, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f76362e) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a9, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f76367m) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b1, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r8.f76368n) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b9, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376072g) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376073h) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376074i) != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "reset commonUseAppInfo");
        r8 = r1.D0(r7, r0);
        r8.f76366i = r7.field_appPath;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00de, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376072g) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00e6, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376073h) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ee, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r0.f376074i) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f0, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCommonUsedAppStorage", "wxaCommUseInfo appid:%s, app_nick_name:%s, app_icon_url:%s", r0.f376072g, r0.f376073h, r0.f376074i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0107, code lost:
    
        r10 = r0.f376069d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0109, code lost:
    
        if (r6 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x010b, code lost:
    
        r11 = r6.f369756d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0111, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.L0(r11) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0114, code lost:
    
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011c, code lost:
    
        if (r11.hasNext() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x011e, code lost:
    
        r12 = (r45.fn5) r11.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        if (r12.f374467d != r10) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0128, code lost:
    
        r10 = r12.f374468e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012c, code lost:
    
        r8.f76374t = r10;
        r10 = new com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo();
        r10.f76337d = r0.f376069d;
        r10.f76338e = r0.f376070e;
        r10.f76339f = r0.f376071f;
        r8.f76375u = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
    
        r10 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0142, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandCommonUsedAppStorage", r0, "", new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0066, code lost:
    
        if (r4.moveToFirst() != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0068, code lost:
    
        r7 = new com.tencent.mm.plugin.appbrand.appusage.g0();
        r7.convertFrom(r4);
        r8 = k91.k4.b(r1.z0(r7.field_username, r7.field_versionType), r7.field_username, r7.field_versionType, -1, false, "");
        r8.f76366i = r7.field_appPath;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x008b, code lost:
    
        if (r7.field_commonUseInfo == null) goto L46;
     */
    @Override // com.tencent.mm.plugin.appbrand.appusage.a6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List t0(int r17) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appusage.m0.t0(int):java.util.List");
    }

    @Override // com.tencent.mm.plugin.appbrand.appusage.a6
    public boolean x0(java.lang.String str, int i17) {
        return ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).J0(str, i17);
    }

    @Override // l75.l0
    public void add(l75.q0 q0Var, android.os.Looper looper) {
        if (com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class) != null) {
            ((com.tencent.mm.plugin.appbrand.appusage.l0) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.l0.class)).add(q0Var, looper);
        }
    }
}
