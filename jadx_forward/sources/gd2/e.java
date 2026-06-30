package gd2;

/* loaded from: classes3.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.i f352060d;

    public e(gd2.i iVar) {
        this.f352060d = iVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        gd2.i iVar = this.f352060d;
        o25.y1 y1Var = iVar.f352073i;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = iVar.f352065a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = iVar.f352071g;
        if (k0Var != null) {
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).wi(abstractActivityC21394xb3d2c0cf, g4Var, k0Var);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("menu");
            throw null;
        }
    }
}
