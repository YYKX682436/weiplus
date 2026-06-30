package mo1;

/* loaded from: classes10.dex */
public final class o extends mo1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f411846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String message) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f411846a = message;
    }

    /* renamed from: equals */
    public boolean m148154xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mo1.o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f411846a, ((mo1.o) obj).f411846a);
    }

    /* renamed from: hashCode */
    public int m148155x8cdac1b() {
        return this.f411846a.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148156x9616526c() {
        return "Error(message=" + this.f411846a + ')';
    }
}
