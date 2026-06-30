package com.tencent.mm.plugin.base.stub;

/* loaded from: classes9.dex */
public class o implements com.tencent.mm.plugin.base.stub.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f93776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req f93777b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.UIEntryStub f93778c;

    public o(com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub, android.os.Bundle bundle, com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req) {
        this.f93778c = uIEntryStub;
        this.f93776a = bundle;
        this.f93777b = req;
    }

    @Override // com.tencent.mm.plugin.base.stub.j
    public void a(boolean z17) {
        com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub = this.f93778c;
        boolean isFinishing = uIEntryStub.isFinishing();
        if (!z17 || isFinishing) {
            com.tencent.mm.pluginsdk.model.app.m5.c(uIEntryStub, com.tencent.mm.pluginsdk.model.app.m5.a(uIEntryStub.getIntent().getExtras(), -3), true, false);
        } else {
            android.content.Intent intent = new android.content.Intent(uIEntryStub, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class);
            intent.putExtras(this.f93776a);
            intent.putExtra("Select_Conv_User", "weixinfile");
            intent.putExtra("SendAppMessageWrapper_Scene", this.f93777b.scene);
            com.tencent.mm.plugin.base.stub.UIEntryStub uIEntryStub2 = this.f93778c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(uIEntryStub2, arrayList.toArray(), "com/tencent/mm/plugin/base/stub/UIEntryStub$2", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            uIEntryStub2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(uIEntryStub2, "com/tencent/mm/plugin/base/stub/UIEntryStub$2", "onCheckEnd", "(Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.base.stub.n(this), 1000L);
    }
}
