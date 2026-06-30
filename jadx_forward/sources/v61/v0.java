package v61;

/* loaded from: classes5.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f515016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v61.w0 f515017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.String str, v61.w0 w0Var) {
        super(0);
        this.f515016d = str;
        this.f515017e = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.database.Cursor B;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 cj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = this.f515016d;
        final java.lang.String str2 = "unavailable_account_tip";
        final java.lang.String X8 = cj6.X8(str);
        if (cj6.Da(X8)) {
            final int i17 = 570425393;
            final int i18 = 570425393;
            B = ot0.c3.l().c("getCursorByFilter", new yz5.a() { // from class: com.tencent.mm.storage.g9$$w5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.Q(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str, str2, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x5
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var.getClass();
                    return g9Var.f275522r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = " + i18) + " ORDER BY createTime DESC", null);
                }
            });
        } else if (cj6.Pb(X8)) {
            B = ot0.z2.f430355a.Q(cj6.f275522r, X8, str, "unavailable_account_tip", 570425393);
        } else {
            B = cj6.f275522r.B(("SELECT * FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND content LIKE '%unavailable_account_tip%' AND type = 570425393") + " ORDER BY createTime DESC", null);
        }
        if (B != null) {
            java.lang.String str3 = this.f515016d;
            v61.w0 w0Var = this.f515017e;
            try {
                if (!B.moveToFirst()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
                    f9Var.j1(2);
                    f9Var.u1(str3);
                    f9Var.r1(4);
                    f9Var.d1(w0Var.wi());
                    f9Var.o1(0L);
                    f9Var.e1(c01.w9.m(str3, c01.id.c() / 1000));
                    f9Var.m124850x7650bebc(570425393);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnAvailableAccountService", "checkOrInsertUnAvailableSysMsg msgId:" + c01.w9.x(f9Var));
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return jz5.f0.f384359a;
    }
}
