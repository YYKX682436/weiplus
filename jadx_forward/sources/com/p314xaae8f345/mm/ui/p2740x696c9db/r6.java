package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public class r6 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.s6 f292202d;

    public r6(com.p314xaae8f345.mm.ui.p2740x696c9db.s6 s6Var) {
        this.f292202d = s6Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        g4Var.clear();
        java.util.Iterator it = ((java.util.ArrayList) this.f292202d.f292259m.f309877d).iterator();
        while (it.hasNext()) {
            g4Var.v((android.view.MenuItem) it.next());
        }
    }
}
