package co1;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f125285a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f125286b;

    /* renamed from: c, reason: collision with root package name */
    public t21.v2 f125287c;

    /* renamed from: d, reason: collision with root package name */
    public t21.v2 f125288d;

    /* renamed from: e, reason: collision with root package name */
    public co1.b f125289e;

    /* renamed from: f, reason: collision with root package name */
    public r15.b f125290f;

    /* renamed from: g, reason: collision with root package name */
    public ot0.t f125291g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f125292h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f125293i;

    /* renamed from: j, reason: collision with root package name */
    public long f125294j;

    public c(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4, java.lang.String str, t21.v2 v2Var, t21.v2 v2Var2, co1.b bVar, r15.b bVar2, ot0.t tVar, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar, boolean z17, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        c21053xdbf1e5f4 = (i17 & 1) != 0 ? null : c21053xdbf1e5f4;
        str = (i17 & 2) != 0 ? null : str;
        v2Var = (i17 & 4) != 0 ? null : v2Var;
        v2Var2 = (i17 & 8) != 0 ? null : v2Var2;
        bVar = (i17 & 16) != 0 ? null : bVar;
        bVar2 = (i17 & 32) != 0 ? null : bVar2;
        tVar = (i17 & 64) != 0 ? null : tVar;
        dVar = (i17 & 128) != 0 ? null : dVar;
        z17 = (i17 & 256) != 0 ? false : z17;
        j17 = (i17 & 512) != 0 ? -1L : j17;
        this.f125285a = c21053xdbf1e5f4;
        this.f125286b = str;
        this.f125287c = v2Var;
        this.f125288d = v2Var2;
        this.f125289e = bVar;
        this.f125290f = bVar2;
        this.f125291g = tVar;
        this.f125292h = dVar;
        this.f125293i = z17;
        this.f125294j = j17;
    }

    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d a() {
        return this.f125292h;
    }

    public final ot0.t b() {
        return this.f125291g;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c() {
        return this.f125285a;
    }

    public final long d() {
        return this.f125294j;
    }

    public final r15.b e() {
        return this.f125290f;
    }

    /* renamed from: equals */
    public boolean m15393xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co1.c)) {
            return false;
        }
        co1.c cVar = (co1.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125285a, cVar.f125285a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125286b, cVar.f125286b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125287c, cVar.f125287c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125288d, cVar.f125288d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125289e, cVar.f125289e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125290f, cVar.f125290f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125291g, cVar.f125291g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f125292h, cVar.f125292h) && this.f125293i == cVar.f125293i && this.f125294j == cVar.f125294j;
    }

    public final java.lang.String f() {
        return this.f125286b;
    }

    public final boolean g() {
        return this.f125293i;
    }

    public final t21.v2 h() {
        return this.f125288d;
    }

    /* renamed from: hashCode */
    public int m15394x8cdac1b() {
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f125285a;
        int hashCode = (c21053xdbf1e5f4 == null ? 0 : c21053xdbf1e5f4.hashCode()) * 31;
        java.lang.String str = this.f125286b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t21.v2 v2Var = this.f125287c;
        int hashCode3 = (hashCode2 + (v2Var == null ? 0 : v2Var.hashCode())) * 31;
        t21.v2 v2Var2 = this.f125288d;
        int hashCode4 = (hashCode3 + (v2Var2 == null ? 0 : v2Var2.hashCode())) * 31;
        co1.b bVar = this.f125289e;
        int m15391x8cdac1b = (hashCode4 + (bVar == null ? 0 : bVar.m15391x8cdac1b())) * 31;
        r15.b bVar2 = this.f125290f;
        int hashCode5 = (m15391x8cdac1b + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        ot0.t tVar = this.f125291g;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar = this.f125292h;
        return ((((hashCode6 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f125293i)) * 31) + java.lang.Long.hashCode(this.f125294j);
    }

    public final co1.b i() {
        return this.f125289e;
    }

    public final t21.v2 j() {
        return this.f125287c;
    }

    public final void k(java.lang.String str) {
        this.f125286b = str;
    }

    public final void l(co1.b bVar) {
        this.f125289e = bVar;
    }

    /* renamed from: toString */
    public java.lang.String m15395x9616526c() {
        return "RecoverExtraInfo(emojiInfo=" + this.f125285a + ", msgKey=" + this.f125286b + ", videoInfo=" + this.f125287c + ", originVideoInfo=" + this.f125288d + ", recoverExtraImageInfo=" + this.f125289e + ", extCommonInfo=" + this.f125290f + ", appMessage=" + this.f125291g + ", appAttach=" + this.f125292h + ", needInsertWithMsgId=" + this.f125293i + ", existAppAttachRowId=" + this.f125294j + ')';
    }
}
