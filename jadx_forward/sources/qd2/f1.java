package qd2;

/* loaded from: classes10.dex */
public final class f1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 f443258a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443259b;

    public f1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var, qd2.g1 g1Var) {
        this.f443258a = c0Var;
        this.f443259b = g1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.a0
    /* renamed from: onResult */
    public final void mo26363x57429edc(boolean z17, java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = this.f443258a;
        c0Var.d();
        if (z17) {
            int b17 = c0Var.b();
            qd2.g1 g1Var = this.f443259b;
            g1Var.f443290k = b17;
            g1Var.d();
            g1Var.f443296q = g1Var.b();
            yz5.l lVar = g1Var.f443292m;
            if (lVar != null) {
                lVar.mo146xb9724478(g1Var.f443296q);
            }
        }
    }
}
