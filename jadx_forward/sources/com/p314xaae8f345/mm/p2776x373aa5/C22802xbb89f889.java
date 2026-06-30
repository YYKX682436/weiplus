package com.p314xaae8f345.mm.p2776x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u001d\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/view/RelativeLayoutEx;", "Landroid/widget/RelativeLayout;", "", "translationX", "Ljz5/f0;", "setTranslationX", "alpha", "setTransitionAlpha", "translationY", "setTranslationY", "translationZ", "setTranslationZ", "Lym5/z4;", "d", "Lym5/z4;", "getTranslationCallback", "()Lym5/z4;", "setTranslationCallback", "(Lym5/z4;)V", "translationCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.RelativeLayoutEx */
/* loaded from: classes8.dex */
public final class C22802xbb89f889 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ym5.z4 translationCallback;

    public C22802xbb89f889(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final ym5.z4 getTranslationCallback() {
        return this.translationCallback;
    }

    @Override // android.view.View
    public void setTransitionAlpha(float f17) {
        super.setTransitionAlpha(f17);
        ym5.z4 z4Var = this.translationCallback;
        if (z4Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h1) z4Var).a(this);
        }
    }

    /* renamed from: setTranslationCallback */
    public final void m82725xd93d254(ym5.z4 z4Var) {
        this.translationCallback = z4Var;
    }

    @Override // android.view.View
    public void setTranslationX(float f17) {
        super.setTranslationX(f17);
        ym5.z4 z4Var = this.translationCallback;
        if (z4Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h1) z4Var).a(this);
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        super.setTranslationY(f17);
        ym5.z4 z4Var = this.translationCallback;
        if (z4Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h1) z4Var).a(this);
        }
    }

    @Override // android.view.View
    public void setTranslationZ(float f17) {
        super.setTranslationZ(f17);
        ym5.z4 z4Var = this.translationCallback;
        if (z4Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h1) z4Var).a(this);
        }
    }

    public C22802xbb89f889(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
