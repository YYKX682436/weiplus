package zv1;

/* loaded from: classes15.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final zv1.d f557892a;

    /* renamed from: b, reason: collision with root package name */
    public final long f557893b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f557894c;

    /* renamed from: d, reason: collision with root package name */
    public long f557895d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f557896e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f557897f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f557898g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f557899h;

    public r(zv1.d cleaner, long j17, boolean z17, long j18, java.util.List exemptFiles, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, boolean z18, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleaner, "cleaner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exemptFiles, "exemptFiles");
        this.f557892a = cleaner;
        this.f557893b = j17;
        this.f557894c = z17;
        this.f557895d = j18;
        this.f557896e = exemptFiles;
        this.f557897f = c26987xeef691ab;
        this.f557898g = z18;
        this.f557899h = z19;
    }

    /* renamed from: equals */
    public boolean m179762xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.r)) {
            return false;
        }
        zv1.r rVar = (zv1.r) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557892a, rVar.f557892a) && this.f557893b == rVar.f557893b && this.f557894c == rVar.f557894c && this.f557895d == rVar.f557895d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557896e, rVar.f557896e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557897f, rVar.f557897f) && this.f557898g == rVar.f557898g && this.f557899h == rVar.f557899h;
    }

    /* renamed from: hashCode */
    public int m179763x8cdac1b() {
        int hashCode = ((((((((this.f557892a.hashCode() * 31) + java.lang.Long.hashCode(this.f557893b)) * 31) + java.lang.Boolean.hashCode(this.f557894c)) * 31) + java.lang.Long.hashCode(this.f557895d)) * 31) + this.f557896e.hashCode()) * 31;
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f557897f;
        return ((((hashCode + (c26987xeef691ab == null ? 0 : c26987xeef691ab.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f557898g)) * 31) + java.lang.Boolean.hashCode(this.f557899h);
    }

    /* renamed from: toString */
    public java.lang.String m179764x9616526c() {
        return "CleanCacheContinuation(cleaner=" + this.f557892a + ", expectCleanSize=" + this.f557893b + ", withDirs=" + this.f557894c + ", exemptCleanSize=" + this.f557895d + ", exemptFiles=" + this.f557896e + ", cs=" + this.f557897f + ", debugMode=" + this.f557898g + ", dryRun=" + this.f557899h + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(zv1.d r14, long r15, boolean r17, long r18, java.util.List r20, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab r21, boolean r22, boolean r23, int r24, p3321xbce91901.jvm.p3324x21ffc6bd.i r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 2
            if (r1 == 0) goto L9
            r1 = -1
            goto La
        L9:
            r1 = r15
        La:
            r3 = r0 & 4
            java.lang.String r4 = "0"
            java.lang.String r5 = "1"
            java.lang.Class<e42.e0> r6 = e42.e0.class
            java.lang.Class<zv1.f1> r7 = zv1.f1.class
            if (r3 == 0) goto L3f
            int r3 = zv1.f1.f557832w1
            i95.m r3 = i95.n0.c(r7)
            zv1.f1 r3 = (zv1.f1) r3
            yv1.h r3 = (yv1.h) r3
            r3.getClass()
            boolean r3 = zv1.s.f557900f
            i95.m r3 = i95.n0.c(r6)
            e42.e0 r3 = (e42.e0) r3
            boolean r8 = zv1.s.f557902h
            if (r8 == 0) goto L31
            r8 = r5
            goto L32
        L31:
            r8 = r4
        L32:
            h62.d r3 = (h62.d) r3
            java.lang.String r9 = "clicfg_auto_clean_cache_with_dirs"
            java.lang.String r3 = r3.aj(r9, r8)
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            goto L41
        L3f:
            r3 = r17
        L41:
            r8 = r0 & 8
            if (r8 == 0) goto L48
            r8 = 0
            goto L4a
        L48:
            r8 = r18
        L4a:
            r10 = r0 & 16
            if (r10 == 0) goto L51
            kz5.p0 r10 = kz5.p0.f395529d
            goto L53
        L51:
            r10 = r20
        L53:
            r11 = r0 & 32
            if (r11 == 0) goto L59
            r11 = 0
            goto L5b
        L59:
            r11 = r21
        L5b:
            r12 = r0 & 64
            if (r12 == 0) goto L86
            int r12 = zv1.f1.f557832w1
            i95.m r7 = i95.n0.c(r7)
            zv1.f1 r7 = (zv1.f1) r7
            yv1.h r7 = (yv1.h) r7
            r7.getClass()
            boolean r7 = zv1.s.f557900f
            i95.m r6 = i95.n0.c(r6)
            e42.e0 r6 = (e42.e0) r6
            boolean r7 = zv1.s.f557901g
            if (r7 == 0) goto L79
            r4 = r5
        L79:
            h62.d r6 = (h62.d) r6
            java.lang.String r7 = "clicfg_auto_clean_cache_debug_mode"
            java.lang.String r4 = r6.aj(r7, r4)
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            goto L88
        L86:
            r4 = r22
        L88:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L8e
            r0 = 0
            goto L90
        L8e:
            r0 = r23
        L90:
            r15 = r13
            r16 = r14
            r17 = r1
            r19 = r3
            r20 = r8
            r22 = r10
            r23 = r11
            r24 = r4
            r25 = r0
            r15.<init>(r16, r17, r19, r20, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.r.<init>(zv1.d, long, boolean, long, java.util.List, com.tencent.wcdb.support.CancellationSignal, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }
}
