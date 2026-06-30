package mx2;

/* loaded from: classes2.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041) {
        super(2);
        this.f414015d = c15401xb8016041;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        ym5.o1 indicator = this.f414015d.getIndicator();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f c15407x15c8ab5f = indicator instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f) indicator : null;
        if (c15407x15c8ab5f != null) {
            float f17 = ((float) longValue) / ((float) longValue2);
            android.animation.ValueAnimator valueAnimator = c15407x15c8ab5f.f213900n;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c15407x15c8ab5f.f213897h = f17;
            c15407x15c8ab5f.invalidate();
        }
        return jz5.f0.f384359a;
    }
}
