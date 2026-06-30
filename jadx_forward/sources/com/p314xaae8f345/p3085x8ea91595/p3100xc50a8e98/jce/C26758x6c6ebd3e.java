package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.TipsInfoLog */
/* loaded from: classes13.dex */
public final class C26758x6c6ebd3e extends com.qq.taf.jce.AbstractC2861x7aec4921 implements java.lang.Cloneable {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f56716x7118e671 = false;
    private static final java.lang.String TAG = "TipsInfoLog";

    /* renamed from: authorizedBtnClickCount */
    public int f56717x9bb45608;

    /* renamed from: authorizedTipsCount */
    public int f56718x5759995c;

    /* renamed from: cancelBtnClickCount */
    public int f56719xe134bf89;

    /* renamed from: downloadBtnClickCount */
    public int f56720xc3ff6c3b;

    /* renamed from: downloadTipsCount */
    public int f56721x1e35c10f;

    /* renamed from: gameChannelId */
    public java.lang.String f56722x75f375ac;

    /* renamed from: gamePackageName */
    public java.lang.String f56723xecc5609f;

    /* renamed from: gameVersionCode */
    public int f56724xdfa5e393;

    /* renamed from: installBtnClickCount */
    public int f56725x21012608;

    /* renamed from: installTipsCount */
    public int f56726xa38e695c;

    /* renamed from: networkErrorTipsCount */
    public int f56727x63ae255d;

    /* renamed from: userId */
    public java.lang.String f56728xce2b2e46;

    /* renamed from: userIdType */
    public java.lang.String f56729x4ce69ea0;

    public C26758x6c6ebd3e() {
        this.f56728xce2b2e46 = "";
        this.f56729x4ce69ea0 = "";
        this.f56723xecc5609f = "";
        this.f56724xdfa5e393 = 0;
        this.f56722x75f375ac = "";
        this.f56718x5759995c = 0;
        this.f56721x1e35c10f = 0;
        this.f56726xa38e695c = 0;
        this.f56727x63ae255d = 0;
        this.f56719xe134bf89 = 0;
        this.f56720xc3ff6c3b = 0;
        this.f56725x21012608 = 0;
        this.f56717x9bb45608 = 0;
    }

    /* renamed from: className */
    public java.lang.String m105366xff691c23() {
        return "jce.TipsInfoLog";
    }

