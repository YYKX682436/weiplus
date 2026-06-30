package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class x implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g23.f f219877d;

    public x(g23.f fVar) {
        this.f219877d = fVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        g23.f fVar = this.f219877d;
        int size = ((java.util.ArrayList) fVar.f349446f).size();
        for (int i17 = 0; i17 < size; i17++) {
            g23.i iVar = (g23.i) ((java.util.ArrayList) fVar.f349446f).get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g4Var);
            g4Var.f(i17, iVar.f349456a);
        }
    }
}
