package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class tk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110580f;

    public tk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str, java.lang.String str2) {
        this.f110578d = finderSharePostUI;
        this.f110579e = str;
        this.f110580f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f110579e;
        java.lang.String str2 = this.f110580f;
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110578d;
        finderSharePostUI.e7(-7, "", str, str2);
        finderSharePostUI.c7();
    }
}
