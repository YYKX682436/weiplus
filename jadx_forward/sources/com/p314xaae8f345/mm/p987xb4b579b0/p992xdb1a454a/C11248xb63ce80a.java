package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed */
/* loaded from: classes9.dex */
public class C11248xb63ce80a {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: LENGTH_LIMIT */
        private static final int f32951x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelOpenFeed.Req";

        /* renamed from: feedID */
        public java.lang.String f32952xb3ccff39;

        /* renamed from: nonceID */
        public java.lang.String f32953x7e94014a;

        /* renamed from: notGetReleatedList */
        public boolean f32954x8be991df;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32952xb3ccff39)) {
                str = "feedID is null";
            } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32953x7e94014a)) {
                str = "nonceID is null";
            } else if (this.f32952xb3ccff39.length() > 1024) {
                str = "feedID.length too long!";
            } else {
                if (this.f32953x7e94014a.length() <= 1024) {
                    return true;
                }
                str = "nonceID.length too long!";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32952xb3ccff39 = bundle.getString("_wxapi_finder_feedID");
            this.f32953x7e94014a = bundle.getString("_wxapi_finder_nonceID");
            this.f32954x8be991df = bundle.getBoolean("_wxapi_finder_notGetReleatedList");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 36;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_finder_feedID", this.f32952xb3ccff39);
            bundle.putString("_wxapi_finder_nonceID", this.f32953x7e94014a);
            bundle.putBoolean("_wxapi_finder_notGetReleatedList", this.f32954x8be991df);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f32955xb32a65a0;

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
            this.f32955xb32a65a0 = bundle.getString("_wxapi_finder_extMsg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 36;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_finder_extMsg", this.f32955xb32a65a0);
        }
    }
}
