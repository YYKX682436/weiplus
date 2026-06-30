package yq5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f546139a;

    /* renamed from: b, reason: collision with root package name */
    public final zq5.e f546140b;

    /* renamed from: c, reason: collision with root package name */
    public final int f546141c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f546142d;

    /* renamed from: e, reason: collision with root package name */
    public yq5.p f546143e;

    /* renamed from: f, reason: collision with root package name */
    public int f546144f;

    /* renamed from: g, reason: collision with root package name */
    public int f546145g;

    /* renamed from: h, reason: collision with root package name */
    public final yq5.l f546146h;

    public m(long j17, zq5.e srcRect, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcRect, "srcRect");
        this.f546139a = j17;
        this.f546140b = srcRect;
        this.f546141c = i17;
        this.f546146h = new yq5.l();
    }

    public final void a() {
        b(null, 0, false);
    }

    public final void b(yq5.p pVar, int i17, boolean z17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar, this.f546143e)) {
            return;
        }
        this.f546143e = pVar;
        this.f546144f = i17;
        yq5.l lVar = this.f546146h;
        if (pVar != null && z17) {
            lVar.getClass();
            int i18 = s26.f.f483912b;
            lVar.f546136a = java.lang.System.nanoTime() - s26.f.f483911a;
            lVar.a(0.0f);
            lVar.f546138c = 0;
            return;
        }
        if (lVar.f546137b < 1.0f) {
            int i19 = s26.f.f483912b;
            lVar.f546136a = java.lang.System.nanoTime() - s26.f.f483911a;
            lVar.a(1.0f);
            lVar.f546138c = 255;
        }
    }

    /* renamed from: equals */
    public boolean m177529xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.m.class != obj.getClass()) {
            return false;
        }
        yq5.m mVar = (yq5.m) obj;
        int i17 = zq5.c.f556591c;
        return ((this.f546139a > mVar.f546139a ? 1 : (this.f546139a == mVar.f546139a ? 0 : -1)) == 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f546140b, mVar.f546140b) && this.f546141c == mVar.f546141c;
    }

    /* renamed from: hashCode */
    public int m177530x8cdac1b() {
        int i17 = zq5.c.f556591c;
        return (((java.lang.Long.hashCode(this.f546139a) * 31) + this.f546140b.m179316x8cdac1b()) * 31) + this.f546141c;
    }

    /* renamed from: toString */
    public java.lang.String m177531x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Tile(coordinate=");
        sb6.append(zq5.d.b(this.f546139a));
        sb6.append(",srcRect=");
        zq5.e eVar = this.f546140b;
        sb6.append(zq5.f.b(eVar));
        sb6.append(",srcSize=");
        sb6.append(eVar.f556596c - eVar.f556594a);
        sb6.append('x');
        sb6.append(eVar.f556597d - eVar.f556595b);
        sb6.append(",state=");
        int i17 = yq5.t.f546158c;
        int i18 = this.f546145g;
        java.lang.String str = "UNKNOWN";
        sb6.append(i18 != 0 ? i18 != 1 ? i18 != 2 ? i18 != 3 ? "UNKNOWN" : "ERROR" : "LOADED" : "LOADING" : "NONE");
        sb6.append(",from=");
        int i19 = yq5.q.f546150b;
        int i27 = this.f546144f;
        if (i27 == 1) {
            str = "MEMORY_CACHE";
        } else if (i27 == 2) {
            str = "LOCAL";
        }
        sb6.append(str);
        sb6.append(",sampleSize=");
        sb6.append(this.f546141c);
        sb6.append(",bitmap=");
        sb6.append(this.f546143e);
        sb6.append(')');
        return sb6.toString();
    }
}
