package g4;

/* loaded from: classes5.dex */
public final class y3 extends g4.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Throwable f350175a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(java.lang.Throwable throwable) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(throwable, "throwable");
        this.f350175a = throwable;
    }

    /* renamed from: equals */
    public boolean m130866xb2c87fbf(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof g4.y3) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350175a, ((g4.y3) obj).f350175a);
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m130867x8cdac1b() {
        java.lang.Throwable th6 = this.f350175a;
        if (th6 != null) {
            return th6.hashCode();
        }
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m130868x9616526c() {
        return "Error(throwable=" + this.f350175a + ")";
    }
}
