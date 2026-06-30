package com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a;

/* renamed from: com.tencent.mm.opensdk.modelbase.BaseReq */
/* loaded from: classes9.dex */
public abstract class AbstractC11229x4f6513ed {

    /* renamed from: openId */
    public java.lang.String f32865xc3c3c505;

    /* renamed from: transaction */
    public java.lang.String f32866x7fa0d2de;

    /* renamed from: checkArgs */
    public abstract boolean mo48424x17b96605();

    /* renamed from: fromBundle */
    public void mo48425x63aa4ccc(android.os.Bundle bundle) {
        this.f32866x7fa0d2de = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_basereq_transaction");
        this.f32865xc3c3c505 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_basereq_openid");
    }

    /* renamed from: getType */
    public abstract int mo48426xfb85f7b0();

    /* renamed from: toBundle */
    public void mo48427x792022dd(android.os.Bundle bundle) {
        bundle.putInt("_wxapi_command_type", mo48426xfb85f7b0());
        bundle.putString("_wxapi_basereq_transaction", this.f32866x7fa0d2de);
        bundle.putString("_wxapi_basereq_openid", this.f32865xc3c3c505);
    }
}
