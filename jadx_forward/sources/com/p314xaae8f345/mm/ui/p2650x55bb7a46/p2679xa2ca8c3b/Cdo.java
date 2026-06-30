package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.do, reason: invalid class name */
/* loaded from: classes5.dex */
public class Cdo implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jl1.a f285345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f285346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f285347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f285349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f285350i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 f285351m;

    public Cdo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5, jl1.a aVar, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, int i17, int i18, long j17) {
        this.f285351m = c21917xeb4fc2b5;
        this.f285345d = aVar;
        this.f285346e = spannableStringBuilder;
        this.f285347f = charSequence;
        this.f285348g = i17;
        this.f285349h = i18;
        this.f285350i = j17;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(this.f285345d.a(((java.lang.Float) valueAnimator.getAnimatedValue("ratio")).floatValue()));
        android.text.SpannableStringBuilder spannableStringBuilder = this.f285346e;
        spannableStringBuilder.clear();
        java.lang.CharSequence charSequence = this.f285347f;
        int i17 = this.f285348g;
        spannableStringBuilder.append(charSequence.subSequence(0, i17)).setSpan(foregroundColorSpan, this.f285349h, i17, 33);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = this.f285351m;
        c21917xeb4fc2b5.f284742e.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) ((yb5.d) c21917xeb4fc2b5.f284749o.get()).f542241c.a(sb5.k2.class))).o0(this.f285350i)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5.a(c21917xeb4fc2b5);
        }
    }
}
