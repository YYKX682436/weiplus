package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapViewWrapper;", "Landroid/widget/FrameLayout;", "Lrk3/a;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setBitmap", "", "isFullScreen", "setFullScreen", "Landroid/view/View;", "getView", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "d", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "getSnapView", "()Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "setSnapView", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;)V", "snapView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapViewWrapper */
/* loaded from: classes4.dex */
public class C16605x56723de6 extends android.widget.FrameLayout implements rk3.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed snapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16605x56723de6(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed(getContext());
        this.snapView = c16604x2ae249ed;
        addView(c16604x2ae249ed);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed2 = this.snapView;
        if (c16604x2ae249ed2 == null) {
            return;
        }
        c16604x2ae249ed2.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed getSnapView() {
        return this.snapView;
    }

    @Override // rk3.a
    /* renamed from: getView */
    public android.view.View mo67169xfb86a31b() {
        return this;
    }

    @Override // rk3.a
    /* renamed from: setBitmap */
    public void mo67170x5854831(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(1.0f, 1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed = this.snapView;
        if (c16604x2ae249ed != null) {
            c16604x2ae249ed.setImageMatrix(matrix);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed2 = this.snapView;
        if (c16604x2ae249ed2 != null) {
            c16604x2ae249ed2.setImageBitmap(bitmap);
        }
    }

    /* renamed from: setFullScreen */
    public final void m67171xec596ddd(boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed = this.snapView;
        android.view.ViewGroup.LayoutParams layoutParams = c16604x2ae249ed != null ? c16604x2ae249ed.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = com.p314xaae8f345.mm.ui.bl.i(getContext(), -1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed2 = this.snapView;
        if (c16604x2ae249ed2 == null) {
            return;
        }
        c16604x2ae249ed2.setLayoutParams(layoutParams2);
    }

    /* renamed from: setSnapView */
    public final void m67172x87804811(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16604x2ae249ed c16604x2ae249ed) {
        this.snapView = c16604x2ae249ed;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16605x56723de6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16605x56723de6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        a();
    }
}
