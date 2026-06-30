package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/widgets/MCReferenceLineView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.widgets.MCReferenceLineView */
/* loaded from: classes5.dex */
public final class C10996x891f422e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f151218d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10996x891f422e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.util.ArrayList arrayList = this.f151218d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yw0.s) it.next()).a();
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.util.Iterator it = this.f151218d.iterator();
        while (it.hasNext()) {
            ((yw0.s) it.next()).b(canvas, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        java.util.Iterator it = this.f151218d.iterator();
        while (it.hasNext()) {
            ((yw0.s) it.next()).c(z17, i17, i18, i19, i27);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        for (yw0.s sVar : this.f151218d) {
            getMeasuredWidth();
            getMeasuredHeight();
            sVar.getClass();
        }
    }

    public /* synthetic */ C10996x891f422e(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10996x891f422e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f151218d = new java.util.ArrayList();
    }
}
