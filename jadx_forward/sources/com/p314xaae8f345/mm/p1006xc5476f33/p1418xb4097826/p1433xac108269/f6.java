package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class f6 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f183696d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m21.a f183697e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f183698f;

    public f6(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, m21.a aVar, r45.qt2 qt2Var) {
        this.f183696d = abstractActivityC21394xb3d2c0cf;
        this.f183697e = aVar;
        this.f183698f = qt2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        m21.a aVar = this.f183697e;
        if (i18 != -1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Oj(pm0.v.Z(((m21.f) aVar).f404519a.m75945x2fec8307(0)), 2, 2L, "", 0L, this.f183698f);
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>(0);
        }
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(stringArrayListExtra, ";");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f183696d;
        db5.e1.T(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        long Z = pm0.v.Z(((m21.f) aVar).f404519a.m75945x2fec8307(0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
        o3Var.Oj(Z, 2, 1L, c17, stringArrayListExtra.size(), this.f183698f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderShareManager", "[shareAlbumToSnsTimeLine] " + ((m21.f) aVar).f404519a.m75945x2fec8307(1) + " to " + stringArrayListExtra);
    }
}
