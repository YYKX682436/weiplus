package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/tencent/kinda/framework/widget/base/KindaDashLineBoarderLineView;", "Lcom/tencent/kinda/framework/widget/base/MMKViewLayout;", "Lcom/facebook/yoga/android/YogaLayout;", "Lcom/tencent/kinda/gen/KDashLineBoarderLineView;", "Ljz5/f0;", "updateBackgroundDrawable", "Landroid/content/Context;", "context", "createView", "", "value", "setDashWidth", "getDashWidth", "Lcom/tencent/kinda/gen/DynamicColor;", "setDashColor", "getDashColor", "dashWidth", "F", "dashColor", "Lcom/tencent/kinda/gen/DynamicColor;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.widget.base.KindaDashLineBoarderLineView */
/* loaded from: classes9.dex */
public final class C3300x8290ea79 extends com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a<com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda> implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3447x5cb1cf9b {
    private com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 dashColor;
    private float dashWidth;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: updateBackgroundDrawable */
    private final void m26437x4442e095() {
        float f17 = this.dashWidth;
        if ((f17 == 0.0f) || this.dashColor == null) {
            return;
        }
        float a17 = i65.a.a(this.f13206xd6cfe882, f17);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setCornerRadius(i65.a.b(this.f13206xd6cfe882, 4));
        gradientDrawable.setStroke(i65.a.h(this.f13206xd6cfe882, com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh), (int) com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3364xed8549e5.m27189xf794c2a7(this.dashColor), a17, a17);
        ((com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) mo27110xfb86a31b()).setBackground(gradientDrawable);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3447x5cb1cf9b
    public com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 getDashColor() {
        return this.dashColor;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3447x5cb1cf9b
    public float getDashWidth() {
        return this.dashWidth;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3447x5cb1cf9b
    /* renamed from: setDashColor */
    public void mo26440x1b976caf(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
        this.dashColor = c3392x2ae78284;
        m26437x4442e095();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3447x5cb1cf9b
    /* renamed from: setDashWidth */
    public void mo26441x1cae6b12(float f17) {
        this.dashWidth = f17;
        m26437x4442e095();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3355xa7b1bf3a, com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3352x70ee8bf0
    /* renamed from: createView */
    public com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda mo26107x519d71c1(android.content.Context context) {
        com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda c1589x9549ddda = (com.p166x1da19ac6.p169x38ae70.p170xcca8366f.C1589x9549ddda) super.mo26107x519d71c1(context);
        m26437x4442e095();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c1589x9549ddda);
        return c1589x9549ddda;
    }
}
