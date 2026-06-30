package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class z0 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.a1 f100820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI f100821e;

    public z0(com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI, com.tencent.mm.plugin.fav.ui.detail.a1 a1Var) {
        this.f100821e = favoriteImgDetailUI;
        this.f100820d = a1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.f100624w;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = this.f100821e;
        favoriteImgDetailUI.getClass();
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = this.f100820d;
        a1Var.f100686d = false;
        a1Var.f100692j = false;
        a1Var.f100687e = null;
        a1Var.f100688f = 0;
        a1Var.f100689g = 0;
        a1Var.f100690h = "";
        a1Var.f100691i = null;
        ((com.tencent.mm.plugin.scanner.ScanCodeSheetItemLogic) favoriteImgDetailUI.f100631s).n();
    }
}
