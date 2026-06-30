package r85;

/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f474868a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.CharSequence f474869b;

    /* renamed from: c, reason: collision with root package name */
    public float f474870c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.ColorStateList f474871d;

    /* renamed from: e, reason: collision with root package name */
    public int f474872e;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f474868a = context;
        this.f474869b = "";
    }

    public final android.text.SpannableString a() {
        if (this.f474869b.length() == 0) {
            throw new java.lang.IllegalStateException("Text must be set before building");
        }
        if (this.f474870c == 0.0f) {
            throw new java.lang.IllegalStateException("Text size must be set before building");
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(this.f474869b);
        android.content.res.ColorStateList colorStateList = this.f474871d;
        if (colorStateList == null) {
            throw new java.lang.IllegalStateException("Color must be set before building");
        }
        spannableString.setSpan(new android.text.style.TextAppearanceSpan(null, this.f474872e, (int) this.f474870c, colorStateList, colorStateList), 0, spannableString.length(), 33);
        spannableString.setSpan(new r85.a((int) this.f474870c), 0, spannableString.length(), 33);
        return spannableString;
    }

    public final r85.c b(int i17) {
        this.f474870c = this.f474868a.getResources().getDimension(i17);
        return this;
    }
}
