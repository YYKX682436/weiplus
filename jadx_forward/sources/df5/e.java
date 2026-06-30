package df5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f313611a;

    /* renamed from: b, reason: collision with root package name */
    public final android.text.SpannableStringBuilder f313612b;

    /* renamed from: c, reason: collision with root package name */
    public final int f313613c;

    public e(android.widget.TextView tv6, android.text.SpannableStringBuilder newFullSSB, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFullSSB, "newFullSSB");
        this.f313611a = tv6;
        this.f313612b = newFullSSB;
        this.f313613c = i17;
    }

    /* renamed from: equals */
    public boolean m124314xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df5.e)) {
            return false;
        }
        df5.e eVar = (df5.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313611a, eVar.f313611a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f313612b, eVar.f313612b) && this.f313613c == eVar.f313613c;
    }

    /* renamed from: hashCode */
    public int m124315x8cdac1b() {
        return (((this.f313611a.hashCode() * 31) + this.f313612b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f313613c);
    }

    /* renamed from: toString */
    public java.lang.String m124316x9616526c() {
        return "FeederTask(tv=" + this.f313611a + ", newFullSSB=" + ((java.lang.Object) this.f313612b) + ", oldLen=" + this.f313613c + ')';
    }
}
