package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelBind */
/* loaded from: classes6.dex */
public class C11244x2750923f {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelBind$Req */
    /* loaded from: classes6.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBind.Req";

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 42;
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelBind$Resp */
    /* loaded from: classes8.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: KEY_AUTH_BUFFER */
        private static final java.lang.String f32934xd9a49cb7 = "_wxapi_finder_authBuffer";

        /* renamed from: KEY_EXT_MSG */
        private static final java.lang.String f32935x6c2a9a23 = "_wxapi_finder_extMsg";
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelBind.Resp";

        /* renamed from: authBuffer */
        public byte[] f32936x59eb8008;

        /* renamed from: extMsg */
        public java.lang.String f32937xb32a65a0;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            if (bundle != null) {
                mo48429x63aa4ccc(bundle);
            }
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
            this.f32936x59eb8008 = bundle.getByteArray(f32934xd9a49cb7);
            this.f32937xb32a65a0 = bundle.getString(f32935x6c2a9a23);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 42;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putByteArray(f32934xd9a49cb7, this.f32936x59eb8008);
            bundle.putString(f32935x6c2a9a23, this.f32937xb32a65a0);
        }
    }
}
