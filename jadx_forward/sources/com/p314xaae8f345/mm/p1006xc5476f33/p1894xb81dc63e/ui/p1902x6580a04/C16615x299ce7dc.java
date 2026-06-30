package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/MultiTaskCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "", "mode", "Ljz5/f0;", "setMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout */
/* loaded from: classes5.dex */
public final class C16615x299ce7dc extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a {
    public static int I = -1;
    public final android.graphics.Paint D;
    public final android.graphics.Paint E;
    public final android.graphics.RectF F;
    public final int G;
    public android.graphics.Bitmap H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16615x299ce7dc(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.D = paint;
        this.E = new android.graphics.Paint(1);
        this.F = new android.graphics.RectF();
        this.G = com.p314xaae8f345.mm.ui.zk.a(getContext(), 8);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (canvas.getWidth() <= 0 || canvas.getHeight() <= 0) {
            return;
        }
        int saveLayer = canvas.saveLayer(new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), null, 31);
        super.draw(canvas);
        if (this.H == null && I != -1) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ALPHA_8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/panel/MultiTaskCoordinatorLayout", "createCornerBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/multitask/ui/panel/MultiTaskCoordinatorLayout", "createCornerBitmap", "(II)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
            android.graphics.Path path = new android.graphics.Path();
            android.graphics.RectF rectF = this.F;
            float f17 = this.G;
            float f18 = width;
            rectF.set(0.0f, f17 * 2.0f, f18, height);
            path.addRect(rectF, android.graphics.Path.Direction.CCW);
            int i17 = I;
            if (i17 == 0) {
                android.graphics.Path path2 = new android.graphics.Path();
                float f19 = (width - r6) / 2.0f;
                rectF.set(f19, 0.0f, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.R + f19, 4.0f * f17);
                path2.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CCW);
                path.op(path2, android.graphics.Path.Op.UNION);
            } else if (i17 == 1) {
                float f27 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.P + 0.0f;
                android.graphics.Path path3 = new android.graphics.Path();
                float f28 = f18 - (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.f232123J + 0.0f);
                float f29 = 4.0f * f17;
                rectF.set(f28 - f27, 0.0f, f28, f29);
                path3.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CCW);
                path.op(path3, android.graphics.Path.Op.UNION);
                float f37 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.f232123J + 0.0f;
                rectF.set(f37, 0.0f, f27 + f37, f29);
                android.graphics.Path path4 = new android.graphics.Path();
                path4.addRoundRect(rectF, f17, f17, android.graphics.Path.Direction.CW);
                path.op(path4, android.graphics.Path.Op.UNION);
            }
            path.setFillType(android.graphics.Path.FillType.WINDING);
            canvas2.drawPath(path, this.E);
            this.H = createBitmap;
        }
        android.graphics.Bitmap bitmap = this.H;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.D);
        }
        canvas.restoreToCount(saveLayer);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.H = null;
    }

    /* renamed from: setMode */
    public void m67204x764d6925(int i17) {
        if (I == i17) {
            return;
        }
        I = i17;
        if (this.H != null) {
            this.H = null;
        }
        postInvalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16615x299ce7dc(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.D = paint;
        this.E = new android.graphics.Paint(1);
        this.F = new android.graphics.RectF();
        this.G = com.p314xaae8f345.mm.ui.zk.a(getContext(), 8);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }
}
