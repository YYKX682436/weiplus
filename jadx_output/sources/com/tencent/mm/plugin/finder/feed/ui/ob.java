package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes11.dex */
public final class ob implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI f110371a;

    public ob(com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI) {
        this.f110371a = finderLivePostSelectContactUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI finderLivePostSelectContactUI = this.f110371a;
        if (i17 == 0 && fVar.f70616b == 0) {
            finderLivePostSelectContactUI.finish();
            finderLivePostSelectContactUI.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477877e1);
            finderLivePostSelectContactUI.x7();
            finderLivePostSelectContactUI.b7().notifyDataSetChanged();
        } else {
            int i18 = com.tencent.mm.plugin.finder.feed.ui.FinderLivePostSelectContactUI.T;
            finderLivePostSelectContactUI.x7();
            db5.t7.g(finderLivePostSelectContactUI.getContext(), finderLivePostSelectContactUI.getContext().getResources().getString(com.tencent.mm.R.string.e_i));
        }
        return jz5.f0.f302826a;
    }
}
