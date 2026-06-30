package io1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f374985a;

    /* renamed from: b, reason: collision with root package name */
    public final io1.b f374986b;

    /* renamed from: c, reason: collision with root package name */
    public final po1.d f374987c;

    /* renamed from: d, reason: collision with root package name */
    public float f374988d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f374989e;

    /* renamed from: f, reason: collision with root package name */
    public final int f374990f;

    public a(long j17, io1.b deleteType, po1.d deviceInfo, float f17, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleteType, "deleteType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
        this.f374985a = j17;
        this.f374986b = deleteType;
        this.f374987c = deviceInfo;
        this.f374988d = f17;
        this.f374989e = z17;
        this.f374990f = i17;
    }

    /* renamed from: equals */
    public boolean m139654xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io1.a)) {
            return false;
        }
        io1.a aVar = (io1.a) obj;
        return this.f374985a == aVar.f374985a && this.f374986b == aVar.f374986b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f374987c, aVar.f374987c) && java.lang.Float.compare(this.f374988d, aVar.f374988d) == 0 && this.f374989e == aVar.f374989e && this.f374990f == aVar.f374990f;
    }

    /* renamed from: hashCode */
    public int m139655x8cdac1b() {
        return (((((((((java.lang.Long.hashCode(this.f374985a) * 31) + this.f374986b.hashCode()) * 31) + this.f374987c.m158783x8cdac1b()) * 31) + java.lang.Float.hashCode(this.f374988d)) * 31) + java.lang.Boolean.hashCode(this.f374989e)) * 31) + java.lang.Integer.hashCode(this.f374990f);
    }

    /* renamed from: toString */
    public java.lang.String m139656x9616526c() {
        return "DeleteParams(pkgId=" + this.f374985a + ", deleteType=" + this.f374986b + ", deviceInfo=" + this.f374987c + ", progress=" + this.f374988d + ", isDone=" + this.f374989e + ", errorCode=" + this.f374990f + ')';
    }
}
