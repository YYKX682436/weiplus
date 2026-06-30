package gz0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public int f359200a;

    /* renamed from: b, reason: collision with root package name */
    public int f359201b;

    /* renamed from: c, reason: collision with root package name */
    public int f359202c;

    /* renamed from: d, reason: collision with root package name */
    public int f359203d;

    /* renamed from: e, reason: collision with root package name */
    public float f359204e;

    /* renamed from: f, reason: collision with root package name */
    public int f359205f;

    /* renamed from: g, reason: collision with root package name */
    public double f359206g;

    /* renamed from: h, reason: collision with root package name */
    public int f359207h;

    /* renamed from: i, reason: collision with root package name */
    public float f359208i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.TextureView f359209j;

    /* renamed from: k, reason: collision with root package name */
    public int f359210k;

    /* renamed from: l, reason: collision with root package name */
    public float f359211l;

    public i(int i17, int i18, int i19, int i27, float f17, int i28, double d17, int i29, float f18, android.view.TextureView textureView, int i37, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i37 & 1) != 0 ? 0 : i17;
        i18 = (i37 & 2) != 0 ? 0 : i18;
        i19 = (i37 & 4) != 0 ? 0 : i19;
        i27 = (i37 & 8) != 0 ? 0 : i27;
        f17 = (i37 & 16) != 0 ? 0.0f : f17;
        i28 = (i37 & 32) != 0 ? 0 : i28;
        d17 = (i37 & 64) != 0 ? 0.0d : d17;
        i29 = (i37 & 128) != 0 ? 0 : i29;
        f18 = (i37 & 256) != 0 ? 0.0f : f18;
        textureView = (i37 & 512) != 0 ? null : textureView;
        this.f359200a = i17;
        this.f359201b = i18;
        this.f359202c = i19;
        this.f359203d = i27;
        this.f359204e = f17;
        this.f359205f = i28;
        this.f359206g = d17;
        this.f359207h = i29;
        this.f359208i = f18;
        this.f359209j = textureView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r3 < r1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l a() {
        /*
            r15 = this;
            int r0 = r15.f359200a
            int r1 = r15.f359201b
            float r2 = r15.f359204e
            int r3 = r15.f359205f
            int r4 = r15.f359203d
            int r5 = r15.f359202c
            double r6 = r15.f359206g
            int r8 = r0 / 9
            float r8 = (float) r8
            r9 = 1098907648(0x41800000, float:16.0)
            float r8 = r8 * r9
            int r8 = a06.d.b(r8)
            int r8 = java.lang.Math.min(r8, r1)
            int r9 = r1 - r4
            int r10 = r9 - r5
            r11 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r11 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            r12 = 0
            if (r11 >= 0) goto L32
            if (r3 <= 0) goto L53
            if (r3 >= r1) goto L53
            float r11 = (float) r3
            float r11 = r11 / r2
            int r12 = kz0.k1.f395300a
            float r12 = (float) r12
            float r12 = r12 * r11
            goto L4e
        L32:
            if (r3 <= 0) goto L4a
            if (r3 >= r1) goto L4a
            int r11 = kz0.k1.f395300a
            int r13 = r1 - r11
            float r13 = (float) r13
            float r13 = r13 - r2
            float r14 = (float) r8
            float r13 = r13 - r14
            r14 = 1073741824(0x40000000, float:2.0)
            float r13 = r13 / r14
            float r11 = (float) r11
            float r13 = r13 + r11
            float r11 = (float) r3
            float r11 = r11 / r2
            float r13 = r13 * r11
            float r12 = java.lang.Math.min(r13, r12)
        L4a:
            if (r3 <= r4) goto L53
            if (r3 >= r1) goto L53
        L4e:
            int r11 = r1 - r3
            int r13 = (int) r12
            int r11 = r11 - r13
            goto L54
        L53:
            r11 = r8
        L54:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "safeRatio "
            r13.<init>(r14)
            r13.append(r6)
            java.lang.String r6 = " bottomSheetHeight "
            r13.append(r6)
            r13.append(r3)
            java.lang.String r3 = " bottomSheetTotalExpandHeight "
            r13.append(r3)
            r13.append(r2)
            java.lang.String r2 = ", calculatedPreviewHeight "
            r13.append(r2)
            r13.append(r8)
            java.lang.String r2 = ", previewH "
            r13.append(r2)
            r13.append(r11)
            java.lang.String r2 = ", remainHeight "
            r13.append(r2)
            r13.append(r9)
            java.lang.String r2 = ", centerHeight "
            r13.append(r2)
            r13.append(r10)
            java.lang.String r2 = ", toolbarHeight "
            r13.append(r2)
            r13.append(r5)
            java.lang.String r2 = ", bottomListHeight "
            r13.append(r2)
            r13.append(r4)
            java.lang.String r2 = ", previewOffsetY "
            r13.append(r2)
            r13.append(r12)
            java.lang.String r2 = ", constraints.w "
            r13.append(r2)
            r13.append(r0)
            java.lang.String r0 = " h "
            r13.append(r0)
            r13.append(r1)
            java.lang.String r0 = r13.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "calculatePreviewHeight: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "MicroMsg.SnsTemplate.PreviewMatrixCalculateData"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            jz5.l r0 = new jz5.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            java.lang.Float r2 = java.lang.Float.valueOf(r12)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.i.a():jz5.l");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if ((r0 == r12.f359211l) == false) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r12 = this;
            jz5.l r0 = r12.a()
            java.lang.Object r1 = r0.f384366d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.f384367e
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r2 = r12.f359207h
            r3 = 0
            if (r2 < r1) goto L2a
            int r4 = r12.f359210k
            r5 = 1
            if (r1 != r4) goto L29
            float r4 = r12.f359211l
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 != 0) goto L26
            r4 = r5
            goto L27
        L26:
            r4 = r3
        L27:
            if (r4 != 0) goto L2a
        L29:
            r3 = r5
        L2a:
            if (r3 == 0) goto L9c
            int r3 = r12.f359200a
            double r4 = r12.f359206g
            android.graphics.Matrix r6 = new android.graphics.Matrix
            r6.<init>()
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L46
            float r4 = (float) r1
            float r7 = (float) r2
            float r4 = r4 / r7
            float r3 = (float) r3
            r7 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r7
            r6.setScale(r4, r4, r3, r5)
        L46:
            r6.postTranslate(r5, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "offsetY:"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ", originHeight="
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", "
            r3.append(r2)
            long r2 = java.lang.System.currentTimeMillis()
            android.view.TextureView r4 = r12.f359209j     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L6e
            r4.setTransform(r6)     // Catch: java.lang.Throwable -> L97
            jz5.f0 r4 = jz5.f0.f384359a     // Catch: java.lang.Throwable -> L97
            goto L6f
        L6e:
            r4 = 0
        L6f:
            r6 = r4
            long r4 = java.lang.System.currentTimeMillis()
            long r7 = r4 - r2
            pm0.a0 r2 = new pm0.a0
            r9 = 0
            r10 = 4
            r11 = 0
            r5 = r2
            r5.<init>(r6, r7, r9, r10, r11)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "doTransform: cost:"
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.SnsTemplate.PreviewMatrixCalculateData"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            r12.f359210k = r1
            r12.f359211l = r0
            goto L9c
        L97:
            r0 = move-exception
            java.lang.System.currentTimeMillis()
            throw r0
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz0.i.b():void");
    }
}
