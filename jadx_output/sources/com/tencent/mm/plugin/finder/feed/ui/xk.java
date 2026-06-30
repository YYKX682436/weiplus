package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class xk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110741f;

    public xk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str, java.lang.String str2) {
        this.f110739d = finderSharePostUI;
        this.f110740e = str;
        this.f110741f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f110740e;
        java.lang.String str2 = this.f110741f;
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110739d;
        finderSharePostUI.e7(-9, "", str, str2);
        finderSharePostUI.c7();
    }
}
