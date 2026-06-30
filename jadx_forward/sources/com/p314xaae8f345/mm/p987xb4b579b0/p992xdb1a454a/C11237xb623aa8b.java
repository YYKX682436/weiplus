package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.OpenBusiLuckyMoney */
/* loaded from: classes6.dex */
public class C11237xb623aa8b {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.OpenBusiLuckyMoney$Req */
    /* loaded from: classes8.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: MAX_URL_LENGHT */
        private static final int f32907xfd221449 = 10240;

        /* renamed from: appId */
        public java.lang.String f32908x58b7f1c;

        /* renamed from: nonceStr */
        public java.lang.String f32909x53ec53c2;

        /* renamed from: packageExt */
        public java.lang.String f32910x1bf2ffb;

        /* renamed from: signType */
        public java.lang.String f32911x128eba97;

        /* renamed from: signature */
        public java.lang.String f32912x3ffd98b8;

        /* renamed from: timeStamp */
        public java.lang.String f32913x18638f6;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            java.lang.String str4;
            java.lang.String str5 = this.f32908x58b7f1c;
            return str5 != null && str5.length() > 0 && (str = this.f32913x18638f6) != null && str.length() > 0 && (str2 = this.f32909x53ec53c2) != null && str2.length() > 0 && (str3 = this.f32911x128eba97) != null && str3.length() > 0 && (str4 = this.f32912x3ffd98b8) != null && str4.length() > 0;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 13;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_open_busi_lucky_money_appid", this.f32908x58b7f1c);
            bundle.putString("_wxapi_open_busi_lucky_money_timeStamp", this.f32913x18638f6);
            bundle.putString("_wxapi_open_busi_lucky_money_nonceStr", this.f32909x53ec53c2);
            bundle.putString("_wxapi_open_busi_lucky_money_signType", this.f32911x128eba97);
            bundle.putString("_wxapi_open_busi_lucky_money_signature", this.f32912x3ffd98b8);
            bundle.putString("_wxapi_open_busi_lucky_money_package", this.f32910x1bf2ffb);
        }
    }
}
