package se3;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488451a;

    public h(java.lang.String data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f488451a = data;
    }

    /* renamed from: equals */
    public boolean m164358xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f488451a, ((se3.h) obj).f488451a);
    }

    /* renamed from: hashCode */
    public int m164359x8cdac1b() {
        return this.f488451a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m164360x9616526c() {
        return "UpdateDataEvent(data=" + this.f488451a + ')';
    }
}
