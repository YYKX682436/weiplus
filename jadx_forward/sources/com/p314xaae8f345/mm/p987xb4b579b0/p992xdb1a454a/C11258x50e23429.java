package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay */
/* loaded from: classes9.dex */
public class C11258x50e23429 {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Req */
    /* loaded from: classes9.dex */
    public static final class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXNontaxPay.Req";

        /* renamed from: URL_LENGTH_LIMIT */
        private static final int f32993xd2fb99f2 = 10240;
        public java.lang.String url;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public final boolean mo48424x17b96605() {
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.url)) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(TAG, "url should not be empty");
                return false;
            }
            if (this.url.length() <= 10240) {
                return true;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "url must be in 10k");
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public final void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.url = bundle.getString("_wxapi_nontax_pay_req_url");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public final int mo48426xfb85f7b0() {
            return 21;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public final void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            bundle.putString("_wxapi_nontax_pay_req_url", this.url);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp */
    /* loaded from: classes9.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: wxOrderId */
        public java.lang.String f32994xb8a22ee8;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public final boolean mo48428x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public final void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f32994xb8a22ee8 = bundle.getString("_wxapi_nontax_pay_order_id");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 21;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            bundle.putString("_wxapi_nontax_pay_order_id", this.f32994xb8a22ee8);
        }
    }
}
