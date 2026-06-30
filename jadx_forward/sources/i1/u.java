package i1;

/* loaded from: classes14.dex */
public final class u extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368579c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368580d;

    public u(float f17, float f18) {
        super(false, false, 3, null);
        this.f368579c = f17;
        this.f368580d = f18;
    }

    /* renamed from: equals */
    public boolean m134511xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.u)) {
            return false;
        }
        i1.u uVar = (i1.u) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368579c), java.lang.Float.valueOf(uVar.f368579c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368580d), java.lang.Float.valueOf(uVar.f368580d));
    }

    /* renamed from: hashCode */
    public int m134512x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368579c) * 31) + java.lang.Float.hashCode(this.f368580d);
    }

    /* renamed from: toString */
    public java.lang.String m134513x9616526c() {
        return "RelativeMoveTo(dx=" + this.f368579c + ", dy=" + this.f368580d + ')';
    }
}
