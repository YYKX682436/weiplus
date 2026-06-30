package cr5;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr5.f f303542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(cr5.f fVar) {
        super(0);
        this.f303542d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(this.f303542d.f303560b.getResources().getDisplayMetrics().density * 0.5f);
        return paint;
    }
}
