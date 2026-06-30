package d2;

/* loaded from: classes14.dex */
public final class j extends android.text.style.CharacterStyle {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f307310a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f307311b;

    public j(boolean z17, boolean z18) {
        this.f307310a = z17;
        this.f307311b = z18;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPaint, "textPaint");
        textPaint.setUnderlineText(this.f307310a);
        textPaint.setStrikeThruText(this.f307311b);
    }
}
