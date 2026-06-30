package cm2;

/* loaded from: classes3.dex */
public final class k0 extends cm2.t {

    /* renamed from: J, reason: collision with root package name */
    public static final java.text.SimpleDateFormat f43359J = new java.text.SimpleDateFormat(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.edf), java.util.Locale.ENGLISH);
    public final java.lang.String A;
    public final java.lang.String B;
    public final long C;
    public final int D;
    public final java.lang.String E;
    public final java.lang.String F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: v, reason: collision with root package name */
    public r45.ov2 f43360v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f43361w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f43362x;

    /* renamed from: y, reason: collision with root package name */
    public final int f43363y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f43364z;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k0(r45.ov2 r22) {
        /*
            Method dump skipped, instructions count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.k0.<init>(r45.ov2):void");
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43360v;
    }

    @Override // c61.bc
    public long c() {
        return this.f43385d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return ((obj instanceof cm2.k0) && kotlin.jvm.internal.o.b(((cm2.k0) obj).f43362x, this.f43362x)) ? 0 : -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(cm2.k0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowCouponItem");
        return kotlin.jvm.internal.o.b(this.f43362x, ((cm2.k0) obj).f43362x);
    }

    public final boolean g() {
        return this.H;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f43362x != null ? r0.hashCode() : 0;
    }

    @Override // in5.c
    public int h() {
        return 2;
    }

    public int hashCode() {
        java.lang.String str = this.f43362x;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void i(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (this.D == 1) {
            db5.t7.m(context, i65.a.r(context, com.tencent.mm.R.string.edl));
        } else {
            db5.t7.h(context, i65.a.r(context, com.tencent.mm.R.string.edk));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(java.lang.String r5, int r6, java.lang.Integer r7, int r8) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L11
            int r2 = r5.length()
            if (r2 <= 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r2 != r1) goto L11
            r2 = r1
            goto L12
        L11:
            r2 = r0
        L12:
            if (r2 == 0) goto L16
            r4.I = r5
        L16:
            if (r6 == 0) goto L27
            r45.ov2 r5 = r4.f43360v
            r2 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r5.set(r2, r3)
            if (r6 != r1) goto L25
            r0 = r1
        L25:
            r4.H = r0
        L27:
            if (r7 == 0) goto L3b
            r7.intValue()
            r45.ov2 r5 = r4.f43360v
            int r6 = r7.intValue()
            r7 = 21
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.set(r7, r6)
        L3b:
            if (r8 == 0) goto L48
            r45.ov2 r5 = r4.f43360v
            r6 = 23
            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)
            r5.set(r6, r7)
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cm2.k0.j(java.lang.String, int, java.lang.Integer, int):void");
    }

    public java.lang.String toString() {
        return "ShopWindowCouponItem " + this.f43362x + ' ' + this.f43363y + ' ' + this.B + ' ' + this.A + ' ' + this.f43364z + ' ' + this.f43360v.getInteger(4) + ' ' + this.f43360v.getInteger(3) + ' ' + this.I + ' ' + this.D + ' ' + this.C;
    }
}
