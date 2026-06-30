package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public class r6 extends com.tencent.mm.plugin.fav.ui.adapter.f {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavTagEditUI f101375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI, android.content.Context context) {
        super(context);
        this.f101375m = favTagEditUI;
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.f
    public void k(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101375m;
        favTagEditUI.f100417g.d(str, true);
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favTagEditUI.f100416f;
        if (favTagPanel != null) {
            favTagPanel.s(str, true);
        }
        favTagEditUI.T6();
    }

    @Override // com.tencent.mm.plugin.fav.ui.adapter.f
    public void l(java.lang.String str) {
        com.tencent.mm.plugin.fav.ui.FavTagEditUI favTagEditUI = this.f101375m;
        favTagEditUI.f100417g.p(str);
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = favTagEditUI.f100416f;
        if (favTagPanel != null) {
            favTagPanel.s(str, false);
        }
        favTagEditUI.T6();
    }
}
