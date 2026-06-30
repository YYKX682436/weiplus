package sc4;

/* loaded from: classes4.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f488089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f488090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f488091f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f488092g;

    public b(byte[] bArr, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720, boolean z17, boolean z18) {
        this.f488089d = bArr;
        this.f488090e = c19807x593d1720;
        this.f488091f = z17;
        this.f488092g = z18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
        byte[] bArr = this.f488089d;
        if (bArr == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
            return;
        }
        try {
            com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720().mo11468x92b714fd(bArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.TimeLineObject");
            c19807x593d1720 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720) mo11468x92b714fd;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsMultiSpecVideoHelper", "error get snsinfo timeline!");
            c19807x593d1720 = null;
        }
        if (c19807x593d1720 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
            return;
        }
        int i17 = c19807x593d1720.f39014x86965dde.f451370e;
        sc4.c cVar = sc4.c.f488093a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202 = this.f488090e;
        if (i17 == 15 && c19807x593d17202.f39014x86965dde.f451370e == 15 && this.f488091f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear video " + c19807x593d1720.Id);
            java.util.LinkedList MediaObjList = c19807x593d1720.f39014x86965dde.f451373h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaObjList, "MediaObjList");
            r45.jj4 jj4Var = (r45.jj4) kz5.n0.Z(MediaObjList);
            java.util.LinkedList MediaObjList2 = c19807x593d17202.f39014x86965dde.f451373h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaObjList2, "MediaObjList");
            sc4.c.a(cVar, jj4Var, (r45.jj4) kz5.n0.Z(MediaObjList2));
        }
        if (c19807x593d1720.f39014x86965dde.f451370e == 54 && c19807x593d17202.f39014x86965dde.f451370e == 54 && this.f488092g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear LivePhoto " + c19807x593d1720.Id);
            int size = c19807x593d1720.f39014x86965dde.f451373h.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.jj4 jj4Var2 = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(i18);
                java.util.LinkedList MediaObjList3 = c19807x593d17202.f39014x86965dde.f451373h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaObjList3, "MediaObjList");
                r45.jj4 jj4Var3 = (r45.jj4) kz5.n0.a0(MediaObjList3, i18);
                if (jj4Var2.X != null) {
                    if ((jj4Var3 != null ? jj4Var3.X : null) != null) {
                        sc4.c.a(cVar, jj4Var2, jj4Var3);
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper$checkClearOldVideo$1");
    }
}
