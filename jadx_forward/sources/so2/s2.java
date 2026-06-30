package so2;

/* loaded from: classes2.dex */
public final class s2 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final int f492121d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f492122e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.h32 f492123f;

    /* renamed from: g, reason: collision with root package name */
    public final r45.c32 f492124g;

    public s2(int i17, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, r45.h32 h32Var, r45.c32 c32Var) {
        this.f492121d = i17;
        this.f492122e = c19782x23db1cfa;
        this.f492123f = h32Var;
        this.f492124g = c32Var;
    }

    public final java.lang.String a() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f492122e;
        java.lang.String m76197x6c03c64c = c19782x23db1cfa != null ? c19782x23db1cfa.m76197x6c03c64c() : null;
        return m76197x6c03c64c == null ? "" : m76197x6c03c64c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r6.a()) != false) goto L28;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "obj"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            boolean r0 = r6 instanceof so2.s2
            r1 = -1
            if (r0 == 0) goto L51
            so2.s2 r6 = (so2.s2) r6
            int r0 = r6.f492121d
            int r2 = r5.f492121d
            if (r2 == r0) goto L13
            goto L51
        L13:
            r0 = 1
            r3 = 0
            if (r2 == r0) goto L36
            r4 = 2
            if (r2 == r4) goto L1c
        L1a:
            r0 = r3
            goto L4e
        L1c:
            java.lang.String r2 = r5.a()
            int r4 = r2.length()
            if (r4 <= 0) goto L28
            r4 = r0
            goto L29
        L28:
            r4 = r3
        L29:
            if (r4 == 0) goto L1a
            java.lang.String r6 = r6.a()
            boolean r6 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, r6)
            if (r6 == 0) goto L1a
            goto L4e
        L36:
            r0 = 4
            r2 = 0
            r45.h32 r4 = r5.f492123f
            if (r4 == 0) goto L41
            java.lang.String r4 = r4.m75945x2fec8307(r0)
            goto L42
        L41:
            r4 = r2
        L42:
            r45.h32 r6 = r6.f492123f
            if (r6 == 0) goto L4a
            java.lang.String r2 = r6.m75945x2fec8307(r0)
        L4a:
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r2)
        L4e:
            if (r0 == 0) goto L51
            r1 = r3
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.s2.d(com.tencent.mm.plugin.finder.feed.model.internal.r0):int");
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        java.lang.String m75945x2fec8307;
        r45.h32 h32Var = this.f492123f;
        if (h32Var == null || (m75945x2fec8307 = h32Var.m75945x2fec8307(4)) == null) {
            return 0L;
        }
        return m75945x2fec8307.hashCode();
    }

    @Override // in5.c
    public int h() {
        return -12;
    }
}
