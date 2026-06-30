package yf5;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final yf5.x f543399a;

    /* renamed from: b, reason: collision with root package name */
    public final xm3.i f543400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f543401c;

    public f(yf5.x convItem, xm3.i submitType, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convItem, "convItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(submitType, "submitType");
        this.f543399a = convItem;
        this.f543400b = submitType;
        this.f543401c = i17;
    }

    /* renamed from: equals */
    public boolean m176989xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf5.f)) {
            return false;
        }
        yf5.f fVar = (yf5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f543399a, fVar.f543399a) && this.f543400b == fVar.f543400b && this.f543401c == fVar.f543401c;
    }

    /* renamed from: hashCode */
    public int m176990x8cdac1b() {
        return (((this.f543399a.mo148315x8cdac1b() * 31) + this.f543400b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f543401c);
    }

    /* renamed from: toString */
    public java.lang.String m176991x9616526c() {
        return "UpdateEvent(convItem=" + this.f543399a + ", submitType=" + this.f543400b + ", version=" + this.f543401c + ')';
    }
}
