package he5;

/* loaded from: classes9.dex */
public class h implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public android.database.Cursor f362464a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362465b;

    /* renamed from: c, reason: collision with root package name */
    public final long f362466c;

    /* renamed from: d, reason: collision with root package name */
    public final int f362467d;

    /* renamed from: e, reason: collision with root package name */
    public final int f362468e;

    public h(java.lang.String str, long j17, int i17, int i18) {
        this.f362465b = str;
        this.f362466c = j17;
        this.f362468e = i18;
        this.f362467d = i17;
    }

    @Override // he5.t
    public int a() {
        return this.f362468e;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s sVar) {
        this.f362464a.moveToFirst();
        while (!this.f362464a.isAfterLast()) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            f9Var.mo9015xbf5d97fd(this.f362464a);
            list.add(f9Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBizDataSource", "ChattingBizDataSource fillItem: %s %s %s %s", f9Var.Q0(), f9Var.G, java.lang.Integer.valueOf(f9Var.A0()), java.lang.Integer.valueOf(f9Var.mo78013xfb85f7b0()));
            this.f362464a.moveToNext();
        }
        java.util.Collections.sort(list, new he5.g(this));
        ((hd5.f) sVar).a();
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.x4 x4Var = (com.p314xaae8f345.mm.p2621x8fb0427b.x4) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni();
        java.lang.String str = this.f362465b;
        long m07 = x4Var.m0(str);
        long j17 = this.f362466c;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        int i17 = this.f362467d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBizDataSource", "[ChattingBizDataSource] talker:%s bizChatId:%s,count:%s totalCount:%s createTime:%s", str, valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f362468e), java.lang.Long.valueOf(m07));
        com.p314xaae8f345.mm.p2621x8fb0427b.v j18 = c01.d9.b().j();
        java.lang.String str2 = "SELECT * FROM " + j18.e(str) + " WHERE " + j18.l(str, j17) + " ORDER BY createTime DESC LIMIT " + i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizChatMessageStorage", "getBizInitCursor talker:%s, bizChatId:%s, limitCount:%s, sql:[%s]", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), str2);
        android.database.Cursor B = j18.d().B(str2, null);
        this.f362464a = B;
        B.moveToFirst();
        oVar.mo133232x338af3();
    }

    @Override // he5.t
    /* renamed from: close */
    public void mo133462x5a5ddf8() {
        this.f362464a.close();
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }
}
