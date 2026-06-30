package so2;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f491850a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f491851b;

    /* renamed from: c, reason: collision with root package name */
    public final int f491852c;

    /* renamed from: d, reason: collision with root package name */
    public final so2.f f491853d;

    public e(boolean z17, boolean z18, int i17, so2.f loadParams) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadParams, "loadParams");
        this.f491850a = z17;
        this.f491851b = z18;
        this.f491852c = i17;
        this.f491853d = loadParams;
    }

    /* renamed from: equals */
    public boolean m164862xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.e)) {
            return false;
        }
        so2.e eVar = (so2.e) obj;
        return this.f491850a == eVar.f491850a && this.f491851b == eVar.f491851b && this.f491852c == eVar.f491852c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f491853d, eVar.f491853d);
    }

    /* renamed from: hashCode */
    public int m164863x8cdac1b() {
        return (((((java.lang.Boolean.hashCode(this.f491850a) * 31) + java.lang.Boolean.hashCode(this.f491851b)) * 31) + java.lang.Integer.hashCode(this.f491852c)) * 31) + this.f491853d.m164871x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m164864x9616526c() {
        return "LoadLife(hitPreloadStart=" + this.f491850a + ", hitPreloadComplete=" + this.f491851b + ", loadFailReason=" + this.f491852c + ", loadParams=" + this.f491853d + ')';
    }
}
