package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class vk implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110670f;

    public vk(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, java.lang.String str, java.lang.String str2) {
        this.f110668d = finderSharePostUI;
        this.f110669e = str;
        this.f110670f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f110669e;
        java.lang.String str2 = this.f110670f;
        com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI = this.f110668d;
        finderSharePostUI.e7(-8, "", str, str2);
        finderSharePostUI.c7();
    }
}
