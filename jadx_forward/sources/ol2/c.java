package ol2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f427678a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Integer f427679b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f427680c;

    /* renamed from: equals */
    public boolean m151633xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ol2.c.class, obj.getClass())) {
            return false;
        }
        ol2.c cVar = (ol2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427678a, cVar.f427678a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427679b, cVar.f427679b);
    }

    /* renamed from: hashCode */
    public int m151634x8cdac1b() {
        java.lang.String str = this.f427678a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.Integer num = this.f427679b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }
}
