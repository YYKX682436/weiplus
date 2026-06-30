package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class yg implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f111170d;

    public yg(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f111170d = mMActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            com.tencent.mm.plugin.finder.feed.jh jhVar = com.tencent.mm.plugin.finder.feed.jh.f107101a;
            com.tencent.mm.ui.MMActivity mMActivity = this.f111170d;
            g4Var.d(1, mMActivity.getContext().getResources().getColor(com.tencent.mm.R.color.f478532ac), mMActivity.getContext().getResources().getString(com.tencent.mm.R.string.f491733e22));
        }
    }
}
