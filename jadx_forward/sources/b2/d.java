package b2;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f98812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f98813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.TextPaint f98814f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i17, java.lang.CharSequence charSequence, android.text.TextPaint textPaint) {
        super(0);
        this.f98812d = i17;
        this.f98813e = charSequence;
        this.f98814f = textPaint;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.text.TextDirectionHeuristic a17 = b2.u.a(this.f98812d);
        java.lang.CharSequence text = this.f98813e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (a17.isRtl(text, 0, text.length())) {
            return null;
        }
        return android.text.BoringLayout.isBoring(text, this.f98814f, null);
    }
}
