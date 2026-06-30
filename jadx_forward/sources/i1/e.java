package i1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368412a;

    /* renamed from: b, reason: collision with root package name */
    public final float f368413b;

    /* renamed from: c, reason: collision with root package name */
    public final float f368414c;

    /* renamed from: d, reason: collision with root package name */
    public final float f368415d;

    /* renamed from: e, reason: collision with root package name */
    public final float f368416e;

    /* renamed from: f, reason: collision with root package name */
    public final i1.o1 f368417f;

    /* renamed from: g, reason: collision with root package name */
    public final long f368418g;

    /* renamed from: h, reason: collision with root package name */
    public final int f368419h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f368420i;

    public e(java.lang.String str, float f17, float f18, float f19, float f27, i1.o1 o1Var, long j17, int i17, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f368412a = str;
        this.f368413b = f17;
        this.f368414c = f18;
        this.f368415d = f19;
        this.f368416e = f27;
        this.f368417f = o1Var;
        this.f368418g = j17;
        this.f368419h = i17;
        this.f368420i = z17;
    }

    /* renamed from: equals */
    public boolean m134434xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1.e)) {
            return false;
        }
        i1.e eVar = (i1.e) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368412a, eVar.f368412a) || !p2.h.a(this.f368413b, eVar.f368413b) || !p2.h.a(this.f368414c, eVar.f368414c)) {
            return false;
        }
        if (!(this.f368415d == eVar.f368415d)) {
            return false;
        }
        if ((this.f368416e == eVar.f368416e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f368417f, eVar.f368417f) && e1.y.c(this.f368418g, eVar.f368418g)) {
            return (this.f368419h == eVar.f368419h) && this.f368420i == eVar.f368420i;
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m134435x8cdac1b() {
        int hashCode = ((((((((((this.f368412a.hashCode() * 31) + java.lang.Float.hashCode(this.f368413b)) * 31) + java.lang.Float.hashCode(this.f368414c)) * 31) + java.lang.Float.hashCode(this.f368415d)) * 31) + java.lang.Float.hashCode(this.f368416e)) * 31) + this.f368417f.m134484x8cdac1b()) * 31;
        int i17 = e1.y.f327854l;
        return ((((hashCode + java.lang.Long.hashCode(this.f368418g)) * 31) + java.lang.Integer.hashCode(this.f368419h)) * 31) + java.lang.Boolean.hashCode(this.f368420i);
    }
}
