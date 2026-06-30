package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.SendAuth */
/* loaded from: classes9.dex */
public final class C11268x4e2c8170 {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendAuth$Options */
    /* loaded from: classes9.dex */
    public static class Options {

        /* renamed from: INVALID_FLAGS */
        public static final int f33025xbdbfd9ff = -1;

        /* renamed from: callbackClassName */
        public java.lang.String f33026x3a8e995e;

        /* renamed from: callbackFlags */
        public int f33027x54a34142 = -1;

        /* renamed from: fromBundle */
        public void m48439x63aa4ccc(android.os.Bundle bundle) {
            this.f33026x3a8e995e = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_sendauth_options_callback_classname");
            this.f33027x54a34142 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.a(bundle, "_wxapi_sendauth_options_callback_flags");
        }

        /* renamed from: toBundle */
        public void m48440x792022dd(android.os.Bundle bundle) {
            bundle.putString("_wxapi_sendauth_options_callback_classname", this.f33026x3a8e995e);
            bundle.putInt("_wxapi_sendauth_options_callback_flags", this.f33027x54a34142);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendAuth$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: LENGTH_LIMIT */
        private static final int f33028x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.SendAuth.Req";

        /* renamed from: extData */
        public java.lang.String f33029xb21df56b;

        /* renamed from: isOption1 */
        public boolean f33030x92f7cdd2;

        /* renamed from: nonAutomatic */
        public boolean f33031xb0417dde = false;

        /* renamed from: options */
        public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options f33032xb586869e;

        /* renamed from: scope */
        public java.lang.String f33033x6833e54;

        /* renamed from: state */
        public java.lang.String f33034x68ac491;

        public Req() {
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2 = this.f33033x6833e54;
            if (str2 == null || str2.length() == 0 || this.f33033x6833e54.length() > 1024) {
                str = "checkArgs fail, scope is invalid";
            } else {
                java.lang.String str3 = this.f33034x68ac491;
                if (str3 == null || str3.length() <= 1024) {
                    return true;
                }
                str = "checkArgs fail, state is invalid";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33033x6833e54 = bundle.getString("_wxapi_sendauth_req_scope");
            this.f33034x68ac491 = bundle.getString("_wxapi_sendauth_req_state");
            this.f33029xb21df56b = bundle.getString("_wxapi_sendauth_req_ext_data");
            this.f33030x92f7cdd2 = bundle.getBoolean("_wxapi_sendauth_req_isoption1");
            this.f33031xb0417dde = bundle.getBoolean("_wxapi_sendauth_req_non_automatic");
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options();
            this.f33032xb586869e = options;
            options.m48439x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 1;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_sendauth_req_scope", this.f33033x6833e54);
            bundle.putString("_wxapi_sendauth_req_state", this.f33034x68ac491);
            bundle.putString("_wxapi_sendauth_req_ext_data", this.f33029xb21df56b);
            bundle.putBoolean("_wxapi_sendauth_req_isoption1", this.f33030x92f7cdd2);
            bundle.putBoolean("_wxapi_sendauth_req_non_automatic", this.f33031xb0417dde);
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11268x4e2c8170.Options options = this.f33032xb586869e;
            if (options != null) {
                options.m48440x792022dd(bundle);
            }
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.SendAuth$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: ERR_SCOPE_SNSAPI_WXAAPP_INFO_CAN_ONLY_AUTHORIZED_SEPARATELY */
        public static final int f33035x90fd801b = -1000;

        /* renamed from: LENGTH_LIMIT */
        private static final int f33036x94cda102 = 1024;
        private static final java.lang.String TAG = "MicroMsg.SDK.SendAuth.Resp";

        /* renamed from: authResult */
        public boolean f33037x745db3e5 = false;

        /* renamed from: code */
        public java.lang.String f33038x2eaded;

        /* renamed from: country */
        public java.lang.String f33039x39175796;

        /* renamed from: lang */
        public java.lang.String f33040x3291ee;

        /* renamed from: state */
        public java.lang.String f33041x68ac491;
        public java.lang.String url;

        public Resp() {
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public boolean mo48428x17b96605() {
            java.lang.String str = this.f33041x68ac491;
            if (str == null || str.length() <= 1024) {
                return true;
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, state is invalid");
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f33038x2eaded = bundle.getString("_wxapi_sendauth_resp_token");
            this.f33041x68ac491 = bundle.getString("_wxapi_sendauth_resp_state");
            this.url = bundle.getString("_wxapi_sendauth_resp_url");
            this.f33040x3291ee = bundle.getString("_wxapi_sendauth_resp_lang");
            this.f33039x39175796 = bundle.getString("_wxapi_sendauth_resp_country");
            this.f33037x745db3e5 = bundle.getBoolean("_wxapi_sendauth_resp_auth_result");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 1;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_sendauth_resp_token", this.f33038x2eaded);
            bundle.putString("_wxapi_sendauth_resp_state", this.f33041x68ac491);
            bundle.putString("_wxapi_sendauth_resp_url", this.url);
            bundle.putString("_wxapi_sendauth_resp_lang", this.f33040x3291ee);
            bundle.putString("_wxapi_sendauth_resp_country", this.f33039x39175796);
            bundle.putBoolean("_wxapi_sendauth_resp_auth_result", this.f33037x745db3e5);
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }
    }

    private C11268x4e2c8170() {
    }
}
