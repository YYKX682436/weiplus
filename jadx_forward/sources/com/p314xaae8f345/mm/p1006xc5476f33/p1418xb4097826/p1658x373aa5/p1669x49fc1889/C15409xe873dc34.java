package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017B#\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002R*\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR(\u0010\u0011\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/interactioneasteregg/CenterInteractionEasterEggDarkPreview;", "Lcom/tencent/mm/ui/widget/RoundCornerLinearLayout;", "Landroid/animation/Animator;", "getDislikeOptionAnimation", "", "value", "p", "Z", "isThumbLike", "()Z", "setThumbLike", "(Z)V", "Lcom/tencent/mm/api/IEmojiInfo;", "getEmoji", "()Lcom/tencent/mm/api/IEmojiInfo;", "setEmoji", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "emoji", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview */
/* loaded from: classes10.dex */
public final class C15409xe873dc34 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22644xc8fbf3b2 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f213921r = 0;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e f213922f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f213923g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f213924h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f213925i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f213926m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f213927n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f213928o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean isThumbLike;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f213930q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15409xe873dc34(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213930q = new int[2];
    }

    /* renamed from: getDislikeOptionAnimation */
    private final android.animation.Animator m62770x4f8dc9a0() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(10L);
        if (this.isThumbLike) {
            c22699x3dcdb352 = this.f213924h;
            c22699x3dcdb3522 = this.f213925i;
        } else {
            c22699x3dcdb352 = this.f213926m;
            c22699x3dcdb3522 = this.f213927n;
        }
        ofFloat.addUpdateListener(new ox2.t(c22699x3dcdb3522, c22699x3dcdb352));
        ox2.u uVar = new ox2.u(c22699x3dcdb3522, c22699x3dcdb352);
        ofFloat.addListener(new ox2.v(uVar, uVar));
        return ofFloat;
    }

    public final void d() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522;
        if (this.f213928o) {
            if (this.isThumbLike) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f213927n;
                if (c22699x3dcdb3523 != null) {
                    c22699x3dcdb3523.setAlpha(0.0f);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = this.f213925i;
                if (c22699x3dcdb3524 != null) {
                    c22699x3dcdb3524.setAlpha(0.0f);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f213922f;
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f213923g;
            if (c15408x626e05e == null || c22789xd23e9a9b == null) {
                return;
            }
            android.animation.AnimatorSet b17 = c15408x626e05e.b(400L, c22789xd23e9a9b, null);
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c22789xd23e9a9b, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ox2.y yVar = new ox2.y(c22789xd23e9a9b);
            ofFloat.addListener(new ox2.z(yVar, yVar));
            ofFloat.addListener(new ox2.b0(this));
            android.animation.Animator m62770x4f8dc9a0 = m62770x4f8dc9a0();
            if (this.isThumbLike) {
                c22699x3dcdb352 = this.f213924h;
                c22699x3dcdb3522 = this.f213925i;
            } else {
                c22699x3dcdb352 = this.f213926m;
                c22699x3dcdb3522 = this.f213927n;
            }
            android.animation.ValueAnimator ofFloat2 = android.animation.ValueAnimator.ofFloat(1.0f, 1.2f, 1.0f, 0.8f, 1.0f);
            ofFloat2.setStartDelay(0L);
            int i17 = s26.a.f483901f;
            ofFloat2.setDuration(s26.a.e(s26.c.d(0.5d, s26.d.f483905g)));
            ofFloat2.addUpdateListener(new ox2.w(c22699x3dcdb3522));
            ofFloat2.addListener(new ox2.x(c22699x3dcdb352, c22699x3dcdb3522));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            java.util.List b18 = kz5.b0.b();
            lz5.e eVar = (lz5.e) b18;
            eVar.add(m62770x4f8dc9a0);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            animatorSet2.setStartDelay(500L);
            animatorSet2.playTogether(ofFloat2, ofFloat);
            eVar.add(animatorSet2);
            if (b17 != null) {
                eVar.add(b17);
            }
            animatorSet.playSequentially(kz5.b0.a(b18));
            animatorSet.addListener(new ox2.c0(c22789xd23e9a9b, this));
            animatorSet.start();
        }
    }

    /* renamed from: getEmoji */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb m62771x74602690() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f213922f;
        if (c15408x626e05e != null) {
            return c15408x626e05e.getEmoji();
        }
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e) findViewById(com.p314xaae8f345.mm.R.id.f565128sp0);
        this.f213922f = c15408x626e05e;
        if (c15408x626e05e != null) {
            c15408x626e05e.m62769x9e476d06(true);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) findViewById(com.p314xaae8f345.mm.R.id.uoe);
        this.f213923g = c22789xd23e9a9b;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.setAlpha(0.0f);
        }
        this.f213924h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.u7q);
        this.f213925i = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.u7r);
        this.f213926m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.u7_);
        this.f213927n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById(com.p314xaae8f345.mm.R.id.u7a);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f213925i;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setAlpha(0.0f);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f213927n;
        if (c22699x3dcdb3522 == null) {
            return;
        }
        c22699x3dcdb3522.setAlpha(0.0f);
    }

    /* renamed from: setEmoji */
    public final void m62772x52ee4104(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f213922f;
        if (c15408x626e05e != null) {
            c15408x626e05e.e(0L, null, interfaceC4987x84e327cb);
        }
    }

    /* renamed from: setThumbLike */
    public final void m62773xab002c4b(boolean z17) {
        this.isThumbLike = z17;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e = this.f213922f;
            if (c15408x626e05e != null) {
                c15408x626e05e.g();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1669x49fc1889.C15408x626e05e c15408x626e05e2 = this.f213922f;
        if (c15408x626e05e2 != null) {
            c15408x626e05e2.f();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15409xe873dc34(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f213930q = new int[2];
    }
}
