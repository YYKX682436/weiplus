package com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3099x658188d.jce;

/* renamed from: com.tencent.tmassistantsdk.openSDK.param.jce.IPCBaseParam */
/* loaded from: classes13.dex */
public final class C26724xb2aa7ba0 extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: channelId */
    public java.lang.String f56502x5720517e;

    /* renamed from: hostAppId */
    public java.lang.String f56503xd396e254;

    /* renamed from: taskAppId */
    public java.lang.String f56504x9200497;

    /* renamed from: taskPackageName */
    public java.lang.String f56505x4225cd2c;

    /* renamed from: taskVersion */
    public java.lang.String f56506x857e2f93;
    public java.lang.String uin;

    /* renamed from: uinType */
    public java.lang.String f56507xe69c0ab4;
    public java.lang.String via;

    public C26724xb2aa7ba0() {
        this.f56503xd396e254 = "";
        this.f56504x9200497 = "";
        this.f56506x857e2f93 = "";
        this.f56505x4225cd2c = "";
        this.uin = "";
        this.f56507xe69c0ab4 = "";
        this.via = "";
        this.f56502x5720517e = "";
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f56503xd396e254 = c2859xe10ac61e.m21321xe22f9d47(0, true);
        this.f56504x9200497 = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f56506x857e2f93 = c2859xe10ac61e.m21321xe22f9d47(2, true);
        this.f56505x4225cd2c = c2859xe10ac61e.m21321xe22f9d47(3, true);
        this.uin = c2859xe10ac61e.m21321xe22f9d47(4, false);
        this.f56507xe69c0ab4 = c2859xe10ac61e.m21321xe22f9d47(5, false);
        this.via = c2859xe10ac61e.m21321xe22f9d47(6, false);
        this.f56502x5720517e = c2859xe10ac61e.m21321xe22f9d47(7, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        c2860x6de9642d.m21349x6c257df(this.f56503xd396e254, 0);
        java.lang.String str = this.f56504x9200497;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 1);
        }
        c2860x6de9642d.m21349x6c257df(this.f56506x857e2f93, 2);
        c2860x6de9642d.m21349x6c257df(this.f56505x4225cd2c, 3);
        java.lang.String str2 = this.uin;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 4);
        }
        java.lang.String str3 = this.f56507xe69c0ab4;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 5);
        }
        java.lang.String str4 = this.via;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 6);
        }
        java.lang.String str5 = this.f56502x5720517e;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 7);
        }
    }

    public C26724xb2aa7ba0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        this.f56503xd396e254 = str;
        this.f56504x9200497 = str2;
        this.f56506x857e2f93 = str3;
        this.f56505x4225cd2c = str4;
        this.uin = str5;
        this.f56507xe69c0ab4 = str6;
        this.via = str7;
        this.f56502x5720517e = str8;
    }
}
