package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public class r5 extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.q5 f135282a;

    public r5(com.p314xaae8f345.mm.app.q5 q5Var) {
        this.f135282a = q5Var;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onEnterForeground */
    public void mo8896x832bee5c() {
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        final java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.r5$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.app.q5 q5Var = com.p314xaae8f345.mm.app.r5.this.f135282a;
                final java.lang.String str3 = str2;
                q5Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcForegroundDelegate", "onProcessForeground");
                q5Var.f135271a = true;
                synchronized (q5Var.f135272b) {
                    for (com.p314xaae8f345.mm.app.s5 s5Var : q5Var.f135272b) {
                        if (s5Var != null) {
                            s5Var.Jb(str3);
                        }
                    }
                }
                fs.g.b(com.p314xaae8f345.mm.app.t5.class, new fs.o() { // from class: com.tencent.mm.app.q5$$a
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        ((z33.l) ((com.p314xaae8f345.mm.app.t5) nVar)).getClass();
                        java.lang.String str4 = str3;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameChatroomProcListener", "procForegroundDelegate, onProcessForeground(%s)", str4);
                        if (s33.n.f484064c != null) {
                            return false;
                        }
                        s33.n.f484064c = str4;
                        return false;
                    }
                });
            }
        });
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.h
    /* renamed from: onExitForeground */
    public void mo8897xa55158c0() {
        java.lang.String str = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134252a;
        final java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134268q;
        ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.r5$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.app.q5 q5Var = com.p314xaae8f345.mm.app.r5.this.f135282a;
                java.lang.String str3 = str2;
                q5Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProcForegroundDelegate", "onProcessBackground");
                q5Var.f135271a = false;
                synchronized (q5Var.f135272b) {
                    for (com.p314xaae8f345.mm.app.s5 s5Var : q5Var.f135272b) {
                        if (s5Var != null) {
                            s5Var.k2(str3);
                        }
                    }
                }
                java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.p314xaae8f345.mm.app.t5.class)).all()).iterator();
                while (true) {
                    fs.f fVar = (fs.f) it;
                    if (!fVar.hasNext()) {
                        return;
                    }
                    fs.q qVar = (fs.q) fVar.next();
                    if (fs.g.d(fs.g.f347619c, qVar)) {
                        ((com.p314xaae8f345.mm.app.t5) ((fs.n) qVar.get())).getClass();
                    }
                }
            }
        });
    }
}
