package h2;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final h2.e f359790a;

    public b(h2.e platformLocale) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(platformLocale, "platformLocale");
        this.f359790a = platformLocale;
    }

    public final java.lang.String a() {
        java.lang.String languageTag = ((h2.a) this.f359790a).f359789a.toLanguageTag();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    /* renamed from: equals */
    public boolean m132775xb2c87fbf(java.lang.Object obj) {
        if (obj == null || !(obj instanceof h2.b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a(), ((h2.b) obj).a());
    }

    /* renamed from: hashCode */
    public int m132776x8cdac1b() {
        return a().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m132777x9616526c() {
        return a();
    }
}
