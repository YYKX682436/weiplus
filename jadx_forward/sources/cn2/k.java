package cn2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final cn2.d f125086i = new cn2.d(null);

    /* renamed from: j, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f125087j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f125088k;

    /* renamed from: l, reason: collision with root package name */
    public static cn2.k f125089l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f125090a;

    /* renamed from: b, reason: collision with root package name */
    public cn2.a f125091b;

    /* renamed from: c, reason: collision with root package name */
    public cn2.b f125092c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125093d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125094e;

    /* renamed from: f, reason: collision with root package name */
    public final cn2.h f125095f;

    /* renamed from: g, reason: collision with root package name */
    public final cn2.j f125096g;

    /* renamed from: h, reason: collision with root package name */
    public final cn2.e f125097h;

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BulletCommentHelper", "initMemoryTrim");
        ki.i.f389634c.c(new cn2.c());
        f125087j = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(3);
        f125088k = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(2);
    }

    public k(java.lang.String uniqueId, cn2.a beginState, cn2.b mode, boolean z17, boolean z18, cn2.h hParams, cn2.j nParams, cn2.e extra, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        beginState = (i17 & 2) != 0 ? cn2.a.f124996d : beginState;
        mode = (i17 & 4) != 0 ? cn2.b.f125002e : mode;
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beginState, "beginState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hParams, "hParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nParams, "nParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extra, "extra");
        this.f125090a = uniqueId;
        this.f125091b = beginState;
        this.f125092c = mode;
        this.f125093d = z17;
        this.f125094e = z18;
        this.f125095f = hParams;
        this.f125096g = nParams;
        this.f125097h = extra;
    }

    /* renamed from: equals */
    public boolean m15351xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.k)) {
            return false;
        }
        cn2.k kVar = (cn2.k) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125090a, kVar.f125090a) && this.f125091b == kVar.f125091b && this.f125092c == kVar.f125092c && this.f125093d == kVar.f125093d && this.f125094e == kVar.f125094e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125095f, kVar.f125095f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125096g, kVar.f125096g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125097h, kVar.f125097h);
    }

    /* renamed from: hashCode */
    public int m15352x8cdac1b() {
        return (((((((((((((this.f125090a.hashCode() * 31) + this.f125091b.hashCode()) * 31) + this.f125092c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f125093d)) * 31) + java.lang.Boolean.hashCode(this.f125094e)) * 31) + this.f125095f.m15341x8cdac1b()) * 31) + this.f125096g.m15348x8cdac1b()) * 31) + this.f125097h.m15331x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m15353x9616526c() {
        return "AnimConfig(uniqueId=" + this.f125090a + ", beginState=" + this.f125091b + ", mode=" + this.f125092c + ", working=" + this.f125093d + ", alphaTo1WhenBegin=" + this.f125094e + ", hParams=" + this.f125095f + ", nParams=" + this.f125096g + ", extra=" + this.f125097h + ')';
    }
}
