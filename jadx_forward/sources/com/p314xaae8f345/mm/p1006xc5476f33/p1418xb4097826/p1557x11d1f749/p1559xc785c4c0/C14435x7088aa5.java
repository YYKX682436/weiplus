package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/DoubleLayerView;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "e", "Ljz5/g;", "getDefaultMatrix", "()Landroid/graphics/Matrix;", "defaultMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.topstory.DoubleLayerView */
/* loaded from: classes2.dex */
public final class C14435x7088aa5 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f202410d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultMatrix;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f202412f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f202413g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f202414h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Matrix f202415i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14435x7088aa5(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributeSet, "attributeSet");
        this.f202410d = "DoubleLayerView";
        this.defaultMatrix = jz5.h.b(vn2.a.f519768d);
    }

    /* renamed from: getDefaultMatrix */
    private final android.graphics.Matrix m58215xec22a1ac() {
        return (android.graphics.Matrix) ((jz5.n) this.defaultMatrix).mo141623x754a37bb();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.f202412f;
        if (bitmap != null) {
            android.graphics.Matrix matrix = this.f202413g;
            if (matrix == null) {
                matrix = m58215xec22a1ac();
            }
            canvas.drawBitmap(bitmap, matrix, null);
        }
        android.graphics.Bitmap bitmap2 = this.f202414h;
        if (bitmap2 != null) {
            android.graphics.Matrix matrix2 = this.f202415i;
            if (matrix2 == null) {
                matrix2 = m58215xec22a1ac();
            }
            canvas.drawBitmap(bitmap2, matrix2, null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }
}
