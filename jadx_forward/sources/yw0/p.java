package yw0;

/* loaded from: classes5.dex */
public final class p extends yw0.s {

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f548112b;

    /* renamed from: c, reason: collision with root package name */
    public yw0.o f548113c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(android.content.Context context, yw0.r drawerAction) {
        super(drawerAction);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawerAction, "drawerAction");
        int color = j65.q.a(context).getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560962ad5, null);
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setColor(color);
        paint.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        paint.setStrokeWidth(j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 2.0f);
        this.f548112b = paint;
        this.f548113c = yw0.o.f548109d;
    }

    @Override // yw0.s
    public void a() {
    }

    @Override // yw0.s
    public void b(android.graphics.Canvas canvas, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        if (this.f548113c.ordinal() != 1) {
            return;
        }
        canvas.drawRect(0.0f, 0.0f, i17, i18, this.f548112b);
    }
}
