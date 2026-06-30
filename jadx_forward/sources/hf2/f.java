package hf2;

/* loaded from: classes10.dex */
public final class f implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f362588d;

    public f(hf2.x xVar) {
        this.f362588d = xVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String str = (java.lang.String) obj;
        hf2.x xVar = this.f362588d;
        boolean z17 = xVar.f362723v;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            return f0Var;
        }
        r45.h84 h84Var = xVar.f362719r;
        boolean z18 = false;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, h84Var != null ? h84Var.m75945x2fec8307(0) : null)) {
            return f0Var;
        }
        xVar.f362723v = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = xVar.l7().f362640d;
        if (c22613xe7040d9c != null && c22613xe7040d9c.isShowing) {
            z18 = true;
        }
        if (z18) {
            java.lang.Object Z6 = hf2.x.Z6(xVar, "resourceLoadFinish", interfaceC29045xdcb5ca57);
            return Z6 == pz5.a.f440719d ? Z6 : f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(xVar.f362714m, "waitingInitMaasResurceDownload " + str + " but panel hide!");
        return f0Var;
    }
}
