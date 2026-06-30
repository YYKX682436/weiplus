package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage */
/* loaded from: classes6.dex */
public class C11257xdceeb189 {

    /* renamed from: URI_PATH */
    public static final java.lang.String f32985xf174bb38 = "launchWxaOpenApiRedirectingPage";

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$ConstantsWxaRedirectingPage */
    /* loaded from: classes6.dex */
    public interface ConstantsWxaRedirectingPage {

        /* renamed from: KEY_CALLBACK_ACTIVITY */
        public static final java.lang.String f32986x7be01bc9 = "_launch_wx_wxa_redirecting_page_callback_activity";

        /* renamed from: KEY_CALLBACK_MSG */
        public static final java.lang.String f32987x5f6ce667 = "_launch_wx_wxa_redirecting_page_callback_msg";

        /* renamed from: KEY_INVOKE_TICKET */
        public static final java.lang.String f32988xe44ec6b3 = "_launch_wx_wxa_redirecting_page_invoke_ticket";
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req */
    /* loaded from: classes9.dex */
    public static final class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXLaunchWxaRedirectingPage.Req";

        /* renamed from: callbackActivity */
        public java.lang.String f32989x9f346274;

        /* renamed from: invokeTicket */
        public java.lang.String f32990xe4e861a4;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public final boolean mo48424x17b96605() {
            return !android.text.TextUtils.isEmpty(this.f32990xe4e861a4);
        }

        /* renamed from: fromArray */
        public final void m48437x327a4cf(java.lang.String[] strArr) {
            this.f32990xe4e861a4 = strArr[0];
            this.f32989x9f346274 = strArr[1];
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public final void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f32990xe4e861a4 = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32988xe44ec6b3);
            this.f32989x9f346274 = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32986x7be01bc9);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public final int mo48426xfb85f7b0() {
            return 30;
        }

        /* renamed from: toArray */
        public final java.lang.String[] m48438xb986489e() {
            return new java.lang.String[]{this.f32990xe4e861a4, this.f32989x9f346274};
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public final void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32988xe44ec6b3, this.f32990xe4e861a4);
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32986x7be01bc9, this.f32989x9f346274);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp */
    /* loaded from: classes9.dex */
    public static final class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {
        private static final java.lang.String TAG = "MicroMsg.SDK.WXLaunchWxaFRedirectingPage.Resp";

        /* renamed from: callbackActivity */
        public java.lang.String f32991x9f346274;

        /* renamed from: invokeTicket */
        public java.lang.String f32992xe4e861a4;

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public final boolean mo48428x17b96605() {
            return true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public final void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            this.f32992xe4e861a4 = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32988xe44ec6b3);
            this.f32991x9f346274 = bundle.getString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32986x7be01bc9);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public final int mo48430xfb85f7b0() {
            return 30;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public final void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32988xe44ec6b3, this.f32992xe4e861a4);
            bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11257xdceeb189.ConstantsWxaRedirectingPage.f32986x7be01bc9, this.f32991x9f346274);
        }
    }
}
