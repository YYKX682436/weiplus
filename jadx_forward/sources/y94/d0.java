package y94;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f541892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y94.f0 f541893e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.String str, y94.f0 f0Var) {
        super(3);
        this.f541892d = str;
        this.f541893e = f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b d17 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.e.d(this.f541892d, true);
        if (d17 != null) {
            int i17 = d17.f243915a;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            y94.f0 f0Var = this.f541893e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = f0Var.f541899h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
            if (c16993xacc19624 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("configProvider");
                throw null;
            }
            if (i17 > c16993xacc19624.f237218w + 500) {
                ju3.d0 d0Var = f0Var.f546865d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(d0Var, "null cannot be cast to non-null type android.view.ViewGroup");
                ((android.view.ViewGroup) d0Var).findViewById(com.p314xaae8f345.mm.R.id.n7i).performClick();
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putInt("EDIT_CROP_VIDEO_LENGTH_START_TIME_INT", 0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = f0Var.f541899h;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getConfigProvider$p", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin");
                if (c16993xacc196242 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("configProvider");
                    throw null;
                }
                bundle.putInt("EDIT_CROP_VIDEO_LENGTH_END_TIME_INT", c16993xacc196242.f237218w);
                d0Var.w(ju3.c0.f383449y0, bundle);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.edit.plugin.SnsCoverEffectPreviewPlugin$prepareAndPlayVideo$1");
        return f0Var2;
    }
}
