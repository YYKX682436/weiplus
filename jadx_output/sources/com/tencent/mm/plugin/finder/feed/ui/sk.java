package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class sk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110540d;

    public sk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI) {
        this.f110540d = finderSharePostUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String string;
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110540d;
        r45.n46 n46Var = finderSharePostUI.A;
        if (n46Var == null) {
            kotlin.jvm.internal.o.o("shareData");
            throw null;
        }
        r45.bu5 bu5Var = (r45.bu5) n46Var.getCustom(1);
        java.lang.String str2 = "";
        if (bu5Var == null || (str = bu5Var.getString(0)) == null) {
            str = "";
        }
        r45.n46 n46Var2 = finderSharePostUI.A;
        if (n46Var2 == null) {
            kotlin.jvm.internal.o.o("shareData");
            throw null;
        }
        r45.bu5 bu5Var2 = (r45.bu5) n46Var2.getCustom(1);
        if (bu5Var2 != null && (string = bu5Var2.getString(1)) != null) {
            str2 = string;
        }
        finderSharePostUI.e7(-6, "teenmode", str, str2);
        finderSharePostUI.finish();
    }
}
