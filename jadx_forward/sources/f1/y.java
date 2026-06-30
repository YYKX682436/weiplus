package f1;

/* loaded from: classes14.dex */
public final class y extends f1.d {

    /* renamed from: p, reason: collision with root package name */
    public static final f1.v f340055p = new f1.v(null);

    /* renamed from: d, reason: collision with root package name */
    public final f1.a0 f340056d;

    /* renamed from: e, reason: collision with root package name */
    public final float f340057e;

    /* renamed from: f, reason: collision with root package name */
    public final float f340058f;

    /* renamed from: g, reason: collision with root package name */
    public final f1.z f340059g;

    /* renamed from: h, reason: collision with root package name */
    public final float[] f340060h;

    /* renamed from: i, reason: collision with root package name */
    public final float[] f340061i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f340062j;

    /* renamed from: k, reason: collision with root package name */
    public final yz5.l f340063k;

    /* renamed from: l, reason: collision with root package name */
    public final yz5.l f340064l;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.l f340065m;

    /* renamed from: n, reason: collision with root package name */
    public final yz5.l f340066n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f340067o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0201  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r29, float[] r30, f1.a0 r31, float[] r32, yz5.l r33, yz5.l r34, float r35, float r36, f1.z r37, int r38) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, float[], yz5.l, yz5.l, float, float, f1.z, int):void");
    }

    @Override // f1.d
    public float[] a(float[] v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        f1.e.h(this.f340062j, v17);
        f1.x xVar = (f1.x) this.f340064l;
        v17[0] = (float) ((java.lang.Number) xVar.mo146xb9724478(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) xVar.mo146xb9724478(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) xVar.mo146xb9724478(java.lang.Double.valueOf(v17[2]))).doubleValue();
        return v17;
    }

    @Override // f1.d
    public float b(int i17) {
        return this.f340058f;
    }

    @Override // f1.d
    public float c(int i17) {
        return this.f340057e;
    }

    @Override // f1.d
    public boolean d() {
        return this.f340067o;
    }

    @Override // f1.d
    public float[] e(float[] v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        f1.w wVar = (f1.w) this.f340066n;
        v17[0] = (float) ((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(v17[0]))).doubleValue();
        v17[1] = (float) ((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(v17[1]))).doubleValue();
        v17[2] = (float) ((java.lang.Number) wVar.mo146xb9724478(java.lang.Double.valueOf(v17[2]))).doubleValue();
        f1.e.h(this.f340061i, v17);
        return v17;
    }

    @Override // f1.d
    /* renamed from: equals */
    public boolean mo128675xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(f1.y.class), p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(obj.getClass())) || !super.mo128675xb2c87fbf(obj)) {
            return false;
        }
        f1.y yVar = (f1.y) obj;
        if (java.lang.Float.compare(yVar.f340057e, this.f340057e) != 0 || java.lang.Float.compare(yVar.f340058f, this.f340058f) != 0 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340056d, yVar.f340056d) || !java.util.Arrays.equals(this.f340060h, yVar.f340060h)) {
            return false;
        }
        f1.z zVar = yVar.f340059g;
        f1.z zVar2 = this.f340059g;
        if (zVar2 != null) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zVar2, zVar);
        }
        if (zVar == null) {
            return true;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340063k, yVar.f340063k)) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f340065m, yVar.f340065m);
        }
        return false;
    }

    @Override // f1.d
    /* renamed from: hashCode */
    public int mo128676x8cdac1b() {
        int mo128676x8cdac1b = ((((super.mo128676x8cdac1b() * 31) + this.f340056d.m128671x8cdac1b()) * 31) + java.util.Arrays.hashCode(this.f340060h)) * 31;
        float f17 = this.f340057e;
        int floatToIntBits = (mo128676x8cdac1b + (!((f17 > 0.0f ? 1 : (f17 == 0.0f ? 0 : -1)) == 0) ? java.lang.Float.floatToIntBits(f17) : 0)) * 31;
        float f18 = this.f340058f;
        int floatToIntBits2 = (floatToIntBits + (!(f18 == 0.0f) ? java.lang.Float.floatToIntBits(f18) : 0)) * 31;
        f1.z zVar = this.f340059g;
        int m128686x8cdac1b = floatToIntBits2 + (zVar != null ? zVar.m128686x8cdac1b() : 0);
        return zVar == null ? (((m128686x8cdac1b * 31) + this.f340063k.hashCode()) * 31) + this.f340065m.hashCode() : m128686x8cdac1b;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r16, float[] r17, f1.a0 r18, f1.z r19, int r20) {
        /*
            r15 = this;
            r9 = r19
            java.lang.String r0 = "name"
            r1 = r16
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r0)
            java.lang.String r0 = "primaries"
            r2 = r17
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            java.lang.String r0 = "whitePoint"
            r3 = r18
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.String r0 = "function"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r4 = 0
            double r5 = r9.f340073f
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 1
            r11 = 0
            if (r0 != 0) goto L29
            r0 = r10
            goto L2a
        L29:
            r0 = r11
        L2a:
            double r12 = r9.f340074g
            if (r0 == 0) goto L3d
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L34
            r0 = r10
            goto L35
        L34:
            r0 = r11
        L35:
            if (r0 == 0) goto L3d
            f1.o r0 = new f1.o
            r0.<init>(r9)
            goto L42
        L3d:
            f1.p r0 = new f1.p
            r0.<init>(r9)
        L42:
            r14 = r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L49
            r0 = r10
            goto L4a
        L49:
            r0 = r11
        L4a:
            if (r0 == 0) goto L5a
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L51
            goto L52
        L51:
            r10 = r11
        L52:
            if (r10 == 0) goto L5a
            f1.q r0 = new f1.q
            r0.<init>(r9)
            goto L5f
        L5a:
            f1.r r0 = new f1.r
            r0.<init>(r9)
        L5f:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r14
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, f1.z, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y(java.lang.String r24, float[] r25, f1.a0 r26, double r27, float r29, float r30, int r31) {
        /*
            r23 = this;
            r1 = r27
            java.lang.String r0 = "name"
            r15 = r24
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r0 = "primaries"
            r13 = r25
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            java.lang.String r0 = "whitePoint"
            r14 = r26
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            r17 = 0
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L23
            r5 = r3
            goto L24
        L23:
            r5 = r4
        L24:
            f1.u r6 = f1.u.f340052d
            if (r5 == 0) goto L2b
            r18 = r6
            goto L32
        L2b:
            f1.s r5 = new f1.s
            r5.<init>(r1)
            r18 = r5
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r3 = r4
        L36:
            if (r3 == 0) goto L3b
            r19 = r6
            goto L42
        L3b:
            f1.t r0 = new f1.t
            r0.<init>(r1)
            r19 = r0
        L42:
            f1.z r20 = new f1.z
            r0 = r20
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r21 = 0
            r13 = r21
            r16 = 96
            r15 = r16
            r16 = 0
            r1 = r27
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16)
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r29
            r9 = r30
            r10 = r20
            r11 = r31
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.y.<init>(java.lang.String, float[], f1.a0, double, float, float, int):void");
    }
}
