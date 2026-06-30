package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1512x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/view/PotholingImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "a", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "i", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.view.PotholingImageView */
/* loaded from: classes4.dex */
public final class C14244x5bb442ce extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f193244f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f193245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14244x5bb442ce(android.content.Context context, android.util.AttributeSet a17) {
        super(context, a17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f193244f = new java.util.ArrayList();
        this.f193245g = new android.graphics.Paint(1);
    }

    public final void n() {
        this.f193244f.clear();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        java.util.ArrayList arrayList = this.f193244f;
        if (arrayList.isEmpty()) {
            super.onDraw(canvas);
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        android.graphics.Paint paint = this.f193245g;
        int saveLayer = canvas.saveLayer(rectF, paint, 31);
        super.onDraw(canvas);
        paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            canvas.drawPath((android.graphics.Path) it.next(), paint);
        }
        paint.setXfermode(null);
        canvas.restoreToCount(saveLayer);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PotholingImageView", "measureTimeMillis: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " size: " + arrayList.size());
    }

    public final void r(float f17, java.util.ArrayList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        n();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            android.graphics.RectF rectF = (android.graphics.RectF) it.next();
            android.graphics.Path path = new android.graphics.Path();
            path.addRoundRect(rectF, new float[]{f17, f17, f17, f17, f17, f17, f17, f17}, android.graphics.Path.Direction.CW);
            this.f193244f.add(path);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14244x5bb442ce(android.content.Context context, android.util.AttributeSet a17, int i17) {
        super(context, a17, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a17, "a");
        this.f193244f = new java.util.ArrayList();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f193245g = paint;
        paint.setColor(android.graphics.Color.parseColor("#000000"));
    }
}
