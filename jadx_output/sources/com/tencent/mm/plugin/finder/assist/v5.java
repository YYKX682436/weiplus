package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class v5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102625e;

    public v5(yz5.a aVar, android.content.Context context) {
        this.f102624d = aVar;
        this.f102625e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.a aVar = this.f102624d;
        if (aVar != null) {
            aVar.invoke();
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f102625e;
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        com.tencent.mm.ui.MMWizardActivity.X6(context, intent);
    }
}