    /* renamed from: clone */
    public java.lang.Object m105367x5a5dd5d() {
        try {
            return super.clone();
        } catch (java.lang.CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: display */
    public void mo21232x63a518c2(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21252x63a518c2(this.f56728xce2b2e46, "userId");
        c2857xb4f8ac23.m21252x63a518c2(this.f56729x4ce69ea0, "userIdType");
        c2857xb4f8ac23.m21252x63a518c2(this.f56723xecc5609f, "gamePackageName");
        c2857xb4f8ac23.m21248x63a518c2(this.f56724xdfa5e393, "gameVersionCode");
        c2857xb4f8ac23.m21252x63a518c2(this.f56722x75f375ac, "gameChannelId");
        c2857xb4f8ac23.m21248x63a518c2(this.f56718x5759995c, "authorizedTipsCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56721x1e35c10f, "downloadTipsCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56726xa38e695c, "installTipsCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56727x63ae255d, "networkErrorTipsCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56719xe134bf89, "cancelBtnClickCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56720xc3ff6c3b, "downloadBtnClickCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56725x21012608, "installBtnClickCount");
        c2857xb4f8ac23.m21248x63a518c2(this.f56717x9bb45608, "authorizedBtnClickCount");
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: displaySimple */
    public void mo21367x93891d14(java.lang.StringBuilder sb6, int i17) {
        com.qq.taf.jce.C2857xb4f8ac23 c2857xb4f8ac23 = new com.qq.taf.jce.C2857xb4f8ac23(sb6, i17);
        c2857xb4f8ac23.m21273x93891d14(this.f56728xce2b2e46, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56729x4ce69ea0, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56723xecc5609f, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56724xdfa5e393, true);
        c2857xb4f8ac23.m21273x93891d14(this.f56722x75f375ac, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56718x5759995c, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56721x1e35c10f, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56726xa38e695c, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56727x63ae255d, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56719xe134bf89, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56720xc3ff6c3b, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56725x21012608, true);
        c2857xb4f8ac23.m21269x93891d14(this.f56717x9bb45608, false);
    }

    /* renamed from: equals */
    public boolean m105368xb2c87fbf(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e c26758x6c6ebd3e = (com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce.C26758x6c6ebd3e) obj;
        return com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56728xce2b2e46, c26758x6c6ebd3e.f56728xce2b2e46) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56729x4ce69ea0, c26758x6c6ebd3e.f56729x4ce69ea0) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56723xecc5609f, c26758x6c6ebd3e.f56723xecc5609f) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56724xdfa5e393, c26758x6c6ebd3e.f56724xdfa5e393) && com.qq.taf.jce.C2862xf934904e.m21400xb2c87fbf(this.f56722x75f375ac, c26758x6c6ebd3e.f56722x75f375ac) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56718x5759995c, c26758x6c6ebd3e.f56718x5759995c) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56721x1e35c10f, c26758x6c6ebd3e.f56721x1e35c10f) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56726xa38e695c, c26758x6c6ebd3e.f56726xa38e695c) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56727x63ae255d, c26758x6c6ebd3e.f56727x63ae255d) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56719xe134bf89, c26758x6c6ebd3e.f56719xe134bf89) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56720xc3ff6c3b, c26758x6c6ebd3e.f56720xc3ff6c3b) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56725x21012608, c26758x6c6ebd3e.f56725x21012608) && com.qq.taf.jce.C2862xf934904e.m21398xb2c87fbf(this.f56717x9bb45608, c26758x6c6ebd3e.f56717x9bb45608);
    }

    /* renamed from: fullClassName */
    public java.lang.String m105369xe2b78a54() {
        return TAG;
    }

    /* renamed from: getAuthorizedBtnClickCount */
    public int m105370x6bb4bdd2() {
        return this.f56717x9bb45608;
    }

    /* renamed from: getAuthorizedTipsCount */
    public int m105371xaf897626() {
        return this.f56718x5759995c;
    }

    /* renamed from: getCancelBtnClickCount */
    public int m105372x39649c53() {
        return this.f56719xe134bf89;
    }

    /* renamed from: getDownloadBtnClickCount */
    public int m105373xcfab3e85() {
        return this.f56720xc3ff6c3b;
    }

    /* renamed from: getDownloadTipsCount */
    public int m105374x716a4859() {
        return this.f56721x1e35c10f;
    }

    /* renamed from: getGameChannelId */
    public java.lang.String m105375x335331f6() {
        return this.f56722x75f375ac;
    }

    /* renamed from: getGamePackageName */
    public java.lang.String m105376xd1273269() {
        return this.f56723xecc5609f;
    }

    /* renamed from: getGameVersionCode */
    public int m105377xc407b55d() {
        return this.f56724xdfa5e393;
    }

    /* renamed from: getInstallBtnClickCount */
    public int m105378xcecce27e() {
        return this.f56725x21012608;
    }

    /* renamed from: getInstallTipsCount */
    public int m105379x4b66d0d2() {
        return this.f56726xa38e695c;
    }

    /* renamed from: getNetworkErrorTipsCount */
    public int m105380x6f59f7a7() {
        return this.f56727x63ae255d;
    }

    /* renamed from: getUserId */
    public java.lang.String m105381x3342513c() {
        return this.f56728xce2b2e46;
    }

    /* renamed from: getUserIdType */
    public java.lang.String m105382x3b275696() {
        return this.f56729x4ce69ea0;
    }

    /* renamed from: hashCode */
    public int m105383x8cdac1b() {
        try {
            throw new java.lang.Exception("Need define key first!");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56728xce2b2e46 = c2859xe10ac61e.m21321xe22f9d47(0, false);
        this.f56729x4ce69ea0 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56723xecc5609f = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f56724xdfa5e393 = c2859xe10ac61e.m21299x355996(this.f56724xdfa5e393, 3, false);
        this.f56722x75f375ac = c2859xe10ac61e.m21321xe22f9d47(4, false);
        this.f56718x5759995c = c2859xe10ac61e.m21299x355996(this.f56718x5759995c, 5, false);
        this.f56721x1e35c10f = c2859xe10ac61e.m21299x355996(this.f56721x1e35c10f, 6, false);
        this.f56726xa38e695c = c2859xe10ac61e.m21299x355996(this.f56726xa38e695c, 7, false);
        this.f56727x63ae255d = c2859xe10ac61e.m21299x355996(this.f56727x63ae255d, 8, false);
        this.f56719xe134bf89 = c2859xe10ac61e.m21299x355996(this.f56719xe134bf89, 9, false);
        this.f56720xc3ff6c3b = c2859xe10ac61e.m21299x355996(this.f56720xc3ff6c3b, 10, false);
        this.f56725x21012608 = c2859xe10ac61e.m21299x355996(this.f56725x21012608, 11, false);
        this.f56717x9bb45608 = c2859xe10ac61e.m21299x355996(this.f56717x9bb45608, 12, false);
    }

    /* renamed from: setAuthorizedBtnClickCount */
    public void m105384x81e4a346(int i17) {
        this.f56717x9bb45608 = i17;
    }

    /* renamed from: setAuthorizedTipsCount */
    public void m105385xfdce359a(int i17) {
        this.f56718x5759995c = i17;
    }

    /* renamed from: setCancelBtnClickCount */
    public void m105386x87a95bc7(int i17) {
        this.f56719xe134bf89 = i17;
    }

    /* renamed from: setDownloadBtnClickCount */
    public void m105387x9fbdf0f9(int i17) {
        this.f56720xc3ff6c3b = i17;
    }

    /* renamed from: setDownloadTipsCount */
    public void m105388x4d0054cd(int i17) {
        this.f56721x1e35c10f = i17;
    }

    /* renamed from: setGameChannelId */
    public void m105389xc629986a(java.lang.String str) {
        this.f56722x75f375ac = str;
    }

    /* renamed from: setGamePackageName */
    public void m105390x7fdcbdd(java.lang.String str) {
        this.f56723xecc5609f = str;
    }

    /* renamed from: setGameVersionCode */
    public void m105391xfade4ed1(int i17) {
        this.f56724xdfa5e393 = i17;
    }

    /* renamed from: setInstallBtnClickCount */
    public void m105392x4920118a(int i17) {
        this.f56725x21012608 = i17;
    }

    /* renamed from: setInstallTipsCount */
    public void m105393xef6365de(int i17) {
        this.f56726xa38e695c = i17;
    }

    /* renamed from: setNetworkErrorTipsCount */
    public void m105394x3f6caa1b(int i17) {
        this.f56727x63ae255d = i17;
    }

    /* renamed from: setUserId */
    public void m105395x26778548(java.lang.String str) {
        this.f56728xce2b2e46 = str;
    }

    /* renamed from: setUserIdType */
    public void m105396x694ba4a2(java.lang.String str) {
        this.f56729x4ce69ea0 = str;
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.lang.String str = this.f56728xce2b2e46;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 0);
        }
        java.lang.String str2 = this.f56729x4ce69ea0;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 1);
        }
        java.lang.String str3 = this.f56723xecc5609f;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 2);
        }
        c2860x6de9642d.m21338x6c257df(this.f56724xdfa5e393, 3);
        java.lang.String str4 = this.f56722x75f375ac;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 4);
        }
        c2860x6de9642d.m21338x6c257df(this.f56718x5759995c, 5);
        c2860x6de9642d.m21338x6c257df(this.f56721x1e35c10f, 6);
        c2860x6de9642d.m21338x6c257df(this.f56726xa38e695c, 7);
        c2860x6de9642d.m21338x6c257df(this.f56727x63ae255d, 8);
        c2860x6de9642d.m21338x6c257df(this.f56719xe134bf89, 9);
        c2860x6de9642d.m21338x6c257df(this.f56720xc3ff6c3b, 10);
        c2860x6de9642d.m21338x6c257df(this.f56725x21012608, 11);
        c2860x6de9642d.m21338x6c257df(this.f56717x9bb45608, 12);
    }

    public C26758x6c6ebd3e(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18, int i19, int i27, int i28, int i29, int i37, int i38, int i39) {
        this.f56728xce2b2e46 = str;
        this.f56729x4ce69ea0 = str2;
        this.f56723xecc5609f = str3;
        this.f56724xdfa5e393 = i17;
        this.f56722x75f375ac = str4;
        this.f56718x5759995c = i18;
        this.f56721x1e35c10f = i19;
        this.f56726xa38e695c = i27;
        this.f56727x63ae255d = i28;
        this.f56719xe134bf89 = i29;
        this.f56720xc3ff6c3b = i37;
        this.f56725x21012608 = i38;
        this.f56717x9bb45608 = i39;
    }
}
