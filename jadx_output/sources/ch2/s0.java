package ch2;

/* loaded from: classes10.dex */
public final class s0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41457d;

    public s0(ch2.o2 o2Var) {
        this.f41457d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.Boolean bool;
        om2.a aVar = (om2.a) obj;
        if (aVar != null) {
            ch2.o2 o2Var = this.f41457d;
            o2Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAnchorOptionState: ");
            boolean z17 = aVar.f346268a;
            sb6.append(z17);
            sb6.append(" isPause: ");
            om2.i iVar = o2Var.q7().f346307n;
            if (iVar != null) {
                r45.ia4 ia4Var = iVar.f346323c;
                bool = java.lang.Boolean.valueOf(ia4Var != null && ia4Var.f376877o);
            } else {
                bool = null;
            }
            sb6.append(bool);
            com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", sb6.toString());
            om2.i iVar2 = o2Var.q7().f346307n;
            if (iVar2 != null) {
                r45.ia4 ia4Var2 = iVar2.f346323c;
                if (z17) {
                    if (!(ia4Var2 != null && ia4Var2.f376877o)) {
                        pm0.v.X(new ch2.s(iVar2, o2Var));
                    }
                } else {
                    if (ia4Var2 != null && ia4Var2.f376877o) {
                        pm0.v.X(new ch2.t(iVar2, o2Var));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
