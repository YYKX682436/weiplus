package g16;

/* loaded from: classes15.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g16.t0 f349199b = new g16.t0(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f349200a;

    public u0(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f349200a = str;
    }

    /* renamed from: equals */
    public boolean m130659xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g16.u0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349200a, ((g16.u0) obj).f349200a);
    }

    /* renamed from: hashCode */
    public int m130660x8cdac1b() {
        return this.f349200a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m130661x9616526c() {
        return "MemberSignature(signature=" + this.f349200a + ')';
    }
}
