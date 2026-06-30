package com.tencent.mm.plugin.appbrand.widget;

/* loaded from: classes7.dex */
public class AppBrandGlobalNativeWidgetContainerView extends android.widget.AbsoluteLayout implements com.tencent.mm.plugin.appbrand.page.sd, com.tencent.mm.plugin.appbrand.page.ma, pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f90972d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f90973e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.i f90974f;

    public AppBrandGlobalNativeWidgetContainerView(android.content.Context context) {
        super(context);
        this.f90973e = new java.util.LinkedList();
        this.f90974f = null;
        this.f90972d = this;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.widget.AbsoluteLayout absoluteLayout = this.f90972d;
        if (absoluteLayout != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            android.view.ViewGroup.LayoutParams layoutParams = absoluteLayout.getLayoutParams();
            if (layoutParams == null) {
                absoluteLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(width, height));
            } else if (width != layoutParams.width || height != layoutParams.height) {
                layoutParams.width = width;
                layoutParams.height = height;
                absoluteLayout.setLayoutParams(layoutParams);
            }
            absoluteLayout.scrollTo(i17, i18);
        }
        java.util.Iterator it = this.f90973e.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.page.ga gaVar = (com.tencent.mm.plugin.appbrand.page.ga) ((com.tencent.mm.plugin.appbrand.page.rd) it.next());
            float f17 = i17;
            gaVar.f86644d = f17;
            gaVar.f86641a.setX(gaVar.f86642b + f17);
            gaVar.f86641a.setY(gaVar.f86643c + i18);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.tencent.mm.plugin.appbrand.widget.i iVar = this.f90974f;
        if (iVar != null) {
            com.tencent.mm.plugin.appbrand.widget.halfscreen.d0 d0Var = (com.tencent.mm.plugin.appbrand.widget.halfscreen.d0) iVar;
            d0Var.getClass();
            kotlin.jvm.internal.o.d(view);
            d0Var.f91162a.j(canvas, view, com.tencent.mm.plugin.appbrand.widget.halfscreen.o.f91210e);
        }
        return super.drawChild(canvas, view, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.sd
    public void e(com.tencent.mm.plugin.appbrand.page.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        this.f90973e.remove(rdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.sd
    public void k(com.tencent.mm.plugin.appbrand.page.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        java.util.List list = this.f90973e;
        if (list.contains(rdVar)) {
            return;
        }
        list.add(rdVar);
    }

    public void setCapsuleBarBackgroundRenderer(com.tencent.mm.plugin.appbrand.widget.i iVar) {
        if (this.f90974f == iVar) {
            return;
        }
        this.f90974f = iVar;
        invalidate();
    }

    public AppBrandGlobalNativeWidgetContainerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90973e = new java.util.LinkedList();
        this.f90974f = null;
        this.f90972d = this;
    }

    public AppBrandGlobalNativeWidgetContainerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f90973e = new java.util.LinkedList();
        this.f90974f = null;
        this.f90972d = this;
    }
}
