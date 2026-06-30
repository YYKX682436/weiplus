package uf;

/* loaded from: classes7.dex */
public final class v0 implements x91.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f508647d;

    public v0(uf.c1 c1Var) {
        this.f508647d = c1Var;
    }

    @Override // x91.a
    public void C2(x91.h hVar) {
        x91.c cVar;
        java.lang.String str = (hVar == null || (cVar = hVar.f534180a) == null) ? null : cVar.f534174i;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onAddDevice, udn = ".concat(str));
        uf.c1 c1Var = this.f508647d;
        if (hVar == null || r26.n0.N(str)) {
            yz5.l lVar = c1Var.f508520f;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        x91.c cVar2 = c1Var.c().f534180a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, cVar2 != null ? cVar2.f534174i : null)) {
            yz5.l lVar2 = c1Var.f508520f;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
            }
            ((b06.b) c1Var.f508516b).a(c1Var, uf.c1.f508514m[0], hVar);
        }
    }

    @Override // x91.a
    public void K4(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onUpdateDevice");
    }

    @Override // x91.a
    public void q2(x91.h hVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastDeviceManager", "[reconnect]onRemoveDevice");
    }
}
