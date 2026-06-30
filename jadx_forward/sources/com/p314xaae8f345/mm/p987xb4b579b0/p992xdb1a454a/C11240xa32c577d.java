package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMessage */
/* loaded from: classes9.dex */
public final class C11240xa32c577d {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: LENGTH_LIMIT */
        private static final int f32916x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.SubscribeMessage.Req";

        /* renamed from: reserved */
        public java.lang.String f32917xeb1d8b28;

        /* renamed from: scene */
        public int f32918x683188c;

        /* renamed from: templateID */
        public java.lang.String f32919x4db99f15;

        public Req() {
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2 = this.f32919x4db99f15;
            if (str2 == null || str2.length() == 0) {
                str = "checkArgs fail, templateID is null";
            } else if (this.f32919x4db99f15.length() > 1024) {
                str = "checkArgs fail, templateID is too long";
            } else {
                java.lang.String str3 = this.f32917xeb1d8b28;
                if (str3 == null || str3.length() <= 1024) {
                    return true;
                }
                str = "checkArgs fail, reserved is too long";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32918x683188c = bundle.getInt("_wxapi_subscribemessage_req_scene");
            this.f32919x4db99f15 = bundle.getString("_wxapi_subscribemessage_req_templateid");
            this.f32917xeb1d8b28 = bundle.getString("_wxapi_subscribemessage_req_reserved");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 18;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putInt("_wxapi_subscribemessage_req_scene", this.f32918x683188c);
            bundle.putString("_wxapi_subscribemessage_req_templateid", this.f32919x4db99f15);
            bundle.putString("_wxapi_subscribemessage_req_reserved", this.f32917xeb1d8b28);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {
        private static final java.lang.String TAG = "MicroMsg.SDK.SubscribeMessage.Resp";

        /* renamed from: action */
        public java.lang.String f32920xab2f7e36;

        /* renamed from: reserved */
        public java.lang.String f32921xeb1d8b28;

        /* renamed from: scene */
        public int f32922x683188c;

        /* renamed from: templateID */
        public java.lang.String f32923x4db99f15;

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
            this.f32923x4db99f15 = bundle.getString("_wxapi_subscribemessage_resp_templateid");
            this.f32922x683188c = bundle.getInt("_wxapi_subscribemessage_resp_scene");
            this.f32920xab2f7e36 = bundle.getString("_wxapi_subscribemessage_resp_action");
            this.f32921xeb1d8b28 = bundle.getString("_wxapi_subscribemessage_resp_reserved");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 18;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_subscribemessage_resp_templateid", this.f32923x4db99f15);
            bundle.putInt("_wxapi_subscribemessage_resp_scene", this.f32922x683188c);
            bundle.putString("_wxapi_subscribemessage_resp_action", this.f32920xab2f7e36);
            bundle.putString("_wxapi_subscribemessage_resp_reserved", this.f32921xeb1d8b28);
        }
    }

    private C11240xa32c577d() {
    }
}
