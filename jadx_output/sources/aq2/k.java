package aq2;

/* loaded from: classes2.dex */
public final class k extends by1.f {

    /* renamed from: l, reason: collision with root package name */
    public static final aq2.i f13140l = new aq2.i(null);

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f13141e;

    /* renamed from: f, reason: collision with root package name */
    public int f13142f;

    /* renamed from: g, reason: collision with root package name */
    public int f13143g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13144h;

    /* renamed from: i, reason: collision with root package name */
    public int f13145i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13146j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f13147k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String key) {
        super(key);
        kotlin.jvm.internal.o.g(key, "key");
        this.f13141e = "NearLiveStreamCache@" + hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // by1.f, by1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.k.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.f, by1.d
    public void c(java.lang.Object obj, long j17) {
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCache, key=");
        java.lang.String key = (java.lang.String) this.f36356a;
        sb6.append(key);
        sb6.append(", errType: ");
        sb6.append(result.f70615a);
        sb6.append(" errCode: ");
        sb6.append(result.f70616b);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f13141e;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (result.f70615a == 0 && result.f70616b == 0) {
            this.f36361b = result;
            this.f36362c = j17;
            r45.dk2 dk2Var = (r45.dk2) result.f70618d;
            if (dk2Var != null) {
                sp2.b bVar = sp2.b.f410972a;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                kotlin.jvm.internal.o.g(key, "key");
                java.util.HashMap hashMap = sp2.b.f410974c;
                java.lang.Object obj2 = hashMap.get(key);
                if (obj2 == null) {
                    obj2 = new sp2.a();
                    hashMap.put(key, obj2);
                }
                ((sp2.a) obj2).f410954a = currentTimeMillis;
                int h17 = h(dk2Var);
                sp2.b.f410975d = h17 * 1000;
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("saveCache: key=");
                sb8.append(key);
                sb8.append(", prefetchInterval = ");
                sb8.append(sp2.b.f410975d);
                sb8.append("  preload_feed_effective_time: ");
                r45.wo1 wo1Var = (r45.wo1) dk2Var.getCustom(14);
                sb8.append(wo1Var != null ? java.lang.Integer.valueOf(wo1Var.getInteger(2)) : null);
                sb8.append("  prefech_min_interval: ");
                sb8.append(dk2Var.getInteger(3));
                sb8.append(" validTime: ");
                sb8.append(h17);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
            }
        }
    }

    @Override // by1.f
    public boolean d() {
        r45.dk2 dk2Var;
        r45.dk2 dk2Var2;
        java.lang.Object obj = this.f36361b;
        if (obj == null) {
            return false;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int h17 = (fVar == null || (dk2Var2 = (r45.dk2) fVar.f70618d) == null) ? 0 : h(dk2Var2);
        sp2.b bVar = sp2.b.f410972a;
        java.lang.Object obj2 = this.f36356a;
        long a17 = bVar.a((java.lang.String) obj2);
        boolean z17 = this.f13147k || ((long) (h17 * 1000)) + a17 > java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCacheAvailable: key=");
        sb6.append((java.lang.String) obj2);
        sb6.append(", result=");
        sb6.append(z17);
        sb6.append(", doNotCheckTime=");
        sb6.append(this.f13147k);
        sb6.append(" prefech_min_interval=");
        com.tencent.mm.modelbase.f fVar2 = (com.tencent.mm.modelbase.f) this.f36361b;
        sb6.append((fVar2 == null || (dk2Var = (r45.dk2) fVar2.f70618d) == null) ? null : java.lang.Integer.valueOf(dk2Var.getInteger(3)));
        sb6.append(", lastRespSetTime=");
        sb6.append(a17);
        sb6.append(" validTime=");
        sb6.append(h17);
        sb6.append(", isRedDotRequest=");
        sb6.append(this.f13146j);
        sb6.append(", offestTime=");
        sb6.append(java.lang.System.currentTimeMillis() - a17);
        com.tencent.mars.xlog.Log.i(this.f13141e, sb6.toString());
        return z17;
    }

    public void g() {
        this.f36361b = null;
        this.f36362c = 0L;
        com.tencent.mars.xlog.Log.i(this.f13141e, "clearCache");
        this.f13142f = 0;
        this.f13143g = 0;
        this.f13144h = false;
        this.f13145i = 0;
        this.f13147k = false;
        com.tencent.mars.xlog.Log.i("NearLiveKtvCache", "clearKtvCache: 清理KTV缓存");
        by1.d b17 = by1.c.f36353b.a().b("nearby_live_ktv_cache", new aq2.h("nearby_live_ktv_cache", null));
        aq2.h hVar = b17 instanceof aq2.h ? (aq2.h) b17 : null;
        if (hVar == null) {
            hVar = new aq2.h("nearby_live_ktv_cache", null);
        }
        hVar.f36361b = null;
        hVar.f36362c = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(r45.dk2 r7) {
        /*
            r6 = this;
            boolean r0 = r6.j()
            r1 = 3
            if (r0 != 0) goto Lc
            int r7 = r7.getInteger(r1)
            return r7
        Lc:
            boolean r0 = r6.f13146j
            r2 = 0
            if (r0 == 0) goto L61
            r0 = 14
            com.tencent.mm.protobuf.f r0 = r7.getCustom(r0)
            r45.wo1 r0 = (r45.wo1) r0
            r3 = 0
            r4 = 2
            if (r0 == 0) goto L37
            int r0 = r0.getInteger(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r5 = r0.intValue()
            if (r5 <= 0) goto L2c
            r2 = 1
        L2c:
            if (r2 == 0) goto L2f
            goto L30
        L2f:
            r0 = r3
        L30:
            if (r0 == 0) goto L37
            int r7 = r0.intValue()
            goto L76
        L37:
            java.lang.Object r0 = r6.f36361b
            com.tencent.mm.modelbase.f r0 = (com.tencent.mm.modelbase.f) r0
            if (r0 == 0) goto L4b
            com.tencent.mm.modelbase.i r0 = r0.f70620f
            boolean r2 = r0 instanceof aq2.b
            if (r2 == 0) goto L46
            r3 = r0
            aq2.b r3 = (aq2.b) r3
        L46:
            if (r3 == 0) goto L4b
            java.lang.String r0 = r3.f13121v
            goto L4d
        L4b:
            java.lang.String r0 = ""
        L4d:
            java.util.HashMap r2 = cq2.q.f221429b
            java.lang.Object r0 = r2.get(r0)
            r45.wo1 r0 = (r45.wo1) r0
            if (r0 == 0) goto L5c
            int r7 = r0.getInteger(r4)
            goto L76
        L5c:
            int r7 = r7.getInteger(r1)
            goto L76
        L61:
            r0 = 16
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r0)
            r45.bk2 r7 = (r45.bk2) r7
            if (r7 == 0) goto L70
            r0 = 7
            int r2 = r7.getInteger(r0)
        L70:
            if (r2 > 0) goto L75
            r7 = 300(0x12c, float:4.2E-43)
            goto L76
        L75:
            r7 = r2
        L76:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.k.h(r45.dk2):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i() {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.k.i():boolean");
    }

    public final boolean j() {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) this.f36361b;
        if (fVar == null) {
            return false;
        }
        com.tencent.mm.modelbase.i iVar = fVar.f70620f;
        aq2.b bVar = iVar instanceof aq2.b ? (aq2.b) iVar : null;
        if (bVar == null) {
            return false;
        }
        int i17 = bVar.f13119t.f13102a;
        return i17 == 10 || i17 == 9;
    }

    @Override // by1.f, by1.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.modelbase.f a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f13141e, "removeCache: key=" + ((java.lang.String) this.f36356a) + ", needRecycle=" + z17);
        return (com.tencent.mm.modelbase.f) super.a(z17);
    }
}
