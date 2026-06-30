package mx2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414014d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041) {
        super(0);
        this.f414014d = c15401xb8016041;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPlay : onPlayComplete, scroll from:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414014d;
        sb6.append(c15401xb8016041.getFocusPosition());
        sb6.append(" to next page");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageBanner", sb6.toString());
        ym5.o1 indicator = c15401xb8016041.getIndicator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f c15407x15c8ab5f = indicator instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f) indicator : null;
        if (c15407x15c8ab5f != null) {
            android.animation.ValueAnimator valueAnimator = c15407x15c8ab5f.f213900n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c15407x15c8ab5f.f213897h = 1.0f;
            c15407x15c8ab5f.invalidate();
        }
        if (c15401xb8016041.f213857v && c15401xb8016041.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041.c(c15401xb8016041);
        }
        return jz5.f0.f384359a;
    }
}
