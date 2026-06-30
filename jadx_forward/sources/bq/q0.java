package bq;

/* loaded from: classes10.dex */
public final class q0 extends bq.e {

    /* renamed from: t, reason: collision with root package name */
    public static final bq.p0 f105046t = new bq.p0(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.HashMap f105047u = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public final int f105048o;

    /* renamed from: p, reason: collision with root package name */
    public final int f105049p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Boolean f105050q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f105051r;

    /* renamed from: s, reason: collision with root package name */
    public r45.qk4 f105052s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q0(int i17, int i18, java.lang.String username, java.lang.Boolean bool) {
        super(null == true ? 1 : 0, 1, null == true ? 1 : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.Object obj = null;
        this.f105048o = i17;
        this.f105049p = i18;
        this.f105050q = bool;
        this.f105051r = new java.util.LinkedList();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 978;
        r45.m81 m81Var = new r45.m81();
        m81Var.set(6, java.lang.Integer.valueOf(i18));
        bq.p0 p0Var = f105046t;
        m81Var.set(4, java.lang.Integer.valueOf(p0Var.a(i17)));
        if (t()) {
            m81Var.set(10, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(p0Var.d(i17, i18, username, true)));
            m81Var.set(9, 1);
        } else {
            m81Var.set(2, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(p0Var.d(i17, i18, username, false)));
            m81Var.set(9, 0);
        }
        m81Var.set(3, username);
        m81Var.set(5, db2.t4.f309704a.a(978));
        lVar.f152197a = m81Var;
        lVar.f152198b = new r45.n81();
        lVar.f152199c = "/cgi-bin/micromsg-bin/findergetmentionlist";
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init, scene ");
        sb6.append(i17);
        sb6.append(" type ");
        sb6.append(i18);
        sb6.append(" lastBuf ");
        if (m81Var.m75934xbce7f2f(2) == null) {
            obj = "null";
        } else {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = m81Var.m75934xbce7f2f(2);
            if (m75934xbce7f2f != null) {
                obj = java.lang.Integer.valueOf(m75934xbce7f2f.f273689a.length);
            }
        }
        sb6.append(obj);
        sb6.append(", forbidNewMentionMode = ");
        sb6.append(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGetMentionListCGI", sb6.toString());
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
    public void s(int r33, int r34, java.lang.String r35, com.p314xaae8f345.mm.p2495xc50a8b8b.f r36, com.p314xaae8f345.mm.p944x882e457a.m1 r37) {
        /*
            Method dump skipped, instructions count: 1352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bq.q0.s(int, int, java.lang.String, com.tencent.mm.protobuf.f, com.tencent.mm.modelbase.m1):void");
    }

    public final boolean t() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f105050q, java.lang.Boolean.TRUE)) {
            return false;
        }
        return f105046t.b();
    }
}
