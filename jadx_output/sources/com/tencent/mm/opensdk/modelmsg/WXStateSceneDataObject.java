package com.tencent.mm.opensdk.modelmsg;

/* loaded from: classes9.dex */
public class WXStateSceneDataObject implements com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject {
    private static final int LENGTH_LIMIT = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateSceneDataObject";
    private static final java.lang.String WX_STATE_JUMP_INFO_KEY_IDENTIFIER = "_wxapi_scene_data_state_jump_info_identifier";
    public java.lang.String stateId;
    public com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo stateJumpInfo;
    public java.lang.String stateTitle;
    public java.lang.String token;

    /* loaded from: classes9.dex */
    public interface IWXStateJumpInfo {
        public static final int WX_STATE_JUMP_TYPE_CHANNEL_PROFILE = 3;
        public static final int WX_STATE_JUMP_TYPE_MINI_PROGRAM = 2;
        public static final int WX_STATE_JUMP_TYPE_UNKNOWN = 0;
        public static final int WX_STATE_JUMP_TYPE_URL = 1;

        boolean checkArgs();

        void serialize(android.os.Bundle bundle);

        int type();

        void unserialize(android.os.Bundle bundle);
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public boolean checkArgs() {
        java.lang.String str = this.stateId;
        if (str != null && str.length() > 10240) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        java.lang.String str2 = this.stateTitle;
        if (str2 != null && str2.length() > 10240) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        java.lang.String str3 = this.token;
        if (str3 != null && str3.length() > 10240) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.checkArgs();
        }
        com.tencent.mm.opensdk.utils.Log.e(TAG, "checkArgs fail, statsJumpInfo is null");
        return false;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public int getJumpType() {
        com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.type();
        }
        return 0;
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void serialize(android.os.Bundle bundle) {
        bundle.putString("_wxapi_scene_data_state_id", this.stateId);
        bundle.putString("_wxapi_scene_data_state_title", this.stateTitle);
        bundle.putString("_wxapi_scene_data_state_token", this.token);
        com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo iWXStateJumpInfo = this.stateJumpInfo;
        if (iWXStateJumpInfo != null) {
            bundle.putString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER, iWXStateJumpInfo.getClass().getName());
            this.stateJumpInfo.serialize(bundle);
        }
    }

    @Override // com.tencent.mm.opensdk.modelmsg.SendMessageToWX.IWXSceneDataObject
    public void unserialize(android.os.Bundle bundle) {
        this.stateId = bundle.getString("_wxapi_scene_data_state_id");
        this.stateTitle = bundle.getString("_wxapi_scene_data_state_title");
        this.token = bundle.getString("_wxapi_scene_data_state_token");
        java.lang.String string = bundle.getString(WX_STATE_JUMP_INFO_KEY_IDENTIFIER);
        if (string != null) {
            try {
                com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo iWXStateJumpInfo = (com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject.IWXStateJumpInfo) java.lang.Class.forName(string).newInstance();
                this.stateJumpInfo = iWXStateJumpInfo;
                iWXStateJumpInfo.unserialize(bundle);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.opensdk.utils.Log.e(TAG, "get WXSceneDataObject from bundle failed: unknown ident " + string + ", ex = " + e17.getMessage());
            }
        }
    }
}
