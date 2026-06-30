package km2;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f390729a;

    /* renamed from: b, reason: collision with root package name */
    public long f390730b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f390731c;

    /* renamed from: d, reason: collision with root package name */
    public r45.kd1 f390732d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f390733e;

    /* renamed from: f, reason: collision with root package name */
    public int f390734f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f390735g;

    /* renamed from: h, reason: collision with root package name */
    public int f390736h;

    /* renamed from: i, reason: collision with root package name */
    public float f390737i;

    /* renamed from: j, reason: collision with root package name */
    public float f390738j;

    /* renamed from: k, reason: collision with root package name */
    public int f390739k;

    /* renamed from: l, reason: collision with root package name */
    public int f390740l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f390741m;

    /* renamed from: n, reason: collision with root package name */
    public r45.gy0 f390742n;

    /* renamed from: o, reason: collision with root package name */
    public int f390743o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f390744p;

    /* renamed from: q, reason: collision with root package name */
    public int f390745q;

    /* renamed from: r, reason: collision with root package name */
    public r45.q92 f390746r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f390747s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f390748t;

    /* renamed from: u, reason: collision with root package name */
    public int f390749u;

    public r(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, long j17, java.lang.String str, r45.kd1 kd1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, int i17, java.lang.String str2, int i18, float f17, float f18, int i19, int i27, java.lang.String str3, r45.gy0 gy0Var, int i28, java.util.LinkedList linkedList, int i29, r45.q92 q92Var, boolean z17, java.lang.String str4, int i37, int i38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        int i39;
        java.util.LinkedList readList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i38 & 1) != 0 ? null : gVar;
        long j18 = (i38 & 2) != 0 ? 0L : j17;
        java.lang.String str5 = (i38 & 4) != 0 ? "" : str;
        r45.kd1 kd1Var2 = (i38 & 8) != 0 ? null : kd1Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (i38 & 16) != 0 ? null : c19792x256d2725;
        int i47 = (i38 & 32) != 0 ? 3 : i17;
        java.lang.String nonceId = (i38 & 64) == 0 ? str2 : "";
        int i48 = (i38 & 128) != 0 ? 0 : i18;
        float f19 = (i38 & 256) != 0 ? 0.0f : f17;
        float f27 = (i38 & 512) == 0 ? f18 : 0.0f;
        int i49 = (i38 & 1024) != 0 ? 0 : i19;
        int i57 = (i38 & 2048) != 0 ? -1 : i27;
        java.lang.String str6 = (i38 & 4096) != 0 ? null : str3;
        r45.gy0 gy0Var2 = (i38 & 8192) != 0 ? null : gy0Var;
        int i58 = (i38 & 16384) != 0 ? 0 : i28;
        if ((i38 & 32768) != 0) {
            i39 = i58;
            readList = new java.util.LinkedList();
        } else {
            i39 = i58;
            readList = linkedList;
        }
        int i59 = (i38 & 65536) != 0 ? 0 : i29;
        r45.q92 q92Var2 = (i38 & 131072) != 0 ? null : q92Var;
        boolean z18 = (i38 & 262144) != 0 ? false : z17;
        java.lang.String str7 = (i38 & 524288) != 0 ? null : str4;
        int i66 = (i38 & 1048576) != 0 ? 0 : i37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(readList, "readList");
        this.f390729a = gVar2;
        this.f390730b = j18;
        this.f390731c = str5;
        this.f390732d = kd1Var2;
        this.f390733e = c19792x256d27252;
        this.f390734f = i47;
        this.f390735g = nonceId;
        this.f390736h = i48;
        this.f390737i = f19;
        this.f390738j = f27;
        this.f390739k = i49;
        this.f390740l = i57;
        this.f390741m = str6;
        this.f390742n = gy0Var2;
        this.f390743o = i39;
        this.f390744p = readList;
        this.f390745q = i59;
        this.f390746r = q92Var2;
        this.f390747s = z18;
        this.f390748t = str7;
        this.f390749u = i66;
    }

    /* renamed from: equals */
    public boolean m143686xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.r)) {
            return false;
        }
        km2.r rVar = (km2.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390729a, rVar.f390729a) && this.f390730b == rVar.f390730b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390731c, rVar.f390731c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390732d, rVar.f390732d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390733e, rVar.f390733e) && this.f390734f == rVar.f390734f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390735g, rVar.f390735g) && this.f390736h == rVar.f390736h && java.lang.Float.compare(this.f390737i, rVar.f390737i) == 0 && java.lang.Float.compare(this.f390738j, rVar.f390738j) == 0 && this.f390739k == rVar.f390739k && this.f390740l == rVar.f390740l && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390741m, rVar.f390741m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390742n, rVar.f390742n) && this.f390743o == rVar.f390743o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390744p, rVar.f390744p) && this.f390745q == rVar.f390745q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390746r, rVar.f390746r) && this.f390747s == rVar.f390747s && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390748t, rVar.f390748t) && this.f390749u == rVar.f390749u;
    }

    /* renamed from: hashCode */
    public int m143687x8cdac1b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f390729a;
        int hashCode = (((gVar == null ? 0 : gVar.hashCode()) * 31) + java.lang.Long.hashCode(this.f390730b)) * 31;
        java.lang.String str = this.f390731c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        r45.kd1 kd1Var = this.f390732d;
        int hashCode3 = (hashCode2 + (kd1Var == null ? 0 : kd1Var.hashCode())) * 31;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f390733e;
        int hashCode4 = (((((((((((((((hashCode3 + (c19792x256d2725 == null ? 0 : c19792x256d2725.hashCode())) * 31) + java.lang.Integer.hashCode(this.f390734f)) * 31) + this.f390735g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f390736h)) * 31) + java.lang.Float.hashCode(this.f390737i)) * 31) + java.lang.Float.hashCode(this.f390738j)) * 31) + java.lang.Integer.hashCode(this.f390739k)) * 31) + java.lang.Integer.hashCode(this.f390740l)) * 31;
        java.lang.String str2 = this.f390741m;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r45.gy0 gy0Var = this.f390742n;
        int hashCode6 = (((((((hashCode5 + (gy0Var == null ? 0 : gy0Var.hashCode())) * 31) + java.lang.Integer.hashCode(this.f390743o)) * 31) + this.f390744p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f390745q)) * 31;
        r45.q92 q92Var = this.f390746r;
        int hashCode7 = (((hashCode6 + (q92Var == null ? 0 : q92Var.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f390747s)) * 31;
        java.lang.String str3 = this.f390748t;
        return ((hashCode7 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f390749u);
    }

    /* renamed from: toString */
    public java.lang.String m143688x9616526c() {
        return "FinderLiveRelatedLoaderParam(lastBuf=" + this.f390729a + ", objectId=" + this.f390730b + ", sessionBuffer=" + this.f390731c + ", lbsTabTipsInfo=" + this.f390732d + ", targetFeedObject=" + this.f390733e + ", tabType=" + this.f390734f + ", nonceId=" + this.f390735g + ", scene=" + this.f390736h + ", long=" + this.f390737i + ", lat=" + this.f390738j + ", commentScene=" + this.f390739k + ", pullMoreType=" + this.f390740l + ", contextId=" + this.f390741m + ", byPassInfo=" + this.f390742n + ", enterScene=" + this.f390743o + ", readList=" + this.f390744p + ", curIndex=" + this.f390745q + ", squareEntranceInfo=" + this.f390746r + ", isFirstPagePreload=" + this.f390747s + ", feedColumnVMKey=" + this.f390748t + ", requestScene=" + this.f390749u + ')';
    }
}
