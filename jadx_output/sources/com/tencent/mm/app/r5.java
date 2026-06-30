package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class r5 extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.q5 f53749a;

    public r5(com.tencent.mm.app.q5 q5Var) {
        this.f53749a = q5Var;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        final java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52735q;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.r5$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.app.q5 q5Var = com.tencent.mm.app.r5.this.f53749a;
                final java.lang.String str3 = str2;
                q5Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcForegroundDelegate", "onProcessForeground");
                q5Var.f53738a = true;
                synchronized (q5Var.f53739b) {
                    for (com.tencent.mm.app.s5 s5Var : q5Var.f53739b) {
                        if (s5Var != null) {
                            s5Var.Jb(str3);
                        }
                    }
                }
                fs.g.b(com.tencent.mm.app.t5.class, new fs.o() { // from class: com.tencent.mm.app.q5$$a
                    @Override // fs.o
                    public final boolean a(fs.n nVar) {
                        ((z33.l) ((com.tencent.mm.app.t5) nVar)).getClass();
                        java.lang.String str4 = str3;
                        com.tencent.mars.xlog.Log.i("GameChatroomProcListener", "procForegroundDelegate, onProcessForeground(%s)", str4);
                        if (s33.n.f402531c != null) {
                            return false;
                        }
                        s33.n.f402531c = str4;
                        return false;
                    }
                });
            }
        });
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        java.lang.String str = com.tencent.matrix.lifecycle.owners.f0.f52719a;
        final java.lang.String str2 = com.tencent.matrix.lifecycle.owners.f0.f52735q;
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.app.r5$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.app.q5 q5Var = com.tencent.mm.app.r5.this.f53749a;
                java.lang.String str3 = str2;
                q5Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ProcForegroundDelegate", "onProcessBackground");
                q5Var.f53738a = false;
                synchronized (q5Var.f53739b) {
                    for (com.tencent.mm.app.s5 s5Var : q5Var.f53739b) {
                        if (s5Var != null) {
                            s5Var.k2(str3);
                        }
                    }
                }
                java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(com.tencent.mm.app.t5.class)).all()).iterator();
                while (true) {
                    fs.f fVar = (fs.f) it;
                    if (!fVar.hasNext()) {
                        return;
                    }
                    fs.q qVar = (fs.q) fVar.next();
                    if (fs.g.d(fs.g.f266086c, qVar)) {
                        ((com.tencent.mm.app.t5) ((fs.n) qVar.get())).getClass();
                    }
                }
            }
        });
    }
}
