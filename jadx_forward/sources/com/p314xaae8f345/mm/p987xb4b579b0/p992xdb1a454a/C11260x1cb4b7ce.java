package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview */
/* loaded from: classes9.dex */
public class C11260x1cb4b7ce {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: businessType */
        public int f33000xd7e6e31a;

        /* renamed from: queryInfo */
        public java.util.HashMap<java.lang.String, java.lang.String> f33001x94484d96;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33001x94484d96 = (java.util.HashMap) bundle.getSerializable("_wxapi_open_business_webview_query_info");
            this.f33000xd7e6e31a = bundle.getInt("_wxapi_open_business_webview_query_type", 0);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 25;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putSerializable("_wxapi_open_business_webview_query_info", this.f33001x94484d96);
            bundle.putInt("_wxapi_open_business_webview_query_type", this.f33000xd7e6e31a);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: businessType */
        public int f33002xd7e6e31a;

        /* renamed from: resultInfo */
        public java.lang.String f33003xdde54a6b;

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
            this.f33003xdde54a6b = bundle.getString("_wxapi_open_business_webview_result");
            this.f33002xd7e6e31a = bundle.getInt("_wxapi_open_business_webview_query_type", 0);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 25;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_open_business_webview_result", this.f33003xdde54a6b);
            bundle.putInt("_wxapi_open_business_webview_query_type", this.f33002xd7e6e31a);
        }
    }
}
