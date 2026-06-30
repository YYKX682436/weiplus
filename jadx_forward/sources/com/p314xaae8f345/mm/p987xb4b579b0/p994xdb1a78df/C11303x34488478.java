package com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df;

/* renamed from: com.tencent.mm.opensdk.modelpay.PayResp */
/* loaded from: classes8.dex */
public class C11303x34488478 extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

    /* renamed from: extData */
    public java.lang.String f33264xb21df56b;

    /* renamed from: prepayId */
    public java.lang.String f33265xb3bbab20;

    /* renamed from: returnKey */
    public java.lang.String f33266xc8c39b0f;

    public C11303x34488478() {
    }

    public C11303x34488478(android.os.Bundle bundle) {
        mo48429x63aa4ccc(bundle);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
    /* renamed from: checkArgs */
    public boolean mo48428x17b96605() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
    /* renamed from: fromBundle */
    public void mo48429x63aa4ccc(android.os.Bundle bundle) {
        super.mo48429x63aa4ccc(bundle);
        this.f33265xb3bbab20 = bundle.getString("_wxapi_payresp_prepayid");
        this.f33266xc8c39b0f = bundle.getString("_wxapi_payresp_returnkey");
        this.f33264xb21df56b = bundle.getString("_wxapi_payresp_extdata");
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
    /* renamed from: getType */
    public int mo48430xfb85f7b0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
    /* renamed from: toBundle */
    public void mo48431x792022dd(android.os.Bundle bundle) {
        super.mo48431x792022dd(bundle);
        bundle.putString("_wxapi_payresp_prepayid", this.f33265xb3bbab20);
        bundle.putString("_wxapi_payresp_returnkey", this.f33266xc8c39b0f);
        bundle.putString("_wxapi_payresp_extdata", this.f33264xb21df56b);
    }
}
