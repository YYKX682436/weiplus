package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes6.dex */
public class WXChannelBind {

    /* loaded from: classes6.dex */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBind.Req";

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 42;
        }
    }

    /* loaded from: classes8.dex */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        private static final java.lang.String KEY_AUTH_BUFFER = "_wxapi_finder_authBuffer";
        private static final java.lang.String KEY_EXT_MSG = "_wxapi_finder_extMsg";
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBind.Resp";
        public byte[] authBuffer;
        public java.lang.String extMsg;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            if (bundle != null) {
                fromBundle(bundle);
            }
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.authBuffer = bundle.getByteArray(KEY_AUTH_BUFFER);
            this.extMsg = bundle.getString(KEY_EXT_MSG);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 42;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putByteArray(KEY_AUTH_BUFFER, this.authBuffer);
            bundle.putString(KEY_EXT_MSG, this.extMsg);
        }
    }
}
