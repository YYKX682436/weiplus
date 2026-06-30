package nv;

/* renamed from: nv.b2$$a */
/* loaded from: classes9.dex */
public final /* synthetic */ class C29226x57c45d1 implements java.util.function.Consumer {
    @Override // java.util.function.Consumer
    public final void accept(java.lang.Object obj) {
        sn1.j jVar = (sn1.j) obj;
        final bw5.s10 s10Var = (bw5.s10) jVar.f491564a;
        int i17 = jVar.f491565b;
        if (i17 == 0 && jVar.f491566c == 0 && s10Var != null) {
            yn1.k4.d(true);
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nv.b2$$c
                @Override // java.lang.Runnable
                public final void run() {
                    android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                    if (m78443x9cf0d20b == null) {
                        m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                    ((yn1.h4) wVar).bj(m78443x9cf0d20b, bw5.s10.this, mv.a.f413006i);
                }
            });
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCore", "getConnectInfoAsync fail, errType:%s, errCode:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(jVar.f491566c));
            yn1.k4.d(false);
            final bw5.zi0 zi0Var = (jVar.f491565b != 4 || jVar.f491566c == 0) ? bw5.zi0.ERROR_CODE_NETWORK_DISCONNECT : bw5.zi0.ERROR_CODE_ACCOUNT_MISMATCH;
            ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: nv.b2$$b
                @Override // java.lang.Runnable
                public final void run() {
                    android.content.Context m78443x9cf0d20b = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b();
                    if (m78443x9cf0d20b == null) {
                        m78443x9cf0d20b = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    }
                    mv.w wVar = (mv.w) i95.n0.c(mv.w.class);
                    ((yn1.h4) wVar).ij(m78443x9cf0d20b, bw5.zi0.this, mv.a.f413006i);
                }
            });
        }
    }
}
