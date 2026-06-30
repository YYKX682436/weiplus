package a10;

/* loaded from: classes8.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f493e;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f494d;

    static {
        java.lang.String createSQLs = l75.n0.getCreateSQLs(a10.a.f486x, "EcsKfProductCardCache");
        kotlin.jvm.internal.o.f(createSQLs, "getCreateSQLs(...)");
        f493e = new java.lang.String[]{createSQLs};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, a10.a.f486x, "EcsKfProductCardCache", null);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = a10.a.f486x;
        this.f494d = db6;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List D0(java.lang.String r11, int r12) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto Ld
            int r2 = r11.length()
            if (r2 != 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 == 0) goto L13
            kz5.p0 r11 = kz5.p0.f313996d
            return r11
        L13:
            p75.n0 r2 = dm.q2.f239367h
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            p75.d r5 = dm.q2.f239368i
            r2.add(r5)
            p75.d r5 = dm.q2.f239369m
            r2.add(r5)
            p75.d r5 = dm.q2.f239370n
            r2.add(r5)
            p75.d r6 = dm.q2.f239371o
            p75.m0 r6 = r6.j(r11)
            p75.s r5 = r5.u()
            r3.add(r5)
            if (r12 <= 0) goto L48
            p75.j0 r5 = new p75.j0
            r5.<init>(r12, r1)
            goto L49
        L48:
            r5 = 0
        L49:
            p75.n0 r7 = dm.q2.f239367h
            p75.i0 r2 = r7.g(r2)
            r2.f352657d = r6
            r2.d(r3)
            r2.b(r4)
            if (r5 == 0) goto L60
            int r3 = r5.f352667a
            int r4 = r5.f352668b
            r2.c(r3, r4)
        L60:
            p75.l0 r2 = r2.a()
            l75.k0 r3 = r10.f494d
            java.lang.Class<a10.a> r4 = a10.a.class
            java.util.List r2 = r2.k(r3, r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L75:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La3
            java.lang.Object r4 = r2.next()
            r5 = r4
            a10.a r5 = (a10.a) r5
            long r6 = r5.field_msgSvrId
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L9c
            java.lang.String r5 = r5.field_cachedXml
            if (r5 == 0) goto L97
            int r5 = r5.length()
            if (r5 != 0) goto L95
            goto L97
        L95:
            r5 = r1
            goto L98
        L97:
            r5 = r0
        L98:
            if (r5 != 0) goto L9c
            r5 = r0
            goto L9d
        L9c:
            r5 = r1
        L9d:
            if (r5 == 0) goto L75
            r3.add(r4)
            goto L75
        La3:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            int r0 = r3.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r0}
            java.lang.String r12 = "MicroMsg.EcsKfProductCardStorage"
            java.lang.String r0 = "queryByTalker talker=%s limit=%d size=%d"
            com.tencent.mars.xlog.Log.i(r12, r0, r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a10.f.D0(java.lang.String, int):java.util.List");
    }

    public final int J0(java.lang.String str, java.util.List msgSvrIds) {
        kotlin.jvm.internal.o.g(msgSvrIds, "msgSvrIds");
        int i17 = 0;
        if (str == null || str.length() == 0) {
            return -1;
        }
        if (msgSvrIds.isEmpty()) {
            return 0;
        }
        int i18 = 0;
        for (java.lang.Object obj : kz5.n0.N(msgSvrIds, 500)) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.List list = (java.util.List) obj;
            p75.n0 n0Var = dm.q2.f239367h;
            n0Var.getClass();
            p75.m c17 = dm.q2.f239371o.j(str).c(dm.q2.f239368i.k(list));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            int f17 = new p75.i(n0Var.b(), c17.b(), c17.e()).f(this.f494d);
            if (f17 > 0) {
                i17 += f17;
            } else if (f17 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EcsKfProductCardStorage", "removeBatch chunk[%d] fail affected=%d talker=%s size=%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(f17), str, java.lang.Integer.valueOf(list.size()));
            }
            i18 = i19;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardStorage", "removeBatch talker=%s ids=%d affected=%d", str, java.lang.Integer.valueOf(msgSvrIds.size()), java.lang.Integer.valueOf(i17));
        return i17;
    }

    public final int L0(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        p75.n0 n0Var = dm.q2.f239367h;
        p75.m0 j17 = dm.q2.f239371o.j(str);
        p75.n0 n0Var2 = dm.q2.f239367h;
        n0Var2.getClass();
        if (n0Var2 instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        java.lang.String table = n0Var2.b();
        java.lang.String b17 = j17.b();
        java.lang.String[] e17 = j17.e();
        kotlin.jvm.internal.o.g(table, "table");
        l75.k0 k0Var = this.f494d;
        int delete = k0Var != null ? k0Var.delete(table, b17, e17) : -1;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardStorage", "removeByTalker talker=%s affected=%d", str, java.lang.Integer.valueOf(delete));
        return delete;
    }

    public final boolean y0(long j17, java.lang.String str, long j18, java.lang.String str2) {
        if (j17 <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardStorage", "put fail: msgSvrId invalid");
            return false;
        }
        boolean z17 = true;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsKfProductCardStorage", "put fail: cachedXml empty, msgSvrId=%d", java.lang.Long.valueOf(j17));
            return false;
        }
        if (str2 != null && str2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EcsKfProductCardStorage", "put fail: empty talker — refusing to write orphan record, msgSvrId=%d", java.lang.Long.valueOf(j17));
            return false;
        }
        a10.a aVar = new a10.a();
        aVar.field_msgSvrId = j17;
        aVar.field_cachedXml = str;
        aVar.field_updateTime = j18;
        aVar.field_talker = str2;
        boolean replace = replace(aVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsKfProductCardStorage", "put msgSvrId=%d talker=%s updateTime=%d ret=%s", java.lang.Long.valueOf(j17), str2, java.lang.Long.valueOf(j18), java.lang.Boolean.valueOf(replace));
        return replace;
    }

    public final a10.a z0(long j17, java.lang.String str) {
        if (j17 <= 0) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        p75.n0 n0Var = dm.q2.f239367h;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = dm.q2.f239368i.i(java.lang.Long.valueOf(j17)).c(dm.q2.f239371o.j(str));
        p75.i0 g17 = dm.q2.f239367h.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return (a10.a) g17.a().o(this.f494d, a10.a.class);
    }
}
