package com.tencent.mm.mj_publisher.finder.shoot_composing.sidebar;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/shoot_composing/sidebar/SelectorView;", "Landroid/widget/FrameLayout;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setOnCheckedChangeListener", "", "buttonId", "setCheckedBtn", "Landroid/view/View;", "d", "Ljz5/g;", "getRadioGroup", "()Landroid/view/View;", "radioGroup", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SelectorView extends android.widget.FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f69668e = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g radioGroup;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final android.view.View getRadioGroup() {
        java.lang.Object value = ((jz5.n) this.radioGroup).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final boolean a() {
        if (getVisibility() != 0) {
            return false;
        }
        setVisibility(4);
        return true;
    }

    public final void b(int i17, int i18, int i19) {
        android.view.View radioGroup = getRadioGroup();
        android.view.View findViewById = radioGroup.findViewById(com.tencent.mm.R.id.rpa);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RadioButton radioButton = (android.widget.RadioButton) findViewById;
        android.view.View findViewById2 = radioGroup.findViewById(com.tencent.mm.R.id.f486780s46);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.RadioButton radioButton2 = (android.widget.RadioButton) findViewById2;
        android.view.View findViewById3 = radioGroup.findViewById(com.tencent.mm.R.id.s8e);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.RadioButton radioButton3 = (android.widget.RadioButton) findViewById3;
        radioButton.setText(radioGroup.getContext().getString(i17));
        radioButton.setContentDescription(radioButton.getText());
        radioButton2.setText(radioGroup.getContext().getString(i18));
        radioButton2.setContentDescription(radioButton2.getText());
        radioButton3.setText(radioGroup.getContext().getString(i19));
        radioButton3.setContentDescription(radioButton3.getText());
    }

    public final void c(android.view.View referenceView, int i17) {
        kotlin.jvm.internal.o.g(referenceView, "referenceView");
        int[] iArr = new int[2];
        referenceView.getLocationOnScreen(iArr);
        jz5.l lVar = new jz5.l(java.lang.Integer.valueOf(iArr[0]), java.lang.Integer.valueOf(iArr[1]));
        int intValue = ((java.lang.Number) lVar.f302833d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f302834e).intValue();
        setOnTouchListener(new wx0.d1(this, intValue, referenceView, intValue2));
        getRadioGroup().measure(0, 0);
        int height = (intValue2 + (referenceView.getHeight() / 2)) - (getRadioGroup().getMeasuredHeight() / 2);
        android.view.View radioGroup = getRadioGroup();
        android.view.ViewGroup.LayoutParams layoutParams = getRadioGroup().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 53;
        layoutParams2.topMargin = height;
        layoutParams2.rightMargin = i17;
        radioGroup.setLayoutParams(layoutParams2);
        setVisibility(0);
    }

    public final void setCheckedBtn(int i17) {
        android.view.View radioGroup = getRadioGroup();
        android.widget.RadioGroup radioGroup2 = radioGroup instanceof android.widget.RadioGroup ? (android.widget.RadioGroup) radioGroup : null;
        if (radioGroup2 != null) {
            radioGroup2.check(i17);
        }
    }

    public final void setOnCheckedChangeListener(android.widget.RadioGroup.OnCheckedChangeListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        android.view.View radioGroup = getRadioGroup();
        android.widget.RadioGroup radioGroup2 = radioGroup instanceof android.widget.RadioGroup ? (android.widget.RadioGroup) radioGroup : null;
        if (radioGroup2 != null) {
            radioGroup2.setOnCheckedChangeListener(listener);
        }
    }

    public /* synthetic */ SelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.radioGroup = jz5.h.b(new wx0.c1(context));
        addView(getRadioGroup());
        setVisibility(4);
    }
}
