package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.IPCHead */
/* loaded from: classes13.dex */
public final class C26727xa1fcfffc extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: cmdId */
    public int f56537x5a623f5;

    /* renamed from: hostPackageName */
    public java.lang.String f56538xab3ca929;

    /* renamed from: hostVersionCode */
    public java.lang.String f56539x9e1d2c1d;

    /* renamed from: requestId */
    public int f56540x295c940a;

    public C26727xa1fcfffc() {
        this.f56540x295c940a = 0;
        this.f56537x5a623f5 = 0;
        this.f56538xab3ca929 = "";
        this.f56539x9e1d2c1d = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56540x295c940a = c2859xe10ac61e.m21299x355996(this.f56540x295c940a, 0, true);
        this.f56537x5a623f5 = c2859xe10ac61e.m21299x355996(this.f56537x5a623f5, 1, true);
        this.f56538xab3ca929 = c2859xe10ac61e.m21321xe22f9d47(2, true);
        this.f56539x9e1d2c1d = c2859xe10ac61e.m21321xe22f9d47(3, true);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21338x6c257df(this.f56540x295c940a, 0);
        c2860x6de9642d.m21338x6c257df(this.f56537x5a623f5, 1);
        c2860x6de9642d.m21349x6c257df(this.f56538xab3ca929, 2);
        c2860x6de9642d.m21349x6c257df(this.f56539x9e1d2c1d, 3);
    }

    public C26727xa1fcfffc(int i17, int i18, java.lang.String str, java.lang.String str2) {
        this.f56540x295c940a = i17;
        this.f56537x5a623f5 = i18;
        this.f56538xab3ca929 = str;
        this.f56539x9e1d2c1d = str2;
    }
}
