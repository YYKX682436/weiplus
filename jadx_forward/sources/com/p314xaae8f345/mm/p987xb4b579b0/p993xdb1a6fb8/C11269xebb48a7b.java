package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.SendMessageToWX */
/* loaded from: classes9.dex */
public class C11269xebb48a7b {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXMusicVipObject */
    /* loaded from: classes9.dex */
    public interface IWXMusicVipObject {
        /* renamed from: checkArgs */
        boolean mo48441x17b96605();

        /* renamed from: serialize */
        void mo48442xddd166e0(android.os.Bundle bundle);

        /* renamed from: unserialize */
        void mo48443xe1e5b467(android.os.Bundle bundle);
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject */
    /* loaded from: classes9.dex */
    public interface IWXSceneDataObject {
        /* renamed from: checkArgs */
        boolean mo48444x17b96605();

        /* renamed from: getJumpType */
        int mo48445x6ca26dfe();

        /* renamed from: serialize */
        void mo48446xddd166e0(android.os.Bundle bundle);

        /* renamed from: unserialize */
        void mo48447xe1e5b467(android.os.Bundle bundle);
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: FAV_CONTENT_LENGTH_LIMIT */
        private static final int f33042x713229ec = 26214400;

        /* renamed from: SCENE_DATA_OBJECT_KEY_IDENTIFIER */
        private static final java.lang.String f33043xb533b087 = "_scene_data_object_identifier";
        private static final java.lang.String TAG = "MicroMsg.SDK.SendMessageToWX.Req";

        /* renamed from: WXSceneFavorite */
        public static final int f33044xf34194e7 = 2;

        /* renamed from: WXSceneSession */
        public static final int f33045xbe34a1eb = 0;

        /* renamed from: WXSceneSpecifiedContact */
        public static final int f33046xb363089b = 3;

        /* renamed from: WXSceneStatus */
        public static final int f33047x6edf1fd = 4;

        /* renamed from: WXSceneTimeline */
        public static final int f33048x38d89f8c = 1;

        /* renamed from: message */
        public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f33049x38eb0007;

        /* renamed from: scene */
        public int f33050x683188c;

        /* renamed from: sceneDataObject */
        public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject f33051x97b14d35;

        /* renamed from: userOpenId */
        public java.lang.String f33052x57d458b0;

        public Req() {
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f33049x38eb0007;
            if (c11286x34a5504 == null) {
                str = "checkArgs fail ,message is null";
            } else {
                if (c11286x34a5504.f33122xe4128443.mo14189x368f3a() == 6 && this.f33050x683188c == 2) {
                    ((com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c) this.f33049x38eb0007.f33122xe4128443).m48458x260a023e(f33042x713229ec);
                }
                int i17 = this.f33050x683188c;
                if (i17 == 3 && this.f33052x57d458b0 == null) {
                    str = "Send specifiedContact userOpenId can not be null.";
                } else if (i17 == 3 && this.f32865xc3c3c505 == null) {
                    str = "Send specifiedContact openid can not be null.";
                } else {
                    if (i17 != 4) {
                        return this.f33049x38eb0007.m48466x17b96605();
                    }
                    if (this.f33051x97b14d35 != null) {
                        return this.f33049x38eb0007.m48467xfb85f7b0() == 1 ? this.f33051x97b14d35.mo48444x17b96605() : this.f33049x38eb0007.m48466x17b96605() && this.f33051x97b14d35.mo48444x17b96605();
                    }
                    str = "checkArgs fail, sceneDataObject is null";
                }
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33049x38eb0007 = com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48469x63aa4ccc(bundle);
            this.f33050x683188c = bundle.getInt("_wxapi_sendmessagetowx_req_scene");
            this.f33052x57d458b0 = bundle.getString("_wxapi_sendmessagetowx_req_use_open_id");
            java.lang.String string = bundle.getString(f33043xb533b087);
            if (string != null) {
                try {
                    com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject iWXSceneDataObject = (com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject) java.lang.Class.forName(string).newInstance();
                    this.f33051x97b14d35 = iWXSceneDataObject;
                    iWXSceneDataObject.mo48447xe1e5b467(bundle);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get WXSceneDataObject from bundle failed: unknown ident " + string + ", ex = " + e17.getMessage());
                }
            }
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 2;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putAll(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48472x792022dd(this.f33049x38eb0007));
            bundle.putInt("_wxapi_sendmessagetowx_req_scene", this.f33050x683188c);
            bundle.putInt("_wxapi_sendmessagetowx_req_media_type", this.f33049x38eb0007.m48467xfb85f7b0());
            bundle.putString("_wxapi_sendmessagetowx_req_use_open_id", this.f33052x57d458b0);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.IWXSceneDataObject iWXSceneDataObject = this.f33051x97b14d35;
            if (iWXSceneDataObject != null) {
                bundle.putString(f33043xb533b087, iWXSceneDataObject.getClass().getName());
                this.f33051x97b14d35.mo48446xddd166e0(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {
        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
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
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 2;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
        }
    }

    private C11269xebb48a7b() {
    }
}
