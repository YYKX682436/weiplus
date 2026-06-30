package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent */
/* loaded from: classes9.dex */
public class C11247x1159bdae {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: Key_EventId */
        private static final java.lang.String f32942xb20ef335 = "_wxapi_finder_open_event_eventId";

        /* renamed from: Key_ExtInfo */
        private static final java.lang.String f32943xb63b204f = "_wxapi_finder_open_event_extInfo";

        /* renamed from: Key_Username */
        private static final java.lang.String f32944x6f658ef6 = "_wxapi_finder_open_event_username";

        /* renamed from: LENGTH_LIMIT */
        private static final int f32945x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.WXChannelOpenEvent.Req";

        /* renamed from: eventId */
        public java.lang.String f32946xadf43d55;

        /* renamed from: extInfo */
        public java.lang.String f32947xb2206a6f;

        /* renamed from: username */
        public java.lang.String f32948xf02988d6;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32948xf02988d6)) {
                str = "username is null";
            } else if (this.f32948xf02988d6.length() > 1024) {
                str = "username exceeds the limit";
            } else if (com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32946xadf43d55)) {
                str = "eventId is null";
            } else {
                if (this.f32946xadf43d55.length() <= 1024) {
                    return true;
                }
                str = "eventId exceeds the limit";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32948xf02988d6 = bundle.getString(f32944x6f658ef6);
            this.f32946xadf43d55 = bundle.getString(f32942xb20ef335);
            this.f32947xb2206a6f = bundle.getString(f32943xb63b204f);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 41;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString(f32944x6f658ef6, this.f32948xf02988d6);
            bundle.putString(f32942xb20ef335, this.f32946xadf43d55);
            bundle.putString(f32943xb63b204f, this.f32947xb2206a6f);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXChannelOpenEvent$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: Key_ExtMsg */
        private static final java.lang.String f32949x47f173c0 = "_wxapi_finder_open_event_extMsg";

        /* renamed from: extMsg */
        public java.lang.String f32950xb32a65a0;

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
            this.f32950xb32a65a0 = bundle.getString(f32949x47f173c0);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 41;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString(f32949x47f173c0, this.f32950xb32a65a0);
        }
    }
}
