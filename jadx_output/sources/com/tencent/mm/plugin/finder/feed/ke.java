package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ke implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.af f107184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f107185e;

    public ke(com.tencent.mm.plugin.finder.feed.af afVar, boolean z17) {
        this.f107184d = afVar;
        this.f107185e = z17;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.finder.feed.af afVar = this.f107184d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = afVar.f106277x1;
        if (k0Var != null) {
            k0Var.o(null);
        }
        g4Var.clear();
        boolean z17 = this.f107185e;
        g4Var.j(z17 ? 0 : 2, "发送给朋友", com.tencent.mm.R.raw.finder_icons_filled_share, afVar.getContext().getResources().getColor(com.tencent.mm.R.color.f478502m), false);
        g4Var.j(z17 ? 1 : 3, "分享到朋友圈", com.tencent.mm.R.raw.bottomsheet_icon_moment, 0, false);
    }
}
