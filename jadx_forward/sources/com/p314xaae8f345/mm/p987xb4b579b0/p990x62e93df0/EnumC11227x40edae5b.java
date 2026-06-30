package com.p314xaae8f345.mm.p987xb4b579b0.p990x62e93df0;

/* renamed from: com.tencent.mm.opensdk.diffdev.OAuthErrCode */
/* loaded from: classes15.dex */
public enum EnumC11227x40edae5b {
    WechatAuth_Err_OK(0),
    WechatAuth_Err_NormalErr(-1),
    WechatAuth_Err_NetworkErr(-2),
    WechatAuth_Err_JsonDecodeErr(-3),
    WechatAuth_Err_Cancel(-4),
    WechatAuth_Err_Timeout(-5),
    WechatAuth_Err_Auth_Stopped(-6);


    /* renamed from: code */
    private int f32859x2eaded;

    EnumC11227x40edae5b(int i17) {
        this.f32859x2eaded = i17;
    }

    /* renamed from: getCode */
    public final int m48416xfb7e1663() {
        return this.f32859x2eaded;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return "OAuthErrCode:" + this.f32859x2eaded;
    }
}
