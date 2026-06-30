package w33;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.l f524242a;

    /* renamed from: b, reason: collision with root package name */
    public final w33.e f524243b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f524244c;

    /* renamed from: d, reason: collision with root package name */
    public final int f524245d;

    public c(jz5.l topTip, w33.e user, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topTip, "topTip");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        this.f524242a = topTip;
        this.f524243b = user;
        this.f524244c = z17;
        this.f524245d = i17;
    }

    /* renamed from: equals */
    public boolean m173187xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.c)) {
            return false;
        }
        w33.c cVar = (w33.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524242a, cVar.f524242a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f524243b, cVar.f524243b) && this.f524244c == cVar.f524244c && this.f524245d == cVar.f524245d;
    }

    /* renamed from: hashCode */
    public int m173188x8cdac1b() {
        return (((((this.f524242a.m141638x8cdac1b() * 31) + this.f524243b.m173194x8cdac1b()) * 31) + java.lang.Boolean.hashCode(this.f524244c)) * 31) + java.lang.Integer.hashCode(this.f524245d);
    }

    /* renamed from: toString */
    public java.lang.String m173189x9616526c() {
        return "MentionUserWrapper(topTip=" + this.f524242a + ", user=" + this.f524243b + ", showFooter=" + this.f524244c + ", reportPosition=" + this.f524245d + ')';
    }

    public /* synthetic */ c(jz5.l lVar, w33.e eVar, boolean z17, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? new jz5.l(java.lang.Boolean.FALSE, null) : lVar, eVar, (i18 & 4) != 0 ? false : z17, (i18 & 8) != 0 ? -1 : i17);
    }
}
