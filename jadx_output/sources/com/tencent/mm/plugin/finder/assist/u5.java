package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class u5 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102593a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102594b;

    public u5(yz5.a aVar, android.content.Context context) {
        this.f102593a = aVar;
        this.f102594b = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        yz5.a aVar = this.f102593a;
        if (aVar != null) {
            aVar.invoke();
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f102594b;
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }
}
