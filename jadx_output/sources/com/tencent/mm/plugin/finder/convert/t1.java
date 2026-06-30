package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class t1 implements db5.r4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f104581a;

    public t1(int i17, so2.y0 y0Var) {
        this.f104581a = y0Var;
    }

    @Override // db5.r4
    public final void a(android.view.View view, int i17, android.view.MenuItem menuItem) {
        if (menuItem.getItemId() == 0) {
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(view, "long_press_add_to_my_sticker");
            aVar.Tj(view, 40, 1, false);
            jz5.l[] lVarArr = new jz5.l[6];
            so2.y0 y0Var = this.f104581a;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(y0Var.f410703d.field_feedId));
            lVarArr[1] = new jz5.l("comment_id", pm0.v.u(y0Var.f410703d.t0()));
            com.tencent.mm.api.IEmojiInfo iEmojiInfo = y0Var.f410714r;
            lVarArr[2] = new jz5.l("pid", iEmojiInfo != null ? iEmojiInfo.getGroupId() : null);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = y0Var.f410714r;
            lVarArr[3] = new jz5.l("emoticon_activityid", iEmojiInfo2 != null ? iEmojiInfo2.S0() : null);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = y0Var.f410714r;
            lVarArr[4] = new jz5.l("emoticon_designerid", iEmojiInfo3 != null ? iEmojiInfo3.X0() : null);
            com.tencent.mm.api.IEmojiInfo iEmojiInfo4 = y0Var.f410714r;
            lVarArr[5] = new jz5.l("emoticon_md5", iEmojiInfo4 != null ? iEmojiInfo4.getMd5() : null);
            aVar.gk(view, kz5.c1.k(lVarArr));
        }
    }
}
