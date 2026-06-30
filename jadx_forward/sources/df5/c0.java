package df5;

/* loaded from: classes11.dex */
public final class c0 extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final int f313590d;

    /* renamed from: e, reason: collision with root package name */
    public final int f313591e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f313592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.content.Context context, v11.e0 renderConfig) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderConfig, "renderConfig");
        v11.y yVar = renderConfig.f513906l;
        int i17 = yVar.f514021a;
        this.f313590d = i17;
        int i18 = yVar.f514023c;
        this.f313591e = i18;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setColor(yVar.f514022b);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f313592f = paint;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (i18 * 2) + i17));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float f17 = this.f313591e;
        canvas.drawRect(0.0f, f17, getWidth(), f17 + this.f313590d, this.f313592f);
    }
}
