package com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8;

/* renamed from: com.tencent.mm.opensdk.modelmsg.LaunchFromWX */
/* loaded from: classes8.dex */
public class C11267x35e771be {

    /* renamed from: com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Req */
    /* loaded from: classes8.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: MESSAGE_ACTION_LENGTH_LIMIT */
        private static final int f33019xe5938013 = 2048;

        /* renamed from: MESSAGE_EXT_LENGTH_LIMIT */
        private static final int f33020x276dc7d8 = 2048;
        private static final java.lang.String TAG = "MicroMsg.SDK.LaunchFromWX.Req";

        /* renamed from: country */
        public java.lang.String f33021x39175796;

        /* renamed from: lang */
        public java.lang.String f33022x3291ee;

        /* renamed from: messageAction */
        public java.lang.String f33023x838b091d;

        /* renamed from: messageExt */
        public java.lang.String f33024x9b39409a;

        public Req() {
        }

        public Req(android.os.Bundle bundle) {
            mo48425x63aa4ccc(bundle);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            java.lang.String str;
            java.lang.String str2 = this.f33023x838b091d;
            if (str2 == null || str2.length() <= 2048) {
                java.lang.String str3 = this.f33024x9b39409a;
                if (str3 == null || str3.length() <= 2048) {
                    return true;
                }
                str = "checkArgs fail, messageExt is too long";
            } else {
                str = "checkArgs fail, messageAction is too long";
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.Log.e(TAG, str);
            return false;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: fromBundle */
        public void mo48425x63aa4ccc(android.os.Bundle bundle) {
            super.mo48425x63aa4ccc(bundle);
            this.f33023x838b091d = bundle.getString("_wxobject_message_action");
            this.f33024x9b39409a = bundle.getString("_wxobject_message_ext");
            this.f33022x3291ee = bundle.getString("_wxapi_launch_req_lang");
            this.f33021x39175796 = bundle.getString("_wxapi_launch_req_country");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 6;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxobject_message_action", this.f33023x838b091d);
            bundle.putString("_wxobject_message_ext", this.f33024x9b39409a);
            bundle.putString("_wxapi_launch_req_lang", this.f33022x3291ee);
            bundle.putString("_wxapi_launch_req_country", this.f33021x39175796);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Resp */
    /* loaded from: classes8.dex */
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
            return 6;
        }
    }

    private C11267x35e771be() {
    }
}
