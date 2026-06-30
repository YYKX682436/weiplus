package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class v5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f184157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184158e;

    public v5(yz5.a aVar, android.content.Context context) {
        this.f184157d = aVar;
        this.f184158e = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        yz5.a aVar = this.f184157d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f184158e;
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
    }
}
