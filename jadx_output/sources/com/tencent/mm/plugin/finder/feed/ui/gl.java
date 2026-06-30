package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class gl implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110092d;

    public gl(com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI) {
        this.f110092d = finderSharePostUI;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        int i17 = com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI.B;
        this.f110092d.c7();
    }
}
