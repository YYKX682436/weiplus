package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class oq implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f110389d;

    public oq(com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        this.f110389d = selectLocalFileRouterUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        int i18 = com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI.f109628p;
        this.f110389d.Y6(-201);
    }
}
