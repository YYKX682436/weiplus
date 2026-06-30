package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes5.dex */
public final class e3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106621d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        super(0);
        this.f106621d = a7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.a7 a7Var = this.f106621d;
        android.app.Dialog dialog = a7Var.F1;
        if (dialog != null) {
            dialog.dismiss();
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        android.content.Context context = a7Var.f106207d;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.eyf);
        return e4Var.c();
    }
}
