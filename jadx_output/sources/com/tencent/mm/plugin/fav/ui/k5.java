package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class k5 extends com.tencent.mm.plugin.fav.ui.adapter.f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavSearchUI f101217m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5(com.tencent.mm.plugin.fav.ui.FavSearchUI favSearchUI, android.content.Context context) {
        super(context);
        this.f101217m = favSearchUI;
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.f
    public void k(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f101217m.f100402p;
        java.util.List list = favSearchActionView.f101552g;
        ((java.util.LinkedList) list).add(str);
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favSearchActionView.f101550e;
        if (favTagPanel == null) {
            return;
        }
        favTagPanel.setEditHint("");
        favSearchActionView.f101550e.d(str, true);
        if (favSearchActionView.f101554i == null) {
            return;
        }
        favSearchActionView.c(favSearchActionView.f101550e.getEditText());
        ((com.tencent.mm.plugin.fav.ui.j5) favSearchActionView.f101554i).a(favSearchActionView.f101551f, favSearchActionView.f101553h, list, false);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11126, 2);
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.f
    public void l(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f101217m.f100402p;
        java.util.List list = favSearchActionView.f101552g;
        ((java.util.LinkedList) list).remove(str);
        if (favSearchActionView.f101550e == null) {
            return;
        }
        if (list.isEmpty()) {
            favSearchActionView.f101550e.setEditHint(favSearchActionView.getResources().getString(com.tencent.mm.R.string.f490549y8));
        }
        favSearchActionView.f101550e.p(str);
        if (favSearchActionView.f101554i == null) {
            return;
        }
        favSearchActionView.c(favSearchActionView.f101550e.getEditText());
        ((com.tencent.mm.plugin.fav.ui.j5) favSearchActionView.f101554i).a(favSearchActionView.f101551f, favSearchActionView.f101553h, list, true);
    }
}
