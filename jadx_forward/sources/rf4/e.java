package rf4;

/* loaded from: classes4.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f476571d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f476572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 f476573f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f476574g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f476575h;

    public e(int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7, float f17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yz5.a aVar) {
        this.f476571d = i17;
        this.f476572e = i18;
        this.f476573f = c18474x76daa3b7;
        this.f476574g = h0Var;
        this.f476575h = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        long j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((java.lang.Float) animatedValue).floatValue();
        int i17 = (int) ((this.f476571d - this.f476572e) * (1 - floatValue));
        float f17 = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = this.f476573f;
        c18474x76daa3b7.setTranslationY(f17);
        if (floatValue < 0.1f) {
            float f18 = floatValue / 0.1f;
            c18474x76daa3b7.setScaleX(f18);
            c18474x76daa3b7.setScaleY(f18);
            c18474x76daa3b7.setAlpha((f18 * 0.5f) + 0.5f);
        } else {
            c18474x76daa3b7.setScaleX(1.0f);
            c18474x76daa3b7.setScaleY(1.0f);
            c18474x76daa3b7.setAlpha(1.0f);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f476574g;
            yz5.a aVar = (yz5.a) h0Var.f391656d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
            h0Var.f391656d = null;
            if (!c18474x76daa3b7.f253421m) {
                c18474x76daa3b7.f253421m = true;
                if (c18474x76daa3b7.com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_COMMENT java.lang.String.f352869g) {
                    android.view.ViewGroup.LayoutParams layoutParams = c18474x76daa3b7.getLayoutParams();
                    layoutParams.width = c18474x76daa3b7.f253424p;
                    layoutParams.height = c18474x76daa3b7.f253423o;
                    c18474x76daa3b7.setLayoutParams(layoutParams);
                    j17 = 0;
                } else {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf4.d(c18474x76daa3b7));
                    j17 = 300;
                    ofFloat.setDuration(300L);
                    ofFloat.start();
                }
                c18474x76daa3b7.m71391x9cf1d94d().setVisibility(0);
                c18474x76daa3b7.m71391x9cf1d94d().setAlpha(0.0f);
                android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c18474x76daa3b7.m71391x9cf1d94d(), "alpha", 0.0f, 1.0f);
                ofFloat2.setStartDelay(j17);
                ofFloat2.setDuration(100L);
                ofFloat2.start();
            }
        }
        if (i17 < 100) {
            c18474x76daa3b7.setAlpha(f17 / 100.0f);
        }
        if (c18474x76daa3b7.getAlpha() < 0.05f) {
            android.animation.ValueAnimator normalAnimator = c18474x76daa3b7.getNormalAnimator();
            if (normalAnimator != null) {
                normalAnimator.removeAllUpdateListeners();
            }
            yz5.a aVar2 = this.f476575h;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        }
    }
}
