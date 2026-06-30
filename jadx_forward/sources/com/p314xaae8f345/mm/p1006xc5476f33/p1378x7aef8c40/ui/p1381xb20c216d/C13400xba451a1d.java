package com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorOutsideView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emojicapture.ui.editor.EditorOutsideView */
/* loaded from: classes4.dex */
public final class C13400xba451a1d extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Path f180270d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f180271e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f180272f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13400xba451a1d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180270d = new android.graphics.Path();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f180271e = paint;
        this.f180272f = new android.graphics.Path();
        paint.setAntiAlias(true);
        paint.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744));
        paint.setAlpha(127);
    }

    public final void a(android.graphics.RectF bounds, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        android.graphics.Path path = this.f180270d;
        path.reset();
        path.addRoundRect(new android.graphics.RectF(bounds.left, bounds.top, bounds.right, bounds.bottom), f17, f17, android.graphics.Path.Direction.CW);
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Path path = this.f180272f;
        path.reset();
        path.addPath(this.f180270d);
        path.addRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), android.graphics.Path.Direction.CCW);
        canvas.drawPath(path, this.f180271e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13400xba451a1d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
