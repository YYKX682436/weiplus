package q04;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f440935a;

    /* renamed from: b, reason: collision with root package name */
    public final int f440936b;

    /* renamed from: c, reason: collision with root package name */
    public final o04.p f440937c;

    public t(java.lang.String id6, int i17, o04.p listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f440935a = id6;
        this.f440936b = i17;
        this.f440937c = listener;
    }

    /* renamed from: equals */
    public boolean m159242xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q04.t)) {
            return false;
        }
        q04.t tVar = (q04.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440935a, tVar.f440935a) && this.f440936b == tVar.f440936b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f440937c, tVar.f440937c);
    }

    /* renamed from: hashCode */
    public int m159243x8cdac1b() {
        return (((this.f440935a.hashCode() * 31) + java.lang.Integer.hashCode(this.f440936b)) * 31) + this.f440937c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m159244x9616526c() {
        return "RecoveryData(id=" + this.f440935a + ", type=" + this.f440936b + ", listener=" + this.f440937c + ')';
    }
}
