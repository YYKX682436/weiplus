package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.GetMessageFromWX */
/* loaded from: classes9.dex */
public final class C11266x18086b5c {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: country */
        public java.lang.String f33015x39175796;

        /* renamed from: lang */
        public java.lang.String f33016x3291ee;

        /* renamed from: username */
        public java.lang.String f33017xf02988d6;

        public Req() {
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33016x3291ee = bundle.getString("_wxapi_getmessage_req_lang");
            this.f33015x39175796 = bundle.getString("_wxapi_getmessage_req_country");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 3;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_getmessage_req_lang", this.f33016x3291ee);
            bundle.putString("_wxapi_getmessage_req_country", this.f33015x39175796);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {
        private static final java.lang.String TAG = "MicroMsg.SDK.GetMessageFromWX.Resp";

        /* renamed from: message */
        public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f33018x38eb0007;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public boolean mo48428x17b96605() {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f33018x38eb0007;
            if (c11286x34a5504 != null) {
                return c11286x34a5504.m48466x17b96605();
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, "checkArgs fail, message is null");
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f33018x38eb0007 = com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48469x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 3;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putAll(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48472x792022dd(this.f33018x38eb0007));
        }
    }

    private C11266x18086b5c() {
    }
}
