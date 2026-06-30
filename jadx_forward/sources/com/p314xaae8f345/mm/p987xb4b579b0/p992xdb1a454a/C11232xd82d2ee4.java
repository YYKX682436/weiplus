package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage */
/* loaded from: classes9.dex */
public class C11232xd82d2ee4 {
    private static final java.lang.String TAG = "MicroMsg.ChooseCardFromWXCardPackage";

    /* renamed from: com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: appId */
        public java.lang.String f32883x58b7f1c;

        /* renamed from: canMultiSelect */
        public java.lang.String f32884x59d38da5;

        /* renamed from: cardId */
        public java.lang.String f32885xae7c004b;

        /* renamed from: cardSign */
        public java.lang.String f32886xff81c4ed;

        /* renamed from: cardType */
        public java.lang.String f32887xff82766a;

        /* renamed from: locationId */
        public java.lang.String f32888x5be68fb0;

        /* renamed from: nonceStr */
        public java.lang.String f32889x53ec53c2;

        /* renamed from: signType */
        public java.lang.String f32890x128eba97;

        /* renamed from: timeStamp */
        public java.lang.String f32891x18638f6;

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3 = this.f32883x58b7f1c;
            return str3 != null && str3.length() > 0 && (str = this.f32890x128eba97) != null && str.length() > 0 && (str2 = this.f32886xff81c4ed) != null && str2.length() > 0;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 16;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_choose_card_from_wx_card_app_id", this.f32883x58b7f1c);
            bundle.putString("_wxapi_choose_card_from_wx_card_location_id", this.f32888x5be68fb0);
            bundle.putString("_wxapi_choose_card_from_wx_card_sign_type", this.f32890x128eba97);
            bundle.putString("_wxapi_choose_card_from_wx_card_card_sign", this.f32886xff81c4ed);
            bundle.putString("_wxapi_choose_card_from_wx_card_time_stamp", this.f32891x18638f6);
            bundle.putString("_wxapi_choose_card_from_wx_card_nonce_str", this.f32889x53ec53c2);
            bundle.putString("_wxapi_choose_card_from_wx_card_card_id", this.f32885xae7c004b);
            bundle.putString("_wxapi_choose_card_from_wx_card_card_type", this.f32887xff82766a);
            bundle.putString("_wxapi_choose_card_from_wx_card_can_multi_select", this.f32884x59d38da5);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: cardItemList */
        public java.lang.String f32892x61d0ad81;

        public Resp() {
        }

        public Resp(android.os.Bundle bundle) {
            mo48429x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: checkArgs */
        public boolean mo48428x17b96605() {
            java.lang.String str = this.f32892x61d0ad81;
            return (str == null || str.length() == 0) ? false : true;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: fromBundle */
        public void mo48429x63aa4ccc(android.os.Bundle bundle) {
            super.mo48429x63aa4ccc(bundle);
            java.lang.String string = bundle.getString("_wxapi_choose_card_from_wx_card_list");
            if (string == null || string.length() <= 0) {
                com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.i(com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a.C11232xd82d2ee4.TAG, "cardItemList is empty!");
            } else {
                this.f32892x61d0ad81 = string;
            }
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 16;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_choose_card_from_wx_card_list", this.f32892x61d0ad81);
        }
    }
}
