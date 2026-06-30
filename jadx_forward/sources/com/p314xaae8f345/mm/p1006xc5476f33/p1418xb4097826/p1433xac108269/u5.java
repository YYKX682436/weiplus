package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes.dex */
public final class u5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f184126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f184127b;

    public u5(yz5.a aVar, android.content.Context context) {
        this.f184126a = aVar;
        this.f184127b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        yz5.a aVar = this.f184126a;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.content.Intent intent = new android.content.Intent();
        android.content.Context context = this.f184127b;
        intent.setClassName(context, "com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI");
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(context, intent);
    }
}
