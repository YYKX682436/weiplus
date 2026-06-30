package x52;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f533649a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f533650b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f533651c;

    public h(java.lang.String str, java.lang.String str2, java.util.List entryPageNames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entryPageNames, "entryPageNames");
        this.f533649a = str;
        this.f533650b = str2;
        this.f533651c = entryPageNames;
    }

    /* renamed from: equals */
    public boolean m175036xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x52.h)) {
            return false;
        }
        x52.h hVar = (x52.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533649a, hVar.f533649a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533650b, hVar.f533650b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533651c, hVar.f533651c);
    }

    /* renamed from: hashCode */
    public int m175037x8cdac1b() {
        java.lang.String str = this.f533649a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f533650b;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f533651c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175038x9616526c() {
        return "SessionKEntry(sessionId=" + this.f533649a + ", fromPageName=" + this.f533650b + ", entryPageNames=" + this.f533651c + ')';
    }
}
