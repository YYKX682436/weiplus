package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/media/view/SampleHDImageView;", "Lcom/tencent/mm/ui/base/WxImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.SampleHDImageView */
/* loaded from: classes12.dex */
public final class C16496x621920fa extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16496x621920fa(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void A(float f17, float f18) {
        float translationX = getTranslationX();
        float translationY = getTranslationY();
        if (!(translationX == 0.0f)) {
            setTranslationX(getTranslationX() + f17);
            if (!(java.lang.Math.signum(getTranslationX()) == java.lang.Math.signum(translationX))) {
                if (!(getTranslationX() == 0.0f)) {
                    setTranslationX(0.0f);
                    f17 += translationX;
                }
            }
            f17 = 0.0f;
        }
        if (!(translationY == 0.0f)) {
            setTranslationY(getTranslationY() + f18);
            if (!(java.lang.Math.signum(getTranslationY()) == java.lang.Math.signum(translationY))) {
                if (!(getTranslationY() == 0.0f)) {
                    setTranslationY(0.0f);
                    f18 += translationY;
                }
            }
            f18 = 0.0f;
        }
        jz5.l B = B(f17, f18);
        setTranslationX(getTranslationX() + ((java.lang.Number) B.f384366d).floatValue());
        setTranslationY(getTranslationY() + ((java.lang.Number) B.f384367e).floatValue());
    }

    public final jz5.l B(float f17, float f18) {
        android.graphics.PointF mo45728xfdb07fbf;
        android.graphics.PointF mo45729x3ffd66 = mo45729x3ffd66();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (mo45729x3ffd66 != null && (mo45728xfdb07fbf = mo45728xfdb07fbf()) != null) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            matrix.reset();
            matrix.setScale(mo45728xfdb07fbf.x, mo45728xfdb07fbf.y);
            matrix.postTranslate(mo45729x3ffd66.x, mo45729x3ffd66.y);
            matrix.postTranslate(f17, f18);
            matrix.getValues(new float[9]);
            mo45742x548ba9bf(matrix);
            android.graphics.PointF mo45729x3ffd662 = mo45729x3ffd66();
            float f19 = mo45729x3ffd662.x;
            float f27 = mo45729x3ffd662.y;
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
            if (c1451x2b77465d != null) {
                c1451x2b77465d.m15649x30ea3841(true);
            }
            com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d2 = this.f149750f;
            if (c1451x2b77465d2 != null) {
                c1451x2b77465d2.m15694x147aac0b(false);
                this.f149750f.invalidate();
            }
            android.graphics.PointF mo45729x3ffd663 = mo45729x3ffd66();
            return new jz5.l(java.lang.Float.valueOf(f19 - mo45729x3ffd663.x), java.lang.Float.valueOf(f27 - mo45729x3ffd663.y));
        }
        return new jz5.l(valueOf, valueOf);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21537x5f41189f, db5.f0
    public void i() {
        super.i();
        setTranslationX(0.0f);
        setTranslationY(0.0f);
    }

    public final void z(float f17, float f18, float f19) {
        android.graphics.PointF mo45729x3ffd66;
        android.graphics.PointF mo45728xfdb07fbf;
        if (getVisibility() != 0 || (mo45729x3ffd66 = mo45729x3ffd66()) == null || (mo45728xfdb07fbf = mo45728xfdb07fbf()) == null) {
            return;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        matrix.setScale(mo45728xfdb07fbf.x, mo45728xfdb07fbf.y);
        matrix.postTranslate(mo45729x3ffd66.x, mo45729x3ffd66.y);
        matrix.postScale(f17, f17, f18, f19);
        matrix.getValues(new float[9]);
        mo45742x548ba9bf(matrix);
        com.p151x9ab4726f.p152x329086.p153x9590d8af.p158x373aa5.C1451x2b77465d c1451x2b77465d = this.f149750f;
        if (c1451x2b77465d != null) {
            c1451x2b77465d.m15694x147aac0b(false);
            this.f149750f.invalidate();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16496x621920fa(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20025xc6e1c289()) == 1) {
            this.f149750f.m15705x52dc5711(true);
        }
    }
}
