package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/TaskBarBottomView;", "Landroid/view/View;", "", "topRadius", "Ljz5/f0;", "setTopRoundRadius", "color", "setDrawColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.taskbar.ui.TaskBarBottomView */
/* loaded from: classes3.dex */
public final class C18554x7dbdf23e extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f254022d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f254023e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f254024f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f254025g;

    /* renamed from: h, reason: collision with root package name */
    public float f254026h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f254027i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f254028m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18554x7dbdf23e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f254023e = new android.graphics.Paint();
        this.f254024f = new android.graphics.Path();
        this.f254025g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f254027i = new android.graphics.RectF();
        this.f254028m = new android.graphics.RectF();
        this.f254022d = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560176cz);
        a(8);
    }

    public final void a(int i17) {
        float b17 = i65.a.b(getContext(), i17);
        this.f254026h = b17;
        float[] fArr = this.f254025g;
        fArr[0] = b17;
        fArr[1] = b17;
        fArr[2] = b17;
        fArr[3] = b17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Mp.AppBrandDesktopBottomView", "computeRadius radius: %f", java.lang.Float.valueOf(b17));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int i17 = this.f254022d;
        android.graphics.Paint paint = this.f254023e;
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        if (fp.h.b(20)) {
            this.f254024f.addRoundRect(getLeft(), getTop(), getRight(), getBottom(), this.f254025g, android.graphics.Path.Direction.CCW);
            android.graphics.Path path = this.f254024f;
            canvas.drawPath(path, paint);
            path.reset();
            return;
        }
        float f17 = 2;
        this.f254027i.set(getLeft(), getTop(), getLeft() + (this.f254026h * f17), getTop() + (this.f254026h * f17));
        this.f254028m.set(getRight() - (this.f254026h * f17), getTop(), getRight(), getTop() + (this.f254026h * f17));
        canvas.drawArc(this.f254027i, 180.0f, 90.0f, true, this.f254023e);
        canvas.drawArc(this.f254028m, 270.0f, 90.0f, true, this.f254023e);
        float left = getLeft() + this.f254026h;
        float top = getTop();
        float right = getRight();
        float f18 = this.f254026h;
        canvas.drawRect(left, top, right - f18, f18, this.f254023e);
        canvas.drawRect(getLeft(), getTop() + this.f254026h, getRight(), getBottom(), this.f254023e);
    }

    /* renamed from: setDrawColor */
    public final void m71586x62f3ee3d(int i17) {
        this.f254022d = i17;
        invalidate();
    }

    /* renamed from: setTopRoundRadius */
    public final void m71587x16198c2d(int i17) {
        a(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18554x7dbdf23e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f254023e = new android.graphics.Paint();
        this.f254024f = new android.graphics.Path();
        this.f254025g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f254027i = new android.graphics.RectF();
        this.f254028m = new android.graphics.RectF();
        this.f254022d = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560176cz);
        a(8);
    }
}
