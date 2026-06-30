package gf5;

/* loaded from: classes11.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final double f352956a;

    /* renamed from: b, reason: collision with root package name */
    public final double f352957b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f352958c;

    /* renamed from: d, reason: collision with root package name */
    public final double f352959d;

    /* renamed from: e, reason: collision with root package name */
    public final double f352960e;

    /* renamed from: f, reason: collision with root package name */
    public final double f352961f;

    /* renamed from: g, reason: collision with root package name */
    public final double f352962g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f352963h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f352964i;

    public o(double d17, double d18, java.util.List tokenWeights, double d19, double d27, double d28, double d29, java.util.List textPatternBonuses, java.util.List tokenCountBonuses) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenWeights, "tokenWeights");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPatternBonuses, "textPatternBonuses");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenCountBonuses, "tokenCountBonuses");
        this.f352956a = d17;
        this.f352957b = d18;
        this.f352958c = tokenWeights;
        this.f352959d = d19;
        this.f352960e = d27;
        this.f352961f = d28;
        this.f352962g = d29;
        this.f352963h = textPatternBonuses;
        this.f352964i = tokenCountBonuses;
    }

    public static gf5.o a(gf5.o oVar, double d17, double d18, java.util.List list, double d19, double d27, double d28, double d29, java.util.List list2, java.util.List list3, int i17, java.lang.Object obj) {
        double d37 = (i17 & 1) != 0 ? oVar.f352956a : d17;
        double d38 = (i17 & 2) != 0 ? oVar.f352957b : d18;
        java.util.List tokenWeights = (i17 & 4) != 0 ? oVar.f352958c : list;
        double d39 = (i17 & 8) != 0 ? oVar.f352959d : d19;
        double d47 = (i17 & 16) != 0 ? oVar.f352960e : d27;
        double d48 = (i17 & 32) != 0 ? oVar.f352961f : d28;
        double d49 = (i17 & 64) != 0 ? oVar.f352962g : d29;
        java.util.List textPatternBonuses = (i17 & 128) != 0 ? oVar.f352963h : list2;
        java.util.List tokenCountBonuses = (i17 & 256) != 0 ? oVar.f352964i : list3;
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenWeights, "tokenWeights");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textPatternBonuses, "textPatternBonuses");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenCountBonuses, "tokenCountBonuses");
        return new gf5.o(d37, d38, tokenWeights, d39, d47, d48, d49, textPatternBonuses, tokenCountBonuses);
    }

    /* renamed from: equals */
    public boolean m131478xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.o)) {
            return false;
        }
        gf5.o oVar = (gf5.o) obj;
        return java.lang.Double.compare(this.f352956a, oVar.f352956a) == 0 && java.lang.Double.compare(this.f352957b, oVar.f352957b) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352958c, oVar.f352958c) && java.lang.Double.compare(this.f352959d, oVar.f352959d) == 0 && java.lang.Double.compare(this.f352960e, oVar.f352960e) == 0 && java.lang.Double.compare(this.f352961f, oVar.f352961f) == 0 && java.lang.Double.compare(this.f352962g, oVar.f352962g) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352963h, oVar.f352963h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352964i, oVar.f352964i);
    }

    /* renamed from: hashCode */
    public int m131479x8cdac1b() {
        return (((((((((((((((java.lang.Double.hashCode(this.f352956a) * 31) + java.lang.Double.hashCode(this.f352957b)) * 31) + this.f352958c.hashCode()) * 31) + java.lang.Double.hashCode(this.f352959d)) * 31) + java.lang.Double.hashCode(this.f352960e)) * 31) + java.lang.Double.hashCode(this.f352961f)) * 31) + java.lang.Double.hashCode(this.f352962g)) * 31) + this.f352963h.hashCode()) * 31) + this.f352964i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m131480x9616526c() {
        return "LanguageDetectionProfile(coverageWeight=" + this.f352956a + ", defaultTokenWeight=" + this.f352957b + ", tokenWeights=" + this.f352958c + ", lowCoverageThreshold=" + this.f352959d + ", lowCoveragePenalty=" + this.f352960e + ", lowSpanDensityThreshold=" + this.f352961f + ", lowSpanDensityPenalty=" + this.f352962g + ", textPatternBonuses=" + this.f352963h + ", tokenCountBonuses=" + this.f352964i + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ o(double r17, double r19, java.util.List r21, double r22, double r24, double r26, double r28, java.util.List r30, java.util.List r31, int r32, p3321xbce91901.jvm.p3324x21ffc6bd.i r33) {
        /*
            r16 = this;
            r0 = r32
            r1 = r0 & 1
            if (r1 == 0) goto L9
            r1 = 4638144666238189568(0x405e000000000000, double:120.0)
            goto Lb
        L9:
            r1 = r17
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L12
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L14
        L12:
            r3 = r19
        L14:
            r5 = r0 & 4
            kz5.p0 r6 = kz5.p0.f395529d
            if (r5 == 0) goto L1c
            r5 = r6
            goto L1e
        L1c:
            r5 = r21
        L1e:
            r7 = r0 & 8
            if (r7 == 0) goto L28
            r7 = 4590429028186199163(0x3fb47ae147ae147b, double:0.08)
            goto L2a
        L28:
            r7 = r22
        L2a:
            r9 = r0 & 16
            if (r9 == 0) goto L31
            r9 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L33
        L31:
            r9 = r24
        L33:
            r11 = r0 & 32
            if (r11 == 0) goto L3d
            r11 = 4572414629676717179(0x3f747ae147ae147b, double:0.005)
            goto L3f
        L3d:
            r11 = r26
        L3f:
            r13 = r0 & 64
            if (r13 == 0) goto L49
            r13 = 4630122629401935872(0x4041800000000000, double:35.0)
            goto L4b
        L49:
            r13 = r28
        L4b:
            r15 = r0 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L51
            r15 = r6
            goto L53
        L51:
            r15 = r30
        L53:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L58
            goto L5a
        L58:
            r6 = r31
        L5a:
            r17 = r16
            r18 = r1
            r20 = r3
            r22 = r5
            r23 = r7
            r25 = r9
            r27 = r11
            r29 = r13
            r31 = r15
            r32 = r6
            r17.<init>(r18, r20, r22, r23, r25, r27, r29, r31, r32)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf5.o.<init>(double, double, java.util.List, double, double, double, double, java.util.List, java.util.List, int, kotlin.jvm.internal.i):void");
    }
}
