package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class q implements com.tencent.mm.plugin.base.stub.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f93783a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req f93784b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.UIEntryStub f93785c;

    public q(com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub, android.os.Bundle bundle, com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req) {
        this.f93785c = uIEntryStub;
        this.f93783a = bundle;
        this.f93784b = req;
    }

    @Override // com.tencent.mm.plugin.base.stub.j
    public void a(boolean z17) {
        com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub = this.f93785c;
        boolean isFinishing = uIEntryStub.isFinishing();
        android.os.Bundle bundle = this.f93783a;
        java.lang.String string = bundle.getString("SendAppMessageWrapper_UserName", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.UIEntryStub", "onCheckEnd, isPass = " + z17 + ", isFinishing = " + isFinishing + ", username = " + string);
        if (!z17 || isFinishing || com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            com.tencent.mm.pluginsdk.model.app.m5.c(uIEntryStub, com.tencent.mm.pluginsdk.model.app.m5.a(uIEntryStub.getIntent().getExtras(), -3), true, false);
        } else {
            android.content.Intent intent = new android.content.Intent(uIEntryStub, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class);
            intent.putExtras(bundle);
            intent.putExtra("finish_direct", false);
            intent.putExtra("Chat_User", string);
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = this.f93784b;
            intent.putExtra("SendAppMessageWrapper_Scene", req.scene);
            if (req.message.getType() == 45) {
                intent.putExtra("Select_Send_Card", true);
            }
            com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub2 = this.f93785c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(uIEntryStub2, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            uIEntryStub2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(uIEntryStub2, "com/tencent/mm/plugin/base/stub/UIEntryStub$3", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.base.stub.p(this), 1000L);
    }
}
