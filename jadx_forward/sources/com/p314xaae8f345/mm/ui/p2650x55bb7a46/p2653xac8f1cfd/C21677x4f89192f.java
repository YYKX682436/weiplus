package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/tencent/mm/ui/chatting/component/TranslateControllerView;", "Landroid/widget/LinearLayout;", "", "lan", "Ljz5/f0;", "setLanguageText", "Landroid/widget/TextView;", "d", "Ljz5/g;", "getTargetLanTv", "()Landroid/widget/TextView;", "targetLanTv", "", "value", "g", "I", "setTargetLanTvOriginWidth", "(I)V", "targetLanTvOriginWidth", "Landroid/animation/ValueAnimator;", "h", "getAnim", "()Landroid/animation/ValueAnimator;", "anim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.component.TranslateControllerView */
/* loaded from: classes5.dex */
public final class C21677x4f89192f extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g targetLanTv;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280105e;

    /* renamed from: f, reason: collision with root package name */
    public int f280106f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int targetLanTvOriginWidth;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g anim;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C21677x4f89192f(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21677x4f89192f c21677x4f89192f, int i17) {
        c21677x4f89192f.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21677x4f89192f.f280105e, "updateTextViewWidth() called with: w = " + i17);
        c21677x4f89192f.f280106f = i17;
        android.widget.TextView m79449x5c81e1b4 = c21677x4f89192f.m79449x5c81e1b4();
        if (m79449x5c81e1b4 == null) {
            return;
        }
        m79449x5c81e1b4.setWidth(i17);
    }

    /* renamed from: getAnim */
    private final android.animation.ValueAnimator m79448xfb7d2a87() {
        return (android.animation.ValueAnimator) ((jz5.n) this.anim).mo141623x754a37bb();
    }

    /* renamed from: getTargetLanTv */
    private final android.widget.TextView m79449x5c81e1b4() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.targetLanTv).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    /* renamed from: setTargetLanTvOriginWidth */
    private final void m79450x741ff8(int i17) {
        this.targetLanTvOriginWidth = i17;
    }

    public final void b(int i17, int i18) {
        m79448xfb7d2a87().cancel();
        m79448xfb7d2a87().setIntValues(i17, i18);
        m79448xfb7d2a87().start();
    }

    /* renamed from: setLanguageText */
    public final void m79451x1a8c6e27(java.lang.String lan) {
        android.text.TextPaint paint;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lan, "lan");
        android.widget.TextView m79449x5c81e1b4 = m79449x5c81e1b4();
        if (m79449x5c81e1b4 != null) {
            m79449x5c81e1b4.setText(lan);
        }
        android.widget.TextView m79449x5c81e1b42 = m79449x5c81e1b4();
        m79450x741ff8((m79449x5c81e1b42 == null || (paint = m79449x5c81e1b42.getPaint()) == null) ? 0 : (int) paint.measureText(lan));
        b(this.f280106f, this.targetLanTvOriginWidth);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f280105e, "setLanguageText: setTarget" + this.targetLanTvOriginWidth);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21677x4f89192f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.targetLanTv = jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.in(this));
        this.f280105e = "TranslateControllerView";
        this.anim = jz5.h.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fn(this));
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569978ti, (android.view.ViewGroup) this, true);
    }
}
