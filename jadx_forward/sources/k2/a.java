package k2;

/* loaded from: classes14.dex */
public final class a extends android.text.style.CharacterStyle implements android.text.style.UpdateAppearance {

    /* renamed from: d, reason: collision with root package name */
    public final e1.y0 f384997d;

    /* renamed from: e, reason: collision with root package name */
    public d1.k f384998e;

    public a(e1.y0 shaderBrush) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shaderBrush, "shaderBrush");
        this.f384997d = shaderBrush;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        d1.k kVar;
        if (textPaint == null || (kVar = this.f384998e) == null) {
            return;
        }
        textPaint.setShader(this.f384997d.b(kVar.f307177a));
    }
}
