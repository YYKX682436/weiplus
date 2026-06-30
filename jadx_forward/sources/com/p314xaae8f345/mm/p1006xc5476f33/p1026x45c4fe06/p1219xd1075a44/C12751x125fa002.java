package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.AppBrandGlobalNativeWidgetContainerView */
/* loaded from: classes7.dex */
public class C12751x125fa002 extends android.widget.AbsoluteLayout implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma, pq5.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.AbsoluteLayout f172505d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f172506e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.i f172507f;

    public C12751x125fa002(android.content.Context context) {
        super(context);
        this.f172506e = new java.util.LinkedList();
        this.f172507f = null;
        this.f172505d = this;
    }

    @Override // pq5.a
    public boolean c0(android.graphics.Canvas canvas) {
        draw(canvas);
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ma
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        android.widget.AbsoluteLayout absoluteLayout = this.f172505d;
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
        java.util.Iterator it = this.f172506e.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga gaVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ga) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd) it.next());
            float f17 = i17;
            gaVar.f168177d = f17;
            gaVar.f168174a.setX(gaVar.f168175b + f17);
            gaVar.f168174a.setY(gaVar.f168176c + i18);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.i iVar = this.f172507f;
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.d0) iVar;
            d0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            d0Var.f172695a.j(canvas, view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.o.f172743e);
        }
        return super.drawChild(canvas, view, j17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        this.f172506e.remove(rdVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.sd
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.rd rdVar) {
        if (rdVar == null) {
            return;
        }
        java.util.List list = this.f172506e;
        if (list.contains(rdVar)) {
            return;
        }
        list.add(rdVar);
    }

    /* renamed from: setCapsuleBarBackgroundRenderer */
    public void m53309xbffdbad9(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.i iVar) {
        if (this.f172507f == iVar) {
            return;
        }
        this.f172507f = iVar;
        invalidate();
    }

    public C12751x125fa002(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172506e = new java.util.LinkedList();
        this.f172507f = null;
        this.f172505d = this;
    }

    public C12751x125fa002(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172506e = new java.util.LinkedList();
        this.f172507f = null;
        this.f172505d = this;
    }
}
