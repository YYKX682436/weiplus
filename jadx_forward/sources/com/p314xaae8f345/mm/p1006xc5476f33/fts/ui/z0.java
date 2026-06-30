package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public class z0 implements z21.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 f219919a;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78) {
        this.f219919a = abstractActivityC15595x3a75f78;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        if (strArr == null || strArr.length <= 0 || lj.f.f(strArr[0])) {
            return;
        }
        java.lang.String str = strArr[0];
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219919a;
        abstractActivityC15595x3a75f78.Y = str;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.U6(abstractActivityC15595x3a75f78);
        abstractActivityC15595x3a75f78.f219470y0.t(abstractActivityC15595x3a75f78.Y, k23.r2.f385217f);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onRecognize Finish");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219919a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.U6(abstractActivityC15595x3a75f78);
        abstractActivityC15595x3a75f78.f219470y0.t(abstractActivityC15595x3a75f78.Y, k23.r2.f385217f);
        abstractActivityC15595x3a75f78.Y = "";
    }

    @Override // z21.b
    public void e(final int i17, final int i18, final int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78.U6(this.f219919a);
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable(i17, i18, i19) { // from class: com.tencent.mm.plugin.fts.ui.z0$$a

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f219921e;

            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.z0.this.f219919a;
                abstractActivityC15595x3a75f78.f219470y0.t(abstractActivityC15595x3a75f78.Y, k23.r2.f385217f);
                abstractActivityC15595x3a75f78.h7();
                if (this.f219921e == 12) {
                    abstractActivityC15595x3a75f78.q7(abstractActivityC15595x3a75f78.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fh9));
                } else {
                    abstractActivityC15595x3a75f78.q7(abstractActivityC15595x3a75f78.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fh_));
                }
                db5.d5 d5Var = abstractActivityC15595x3a75f78.f219453m;
                if (d5Var != null && d5Var.isShowing()) {
                    abstractActivityC15595x3a75f78.f219453m.dismiss();
                }
                abstractActivityC15595x3a75f78.n7(8);
            }
        });
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15595x3a75f78 abstractActivityC15595x3a75f78 = this.f219919a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSBaseVoiceSearchUI", "onRecordFin() onRecordFin currentState = %s", abstractActivityC15595x3a75f78.Z);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = abstractActivityC15595x3a75f78.f219473z1;
        if (b4Var != null) {
            b4Var.d();
        }
    }
}
