package b2;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f17279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f17280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f17281f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        super(0);
        this.f17279d = i17;
        this.f17280e = charSequence;
        this.f17281f = textPaint;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.text.TextDirectionHeuristic a17 = b2.u.a(this.f17279d);
        java.lang.CharSequence text = this.f17280e;
        kotlin.jvm.internal.o.g(text, "text");
        if (a17.isRtl(text, 0, text.length())) {
            return null;
        }
        return android.text.BoringLayout.isBoring(text, this.f17281f, null);
    }
}
