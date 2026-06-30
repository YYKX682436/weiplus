package com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.jce;

/* renamed from: com.tencent.tmassistantsdk.protocol.jce.UpdateInfoLog */
/* loaded from: classes13.dex */
public final class C26759x4a692a8d extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: actionCode */
    public int f56730x6e599543;

    /* renamed from: appid */
    public long f56731x58b82fc;

    /* renamed from: extra */
    public java.lang.String f56732x5c79410;

    /* renamed from: packageName */
    public java.lang.String f56733x362a8ff1;

    /* renamed from: updateType */
    public byte f56734xee5cafa3;

    /* renamed from: yybExistFlag */
    public byte f56735xac5b9fe1;

    public C26759x4a692a8d() {
        this.f56734xee5cafa3 = (byte) 0;
        this.f56733x362a8ff1 = "";
        this.f56731x58b82fc = 0L;
        this.f56730x6e599543 = 0;
        this.f56735xac5b9fe1 = (byte) 0;
        this.f56732x5c79410 = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56734xee5cafa3 = c2859xe10ac61e.m21296x355996(this.f56734xee5cafa3, 0, true);
        this.f56733x362a8ff1 = c2859xe10ac61e.m21321xe22f9d47(1, true);
        this.f56731x58b82fc = c2859xe10ac61e.m21300x355996(this.f56731x58b82fc, 2, false);
        this.f56730x6e599543 = c2859xe10ac61e.m21299x355996(this.f56730x6e599543, 3, true);
        this.f56735xac5b9fe1 = c2859xe10ac61e.m21296x355996(this.f56735xac5b9fe1, 4, false);
        this.f56732x5c79410 = c2859xe10ac61e.m21321xe22f9d47(5, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21335x6c257df(this.f56734xee5cafa3, 0);
        c2860x6de9642d.m21349x6c257df(this.f56733x362a8ff1, 1);
        c2860x6de9642d.m21339x6c257df(this.f56731x58b82fc, 2);
        c2860x6de9642d.m21338x6c257df(this.f56730x6e599543, 3);
        c2860x6de9642d.m21335x6c257df(this.f56735xac5b9fe1, 4);
        java.lang.String str = this.f56732x5c79410;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 5);
        }
    }

    public C26759x4a692a8d(byte b17, java.lang.String str, long j17, int i17, byte b18, java.lang.String str2) {
        this.f56734xee5cafa3 = b17;
        this.f56733x362a8ff1 = str;
        this.f56731x58b82fc = j17;
        this.f56730x6e599543 = i17;
        this.f56735xac5b9fe1 = b18;
        this.f56732x5c79410 = str2;
    }
}
