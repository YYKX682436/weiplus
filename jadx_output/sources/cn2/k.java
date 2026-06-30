package cn2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: i, reason: collision with root package name */
    public static final cn2.d f43553i = new cn2.d(null);

    /* renamed from: j, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f43554j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f43555k;

    /* renamed from: l, reason: collision with root package name */
    public static cn2.k f43556l;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f43557a;

    /* renamed from: b, reason: collision with root package name */
    public cn2.a f43558b;

    /* renamed from: c, reason: collision with root package name */
    public cn2.b f43559c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f43560d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f43561e;

    /* renamed from: f, reason: collision with root package name */
    public final cn2.h f43562f;

    /* renamed from: g, reason: collision with root package name */
    public final cn2.j f43563g;

    /* renamed from: h, reason: collision with root package name */
    public final cn2.e f43564h;

    static {
        com.tencent.mars.xlog.Log.i("BulletCommentHelper", "initMemoryTrim");
        ki.i.f308101c.c(new cn2.c());
        f43554j = new com.tencent.mm.sdk.platformtools.r2(3);
        f43555k = new com.tencent.mm.sdk.platformtools.r2(2);
    }

    public k(java.lang.String uniqueId, cn2.a beginState, cn2.b mode, boolean z17, boolean z18, cn2.h hParams, cn2.j nParams, cn2.e extra, int i17, kotlin.jvm.internal.i iVar) {
        beginState = (i17 & 2) != 0 ? cn2.a.f43463d : beginState;
        mode = (i17 & 4) != 0 ? cn2.b.f43469e : mode;
        z17 = (i17 & 8) != 0 ? false : z17;
        z18 = (i17 & 16) != 0 ? true : z18;
        kotlin.jvm.internal.o.g(uniqueId, "uniqueId");
        kotlin.jvm.internal.o.g(beginState, "beginState");
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(hParams, "hParams");
        kotlin.jvm.internal.o.g(nParams, "nParams");
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f43557a = uniqueId;
        this.f43558b = beginState;
        this.f43559c = mode;
        this.f43560d = z17;
        this.f43561e = z18;
        this.f43562f = hParams;
        this.f43563g = nParams;
        this.f43564h = extra;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn2.k)) {
            return false;
        }
        cn2.k kVar = (cn2.k) obj;
        return kotlin.jvm.internal.o.b(this.f43557a, kVar.f43557a) && this.f43558b == kVar.f43558b && this.f43559c == kVar.f43559c && this.f43560d == kVar.f43560d && this.f43561e == kVar.f43561e && kotlin.jvm.internal.o.b(this.f43562f, kVar.f43562f) && kotlin.jvm.internal.o.b(this.f43563g, kVar.f43563g) && kotlin.jvm.internal.o.b(this.f43564h, kVar.f43564h);
    }

    public int hashCode() {
        return (((((((((((((this.f43557a.hashCode() * 31) + this.f43558b.hashCode()) * 31) + this.f43559c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f43560d)) * 31) + java.lang.Boolean.hashCode(this.f43561e)) * 31) + this.f43562f.hashCode()) * 31) + this.f43563g.hashCode()) * 31) + this.f43564h.hashCode();
    }

    public java.lang.String toString() {
        return "AnimConfig(uniqueId=" + this.f43557a + ", beginState=" + this.f43558b + ", mode=" + this.f43559c + ", working=" + this.f43560d + ", alphaTo1WhenBegin=" + this.f43561e + ", hParams=" + this.f43562f + ", nParams=" + this.f43563g + ", extra=" + this.f43564h + ')';
    }
}
