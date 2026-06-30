package ov4;

/* loaded from: classes8.dex */
public final class c implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430724a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430725b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f430726c;

    /* renamed from: d, reason: collision with root package name */
    public final long f430727d;

    /* renamed from: e, reason: collision with root package name */
    public final ov4.d f430728e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f430729f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f430730g;

    /* renamed from: h, reason: collision with root package name */
    public final int f430731h;

    /* renamed from: i, reason: collision with root package name */
    public final int f430732i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f430733j;

    /* renamed from: k, reason: collision with root package name */
    public final int f430734k;

    /* renamed from: l, reason: collision with root package name */
    public final int f430735l;

    /* renamed from: m, reason: collision with root package name */
    public final int f430736m;

    /* renamed from: n, reason: collision with root package name */
    public final int f430737n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f430738o;

    public c(java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, long j17, ov4.d actionId, java.lang.String itemInfo, java.lang.String docInfo, int i17, int i18, java.lang.String reason, int i19, int i27, int i28, int i29, java.lang.String extInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f430724a = sessionId;
        this.f430725b = searchId;
        this.f430726c = requestId;
        this.f430727d = j17;
        this.f430728e = actionId;
        this.f430729f = itemInfo;
        this.f430730g = docInfo;
        this.f430731h = i17;
        this.f430732i = i18;
        this.f430733j = reason;
        this.f430734k = i19;
        this.f430735l = i27;
        this.f430736m = i28;
        this.f430737n = i29;
        this.f430738o = extInfo;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "25118-" + this.f430724a + ',' + this.f430725b + ',' + this.f430726c + ',' + this.f430728e.f430749d + ',' + this.f430729f + ',' + this.f430731h + ',' + this.f430732i + ',' + this.f430733j + ',' + this.f430734k + ',' + this.f430735l + ',' + this.f430736m + ',' + this.f430737n + ',' + this.f430738o;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ov4.c cVar = item instanceof ov4.c ? (ov4.c) item : null;
        if (cVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("25118 merge ");
        java.lang.String str = this.f430730g;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = cVar.f430730g;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSReportItem25118", sb6.toString());
        java.lang.String docInfo = str + '#' + str2;
        long j17 = this.f430727d;
        int i17 = this.f430731h;
        int i18 = this.f430732i;
        int i19 = this.f430734k;
        int i27 = this.f430735l;
        int i28 = this.f430736m;
        int i29 = this.f430737n;
        java.lang.String sessionId = this.f430724a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.lang.String searchId = this.f430725b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        java.lang.String requestId = this.f430726c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        ov4.d actionId = this.f430728e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        java.lang.String itemInfo = this.f430729f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        java.lang.String reason = this.f430733j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.lang.String extInfo = this.f430738o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        return new ov4.c(sessionId, searchId, requestId, j17, actionId, itemInfo, docInfo, i17, i18, reason, i19, i27, i28, i29, extInfo);
    }

    /* renamed from: equals */
    public boolean m157216xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.c)) {
            return false;
        }
        ov4.c cVar = (ov4.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430724a, cVar.f430724a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430725b, cVar.f430725b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430726c, cVar.f430726c) && this.f430727d == cVar.f430727d && this.f430728e == cVar.f430728e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430729f, cVar.f430729f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430730g, cVar.f430730g) && this.f430731h == cVar.f430731h && this.f430732i == cVar.f430732i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430733j, cVar.f430733j) && this.f430734k == cVar.f430734k && this.f430735l == cVar.f430735l && this.f430736m == cVar.f430736m && this.f430737n == cVar.f430737n && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430738o, cVar.f430738o);
    }

    /* renamed from: hashCode */
    public int m157217x8cdac1b() {
        return (((((((((((((((((((((((((((this.f430724a.hashCode() * 31) + this.f430725b.hashCode()) * 31) + this.f430726c.hashCode()) * 31) + java.lang.Long.hashCode(this.f430727d)) * 31) + this.f430728e.hashCode()) * 31) + this.f430729f.hashCode()) * 31) + this.f430730g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430731h)) * 31) + java.lang.Integer.hashCode(this.f430732i)) * 31) + this.f430733j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430734k)) * 31) + java.lang.Integer.hashCode(this.f430735l)) * 31) + java.lang.Integer.hashCode(this.f430736m)) * 31) + java.lang.Integer.hashCode(this.f430737n)) * 31) + this.f430738o.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m157218x9616526c() {
        return "FTSReportItem25118(sessionId=" + this.f430724a + ", searchId=" + this.f430725b + ", requestId=" + this.f430726c + ", timestampMs=" + this.f430727d + ", actionId=" + this.f430728e + ", itemInfo=" + this.f430729f + ", docInfo=" + this.f430730g + ", isDisplay=" + this.f430731h + ", isWebViewRealShow=" + this.f430732i + ", reason=" + this.f430733j + ", h5Version=" + this.f430734k + ", scene=" + this.f430735l + ", actionType=" + this.f430736m + ", businessType=" + this.f430737n + ", extInfo=" + this.f430738o + ')';
    }

    @Override // nv4.h
    public void z() {
        java.lang.String str = this.f430725b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f430726c;
        if (z17) {
            str = str2;
        }
        jx3.f.INSTANCE.mo68478xbd3cda5f(25118, this.f430724a + ',' + str + ',' + str2 + ',' + this.f430727d + ',' + this.f430728e.f430749d + ',' + this.f430729f + ',' + this.f430730g + ',' + this.f430731h + ',' + this.f430732i + ',' + this.f430733j + ',' + this.f430734k + ',' + this.f430735l + ',' + this.f430736m + ',' + this.f430737n + ',' + fp.s0.b(this.f430738o, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(java.lang.String r21, java.lang.String r22, java.lang.String r23, long r24, ov4.d r26, java.lang.String r27, java.lang.String r28, int r29, int r30, java.lang.String r31, int r32, int r33, int r34, int r35, java.lang.String r36, int r37, p3321xbce91901.jvm.p3324x21ffc6bd.i r38) {
        /*
            r20 = this;
            r0 = r37
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r22
        Lc:
            r1 = r0 & 8
            if (r1 == 0) goto L18
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r3 = java.lang.System.currentTimeMillis()
            r7 = r3
            goto L1a
        L18:
            r7 = r24
        L1a:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 1
            if (r1 == 0) goto L21
            r12 = r3
            goto L23
        L21:
            r12 = r29
        L23:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L29
            r13 = r3
            goto L2b
        L29:
            r13 = r30
        L2b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L31
            r14 = r2
            goto L33
        L31:
            r14 = r31
        L33:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L3a
            r1 = 2
            r15 = r1
            goto L3c
        L3a:
            r15 = r32
        L3c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L44
            r1 = 0
            r17 = r1
            goto L46
        L44:
            r17 = r34
        L46:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L4d
            r19 = r2
            goto L4f
        L4d:
            r19 = r36
        L4f:
            r3 = r20
            r4 = r21
            r6 = r23
            r9 = r26
            r10 = r27
            r11 = r28
            r16 = r33
            r18 = r35
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov4.c.<init>(java.lang.String, java.lang.String, java.lang.String, long, ov4.d, java.lang.String, java.lang.String, int, int, java.lang.String, int, int, int, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
