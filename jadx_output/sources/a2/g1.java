package a2;

/* loaded from: classes14.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final l2.l f723a;

    /* renamed from: b, reason: collision with root package name */
    public final long f724b;

    /* renamed from: c, reason: collision with root package name */
    public final f2.r f725c;

    /* renamed from: d, reason: collision with root package name */
    public final f2.p f726d;

    /* renamed from: e, reason: collision with root package name */
    public final f2.q f727e;

    /* renamed from: f, reason: collision with root package name */
    public final f2.h f728f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f729g;

    /* renamed from: h, reason: collision with root package name */
    public final long f730h;

    /* renamed from: i, reason: collision with root package name */
    public final l2.a f731i;

    /* renamed from: j, reason: collision with root package name */
    public final l2.m f732j;

    /* renamed from: k, reason: collision with root package name */
    public final h2.d f733k;

    /* renamed from: l, reason: collision with root package name */
    public final long f734l;

    /* renamed from: m, reason: collision with root package name */
    public final l2.g f735m;

    /* renamed from: n, reason: collision with root package name */
    public final e1.z0 f736n;

    /* renamed from: o, reason: collision with root package name */
    public final a2.t f737o;

    public g1(l2.l lVar, long j17, f2.r rVar, f2.p pVar, f2.q qVar, f2.h hVar, java.lang.String str, long j18, l2.a aVar, l2.m mVar, h2.d dVar, long j19, l2.g gVar, e1.z0 z0Var, a2.t tVar, kotlin.jvm.internal.i iVar) {
        this.f723a = lVar;
        this.f724b = j17;
        this.f725c = rVar;
        this.f726d = pVar;
        this.f727e = qVar;
        this.f728f = hVar;
        this.f729g = str;
        this.f730h = j18;
        this.f731i = aVar;
        this.f732j = mVar;
        this.f733k = dVar;
        this.f734l = j19;
        this.f735m = gVar;
        this.f736n = z0Var;
        this.f737o = tVar;
    }

    public final long a() {
        return this.f723a.a();
    }

    public final boolean b(a2.g1 other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (this == other) {
            return true;
        }
        return p2.t.a(this.f724b, other.f724b) && kotlin.jvm.internal.o.b(this.f725c, other.f725c) && kotlin.jvm.internal.o.b(this.f726d, other.f726d) && kotlin.jvm.internal.o.b(this.f727e, other.f727e) && kotlin.jvm.internal.o.b(this.f728f, other.f728f) && kotlin.jvm.internal.o.b(this.f729g, other.f729g) && p2.t.a(this.f730h, other.f730h) && kotlin.jvm.internal.o.b(this.f731i, other.f731i) && kotlin.jvm.internal.o.b(this.f732j, other.f732j) && kotlin.jvm.internal.o.b(this.f733k, other.f733k) && e1.y.c(this.f734l, other.f734l) && kotlin.jvm.internal.o.b(this.f737o, other.f737o);
    }

    public final a2.g1 c(a2.g1 g1Var) {
        if (g1Var == null) {
            return this;
        }
        l2.l c17 = this.f723a.c(g1Var.f723a);
        f2.h hVar = g1Var.f728f;
        if (hVar == null) {
            hVar = this.f728f;
        }
        f2.h hVar2 = hVar;
        long j17 = g1Var.f724b;
        if (p2.u.c(j17)) {
            j17 = this.f724b;
        }
        long j18 = j17;
        f2.r rVar = g1Var.f725c;
        if (rVar == null) {
            rVar = this.f725c;
        }
        f2.r rVar2 = rVar;
        f2.p pVar = g1Var.f726d;
        if (pVar == null) {
            pVar = this.f726d;
        }
        f2.p pVar2 = pVar;
        f2.q qVar = g1Var.f727e;
        if (qVar == null) {
            qVar = this.f727e;
        }
        f2.q qVar2 = qVar;
        java.lang.String str = g1Var.f729g;
        if (str == null) {
            str = this.f729g;
        }
        java.lang.String str2 = str;
        long j19 = g1Var.f730h;
        if (p2.u.c(j19)) {
            j19 = this.f730h;
        }
        long j27 = j19;
        l2.a aVar = g1Var.f731i;
        if (aVar == null) {
            aVar = this.f731i;
        }
        l2.a aVar2 = aVar;
        l2.m mVar = g1Var.f732j;
        if (mVar == null) {
            mVar = this.f732j;
        }
        l2.m mVar2 = mVar;
        h2.d dVar = g1Var.f733k;
        if (dVar == null) {
            dVar = this.f733k;
        }
        h2.d dVar2 = dVar;
        int i17 = e1.y.f246321l;
        long j28 = e1.y.f246320k;
        long j29 = g1Var.f734l;
        long j37 = (j29 > j28 ? 1 : (j29 == j28 ? 0 : -1)) != 0 ? j29 : this.f734l;
        l2.g gVar = g1Var.f735m;
        if (gVar == null) {
            gVar = this.f735m;
        }
        l2.g gVar2 = gVar;
        e1.z0 z0Var = g1Var.f736n;
        if (z0Var == null) {
            z0Var = this.f736n;
        }
        e1.z0 z0Var2 = z0Var;
        a2.t tVar = this.f737o;
        return new a2.g1(c17, j18, rVar2, pVar2, qVar2, hVar2, str2, j27, aVar2, mVar2, dVar2, j37, gVar2, z0Var2, tVar == null ? g1Var.f737o : tVar, (kotlin.jvm.internal.i) null);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.g1)) {
            return false;
        }
        a2.g1 g1Var = (a2.g1) obj;
        if (b(g1Var)) {
            if (kotlin.jvm.internal.o.b(this.f723a, g1Var.f723a) && kotlin.jvm.internal.o.b(this.f735m, g1Var.f735m) && kotlin.jvm.internal.o.b(this.f736n, g1Var.f736n)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long a17 = a();
        int i17 = e1.y.f246321l;
        int hashCode = java.lang.Long.hashCode(a17) * 31;
        e1.r d17 = this.f723a.d();
        int hashCode2 = (hashCode + (d17 != null ? d17.hashCode() : 0)) * 31;
        p2.v[] vVarArr = p2.t.f351400b;
        int hashCode3 = (hashCode2 + java.lang.Long.hashCode(this.f724b)) * 31;
        f2.r rVar = this.f725c;
        int i18 = (hashCode3 + (rVar != null ? rVar.f258825d : 0)) * 31;
        f2.p pVar = this.f726d;
        int hashCode4 = (i18 + (pVar != null ? java.lang.Integer.hashCode(pVar.f258816a) : 0)) * 31;
        f2.q qVar = this.f727e;
        int hashCode5 = (hashCode4 + (qVar != null ? java.lang.Integer.hashCode(qVar.f258817a) : 0)) * 31;
        f2.h hVar = this.f728f;
        int hashCode6 = (hashCode5 + (hVar != null ? hVar.hashCode() : 0)) * 31;
        java.lang.String str = this.f729g;
        int hashCode7 = (((hashCode6 + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f730h)) * 31;
        l2.a aVar = this.f731i;
        int hashCode8 = (hashCode7 + (aVar != null ? java.lang.Float.hashCode(aVar.f315106a) : 0)) * 31;
        l2.m mVar = this.f732j;
        int hashCode9 = (hashCode8 + (mVar != null ? mVar.hashCode() : 0)) * 31;
        h2.d dVar = this.f733k;
        int hashCode10 = (((hashCode9 + (dVar != null ? dVar.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f734l)) * 31;
        l2.g gVar = this.f735m;
        int i19 = (hashCode10 + (gVar != null ? gVar.f315120a : 0)) * 31;
        e1.z0 z0Var = this.f736n;
        int hashCode11 = (i19 + (z0Var != null ? z0Var.hashCode() : 0)) * 31;
        a2.t tVar = this.f737o;
        return hashCode11 + (tVar != null ? tVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SpanStyle(color=" + ((java.lang.Object) e1.y.i(a())) + ", brush=" + this.f723a.d() + ", fontSize=" + ((java.lang.Object) p2.t.d(this.f724b)) + ", fontWeight=" + this.f725c + ", fontStyle=" + this.f726d + ", fontSynthesis=" + this.f727e + ", fontFamily=" + this.f728f + ", fontFeatureSettings=" + this.f729g + ", letterSpacing=" + ((java.lang.Object) p2.t.d(this.f730h)) + ", baselineShift=" + this.f731i + ", textGeometricTransform=" + this.f732j + ", localeList=" + this.f733k + ", background=" + ((java.lang.Object) e1.y.i(this.f734l)) + ", textDecoration=" + this.f735m + ", shadow=" + this.f736n + ", platformStyle=" + this.f737o + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g1(long r20, long r22, f2.r r24, f2.p r25, f2.q r26, f2.h r27, java.lang.String r28, long r29, l2.a r31, l2.m r32, h2.d r33, long r34, l2.g r36, e1.z0 r37, int r38, kotlin.jvm.internal.i r39) {
        /*
            r19 = this;
            r0 = r38
            r1 = r0 & 1
            if (r1 == 0) goto Lb
            int r1 = e1.y.f246321l
            long r1 = e1.y.f246320k
            goto Ld
        Lb:
            r1 = r20
        Ld:
            r3 = r0 & 2
            if (r3 == 0) goto L16
            p2.v[] r3 = p2.t.f351400b
            long r3 = p2.t.f351401c
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
            p2.v[] r11 = p2.t.f351400b
            long r11 = p2.t.f351401c
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
            int r6 = e1.y.f246321l
            long r16 = e1.y.f246320k
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
    public g1(long j17, long j18, f2.r rVar, f2.p pVar, f2.q qVar, f2.h hVar, java.lang.String str, long j19, l2.a aVar, l2.m mVar, h2.d dVar, long j27, l2.g gVar, e1.z0 z0Var, kotlin.jvm.internal.i iVar) {
        this((j17 > e1.y.f246320k ? 1 : (j17 == e1.y.f246320k ? 0 : -1)) != 0 ? new l2.b(j17, null) : l2.j.f315122b, j18, rVar, pVar, qVar, hVar, str, j19, aVar, mVar, dVar, j27, gVar, z0Var, (a2.t) null, (kotlin.jvm.internal.i) null);
        int i17 = l2.l.f315124a;
    }
}
