package ee1;

/* loaded from: classes4.dex */
public final class d extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f333109a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String reason) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        this.f333109a = reason;
    }

    /* renamed from: equals */
    public boolean m127510xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee1.d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f333109a, ((ee1.d) obj).f333109a);
    }

    /* renamed from: hashCode */
    public int m127511x8cdac1b() {
        return this.f333109a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m127512x9616526c() {
        return "Timeout(reason=" + this.f333109a + ')';
    }
}
