package com.tencent.mm.opensdk.modelbiz;

/* loaded from: classes9.dex */
public class WXChannelShareVideo {

    /* loaded from: classes9.dex */
    public static class Req extends com.tencent.mm.opensdk.modelbase.BaseReq {
        private static final int LENGTH_LIMIT = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelShareVideo.Req";
        private static final java.lang.String WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_channel_share_video_jump_info_identifier";
        public java.lang.String extData;
        public com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo jumpInfo;
        public java.lang.String videoPath;

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public boolean checkArgs() {
            java.lang.String str;
            if (com.tencent.mm.opensdk.utils.d.b(this.videoPath)) {
                str = "videoPath is null";
            } else {
                com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
                if (iWXChannelJumpInfo == null || iWXChannelJumpInfo.checkArgs()) {
                    return true;
                }
                str = "checkArgs fail, jumpInfo is invalid";
            }
            com.tencent.mm.opensdk.utils.Log.e(TAG, str);
            return false;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.videoPath = bundle.getString("_wxapi_finder_share_video_path");
            this.extData = bundle.getString("_wxapi_finder_share_video_extData");
            java.lang.String string = bundle.getString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER);
            if (string != null) {
                try {
                    com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo iWXChannelJumpInfo = (com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo) java.lang.Class.forName(string).newInstance();
                    this.jumpInfo = iWXChannelJumpInfo;
                    iWXChannelJumpInfo.unserialize(bundle);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.opensdk.utils.Log.e(TAG, "get WXChannelJumpInfo from bundle failed: unknown ident " + string + ", ex = " + e17.getMessage());
                }
            }
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public int getType() {
            return 33;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseReq
        public void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_share_video_path", this.videoPath);
            bundle.putString("_wxapi_finder_share_video_extData", this.extData);
            com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo iWXChannelJumpInfo = this.jumpInfo;
            if (iWXChannelJumpInfo != null) {
                bundle.putString(WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER, iWXChannelJumpInfo.getClass().getName());
                this.jumpInfo.serialize(bundle);
            }
        }
    }

    /* loaded from: classes9.dex */
    public static class Resp extends com.tencent.mm.opensdk.modelbase.BaseResp {
        public java.lang.String extMsg;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            fromBundle(bundle);
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public boolean checkArgs() {
            return true;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void fromBundle(android.os.Bundle bundle) {
            super.fromBundle(bundle);
            this.extMsg = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public int getType() {
            return 33;
        }

        @Override // com.tencent.mm.opensdk.modelbase.BaseResp
        public void toBundle(android.os.Bundle bundle) {
            super.toBundle(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.extMsg);
        }
    }
}
