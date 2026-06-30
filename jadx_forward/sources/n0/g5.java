package n0;

/* loaded from: classes3.dex */
public final class g5 implements n0.e5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f415052d;

    public g5(java.lang.Object obj) {
        this.f415052d = obj;
    }

    /* renamed from: equals */
    public boolean m148715xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0.g5) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f415052d, ((n0.g5) obj).f415052d);
        }
        return false;
    }

    @Override // n0.e5
    /* renamed from: getValue */
    public java.lang.Object mo128745x754a37bb() {
        return this.f415052d;
    }

    /* renamed from: hashCode */
    public int m148716x8cdac1b() {
        java.lang.Object obj = this.f415052d;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m148717x9616526c() {
        return "StaticValueHolder(value=" + this.f415052d + ')';
    }
}
