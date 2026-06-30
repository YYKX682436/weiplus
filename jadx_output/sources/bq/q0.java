package bq;

/* loaded from: classes10.dex */
public final class q0 extends bq.e {

    /* renamed from: t, reason: collision with root package name */
    public static final bq.p0 f23513t = new bq.p0(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f23514u = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final int f23515o;

    /* renamed from: p, reason: collision with root package name */
    public final int f23516p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Boolean f23517q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f23518r;

    /* renamed from: s, reason: collision with root package name */
    public r45.qk4 f23519s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(int i17, int i18, java.lang.String username, java.lang.Boolean bool) {
        super(null == true ? 1 : 0, 1, null == true ? 1 : 0);
        kotlin.jvm.internal.o.g(username, "username");
        java.lang.Object obj = null;
        this.f23515o = i17;
        this.f23516p = i18;
        this.f23517q = bool;
        this.f23518r = new java.util.LinkedList();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 978;
        r45.m81 m81Var = new r45.m81();
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        bq.p0 p0Var = f23513t;
        m81Var.set(4, java.lang.Integer.valueOf(p0Var.a(i17)));
        if (t()) {
            m81Var.set(10, com.tencent.mm.protobuf.g.b(p0Var.d(i17, i18, username, true)));
            m81Var.set(9, 1);
        } else {
            m81Var.set(2, com.tencent.mm.protobuf.g.b(p0Var.d(i17, i18, username, false)));
            m81Var.set(9, 0);
        }
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f228171a.a(978));
        lVar.f70664a = m81Var;
        lVar.f70665b = new r45.n81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init, scene ");
        sb6.append(i17);
        sb6.append(" type ");
        sb6.append(i18);
        sb6.append(" lastBuf ");
        if (m81Var.getByteString(2) == null) {
            obj = "null";
        } else {
            com.tencent.mm.protobuf.g byteString = m81Var.getByteString(2);
            if (byteString != null) {
                obj = java.lang.Integer.valueOf(byteString.f192156a.length);
            }
        }
        sb6.append(obj);
        sb6.append(", forbidNewMentionMode = ");
        sb6.append(bool);
        com.tencent.mars.xlog.Log.i("Finder.FinderGetMentionListCGI", sb6.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b5  */
    @Override // bq.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s(int r33, int r34, java.lang.String r35, com.tencent.mm.protobuf.f r36, com.tencent.mm.modelbase.m1 r37) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.q0.s(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    public final boolean t() {
        if (kotlin.jvm.internal.o.b(this.f23517q, java.lang.Boolean.TRUE)) {
            return false;
        }
        return f23513t.b();
    }
}
