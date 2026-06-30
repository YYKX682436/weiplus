package com.p314xaae8f345.mm.p2776x373aa5.p2780x317b13;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/view/item/FloatLayerItem;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.item.FloatLayerItem */
/* loaded from: classes4.dex */
public final class C22826xe8196528 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f295136d;

    public C22826xe8196528(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f295136d = new java.util.ArrayList();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        android.graphics.Paint paint = new android.graphics.Paint();
        float f17 = width;
        float f18 = height;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f17, f18, null, 31);
        paint.setColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
        canvas.drawRect(0.0f, 0.0f, f17, f18, paint);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        for (android.graphics.RectF rectF : this.f295136d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatLayerItem", "onDraw, " + height + ", " + width + ", " + rectF.left + ", " + rectF.right + ',' + rectF.bottom + ", " + rectF.top);
            canvas.drawRect(rectF, paint);
        }
        paint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    public C22826xe8196528(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f295136d = new java.util.ArrayList();
    }
}
