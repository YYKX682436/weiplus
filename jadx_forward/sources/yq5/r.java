package yq5;

/* loaded from: classes11.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f546151a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.e f546152b;

    /* renamed from: c, reason: collision with root package name */
    public final int f546153c;

    /* renamed from: d, reason: collision with root package name */
    public final yq5.p f546154d;

    /* renamed from: e, reason: collision with root package name */
    public final int f546155e;

    /* renamed from: f, reason: collision with root package name */
    public final int f546156f;

    /* renamed from: g, reason: collision with root package name */
    public final int f546157g;

    public r(long j17, zq5.e srcRect, int i17, yq5.p pVar, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcRect, "srcRect");
        this.f546151a = j17;
        this.f546152b = srcRect;
        this.f546153c = i17;
        this.f546154d = pVar;
        this.f546155e = i18;
        this.f546156f = i19;
        this.f546157g = i27;
    }

    /* renamed from: equals */
    public boolean m177536xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.r)) {
            return false;
        }
        yq5.r rVar = (yq5.r) obj;
        long j17 = rVar.f546151a;
        int i17 = zq5.c.f556591c;
        return ((this.f546151a > j17 ? 1 : (this.f546151a == j17 ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546152b, rVar.f546152b) && this.f546153c == rVar.f546153c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546154d, rVar.f546154d) && this.f546155e == rVar.f546155e && this.f546156f == rVar.f546156f && this.f546157g == rVar.f546157g;
    }

    /* renamed from: hashCode */
    public int m177537x8cdac1b() {
        int i17 = zq5.c.f556591c;
        int hashCode = ((((java.lang.Long.hashCode(this.f546151a) * 31) + this.f546152b.m179316x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f546153c)) * 31;
        yq5.p pVar = this.f546154d;
        return ((((((hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f546155e)) * 31) + java.lang.Integer.hashCode(this.f546156f)) * 31) + java.lang.Integer.hashCode(this.f546157g);
    }

    /* renamed from: toString */
    public java.lang.String m177538x9616526c() {
        return "TileSnapshot(coordinate=" + ((java.lang.Object) zq5.c.b(this.f546151a)) + ", srcRect=" + this.f546152b + ", sampleSize=" + this.f546153c + ", tileImage=" + this.f546154d + ", state=" + this.f546155e + ", from=" + this.f546156f + ", alpha=" + this.f546157g + ')';
    }
}
