package com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df;

/* renamed from: com.tencent.mm.opensdk.modelpay.PayReq */
/* loaded from: classes8.dex */
public class C11302x8e12daf6 extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

    /* renamed from: EXTDATA_MAX_LENGTH */
    private static final int f33250x6512bdd5 = 1024;
    private static final java.lang.String TAG = "MicroMsg.PaySdk.PayReq";

    /* renamed from: appId */
    public java.lang.String f33251x58b7f1c;

    /* renamed from: extData */
    public java.lang.String f33252xb21df56b;

    /* renamed from: nonceStr */
    public java.lang.String f33253x53ec53c2;

    /* renamed from: options */
    public com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options f33254xb586869e;

    /* renamed from: packageValue */
    public java.lang.String f33255x8f9828cb;

    /* renamed from: partnerId */
    public java.lang.String f33256x94f8d403;

    /* renamed from: prepayId */
    public java.lang.String f33257xb3bbab20;

    /* renamed from: sign */
    public java.lang.String f33258x35ddbd;

    /* renamed from: signType */
    public java.lang.String f33259x128eba97;

    /* renamed from: timeStamp */
    public java.lang.String f33260x18638f6;

    /* renamed from: com.tencent.mm.opensdk.modelpay.PayReq$Options */
    /* loaded from: classes8.dex */
    public static class Options {

        /* renamed from: INVALID_FLAGS */
        public static final int f33261xbdbfd9ff = -1;

        /* renamed from: callbackClassName */
        public java.lang.String f33262x3a8e995e;

        /* renamed from: callbackFlags */
        public int f33263x54a34142 = -1;

        /* renamed from: fromBundle */
        public void m48483x63aa4ccc(android.os.Bundle bundle) {
            this.f33262x3a8e995e = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payoptions_callback_classname");
            this.f33263x54a34142 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.a(bundle, "_wxapi_payoptions_callback_flags");
        }

        /* renamed from: toBundle */
        public void m48484x792022dd(android.os.Bundle bundle) {
            bundle.putString("_wxapi_payoptions_callback_classname", this.f33262x3a8e995e);
            bundle.putInt("_wxapi_payoptions_callback_flags", this.f33263x54a34142);
        }
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
    /* renamed from: checkArgs */
    public boolean mo48424x17b96605() {
        java.lang.String str;
        java.lang.String str2 = this.f33251x58b7f1c;
        if (str2 == null || str2.length() == 0) {
            str = "checkArgs fail, invalid appId";
        } else {
            java.lang.String str3 = this.f33256x94f8d403;
            if (str3 == null || str3.length() == 0) {
                str = "checkArgs fail, invalid partnerId";
            } else {
                java.lang.String str4 = this.f33257xb3bbab20;
                if (str4 == null || str4.length() == 0) {
                    str = "checkArgs fail, invalid prepayId";
                } else {
                    java.lang.String str5 = this.f33253x53ec53c2;
                    if (str5 == null || str5.length() == 0) {
                        str = "checkArgs fail, invalid nonceStr";
                    } else {
                        java.lang.String str6 = this.f33260x18638f6;
                        if (str6 == null || str6.length() == 0) {
                            str = "checkArgs fail, invalid timeStamp";
                        } else {
                            java.lang.String str7 = this.f33255x8f9828cb;
                            if (str7 == null || str7.length() == 0) {
                                str = "checkArgs fail, invalid packageValue";
                            } else {
                                java.lang.String str8 = this.f33258x35ddbd;
                                if (str8 == null || str8.length() == 0) {
                                    str = "checkArgs fail, invalid sign";
                                } else {
                                    java.lang.String str9 = this.f33252xb21df56b;
                                    if (str9 == null || str9.length() <= 1024) {
                                        return true;
                                    }
                                    str = "checkArgs fail, extData length too long";
                                }
                            }
                        }
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
        return false;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
    /* renamed from: fromBundle */
    public void mo48425x63aa4ccc(android.os.Bundle bundle) {
        super.mo48425x63aa4ccc(bundle);
        this.f33251x58b7f1c = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_appid");
        this.f33256x94f8d403 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_partnerid");
        this.f33257xb3bbab20 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_prepayid");
        this.f33253x53ec53c2 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_noncestr");
        this.f33260x18638f6 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_timestamp");
        this.f33255x8f9828cb = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_packagevalue");
        this.f33258x35ddbd = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_sign");
        this.f33252xb21df56b = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_extdata");
        this.f33259x128eba97 = com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.a.b(bundle, "_wxapi_payreq_sign_type");
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options options = new com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options();
        this.f33254xb586869e = options;
        options.m48483x63aa4ccc(bundle);
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
    /* renamed from: getType */
    public int mo48426xfb85f7b0() {
        return 5;
    }

    @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
    /* renamed from: toBundle */
    public void mo48427x792022dd(android.os.Bundle bundle) {
        super.mo48427x792022dd(bundle);
        bundle.putString("_wxapi_payreq_appid", this.f33251x58b7f1c);
        bundle.putString("_wxapi_payreq_partnerid", this.f33256x94f8d403);
        bundle.putString("_wxapi_payreq_prepayid", this.f33257xb3bbab20);
        bundle.putString("_wxapi_payreq_noncestr", this.f33253x53ec53c2);
        bundle.putString("_wxapi_payreq_timestamp", this.f33260x18638f6);
        bundle.putString("_wxapi_payreq_packagevalue", this.f33255x8f9828cb);
        bundle.putString("_wxapi_payreq_sign", this.f33258x35ddbd);
        bundle.putString("_wxapi_payreq_extdata", this.f33252xb21df56b);
        bundle.putString("_wxapi_payreq_sign_type", this.f33259x128eba97);
        com.p314xaae8f345.mm.p987xb4b579b0.p994xdb1a78df.C11302x8e12daf6.Options options = this.f33254xb586869e;
        if (options != null) {
            options.m48484x792022dd(bundle);
        }
    }
}
