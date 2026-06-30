package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class eo implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f285427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableStringBuilder f285428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f285429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f285430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f285431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 f285432i;

    public eo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5, long j17, android.text.SpannableStringBuilder spannableStringBuilder, java.lang.CharSequence charSequence, int i17, int i18) {
        this.f285432i = c21917xeb4fc2b5;
        this.f285427d = j17;
        this.f285428e = spannableStringBuilder;
        this.f285429f = charSequence;
        this.f285430g = i17;
        this.f285431h = i18;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = this.f285432i;
        android.text.style.ForegroundColorSpan foregroundColorSpan = new android.text.style.ForegroundColorSpan(c21917xeb4fc2b5.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        android.text.SpannableStringBuilder spannableStringBuilder = this.f285428e;
        spannableStringBuilder.clear();
        java.lang.CharSequence charSequence = this.f285429f;
        int i17 = this.f285430g;
        spannableStringBuilder.append(charSequence.subSequence(0, i17)).setSpan(foregroundColorSpan, this.f285431h, i17, 33);
        c21917xeb4fc2b5.f284742e.c(spannableStringBuilder, android.widget.TextView.BufferType.SPANNABLE, null);
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) ((yb5.d) c21917xeb4fc2b5.f284749o.get()).f542241c.a(sb5.k2.class))).o0(this.f285427d)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5.a(c21917xeb4fc2b5);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "renderVoiceTextAppendNew onAnimationCancel!!");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemTranslate", "renderVoiceTextAppendNew onAnimationEnd!!");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5 c21917xeb4fc2b5 = this.f285432i;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.xm) ((sb5.k2) ((yb5.d) c21917xeb4fc2b5.f284749o.get()).f542241c.a(sb5.k2.class))).o0(this.f285427d)) {
            c21917xeb4fc2b5.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.eo$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21917xeb4fc2b5.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.eo.this.f285432i);
                }
            }, 200L);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}
