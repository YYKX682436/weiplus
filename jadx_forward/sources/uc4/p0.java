package uc4;

/* loaded from: classes4.dex */
public final class p0 extends uc4.b1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // uc4.g
    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        for (android.view.View view2 : ((pd4.b) view).m158270xf9bd9d24()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e c17973x67e3e70e = view2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) view2 : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 m70599xcb16a3ea = c17973x67e3e70e != null ? c17973x67e3e70e.m70599xcb16a3ea() : null;
            if (m70599xcb16a3ea != null && m70599xcb16a3ea.getTag(com.p314xaae8f345.mm.R.id.n99) == null) {
                m70599xcb16a3ea.setTag(com.p314xaae8f345.mm.R.id.n99, 1);
                rl5.r f17 = f();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 h1Var = this.f507915g;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getPhotoMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveSinglePhotoClick");
                f17.j(m70599xcb16a3ea, h1Var, new uc4.n0(this));
                m70599xcb16a3ea.setOnClickListener(new uc4.o0(this));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveMultiPhotoClick");
    }
}
