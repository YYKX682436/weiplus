package ov4;

/* loaded from: classes8.dex */
public final class e implements nv4.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f430750a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f430751b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f430752c;

    /* renamed from: d, reason: collision with root package name */
    public final int f430753d;

    /* renamed from: e, reason: collision with root package name */
    public final int f430754e;

    /* renamed from: f, reason: collision with root package name */
    public final ov4.f f430755f;

    /* renamed from: g, reason: collision with root package name */
    public final long f430756g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f430757h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f430758i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f430759j;

    /* renamed from: k, reason: collision with root package name */
    public final int f430760k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f430761l;

    /* renamed from: m, reason: collision with root package name */
    public final int f430762m;

    public e(java.lang.String sessionId, java.lang.String searchId, java.lang.String requestId, int i17, int i18, ov4.f actionId, long j17, java.lang.String featureInfo, java.lang.String itemInfo, java.lang.String docInfo, int i19, java.lang.String parentSearchID, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(featureInfo, "featureInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentSearchID, "parentSearchID");
        this.f430750a = sessionId;
        this.f430751b = searchId;
        this.f430752c = requestId;
        this.f430753d = i17;
        this.f430754e = i18;
        this.f430755f = actionId;
        this.f430756g = j17;
        this.f430757h = featureInfo;
        this.f430758i = itemInfo;
        this.f430759j = docInfo;
        this.f430760k = i19;
        this.f430761l = parentSearchID;
        this.f430762m = i27;
    }

    @Override // nv4.h
    public java.lang.String A() {
        return "25147-" + this.f430750a + ',' + this.f430751b + ',' + this.f430752c + ',' + this.f430753d + ',' + this.f430754e + ',' + this.f430755f.f430767d + ',' + this.f430757h + ',' + this.f430758i + ',' + this.f430760k + ',' + this.f430761l + ',' + this.f430762m;
    }

    @Override // nv4.h
    public nv4.h B(nv4.h item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ov4.e eVar = item instanceof ov4.e ? (ov4.e) item : null;
        if (eVar == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("25147 merge ");
        java.lang.String str = this.f430759j;
        sb6.append(str);
        sb6.append(" with ");
        java.lang.String str2 = eVar.f430759j;
        sb6.append(str2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSReportItem25147", sb6.toString());
        java.lang.String docInfo = str + '#' + str2;
        int i17 = this.f430753d;
        int i18 = this.f430754e;
        long j17 = this.f430756g;
        int i19 = this.f430760k;
        int i27 = this.f430762m;
        java.lang.String sessionId = this.f430750a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        java.lang.String searchId = this.f430751b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchId, "searchId");
        java.lang.String requestId = this.f430752c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
        ov4.f actionId = this.f430755f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionId, "actionId");
        java.lang.String featureInfo = this.f430757h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(featureInfo, "featureInfo");
        java.lang.String itemInfo = this.f430758i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemInfo, "itemInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(docInfo, "docInfo");
        java.lang.String parentSearchID = this.f430761l;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentSearchID, "parentSearchID");
        return new ov4.e(sessionId, searchId, requestId, i17, i18, actionId, j17, featureInfo, itemInfo, docInfo, i19, parentSearchID, i27);
    }

    /* renamed from: equals */
    public boolean m157222xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov4.e)) {
            return false;
        }
        ov4.e eVar = (ov4.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430750a, eVar.f430750a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430751b, eVar.f430751b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430752c, eVar.f430752c) && this.f430753d == eVar.f430753d && this.f430754e == eVar.f430754e && this.f430755f == eVar.f430755f && this.f430756g == eVar.f430756g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430757h, eVar.f430757h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430758i, eVar.f430758i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430759j, eVar.f430759j) && this.f430760k == eVar.f430760k && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f430761l, eVar.f430761l) && this.f430762m == eVar.f430762m;
    }

    /* renamed from: hashCode */
    public int m157223x8cdac1b() {
        return (((((((((((((((((((((((this.f430750a.hashCode() * 31) + this.f430751b.hashCode()) * 31) + this.f430752c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430753d)) * 31) + java.lang.Integer.hashCode(this.f430754e)) * 31) + this.f430755f.hashCode()) * 31) + java.lang.Long.hashCode(this.f430756g)) * 31) + this.f430757h.hashCode()) * 31) + this.f430758i.hashCode()) * 31) + this.f430759j.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430760k)) * 31) + this.f430761l.hashCode()) * 31) + java.lang.Integer.hashCode(this.f430762m);
    }

    /* renamed from: toString */
    public java.lang.String m157224x9616526c() {
        return "FTSReportItem25147(sessionId=" + this.f430750a + ", searchId=" + this.f430751b + ", requestId=" + this.f430752c + ", sceneType=" + this.f430753d + ", scene=" + this.f430754e + ", actionId=" + this.f430755f + ", clientTimestamp=" + this.f430756g + ", featureInfo=" + this.f430757h + ", itemInfo=" + this.f430758i + ", docInfo=" + this.f430759j + ", reqBusinessType=" + this.f430760k + ", parentSearchID=" + this.f430761l + ", h5Version=" + this.f430762m + ')';
    }

    @Override // nv4.h
    public void z() {
        java.lang.String str = this.f430751b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f430752c;
        if (z17) {
            str = str2;
        }
        jx3.f.INSTANCE.mo68478xbd3cda5f(25147, this.f430750a + ',' + str + ',' + str2 + ',' + this.f430753d + ',' + this.f430754e + ',' + this.f430755f.f430767d + ',' + this.f430756g + ',' + this.f430757h + ',' + this.f430758i + ',' + this.f430759j + ',' + this.f430760k + ',' + this.f430761l + ',' + this.f430762m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, int r23, ov4.f r24, long r25, java.lang.String r27, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, int r32, int r33, p3321xbce91901.jvm.p3324x21ffc6bd.i r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r5 = r2
            goto Lc
        La:
            r5 = r20
        Lc:
            r1 = r0 & 4
            if (r1 == 0) goto L12
            r6 = r2
            goto L14
        L12:
            r6 = r21
        L14:
            r1 = r0 & 8
            if (r1 == 0) goto L1b
            r1 = 1
            r7 = r1
            goto L1d
        L1b:
            r7 = r22
        L1d:
            r1 = r0 & 64
            if (r1 == 0) goto L29
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            long r3 = java.lang.System.currentTimeMillis()
            r10 = r3
            goto L2b
        L29:
            r10 = r25
        L2b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L31
            r13 = r2
            goto L33
        L31:
            r13 = r28
        L33:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L39
            r14 = r2
            goto L3b
        L39:
            r14 = r29
        L3b:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L42
            r1 = 0
            r15 = r1
            goto L44
        L42:
            r15 = r30
        L44:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L4b
            r16 = r2
            goto L4d
        L4b:
            r16 = r31
        L4d:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L55
            r0 = 2
            r17 = r0
            goto L57
        L55:
            r17 = r32
        L57:
            r3 = r18
            r4 = r19
            r8 = r23
            r9 = r24
            r12 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov4.e.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, ov4.f, long, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }
}
