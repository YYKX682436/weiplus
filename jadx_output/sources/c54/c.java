package c54;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f38674a;

    /* renamed from: b, reason: collision with root package name */
    public final c54.k f38675b;

    public c(android.content.Context mContext, c54.k mViewHolder) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mViewHolder, "mViewHolder");
        this.f38674a = mContext;
        this.f38675b = mViewHolder;
    }

    public final android.view.animation.Interpolator a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreAnimEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.25f, 0.11f, 0.2f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreAnimEaseInInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        return pathInterpolator;
    }

    public final android.view.animation.Interpolator b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreAnimEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(0.0f, 0.0f, 0.1f, 1.0f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreAnimEaseOutInterpolator", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardAnimController");
        return pathInterpolator;
    }
}
