package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile */
/* loaded from: classes8.dex */
public class C11250x617b5fbd {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Req */
    /* loaded from: classes8.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: LENGTH_LIMIT */
        private static final int f32960x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelOpenProfile.Req";

        /* renamed from: userName */
        public java.lang.String f32961xf01afcf6;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32961xf01afcf6)) {
                str = "userName is null";
            } else {
                if (this.f32961xf01afcf6.length() <= 1024) {
                    return true;
                }
                str = "userName.length too long";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32961xf01afcf6 = bundle.getString("_wxapi_finder_userName");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 34;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_finder_userName", this.f32961xf01afcf6);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Resp */
    /* loaded from: classes8.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f32962xb32a65a0;

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
            this.f32962xb32a65a0 = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 34;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.f32962xb32a65a0);
        }
    }
}
