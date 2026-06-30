package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo */
/* loaded from: classes9.dex */
public class C11251xb1ce4c5e {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: LENGTH_LIMIT */
        private static final int f32963x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelShareVideo.Req";

        /* renamed from: WX_CHANNEL_SHARE_VIDEO_JUMP_INFO_KEY_IDENTIFIER */
        private static final java.lang.String f32964xa6adab27 = "_wxapi_channel_share_video_jump_info_identifier";

        /* renamed from: extData */
        public java.lang.String f32965xb21df56b;

        /* renamed from: jumpInfo */
        public com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 f32966xf0c305fc;

        /* renamed from: videoPath */
        public java.lang.String f32967x4f713740;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32967x4f713740)) {
                str = "videoPath is null";
            } else {
                com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 interfaceC11235xd2b41dd5 = this.f32966xf0c305fc;
                if (interfaceC11235xd2b41dd5 == null || interfaceC11235xd2b41dd5.mo48432x17b96605()) {
                    return true;
                }
                str = "checkArgs fail, jumpInfo is invalid";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32967x4f713740 = bundle.getString("_wxapi_finder_share_video_path");
            this.f32965xb21df56b = bundle.getString("_wxapi_finder_share_video_extData");
            java.lang.String string = bundle.getString(f32964xa6adab27);
            if (string != null) {
                try {
                    com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 interfaceC11235xd2b41dd5 = (com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5) java.lang.Class.forName(string).newInstance();
                    this.f32966xf0c305fc = interfaceC11235xd2b41dd5;
                    interfaceC11235xd2b41dd5.mo48435xe1e5b467(bundle);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "get WXChannelJumpInfo from bundle failed: unknown ident " + string + ", ex = " + e17.getMessage());
                }
            }
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 33;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_finder_share_video_path", this.f32967x4f713740);
            bundle.putString("_wxapi_finder_share_video_extData", this.f32965xb21df56b);
            com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.InterfaceC11235xd2b41dd5 interfaceC11235xd2b41dd5 = this.f32966xf0c305fc;
            if (interfaceC11235xd2b41dd5 != null) {
                bundle.putString(f32964xa6adab27, interfaceC11235xd2b41dd5.getClass().getName());
                this.f32966xf0c305fc.mo48433xddd166e0(bundle);
            }
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f32968xb32a65a0;

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
            this.f32968xb32a65a0 = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 33;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.f32968xb32a65a0);
        }
    }
}
