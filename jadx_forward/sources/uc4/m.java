package uc4;

/* loaded from: classes4.dex */
public final class m implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.o f507965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f507966e;

    public m(uc4.o oVar, java.lang.StringBuilder sb6) {
        this.f507965d = oVar;
        this.f507966e = sb6;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$3");
        java.lang.Object systemService = this.f507965d.b().getSystemService("clipboard");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText(null, this.f507966e.toString()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveAvatarClick$showFeedDetailDialog$3");
    }
}
