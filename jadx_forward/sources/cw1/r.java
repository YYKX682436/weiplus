package cw1;

/* loaded from: classes3.dex */
public final class r implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f304811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 f304812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f304813f;

    public r(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8, yz5.a aVar) {
        this.f304811d = arrayList;
        this.f304812e = activityC13107x4291ddb8;
        this.f304813f = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 0) {
            this.f304813f.mo152xb9724478();
            return;
        }
        java.util.ArrayList<java.lang.String> arrayList = this.f304811d;
        int size = arrayList.size();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.ActivityC13107x4291ddb8 activityC13107x4291ddb8 = this.f304812e;
        if (size > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putStringArrayListExtra("key_conversation_list", arrayList);
            j45.l.u(activityC13107x4291ddb8, ".ui.conversation.SettingCheckUnProcessWalletConvUI", intent, null);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Chat_User", arrayList.get(0));
            intent2.addFlags(67108864);
            j45.l.u(activityC13107x4291ddb8, ".ui.chatting.ChattingUI", intent2, null);
        }
    }
}
