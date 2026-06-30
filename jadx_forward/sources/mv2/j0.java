package mv2;

/* loaded from: classes2.dex */
public final class j0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.l0 f413119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f413120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f413121f;

    public j0(mv2.l0 l0Var, java.util.List list, dn.h hVar) {
        this.f413119d = l0Var;
        this.f413120e = list;
        this.f413121f = hVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        gm0.j1.d().q(3870, this);
        mv2.l0 l0Var = this.f413119d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l0Var.f413136h, "errType " + i17 + " , errCode " + i18 + ", errMsg " + str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderOplog");
        db2.v5 v5Var = (db2.v5) m1Var;
        java.util.List K = v5Var.K();
        com.p314xaae8f345.mm.p944x882e457a.o oVar = v5Var.f309731h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(oVar);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152243a.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogRequest");
        java.util.LinkedList m75941xfb821914 = ((r45.rn2) fVar).m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getCmdList(...)");
        if (i17 == 0 && i18 == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f413120e, m75941xfb821914)) {
            java.util.Iterator it = K.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                r45.ix0 ix0Var = (r45.ix0) it.next();
                if (ix0Var.m75939xb282bd08(0) == 1 && ix0Var.m75939xb282bd08(1) == 0) {
                    break;
                } else {
                    i19++;
                }
            }
            java.lang.String str2 = l0Var.f413136h;
            dn.h hVar = this.f413121f;
            if (i19 != -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update coverImg succ");
                java.lang.String field_fileUrl = hVar.f69524x419c440e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl, "field_fileUrl");
                mv2.l0.e(l0Var, field_fileUrl, true);
                l0Var.b(fp0.u.f346823f);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "update coverImg failed");
            java.lang.String field_fileUrl2 = hVar.f69524x419c440e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fileUrl2, "field_fileUrl");
            mv2.l0.e(l0Var, field_fileUrl2, false);
            l0Var.b(fp0.u.f346824g);
        }
    }
}
