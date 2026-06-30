package rc2;

/* loaded from: classes2.dex */
public final class b extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f475461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f475462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.graphics.Rect rect, android.view.View view, android.content.Context context) {
        super(context);
        this.f475462e = rect;
        this.f475463f = view;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(-65536);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setAntiAlias(true);
        this.f475461d = paint;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Rect rect = this.f475462e;
        int i17 = rect.left;
        android.view.View view = this.f475463f;
        canvas.drawRect(new android.graphics.Rect(i17 - ((android.view.ViewGroup) view).getLeft(), rect.top - ((android.view.ViewGroup) view).getTop(), rect.right - ((android.view.ViewGroup) view).getLeft(), rect.bottom - ((android.view.ViewGroup) view).getTop()), this.f475461d);
    }
}
