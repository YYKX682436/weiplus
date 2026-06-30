package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/landingpage/halfscreen/HalfScreenScrollableFrameLayout;", "Lcom/tencent/mm/plugin/sns/ad/landingpage/halfscreen/ScrollableFrameLayout;", "Ln54/q;", "y", "Ln54/q;", "getChildScrollableListener", "()Ln54/q;", "setChildScrollableListener", "(Ln54/q;)V", "childScrollableListener", "Ln54/s;", "z", "Ln54/s;", "getHalfScreenContainerDoGesture", "()Ln54/s;", "setHalfScreenContainerDoGesture", "(Ln54/s;)V", "halfScreenContainerDoGesture", "", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "F", "getContentViewHeight", "()F", "setContentViewHeight", "(F)V", "contentViewHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout */
/* loaded from: classes14.dex */
public final class C17741x52670971 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0 {

    /* renamed from: A, reason: from kotlin metadata */
    public float contentViewHeight;

    /* renamed from: x, reason: collision with root package name */
    public final int f244593x;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public n54.q childScrollableListener;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public n54.s halfScreenContainerDoGesture;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17741x52670971(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0
    public float d(n54.o animation) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int ordinal = animation.ordinal();
        float f17 = 0.0f;
        if (ordinal == 0) {
            float f18 = this.contentViewHeight;
            f17 = f18 <= 0.0f ? getHeight() : f18;
        } else if (ordinal == 1) {
            f17 = 0.0f - m69457x7bbfcd63();
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                jz5.j jVar = new jz5.j();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
                throw jVar;
            }
            f17 = m69453x423c0867();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcTranslationY", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if ((r4 != null && r4.b() == 5) != false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17741x52670971.g(android.view.MotionEvent):boolean");
    }

    /* renamed from: getChildScrollableListener */
    public final n54.q m69443x6bef6981() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        n54.q qVar = this.childScrollableListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return qVar;
    }

    /* renamed from: getContentViewHeight */
    public final float m69444x1bca7ccf() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        float f17 = this.contentViewHeight;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    /* renamed from: getHalfScreenContainerDoGesture */
    public final n54.s m69445x6c98f612() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        n54.s sVar = this.halfScreenContainerDoGesture;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return sVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0
    public boolean h(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        n54.s sVar = this.halfScreenContainerDoGesture;
        if (sVar != null) {
            ((y54.h) sVar).a(n54.p.f416683d);
        }
        super.h(event);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionDown", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0
    public boolean i(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionMove", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        float rawY = event.getRawY() - m69455x97a2c732();
        event.getRawX();
        m69454x97a2c731();
        if (f() || java.lang.Math.abs(rawY) >= m69458x151bf723()) {
            float m69452x410a6c6e = rawY + m69452x410a6c6e();
            if ((m69452x410a6c6e == 0.0f) || ((m69452x410a6c6e > 0.0f && java.lang.Math.abs(m69452x410a6c6e) < getHeight()) || (m69452x410a6c6e < 0.0f && java.lang.Math.abs(m69452x410a6c6e) < m69457x7bbfcd63()))) {
                m69460xcfcf0555(true);
                n54.s sVar = this.halfScreenContainerDoGesture;
                if (sVar != null) {
                    ((y54.h) sVar).a(n54.p.f416684e);
                }
                m69449xd33fb913();
                if (m69449xd33fb913() || m69452x410a6c6e >= 0.0f) {
                    k(m69452x410a6c6e);
                } else if (!m69449xd33fb913() && m69452x410a6c6e < 0.0f) {
                    k(0.0f);
                }
            }
        }
        boolean f17 = f();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionMove", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return f17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2108x1c644e5f.C17742x250976b0
    public boolean j(android.view.MotionEvent event) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HalfScreenScrollableFrameLayout", "onTouchActionUpOrCancel is called!!!");
        n54.s sVar = this.halfScreenContainerDoGesture;
        if (sVar != null) {
            ((y54.h) sVar).a(n54.p.f416685f);
        }
        if (f()) {
            float translationY = getTranslationY();
            if (m69451x4093a42c()) {
                if (translationY >= 0.0f || java.lang.Math.abs(translationY) <= m69457x7bbfcd63() / 2) {
                    m();
                } else {
                    n();
                }
            } else if (translationY < 0.0f) {
                n();
            } else if (translationY <= this.f244593x) {
                k(0.0f);
            } else {
                m();
            }
        }
        m69460xcfcf0555(false);
        m69466x925b283d(0.0f);
        m69467x925b283e(0.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchActionUpOrCancel", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        return false;
    }

    /* renamed from: setChildScrollableListener */
    public final void m69446x821f4ef5(n54.q qVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.childScrollableListener = qVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setChildScrollableListener", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    /* renamed from: setContentViewHeight */
    public final void m69447xf7608943(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.contentViewHeight = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContentViewHeight", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    /* renamed from: setHalfScreenContainerDoGesture */
    public final void m69448x6782591e(n54.s sVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
        this.halfScreenContainerDoGesture = sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setHalfScreenContainerDoGesture", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.HalfScreenScrollableFrameLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17741x52670971(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f244593x = i65.a.b(getContext(), 60);
    }
}
