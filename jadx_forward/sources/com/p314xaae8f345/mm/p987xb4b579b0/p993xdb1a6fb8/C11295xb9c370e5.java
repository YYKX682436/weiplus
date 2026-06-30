package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject */
/* loaded from: classes9.dex */
public class C11295xb9c370e5 implements com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject {

    /* renamed from: LENGTH_LIMIT */
    private static final int f33218x94cda102 = 10240;
    private static final java.lang.String TAG = "MicroMsg.SDK.WXStateSceneDataObject";

    /* renamed from: WX_STATE_JUMP_INFO_KEY_IDENTIFIER */
    private static final java.lang.String f33219x20f155f5 = "_wxapi_scene_data_state_jump_info_identifier";

    /* renamed from: stateId */
    public java.lang.String f33220x8eebed8c;

    /* renamed from: stateJumpInfo */
    public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo f33221x30e70dad;

    /* renamed from: stateTitle */
    public java.lang.String f33222xf1cfa047;

    /* renamed from: token */
    public java.lang.String f33223x696b9f9;

    /* renamed from: com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject$IWXStateJumpInfo */
    /* loaded from: classes9.dex */
    public interface IWXStateJumpInfo {

        /* renamed from: WX_STATE_JUMP_TYPE_CHANNEL_PROFILE */
        public static final int f33224x530d96ed = 3;

        /* renamed from: WX_STATE_JUMP_TYPE_MINI_PROGRAM */
        public static final int f33225x4ab5f9bc = 2;

        /* renamed from: WX_STATE_JUMP_TYPE_UNKNOWN */
        public static final int f33226xf0085cea = 0;

        /* renamed from: WX_STATE_JUMP_TYPE_URL */
        public static final int f33227x6308ce0f = 1;

        /* renamed from: checkArgs */
        boolean mo48476x17b96605();

        /* renamed from: serialize */
        void mo48477xddd166e0(android.os.Bundle bundle);

        /* renamed from: type */
        int mo48478x368f3a();

        /* renamed from: unserialize */
        void mo48479xe1e5b467(android.os.Bundle bundle);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject
    /* renamed from: checkArgs */
    public boolean mo48444x17b96605() {
        java.lang.String str = this.f33220x8eebed8c;
        if (str != null && str.length() > 10240) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        java.lang.String str2 = this.f33222xf1cfa047;
        if (str2 != null && str2.length() > 10240) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        java.lang.String str3 = this.f33223x696b9f9;
        if (str3 != null && str3.length() > 10240) {
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, stateId is invalid");
            return false;
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo iWXStateJumpInfo = this.f33221x30e70dad;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.mo48476x17b96605();
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, statsJumpInfo is null");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject
    /* renamed from: getJumpType */
    public int mo48445x6ca26dfe() {
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo iWXStateJumpInfo = this.f33221x30e70dad;
        if (iWXStateJumpInfo != null) {
            return iWXStateJumpInfo.mo48478x368f3a();
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject
    /* renamed from: serialize */
    public void mo48446xddd166e0(android.os.Bundle bundle) {
        bundle.putString("_wxapi_scene_data_state_id", this.f33220x8eebed8c);
        bundle.putString("_wxapi_scene_data_state_title", this.f33222xf1cfa047);
        bundle.putString("_wxapi_scene_data_state_token", this.f33223x696b9f9);
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo iWXStateJumpInfo = this.f33221x30e70dad;
        if (iWXStateJumpInfo != null) {
            bundle.putString(f33219x20f155f5, iWXStateJumpInfo.getClass().getName());
            this.f33221x30e70dad.mo48477xddd166e0(bundle);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject
    /* renamed from: unserialize */
    public void mo48447xe1e5b467(android.os.Bundle bundle) {
        this.f33220x8eebed8c = bundle.getString("_wxapi_scene_data_state_id");
        this.f33222xf1cfa047 = bundle.getString("_wxapi_scene_data_state_title");
        this.f33223x696b9f9 = bundle.getString("_wxapi_scene_data_state_token");
        java.lang.String string = bundle.getString(f33219x20f155f5);
        if (string != null) {
            try {
                com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo iWXStateJumpInfo = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11295xb9c370e5.IWXStateJumpInfo) java.lang.Class.forName(string).newInstance();
                this.f33221x30e70dad = iWXStateJumpInfo;
                iWXStateJumpInfo.mo48479xe1e5b467(bundle);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get WXSceneDataObject from bundle failed: unknown ident " + string + ", ex = " + e17.getMessage());
            }
        }
    }
}
