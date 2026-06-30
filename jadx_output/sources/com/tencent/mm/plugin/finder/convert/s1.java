package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class s1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter f104518f;

    public s1(int i17, so2.y0 y0Var, in5.s0 s0Var, int i18, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.NPresenter nPresenter) {
        this.f104516d = y0Var;
        this.f104517e = s0Var;
        this.f104518f = nPresenter;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        so2.y0 y0Var = this.f104516d;
        if (itemId != 0) {
            if (itemId == 1) {
                this.f104518f.r0(y0Var);
                return;
            }
            return;
        }
        com.tencent.mm.feature.emoji.api.v5 v5Var = (com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class);
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
        java.lang.String md52 = iEmojiInfo != null ? iEmojiInfo.getMd5() : null;
        if (md52 == null) {
            md52 = "";
        }
        if (((com.tencent.mm.feature.emoji.k0) v5Var).Bi(md52) == null) {
            com.tencent.mm.feature.emoji.api.n6 n6Var = (com.tencent.mm.feature.emoji.api.n6) i95.n0.c(com.tencent.mm.feature.emoji.api.n6.class);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = y0Var.f410714r;
            java.lang.String md53 = iEmojiInfo2 != null ? iEmojiInfo2.getMd5() : null;
            ((com.tencent.mm.feature.emoji.t2) n6Var).wi(md53 != null ? md53 : "", y0Var.f410714r);
            ((com.tencent.mm.feature.emoji.q0) ((com.tencent.mm.feature.emoji.api.z5) i95.n0.c(com.tencent.mm.feature.emoji.api.z5.class))).Vi(y0Var.f410714r);
        }
        ((com.tencent.mm.feature.emoji.s0) ((com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class))).wi(this.f104517e.f293121e, y0Var.f410714r, 1000039, null);
    }
}
