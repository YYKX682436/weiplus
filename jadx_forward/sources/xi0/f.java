package xi0;

/* loaded from: classes4.dex */
public final class f implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f536215d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f536216e;

    /* renamed from: f, reason: collision with root package name */
    public long f536217f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f536218g;

    public f(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f536215d = username;
        this.f536216e = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(username, c01.z1.r());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.q0 a(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 r13) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xi0.f.a(com.tencent.mm.plugin.sns.storage.SnsInfo):com.tencent.mm.flutter.plugin.proto.q0");
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var != null && m1Var.mo808xfb85f7b0() == 212) {
            gm0.j1.n().f354821b.q(212, this);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "on snsUserPage sceneEnd, errType:" + i17 + ", errCode:" + i18);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.f2 Fj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj();
            java.lang.String str2 = this.f536215d;
            boolean z17 = this.f536216e;
            Fj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            android.database.Cursor K1 = Fj.K1(true, str2, 0, z17, "", (int) ((currentTimeMillis - this.f536217f) / 1000.0d), (int) (currentTimeMillis / 1000));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCursorByUserName", "com.tencent.mm.plugin.sns.storage.SnsInfoStorage");
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e eVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.e();
            eVar.f149492e = new java.util.LinkedList();
            try {
                if (!K1.moveToFirst()) {
                    yz5.l lVar = this.f536218g;
                    if (lVar != null) {
                        lVar.mo146xb9724478(eVar);
                    }
                    vz5.b.a(K1, null);
                }
                do {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226();
                    c17933xe8d1b226.mo9015xbf5d97fd(K1);
                    com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.q0 a17 = a(c17933xe8d1b226);
                    if (a17 != null) {
                        eVar.f149492e.add(a17);
                    }
                } while (K1.moveToNext());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsDataSource", "final dataList size:" + eVar.f149492e.size());
                yz5.l lVar2 = this.f536218g;
                if (lVar2 != null) {
                    lVar2.mo146xb9724478(eVar);
                }
                vz5.b.a(K1, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(K1, th6);
                    throw th7;
                }
            }
        }
    }
}
