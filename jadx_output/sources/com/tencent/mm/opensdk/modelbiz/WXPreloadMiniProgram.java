package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes9.dex */
public class WXPreloadMiniProgram {

    /* loaded from: classes9.dex */
    public static final class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXPreloadMiniProgram.Req";
        public java.lang.String userName;
        public java.lang.String path = "";
        public int miniprogramType = 0;
        public java.lang.String extData = "";

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final boolean checkArgs() {
            java.lang.String str;
            if (com.tencent.mm.opensdk.utils.d.b(this.userName)) {
                str = "userName is null";
            } else {
                int i17 = this.miniprogramType;
                if (i17 >= 0 && i17 <= 2) {
                    return true;
                }
                str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
            }
            com.tencent.mm.opensdk.utils.Log.e(TAG, str);
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final int getType() {
            return 28;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public final void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_username", this.userName);
            bundle.putString("_launch_wxminiprogram_path", this.path);
            bundle.putString("_launch_wxminiprogram_extData", this.extData);
            bundle.putInt("_launch_wxminiprogram_type", this.miniprogramType);
        }
    }

    /* loaded from: classes9.dex */
    public static final class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public java.lang.String extMsg;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_launch_wxminiprogram_ext_msg");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final int getType() {
            return 28;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public final void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_launch_wxminiprogram_ext_msg", this.extMsg);
        }
    }
}
