package wd4;

/* loaded from: classes12.dex */
public final class f1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f526433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wd4.l1 f526434e;

    public f1(yz5.a aVar, wd4.l1 l1Var) {
        this.f526433d = aVar;
        this.f526434e = l1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.c1
    /* renamed from: onDismiss */
    public final void mo889xb349b3ab() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
        this.f526433d.mo152xb9724478();
        wd4.l1 l1Var = this.f526434e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17263x2beb5636) l1Var.e()).n();
        r45.pk5 f17 = l1Var.f();
        if (f17 != null) {
            f17.f464665d = 1;
            f17.f464673o = (int) (android.os.SystemClock.elapsedRealtime() - f17.f464676r);
        }
        l35.a.f396976a.a(l1Var.c());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDismiss", "com.tencent.mm.plugin.sns.ui.sheet.ShareSheet$setOnSheetDismissListener$1");
    }
}
