package df5;

/* loaded from: classes11.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.d1 f313588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(df5.d1 d1Var) {
        super(0);
        this.f313588d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setTypeface(android.graphics.Typeface.MONOSPACE);
        df5.d1 d1Var = this.f313588d;
        textPaint.setTextSize(android.util.TypedValue.applyDimension(1, d1Var.f313606b.f513897c.f513927a.f513949a, d1Var.f313605a.getResources().getDisplayMetrics()));
        return textPaint;
    }
}
