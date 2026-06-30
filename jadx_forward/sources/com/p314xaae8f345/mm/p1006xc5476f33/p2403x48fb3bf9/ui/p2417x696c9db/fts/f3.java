package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes8.dex */
public final class f3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 f265944a;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var) {
        this.f265944a = j3Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (msg.what == 1) {
            mo50303x856b99f0(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.j3 j3Var = this.f265944a;
            z21.e eVar = j3Var.A;
            if (eVar != null) {
                eVar.mo48278xae7a2e7a(true);
            }
            if (msg.arg1 == 99 && com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w2.f266242f == j3Var.f265986c) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74 abstractActivityC19367xd1ae8c74 = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.AbstractActivityC19367xd1ae8c74) j3Var.f265985b.get();
                java.lang.String K9 = abstractActivityC19367xd1ae8c74 != null ? abstractActivityC19367xd1ae8c74.K9() : null;
                if (K9 == null) {
                    K9 = "";
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(K9)) {
                    if (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(j3Var.f265984a)) {
                        android.content.Context context = j3Var.f265984a;
                        db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.azu), com.p314xaae8f345.mm.R.raw.f81332x54357625);
                        com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d = j3Var.f265997n;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21330xc127fb4d);
                        c21330xc127fb4d.setVisibility(8);
                        return;
                    }
                    android.content.Context context2 = j3Var.f265984a;
                    db5.t7.i(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h8t), com.p314xaae8f345.mm.R.raw.f81332x54357625);
                    com.p314xaae8f345.mm.p2633x99f0578a.ui.C21330xc127fb4d c21330xc127fb4d2 = j3Var.f265997n;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c21330xc127fb4d2);
                    c21330xc127fb4d2.setVisibility(8);
                }
            }
        }
    }
}
