package hy0;

/* loaded from: classes5.dex */
public final class f2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy0.p2 f367348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(hy0.p2 p2Var) {
        super(0);
        this.f367348d = p2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.text.TextPaint textPaint = new android.text.TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(((java.lang.Number) ((jz5.n) this.f367348d.f367475t).mo141623x754a37bb()).intValue());
        textPaint.setTextSize((int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 8));
        textPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
        return textPaint;
    }
}
