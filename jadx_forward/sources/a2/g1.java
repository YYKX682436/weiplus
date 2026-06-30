package a2;

/* loaded from: classes14.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final l2.l f82256a;

    /* renamed from: b, reason: collision with root package name */
    public final long f82257b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.r f82258c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.p f82259d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.q f82260e;

    /* renamed from: f, reason: collision with root package name */
    public final f2.h f82261f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f82262g;

    /* renamed from: h, reason: collision with root package name */
    public final long f82263h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.a f82264i;

    /* renamed from: j, reason: collision with root package name */
    public final l2.m f82265j;

    /* renamed from: k, reason: collision with root package name */
    public final h2.d f82266k;

    /* renamed from: l, reason: collision with root package name */
    public final long f82267l;

    /* renamed from: m, reason: collision with root package name */
    public final l2.g f82268m;

    /* renamed from: n, reason: collision with root package name */
    public final e1.z0 f82269n;

    /* renamed from: o, reason: collision with root package name */
    public final a2.t f82270o;

    public g1(l2.l lVar, long j17, f2.r rVar, f2.p pVar, f2.q qVar, f2.h hVar, java.lang.String str, long j18, l2.a aVar, l2.m mVar, h2.d dVar, long j19, l2.g gVar, e1.z0 z0Var, a2.t tVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f82256a = lVar;
        this.f82257b = j17;
        this.f82258c = rVar;
        this.f82259d = pVar;
        this.f82260e = qVar;
        this.f82261f = hVar;
        this.f82262g = str;
        this.f82263h = j18;
        this.f82264i = aVar;
        this.f82265j = mVar;
        this.f82266k = dVar;
        this.f82267l = j19;
        this.f82268m = gVar;
        this.f82269n = z0Var;
        this.f82270o = tVar;
    }

    public final long a() {
        return this.f82256a.a();
    }

    public final boolean b(a2.g1 other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (this == other) {
            return true;
        }
        return p2.t.a(this.f82257b, other.f82257b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82258c, other.f82258c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82259d, other.f82259d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82260e, other.f82260e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82261f, other.f82261f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82262g, other.f82262g) && p2.t.a(this.f82263h, other.f82263h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82264i, other.f82264i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82265j, other.f82265j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82266k, other.f82266k) && e1.y.c(this.f82267l, other.f82267l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82270o, other.f82270o);
    }

    public final a2.g1 c(a2.g1 g1Var) {
        if (g1Var == null) {
            return this;
        }
        l2.l c17 = this.f82256a.c(g1Var.f82256a);
        f2.h hVar = g1Var.f82261f;
        if (hVar == null) {
            hVar = this.f82261f;
        }
        f2.h hVar2 = hVar;
        long j17 = g1Var.f82257b;
        if (p2.u.c(j17)) {
            j17 = this.f82257b;
        }
        long j18 = j17;
        f2.r rVar = g1Var.f82258c;
        if (rVar == null) {
            rVar = this.f82258c;
        }
        f2.r rVar2 = rVar;
        f2.p pVar = g1Var.f82259d;
        if (pVar == null) {
            pVar = this.f82259d;
        }
        f2.p pVar2 = pVar;
        f2.q qVar = g1Var.f82260e;
        if (qVar == null) {
            qVar = this.f82260e;
        }
        f2.q qVar2 = qVar;
        java.lang.String str = g1Var.f82262g;
        if (str == null) {
            str = this.f82262g;
        }
        java.lang.String str2 = str;
        long j19 = g1Var.f82263h;
        if (p2.u.c(j19)) {
            j19 = this.f82263h;
        }
        long j27 = j19;
        l2.a aVar = g1Var.f82264i;
        if (aVar == null) {
            aVar = this.f82264i;
        }
        l2.a aVar2 = aVar;
        l2.m mVar = g1Var.f82265j;
        if (mVar == null) {
            mVar = this.f82265j;
        }
        l2.m mVar2 = mVar;
        h2.d dVar = g1Var.f82266k;
        if (dVar == null) {
            dVar = this.f82266k;
        }
        h2.d dVar2 = dVar;
        int i17 = e1.y.f327854l;
        long j28 = e1.y.f327853k;
        long j29 = g1Var.f82267l;
        long j37 = (j29 > j28 ? 1 : (j29 == j28 ? 0 : -1)) != 0 ? j29 : this.f82267l;
        l2.g gVar = g1Var.f82268m;
        if (gVar == null) {
            gVar = this.f82268m;
        }
        l2.g gVar2 = gVar;
        e1.z0 z0Var = g1Var.f82269n;
        if (z0Var == null) {
            z0Var = this.f82269n;
        }
        e1.z0 z0Var2 = z0Var;
        a2.t tVar = this.f82270o;
        return new a2.g1(c17, j18, rVar2, pVar2, qVar2, hVar2, str2, j27, aVar2, mVar2, dVar2, j37, gVar2, z0Var2, tVar == null ? g1Var.f82270o : tVar, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
    }

    /* renamed from: equals */
    public boolean m352xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.g1)) {
            return false;
        }
        a2.g1 g1Var = (a2.g1) obj;
        if (b(g1Var)) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82256a, g1Var.f82256a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82268m, g1Var.f82268m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82269n, g1Var.f82269n)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m353x8cdac1b() {
        long a17 = a();
        int i17 = e1.y.f327854l;
        int hashCode = java.lang.Long.hashCode(a17) * 31;
        e1.r d17 = this.f82256a.d();
        int hashCode2 = (hashCode + (d17 != null ? d17.hashCode() : 0)) * 31;
        p2.v[] vVarArr = p2.t.f432933b;
        int hashCode3 = (hashCode2 + java.lang.Long.hashCode(this.f82257b)) * 31;
        f2.r rVar = this.f82258c;
        int i18 = (hashCode3 + (rVar != null ? rVar.f340358d : 0)) * 31;
        f2.p pVar = this.f82259d;
        int hashCode4 = (i18 + (pVar != null ? java.lang.Integer.hashCode(pVar.f340349a) : 0)) * 31;
        f2.q qVar = this.f82260e;
        int hashCode5 = (hashCode4 + (qVar != null ? java.lang.Integer.hashCode(qVar.f340350a) : 0)) * 31;
        f2.h hVar = this.f82261f;
        int hashCode6 = (hashCode5 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        java.lang.String str = this.f82262g;
        int hashCode7 = (((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f82263h)) * 31;
        l2.a aVar = this.f82264i;
        int hashCode8 = (hashCode7 + (aVar != null ? java.lang.Float.hashCode(aVar.f396639a) : 0)) * 31;
        l2.m mVar = this.f82265j;
        int m144917x8cdac1b = (hashCode8 + (mVar != null ? mVar.m144917x8cdac1b() : 0)) * 31;
        h2.d dVar = this.f82266k;
        int hashCode9 = (((m144917x8cdac1b + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f82267l)) * 31;
        l2.g gVar = this.f82268m;
        int i19 = (hashCode9 + (gVar != null ? gVar.f396653a : 0)) * 31;
        e1.z0 z0Var = this.f82269n;
        int m126681x8cdac1b = (i19 + (z0Var != null ? z0Var.m126681x8cdac1b() : 0)) * 31;
        a2.t tVar = this.f82270o;
        return m126681x8cdac1b + (tVar != null ? tVar.m406x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m354x9616526c() {
        return "SpanStyle(color=" + ((java.lang.Object) e1.y.i(a())) + ", brush=" + this.f82256a.d() + ", fontSize=" + ((java.lang.Object) p2.t.d(this.f82257b)) + ", fontWeight=" + this.f82258c + ", fontStyle=" + this.f82259d + ", fontSynthesis=" + this.f82260e + ", fontFamily=" + this.f82261f + ", fontFeatureSettings=" + this.f82262g + ", letterSpacing=" + ((java.lang.Object) p2.t.d(this.f82263h)) + ", baselineShift=" + this.f82264i + ", textGeometricTransform=" + this.f82265j + ", localeList=" + this.f82266k + ", background=" + ((java.lang.Object) e1.y.i(this.f82267l)) + ", textDecoration=" + this.f82268m + ", shadow=" + this.f82269n + ", platformStyle=" + this.f82270o + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g1(long r20, long r22, f2.r r24, f2.p r25, f2.q r26, f2.h r27, java.lang.String r28, long r29, l2.a r31, l2.m r32, h2.d r33, long r34, l2.g r36, e1.z0 r37, int r38, p3321xbce91901.jvm.p3324x21ffc6bd.i r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto Lb
            int r1 = e1.y.f327854l
            long r1 = e1.y.f327853k
            goto Ld
        Lb:
            r1 = r20
        Ld:
            r3 = r0 & 2
            if (r3 == 0) goto L16
            p2.v[] r3 = p2.t.f432933b
            long r3 = p2.t.f432934c
            goto L18
        L16:
            r3 = r22
        L18:
            r5 = r0 & 4
            if (r5 == 0) goto L1e
            r5 = 0
            goto L20
        L1e:
            r5 = r24
        L20:
            r7 = r0 & 8
            if (r7 == 0) goto L26
            r7 = 0
            goto L28
        L26:
            r7 = r25
        L28:
            r8 = r0 & 16
            if (r8 == 0) goto L2e
            r8 = 0
            goto L30
        L2e:
            r8 = r26
        L30:
            r9 = r0 & 32
            if (r9 == 0) goto L36
            r9 = 0
            goto L38
        L36:
            r9 = r27
        L38:
            r10 = r0 & 64
            if (r10 == 0) goto L3e
            r10 = 0
            goto L40
        L3e:
            r10 = r28
        L40:
            r11 = r0 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L49
            p2.v[] r11 = p2.t.f432933b
            long r11 = p2.t.f432934c
            goto L4b
        L49:
            r11 = r29
        L4b:
            r13 = r0 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L51
            r13 = 0
            goto L53
        L51:
            r13 = r31
        L53:
            r14 = r0 & 512(0x200, float:7.17E-43)
            if (r14 == 0) goto L59
            r14 = 0
            goto L5b
        L59:
            r14 = r32
        L5b:
            r15 = r0 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L61
            r15 = 0
            goto L63
        L61:
            r15 = r33
        L63:
            r6 = r0 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L6c
            int r6 = e1.y.f327854l
            long r16 = e1.y.f327853k
            goto L6e
        L6c:
            r16 = r34
        L6e:
            r6 = r0 & 4096(0x1000, float:5.74E-42)
            if (r6 == 0) goto L74
            r6 = 0
            goto L76
        L74:
            r6 = r36
        L76:
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L7c
            r0 = 0
            goto L7e
        L7c:
            r0 = r37
        L7e:
            r18 = 0
            r39 = r18
            r20 = r19
            r21 = r1
            r23 = r3
            r25 = r5
            r26 = r7
            r27 = r8
            r28 = r9
            r29 = r10
            r30 = r11
            r32 = r13
            r33 = r14
            r34 = r15
            r35 = r16
            r37 = r6
            r38 = r0
            r20.<init>(r21, r23, r25, r26, r27, r28, r29, r30, r32, r33, r34, r35, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.g1.<init>(long, long, f2.r, f2.p, f2.q, f2.h, java.lang.String, long, l2.a, l2.m, h2.d, long, l2.g, e1.z0, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g1(long j17, long j18, f2.r rVar, f2.p pVar, f2.q qVar, f2.h hVar, java.lang.String str, long j19, l2.a aVar, l2.m mVar, h2.d dVar, long j27, l2.g gVar, e1.z0 z0Var, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((j17 > e1.y.f327853k ? 1 : (j17 == e1.y.f327853k ? 0 : -1)) != 0 ? new l2.b(j17, null) : l2.j.f396655b, j18, rVar, pVar, qVar, hVar, str, j19, aVar, mVar, dVar, j27, gVar, z0Var, (a2.t) null, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
        int i17 = l2.l.f396657a;
    }
}
