package i1;

/* loaded from: classes14.dex */
public final class w extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368590c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368591d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368592e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368593f;

    public w(float f17, float f18, float f19, float f27) {
        super(true, false, 2, null);
        this.f368590c = f17;
        this.f368591d = f18;
        this.f368592e = f19;
        this.f368593f = f27;
    }

    /* renamed from: equals */
    public boolean m134519xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.w)) {
            return false;
        }
        i1.w wVar = (i1.w) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368590c), java.lang.Float.valueOf(wVar.f368590c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368591d), java.lang.Float.valueOf(wVar.f368591d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368592e), java.lang.Float.valueOf(wVar.f368592e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368593f), java.lang.Float.valueOf(wVar.f368593f));
    }

    /* renamed from: hashCode */
    public int m134520x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f368590c) * 31) + java.lang.Float.hashCode(this.f368591d)) * 31) + java.lang.Float.hashCode(this.f368592e)) * 31) + java.lang.Float.hashCode(this.f368593f);
    }

    /* renamed from: toString */
    public java.lang.String m134521x9616526c() {
        return "RelativeReflectiveCurveTo(dx1=" + this.f368590c + ", dy1=" + this.f368591d + ", dx2=" + this.f368592e + ", dy2=" + this.f368593f + ')';
    }
}
