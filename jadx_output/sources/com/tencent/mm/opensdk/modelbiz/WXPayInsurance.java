package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes9.dex */
public class WXPayInsurance {

    /* loaded from: classes9.dex */
    public static final class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXPayInsurance.Req";
        private static final int URL_LENGTH_LIMIT = 10240;
        public java.lang.String url;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            if (com.tencent.mm.opensdk.utils.d.b(this.url)) {
                com.tencent.mm.opensdk.utils.Log.i(TAG, "url should not be empty");
                return false;
            }
            if (this.url.length() <= 10240) {
                return true;
            }
            com.tencent.mm.opensdk.utils.Log.e(TAG, "url must be in 10k");
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.url = bundle.getString("_wxapi_pay_insourance_req_url");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 22;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final void toBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_pay_insourance_req_url", this.url);
        }
    }

    /* loaded from: classes9.dex */
    public static final class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public java.lang.String wxOrderId;

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.wxOrderId = bundle.getString("_wxapi_pay_insourance_order_id");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 22;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final void toBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            bundle.putString("_wxapi_pay_insourance_order_id", this.wxOrderId);
        }
    }
}
