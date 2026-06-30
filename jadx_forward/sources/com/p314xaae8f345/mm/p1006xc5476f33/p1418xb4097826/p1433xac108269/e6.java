package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class e6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.f f183656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183657e;

    public e6(zy2.f fVar, r45.qt2 qt2Var) {
        this.f183656d = fVar;
        this.f183657e = qt2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        zy2.f fVar = this.f183656d;
        if (i18 != -1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Oj(pm0.v.Z(fVar.f558915b.m75945x2fec8307(0)), 3, 2L, "", 0L, this.f183657e);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ";");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long Z = pm0.v.Z(fVar.f558915b.m75945x2fec8307(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        o3Var.Oj(Z, 3, 1L, c17, stringArrayListExtra.size(), this.f183657e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "[shareAlbumToChat] " + fVar.f558915b.m75945x2fec8307(1) + " to " + stringArrayListExtra);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.C16508x1e702dd3.class)).Ai().h(stringArrayListExtra);
    }
}
