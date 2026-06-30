package ym5;

/* loaded from: classes10.dex */
public final class w2 extends ym5.h {
    @Override // ym5.h
    public bn5.f a() {
        return new bn5.g(getContext(), m177317xc879b3f2());
    }

    @Override // ym5.h
    public dn5.c b() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m177317xc879b3f2, "getPresenter(...)");
        return new dn5.d(context, m177317xc879b3f2);
    }

    @Override // ym5.h
    /* renamed from: getFeatures */
    public qk.g6[] mo177315x6a8721b3() {
        if (this.f544880g == null) {
            this.f544880g = new qk.g6[]{qk.g6.DOODLE, qk.g6.EMOJI, qk.g6.TEXT, qk.g6.MOSAIC, qk.g6.CROP_PHOTO};
        }
        qk.g6[] mFeaturesTypes = this.f544880g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }
}
