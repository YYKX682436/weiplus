package com.p314xaae8f345.mm.p987xb4b579b0.p992xdb1a454a;

/* renamed from: com.tencent.mm.opensdk.modelbiz.JoinChatroom */
/* loaded from: classes9.dex */
public class C11236x99f739d {

    /* renamed from: com.tencent.mm.opensdk.modelbiz.JoinChatroom$Req */
    /* loaded from: classes9.dex */
    public static class Req extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed {

        /* renamed from: chatroomNickName */
        public java.lang.String f32903x763745e1;

        /* renamed from: extMsg */
        public java.lang.String f32904xb32a65a0;

        /* renamed from: groupId */
        public java.lang.String f32905x117d5bfa = "";

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: checkArgs */
        public boolean mo48424x17b96605() {
            return !com.p314xaae8f345.mm.p987xb4b579b0.p996x6a710b1.d.b(this.f32905x117d5bfa);
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: getType */
        public int mo48426xfb85f7b0() {
            return 15;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11229x4f6513ed
        /* renamed from: toBundle */
        public void mo48427x792022dd(android.os.Bundle bundle) {
            super.mo48427x792022dd(bundle);
            bundle.putString("_wxapi_join_chatroom_group_id", this.f32905x117d5bfa);
            bundle.putString("_wxapi_join_chatroom_chatroom_nickname", this.f32903x763745e1);
            bundle.putString("_wxapi_join_chatroom_ext_msg", this.f32904xb32a65a0);
            bundle.putString("_wxapi_basereq_openid", this.f32865xc3c3c505);
        }
    }

    /* renamed from: com.tencent.mm.opensdk.modelbiz.JoinChatroom$Resp */
    /* loaded from: classes9.dex */
    public static class Resp extends com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61 {

        /* renamed from: extMsg */
        public java.lang.String f32906xb32a65a0;

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
            this.f32906xb32a65a0 = bundle.getString("_wxapi_join_chatroom_ext_msg");
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: getType */
        public int mo48430xfb85f7b0() {
            return 15;
        }

        @Override // com.p314xaae8f345.mm.p987xb4b579b0.p991x882e457a.AbstractC11230x9d3d6a61
        /* renamed from: toBundle */
        public void mo48431x792022dd(android.os.Bundle bundle) {
            super.mo48431x792022dd(bundle);
            bundle.putString("_wxapi_join_chatroom_ext_msg", this.f32906xb32a65a0);
        }
    }

    private C11236x99f739d() {
    }
}
