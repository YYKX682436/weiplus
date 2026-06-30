package b05;

/* loaded from: classes12.dex */
public final class f extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f98514q;

    /* renamed from: r, reason: collision with root package name */
    public tq.d f98515r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f98516s;

    /* renamed from: t, reason: collision with root package name */
    public final b05.e f98517t;

    /* renamed from: u, reason: collision with root package name */
    public final b05.d f98518u;

    public f(int i17) {
        super(21, i17);
        this.f98517t = new b05.e(this);
        this.f98518u = new b05.d(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // u13.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.content.Context r7, u13.e r8, java.lang.Object... r9) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            java.lang.String r7 = "viewHolder"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r7)
            java.lang.String r7 = "extraData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r7)
            int r7 = r9.length
            java.util.Arrays.copyOf(r9, r7)
            p13.y r7 = r6.f98514q
            if (r7 == 0) goto Lc4
            long r7 = r7.f432719d
            java.lang.Class<c00.g4> r9 = c00.g4.class
            i95.m r0 = i95.n0.c(r9)
            c00.g4 r0 = (c00.g4) r0
            c30.f0 r0 = (c30.f0) r0
            r0.m134976x2690a4ac()
            c30.e r0 = r0.f119646d
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L5e
            c30.t r0 = r0.f119642c
            if (r0 == 0) goto L5e
            com.tencent.wcdb.core.Table r3 = r0.f119695a     // Catch: java.lang.Exception -> L44
            com.tencent.wcdb.orm.Field[] r0 = r0.b()     // Catch: java.lang.Exception -> L44
            com.tencent.wcdb.orm.Field r4 = tq.b.f502716c     // Catch: java.lang.Exception -> L44
            com.tencent.wcdb.winq.Expression r7 = r4.eq(r7)     // Catch: java.lang.Exception -> L44
            java.lang.Object r7 = r3.m107139x946de4d9(r0, r7)     // Catch: java.lang.Exception -> L44
            tq.d r7 = (tq.d) r7     // Catch: java.lang.Exception -> L44
            goto L5f
        L44:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "getByLocalId error: "
            r8.<init>(r0)
            java.lang.String r0 = r7.getMessage()
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r3 = "EcsWeShopItemStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r7, r8, r0)
        L5e:
            r7 = r1
        L5f:
            if (r7 != 0) goto L62
            return
        L62:
            java.lang.String r8 = r7.f502730b
            if (r8 != 0) goto L67
            return
        L67:
            java.lang.String r0 = r7.f502731c
            if (r0 != 0) goto L6c
            return
        L6c:
            r6.f98515r = r7
            p13.y r7 = r6.f98514q
            if (r7 == 0) goto L78
            int r7 = r7.f432718c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
        L78:
            r7 = 1
            if (r1 != 0) goto L7c
            goto L85
        L7c:
            int r3 = r1.intValue()
            r4 = 3
            if (r3 != r4) goto L85
            r2 = r7
            goto L94
        L85:
            if (r1 != 0) goto L88
            goto L93
        L88:
            int r1 = r1.intValue()
            r3 = 2
            if (r1 != r3) goto L93
            r5 = r2
            r2 = r7
            r7 = r5
            goto L94
        L93:
            r7 = r2
        L94:
            p13.r r1 = r6.f505295e
            p13.i r7 = p13.i.d(r0, r1, r2, r7)
            p13.j r7 = o13.q.e(r7)
            java.lang.CharSequence r7 = r7.f432638a
            r6.f98516s = r7
            r6.f505304n = r8
            i95.m r7 = i95.n0.c(r9)
            c00.g4 r7 = (c00.g4) r7
            c30.f0 r7 = (c30.f0) r7
            r7.getClass()
            r7.m134976x2690a4ac()
            c30.s r7 = r7.f119648f
            if (r7 == 0) goto Lc4
            ku5.u0 r9 = ku5.t0.f394148d
            c30.q r0 = new c30.q
            r0.<init>(r7, r8)
            java.lang.String r7 = "EcsWeShopInfoUpdater"
            ku5.t0 r9 = (ku5.t0) r9
            r9.h(r0, r7)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b05.f.a(android.content.Context, u13.e, java.lang.Object[]):void");
    }

    @Override // u13.g
    public java.lang.String c() {
        tq.d dVar = this.f98515r;
        java.lang.String str = dVar != null ? dVar.f502730b : null;
        return str == null ? "" : str;
    }

    @Override // u13.g
    public java.lang.String f() {
        tq.d dVar = this.f98515r;
        java.lang.String str = dVar != null ? dVar.f502731c : null;
        return str == null ? "" : str;
    }

    @Override // u13.g
    public int j() {
        p13.y yVar = this.f98514q;
        if (yVar != null) {
            return yVar.f432733r;
        }
        return 0;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f98517t;
    }
}
