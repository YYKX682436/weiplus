package gm3;

/* loaded from: classes10.dex */
public final class c extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f355076d;

    /* renamed from: e, reason: collision with root package name */
    public final int f355077e;

    /* renamed from: f, reason: collision with root package name */
    public final long f355078f;

    /* renamed from: g, reason: collision with root package name */
    public final int f355079g;

    /* renamed from: h, reason: collision with root package name */
    public gm3.a f355080h;

    /* renamed from: i, reason: collision with root package name */
    public gm3.b f355081i;

    /* renamed from: m, reason: collision with root package name */
    public int f355082m;

    /* renamed from: n, reason: collision with root package name */
    public int f355083n;

    public c(java.lang.String id6, int i17, long j17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f355076d = id6;
        this.f355077e = i17;
        this.f355078f = j17;
        this.f355079g = i18;
        this.f355083n = -1;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        gm3.c other = (gm3.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return this.f355083n == other.f355083n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355081i, other.f355081i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355080h, other.f355080h) && this.f355082m == other.f355082m;
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        gm3.c other = (gm3.c) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f355078f, other.f355078f);
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f355077e;
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f355076d;
    }
}
