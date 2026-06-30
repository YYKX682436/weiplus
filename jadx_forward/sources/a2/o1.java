package a2;

/* loaded from: classes14.dex */
public final class o1 {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.o1 f82322d = new a2.o1(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, null, 0, null, 262143, null);

    /* renamed from: a, reason: collision with root package name */
    public final a2.g1 f82323a;

    /* renamed from: b, reason: collision with root package name */
    public final a2.p f82324b;

    /* renamed from: c, reason: collision with root package name */
    public final a2.u f82325c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o1(a2.g1 r4, a2.p r5) {
        /*
            r3 = this;
            java.lang.String r0 = "spanStyle"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "paragraphStyle"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            a2.t r0 = r4.f82270o
            a2.s r1 = r5.f82330e
            if (r0 != 0) goto L14
            if (r1 != 0) goto L14
            r0 = 0
            goto L1a
        L14:
            a2.u r2 = new a2.u
            r2.<init>(r0, r1)
            r0 = r2
        L1a:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o1.<init>(a2.g1, a2.p):void");
    }

    public static a2.o1 a(a2.o1 o1Var, long j17, long j18, f2.r rVar, f2.p pVar, f2.q qVar, f2.h hVar, java.lang.String str, long j19, l2.a aVar, l2.m mVar, h2.d dVar, long j27, l2.g gVar, e1.z0 z0Var, l2.f fVar, l2.h hVar2, long j28, l2.n nVar, int i17, java.lang.Object obj) {
        l2.m mVar2;
        long j29;
        l2.g gVar2;
        l2.h hVar3;
        long j37;
        l2.l bVar;
        long a17 = (i17 & 1) != 0 ? o1Var.f82323a.a() : j17;
        long j38 = (i17 & 2) != 0 ? o1Var.f82323a.f82257b : j18;
        f2.r rVar2 = (i17 & 4) != 0 ? o1Var.f82323a.f82258c : rVar;
        f2.p pVar2 = (i17 & 8) != 0 ? o1Var.f82323a.f82259d : pVar;
        f2.q qVar2 = (i17 & 16) != 0 ? o1Var.f82323a.f82260e : qVar;
        f2.h hVar4 = (i17 & 32) != 0 ? o1Var.f82323a.f82261f : hVar;
        java.lang.String str2 = (i17 & 64) != 0 ? o1Var.f82323a.f82262g : str;
        long j39 = (i17 & 128) != 0 ? o1Var.f82323a.f82263h : j19;
        l2.a aVar2 = (i17 & 256) != 0 ? o1Var.f82323a.f82264i : aVar;
        l2.m mVar3 = (i17 & 512) != 0 ? o1Var.f82323a.f82265j : mVar;
        h2.d dVar2 = (i17 & 1024) != 0 ? o1Var.f82323a.f82266k : dVar;
        if ((i17 & 2048) != 0) {
            mVar2 = mVar3;
            j29 = o1Var.f82323a.f82267l;
        } else {
            mVar2 = mVar3;
            j29 = j27;
        }
        long j47 = j29;
        l2.g gVar3 = (i17 & 4096) != 0 ? o1Var.f82323a.f82268m : gVar;
        e1.z0 z0Var2 = (i17 & 8192) != 0 ? o1Var.f82323a.f82269n : z0Var;
        l2.f fVar2 = (i17 & 16384) != 0 ? o1Var.f82324b.f82326a : fVar;
        l2.h hVar5 = (i17 & 32768) != 0 ? o1Var.f82324b.f82327b : hVar2;
        if ((i17 & 65536) != 0) {
            hVar3 = hVar5;
            gVar2 = gVar3;
            j37 = o1Var.f82324b.f82328c;
        } else {
            gVar2 = gVar3;
            hVar3 = hVar5;
            j37 = j28;
        }
        l2.n nVar2 = (i17 & 131072) != 0 ? o1Var.f82324b.f82329d : nVar;
        long j48 = j37;
        a2.g1 g1Var = o1Var.f82323a;
        long j49 = j39;
        if (e1.y.c(a17, g1Var.a())) {
            bVar = g1Var.f82256a;
        } else {
            int i18 = l2.l.f396657a;
            bVar = (a17 > e1.y.f327853k ? 1 : (a17 == e1.y.f327853k ? 0 : -1)) != 0 ? new l2.b(a17, null) : l2.j.f396655b;
        }
        a2.g1 g1Var2 = new a2.g1(bVar, j38, rVar2, pVar2, qVar2, hVar4, str2, j49, aVar2, mVar2, dVar2, j47, gVar2, z0Var2, g1Var.f82270o, (p3321xbce91901.jvm.p3324x21ffc6bd.i) null);
        a2.p pVar3 = o1Var.f82324b;
        return new a2.o1(g1Var2, new a2.p(fVar2, hVar3, j48, nVar2, pVar3.f82330e, pVar3.f82331f, null), o1Var.f82325c);
    }

    public final long b() {
        return this.f82323a.a();
    }

    public final a2.o1 c(a2.o1 o1Var) {
        return (o1Var == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o1Var, f82322d)) ? this : new a2.o1(this.f82323a.c(o1Var.f82323a), this.f82324b.a(o1Var.f82324b));
    }

    /* renamed from: equals */
    public boolean m383xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.o1)) {
            return false;
        }
        a2.o1 o1Var = (a2.o1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82323a, o1Var.f82323a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82324b, o1Var.f82324b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82325c, o1Var.f82325c);
    }

    /* renamed from: hashCode */
    public int m384x8cdac1b() {
        int m353x8cdac1b = ((this.f82323a.m353x8cdac1b() * 31) + this.f82324b.m387x8cdac1b()) * 31;
        a2.u uVar = this.f82325c;
        return m353x8cdac1b + (uVar != null ? uVar.m410x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m385x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TextStyle(color=");
        sb6.append((java.lang.Object) e1.y.i(b()));
        sb6.append(", brush=");
        a2.g1 g1Var = this.f82323a;
        sb6.append(g1Var.f82256a.d());
        sb6.append(", fontSize=");
        sb6.append((java.lang.Object) p2.t.d(g1Var.f82257b));
        sb6.append(", fontWeight=");
        sb6.append(g1Var.f82258c);
        sb6.append(", fontStyle=");
        sb6.append(g1Var.f82259d);
        sb6.append(", fontSynthesis=");
        sb6.append(g1Var.f82260e);
        sb6.append(", fontFamily=");
        sb6.append(g1Var.f82261f);
        sb6.append(", fontFeatureSettings=");
        sb6.append(g1Var.f82262g);
        sb6.append(", letterSpacing=");
        sb6.append((java.lang.Object) p2.t.d(g1Var.f82263h));
        sb6.append(", baselineShift=");
        sb6.append(g1Var.f82264i);
        sb6.append(", textGeometricTransform=");
        sb6.append(g1Var.f82265j);
        sb6.append(", localeList=");
        sb6.append(g1Var.f82266k);
        sb6.append(", background=");
        sb6.append((java.lang.Object) e1.y.i(g1Var.f82267l));
        sb6.append(", textDecoration=");
        sb6.append(g1Var.f82268m);
        sb6.append(", shadow=");
        sb6.append(g1Var.f82269n);
        sb6.append(", textAlign=");
        a2.p pVar = this.f82324b;
        sb6.append(pVar.f82326a);
        sb6.append(", textDirection=");
        sb6.append(pVar.f82327b);
        sb6.append(", lineHeight=");
        sb6.append((java.lang.Object) p2.t.d(pVar.f82328c));
        sb6.append(", textIndent=");
        sb6.append(pVar.f82329d);
        sb6.append(", platformStyle=");
        sb6.append(this.f82325c);
        sb6.append("lineHeightStyle=");
        sb6.append(pVar.f82331f);
        sb6.append(')');
        return sb6.toString();
    }

    public o1(a2.g1 spanStyle, a2.p paragraphStyle, a2.u uVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanStyle, "spanStyle");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphStyle, "paragraphStyle");
        this.f82323a = spanStyle;
        this.f82324b = paragraphStyle;
        this.f82325c = uVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o1(long r25, long r27, f2.r r29, f2.p r30, f2.q r31, f2.h r32, java.lang.String r33, long r34, l2.a r36, l2.m r37, h2.d r38, long r39, l2.g r41, e1.z0 r42, l2.f r43, l2.h r44, long r45, l2.n r47, int r48, p3321xbce91901.jvm.p3324x21ffc6bd.i r49) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.o1.<init>(long, long, f2.r, f2.p, f2.q, f2.h, java.lang.String, long, l2.a, l2.m, h2.d, long, l2.g, e1.z0, l2.f, l2.h, long, l2.n, int, kotlin.jvm.internal.i):void");
    }
}
