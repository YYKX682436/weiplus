package i1;

/* loaded from: classes14.dex */
public final class m extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368504c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368505d;

    public m(float f17, float f18) {
        super(false, false, 3, null);
        this.f368504c = f17;
        this.f368505d = f18;
    }

    /* renamed from: equals */
    public boolean m134469xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.m)) {
            return false;
        }
        i1.m mVar = (i1.m) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368504c), java.lang.Float.valueOf(mVar.f368504c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368505d), java.lang.Float.valueOf(mVar.f368505d));
    }

    /* renamed from: hashCode */
    public int m134470x8cdac1b() {
        return (java.lang.Float.hashCode(this.f368504c) * 31) + java.lang.Float.hashCode(this.f368505d);
    }

    /* renamed from: toString */
    public java.lang.String m134471x9616526c() {
        return "MoveTo(x=" + this.f368504c + ", y=" + this.f368505d + ')';
    }
}
