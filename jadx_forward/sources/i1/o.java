package i1;

/* loaded from: classes14.dex */
public final class o extends i1.a0 {

    /* renamed from: c, reason: collision with root package name */
    public final float f368515c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368516d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368517e;

    /* renamed from: f, reason: collision with root package name */
    public final float f368518f;

    public o(float f17, float f18, float f19, float f27) {
        super(true, false, 2, null);
        this.f368515c = f17;
        this.f368516d = f18;
        this.f368517e = f19;
        this.f368518f = f27;
    }

    /* renamed from: equals */
    public boolean m134479xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.o)) {
            return false;
        }
        i1.o oVar = (i1.o) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368515c), java.lang.Float.valueOf(oVar.f368515c)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368516d), java.lang.Float.valueOf(oVar.f368516d)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368517e), java.lang.Float.valueOf(oVar.f368517e)) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Float.valueOf(this.f368518f), java.lang.Float.valueOf(oVar.f368518f));
    }

    /* renamed from: hashCode */
    public int m134480x8cdac1b() {
        return (((((java.lang.Float.hashCode(this.f368515c) * 31) + java.lang.Float.hashCode(this.f368516d)) * 31) + java.lang.Float.hashCode(this.f368517e)) * 31) + java.lang.Float.hashCode(this.f368518f);
    }

    /* renamed from: toString */
    public java.lang.String m134481x9616526c() {
        return "ReflectiveCurveTo(x1=" + this.f368515c + ", y1=" + this.f368516d + ", x2=" + this.f368517e + ", y2=" + this.f368518f + ')';
    }
}
