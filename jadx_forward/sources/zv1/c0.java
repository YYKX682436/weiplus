package zv1;

/* loaded from: classes15.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 f557812a;

    /* renamed from: b, reason: collision with root package name */
    public final zv1.o f557813b;

    /* renamed from: c, reason: collision with root package name */
    public final long f557814c;

    /* renamed from: d, reason: collision with root package name */
    public final long f557815d;

    /* renamed from: e, reason: collision with root package name */
    public final long f557816e;

    /* renamed from: f, reason: collision with root package name */
    public final long f557817f;

    /* renamed from: g, reason: collision with root package name */
    public final long f557818g;

    /* renamed from: h, reason: collision with root package name */
    public final long f557819h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f557820i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f557821j;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 cacheType, zv1.o result, long j17, long j18, long j19, long j27, long j28, long j29, java.util.Map subtypeSizeBefore, java.util.Map subtypeSizeAfter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheType, "cacheType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtypeSizeBefore, "subtypeSizeBefore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subtypeSizeAfter, "subtypeSizeAfter");
        this.f557812a = cacheType;
        this.f557813b = result;
        this.f557814c = j17;
        this.f557815d = j18;
        this.f557816e = j19;
        this.f557817f = j27;
        this.f557818g = j28;
        this.f557819h = j29;
        this.f557820i = subtypeSizeBefore;
        this.f557821j = subtypeSizeAfter;
    }

    /* renamed from: equals */
    public boolean m179733xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv1.c0)) {
            return false;
        }
        zv1.c0 c0Var = (zv1.c0) obj;
        return this.f557812a == c0Var.f557812a && this.f557813b == c0Var.f557813b && this.f557814c == c0Var.f557814c && this.f557815d == c0Var.f557815d && this.f557816e == c0Var.f557816e && this.f557817f == c0Var.f557817f && this.f557818g == c0Var.f557818g && this.f557819h == c0Var.f557819h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557820i, c0Var.f557820i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557821j, c0Var.f557821j);
    }

    /* renamed from: hashCode */
    public int m179734x8cdac1b() {
        return (((((((((((((((((this.f557812a.hashCode() * 31) + this.f557813b.hashCode()) * 31) + java.lang.Long.hashCode(this.f557814c)) * 31) + java.lang.Long.hashCode(this.f557815d)) * 31) + java.lang.Long.hashCode(this.f557816e)) * 31) + java.lang.Long.hashCode(this.f557817f)) * 31) + java.lang.Long.hashCode(this.f557818g)) * 31) + java.lang.Long.hashCode(this.f557819h)) * 31) + this.f557820i.hashCode()) * 31) + this.f557821j.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179735x9616526c() {
        return "CleanerReportData(cacheType=" + this.f557812a + ", result=" + this.f557813b + ", cacheTypeSize=" + this.f557814c + ", expectCleanSize=" + this.f557815d + ", returnCleanSize=" + this.f557816e + ", actualCleanSize=" + this.f557817f + ", exemptCleanSize=" + this.f557818g + ", duration=" + this.f557819h + ", subtypeSizeBefore=" + this.f557820i + ", subtypeSizeAfter=" + this.f557821j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c0(com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.p1324x5a0af82.EnumC13101x40600c60 r22, zv1.o r23, long r24, long r26, long r28, long r30, long r32, long r34, java.util.Map r36, java.util.Map r37, int r38, p3321xbce91901.jvm.p3324x21ffc6bd.i r39) {
        /*
            r21 = this;
            r0 = r38
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto La
            r7 = r2
            goto Lc
        La:
            r7 = r24
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L12
            r9 = r2
            goto L14
        L12:
            r9 = r26
        L14:
            r1 = r0 & 16
            if (r1 == 0) goto L1a
            r11 = r2
            goto L1c
        L1a:
            r11 = r28
        L1c:
            r1 = r0 & 32
            if (r1 == 0) goto L22
            r13 = r2
            goto L24
        L22:
            r13 = r30
        L24:
            r1 = r0 & 64
            if (r1 == 0) goto L2a
            r15 = r2
            goto L2c
        L2a:
            r15 = r32
        L2c:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L33
            r17 = r2
            goto L35
        L33:
            r17 = r34
        L35:
            r1 = r0 & 256(0x100, float:3.59E-43)
            kz5.q0 r2 = kz5.q0.f395534d
            if (r1 == 0) goto L3e
            r19 = r2
            goto L40
        L3e:
            r19 = r36
        L40:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L47
            r20 = r2
            goto L49
        L47:
            r20 = r37
        L49:
            r4 = r21
            r5 = r22
            r6 = r23
            r4.<init>(r5, r6, r7, r9, r11, r13, r15, r17, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zv1.c0.<init>(com.tencent.mm.plugin.clean.cache.CacheClassifyType, zv1.o, long, long, long, long, long, long, java.util.Map, java.util.Map, int, kotlin.jvm.internal.i):void");
    }
}
