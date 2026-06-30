package vf3;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f517904a;

    public c(java.lang.String errorText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorText, "errorText");
        this.f517904a = errorText;
    }

    /* renamed from: equals */
    public boolean m171837xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vf3.c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517904a, ((vf3.c) obj).f517904a);
    }

    /* renamed from: hashCode */
    public int m171838x8cdac1b() {
        return this.f517904a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171839x9616526c() {
        return "LiveErrorInfo(errorText=" + this.f517904a + ')';
    }
}
