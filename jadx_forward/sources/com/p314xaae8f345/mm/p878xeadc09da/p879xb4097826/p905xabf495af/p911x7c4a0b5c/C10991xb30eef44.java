package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p911x7c4a0b5c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView;", "Landroid/widget/FrameLayout;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "Ljz5/f0;", "setOnCheckedChangeListener", "", "buttonId", "setCheckedBtn", "Landroid/view/View;", "d", "Ljz5/g;", "getRadioGroup", "()Landroid/view/View;", "radioGroup", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar.SelectorView */
/* loaded from: classes5.dex */
public final class C10991xb30eef44 extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f151201e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g radioGroup;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10991xb30eef44(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getRadioGroup */
    private final android.view.View m47403xecceef3a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.radioGroup).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final boolean a() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(4);
        return true;
    }

    public final void b(int i17, int i18, int i19) {
        android.view.View m47403xecceef3a = m47403xecceef3a();
        android.view.View findViewById = m47403xecceef3a.findViewById(com.p314xaae8f345.mm.R.id.rpa);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.RadioButton radioButton = (android.widget.RadioButton) findViewById;
        android.view.View findViewById2 = m47403xecceef3a.findViewById(com.p314xaae8f345.mm.R.id.f568313s46);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.RadioButton radioButton2 = (android.widget.RadioButton) findViewById2;
        android.view.View findViewById3 = m47403xecceef3a.findViewById(com.p314xaae8f345.mm.R.id.s8e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.RadioButton radioButton3 = (android.widget.RadioButton) findViewById3;
        radioButton.setText(m47403xecceef3a.getContext().getString(i17));
        radioButton.setContentDescription(radioButton.getText());
        radioButton2.setText(m47403xecceef3a.getContext().getString(i18));
        radioButton2.setContentDescription(radioButton2.getText());
        radioButton3.setText(m47403xecceef3a.getContext().getString(i19));
        radioButton3.setContentDescription(radioButton3.getText());
    }

    public final void c(android.view.View referenceView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(referenceView, "referenceView");
        int[] iArr = new int[2];
        referenceView.getLocationOnScreen(iArr);
        jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        setOnTouchListener(new wx0.d1(this, intValue, referenceView, intValue2));
        m47403xecceef3a().measure(0, 0);
        int height = (intValue2 + (referenceView.getHeight() / 2)) - (m47403xecceef3a().getMeasuredHeight() / 2);
        android.view.View m47403xecceef3a = m47403xecceef3a();
        android.view.ViewGroup.LayoutParams layoutParams = m47403xecceef3a().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 53;
        layoutParams2.topMargin = height;
        layoutParams2.rightMargin = i17;
        m47403xecceef3a.setLayoutParams(layoutParams2);
        setVisibility(0);
    }

    /* renamed from: setCheckedBtn */
    public final void m47404xfdccc737(int i17) {
        android.view.View m47403xecceef3a = m47403xecceef3a();
        android.widget.RadioGroup radioGroup = m47403xecceef3a instanceof android.widget.RadioGroup ? (android.widget.RadioGroup) m47403xecceef3a : null;
        if (radioGroup != null) {
            radioGroup.check(i17);
        }
    }

    /* renamed from: setOnCheckedChangeListener */
    public final void m47405x405278aa(android.widget.RadioGroup.OnCheckedChangeListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        android.view.View m47403xecceef3a = m47403xecceef3a();
        android.widget.RadioGroup radioGroup = m47403xecceef3a instanceof android.widget.RadioGroup ? (android.widget.RadioGroup) m47403xecceef3a : null;
        if (radioGroup != null) {
            radioGroup.setOnCheckedChangeListener(listener);
        }
    }

    public /* synthetic */ C10991xb30eef44(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10991xb30eef44(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.radioGroup = jz5.h.b(new wx0.c1(context));
        addView(m47403xecceef3a());
        setVisibility(4);
    }
}
