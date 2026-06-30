package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX */
/* loaded from: classes9.dex */
public class C11271x7b1482d5 {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: country */
        public java.lang.String f33055x39175796;

        /* renamed from: lang */
        public java.lang.String f33056x3291ee;

        /* renamed from: message */
        public com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f33057x38eb0007;

        public Req() {
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f33057x38eb0007;
            if (c11286x34a5504 == null) {
                return false;
            }
            return c11286x34a5504.m48466x17b96605();
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33056x3291ee = bundle.getString("_wxapi_showmessage_req_lang");
            this.f33055x39175796 = bundle.getString("_wxapi_showmessage_req_country");
            this.f33057x38eb0007 = com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48469x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 4;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            android.os.Bundle m48472x792022dd = com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.Builder.m48472x792022dd(this.f33057x38eb0007);
            super.mo48427x792022dd(m48472x792022dd);
            bundle.putString("_wxapi_showmessage_req_lang", this.f33056x3291ee);
            bundle.putString("_wxapi_showmessage_req_country", this.f33055x39175796);
            bundle.putAll(m48472x792022dd);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Resp */
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
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 4;
        }
    }

    private C11271x7b1482d5() {
    }
}
