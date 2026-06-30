package xa3;

/* loaded from: classes11.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public c() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        ua3.a c17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52 c5385x2a29ba52 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5385x2a29ba52) abstractC20979x809547d1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExitTrackRoomListener", "exit track trackMgr:%s event:%s", ((va3.v0) q21.d.b()).f515897v, c5385x2a29ba52.f135720g.f89709a);
        va3.j0.Ri().h();
        ua3.b bVar = ((va3.z0) q21.d.a()).f515930b;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(bVar != null ? bVar.f507509e : "")) {
            va3.j0.Ri().b(1);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0 c6154xe47ae2d0 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6154xe47ae2d0();
            c6154xe47ae2d0.f136416g.f89117b = true;
            c6154xe47ae2d0.e();
        }
        am.v7 v7Var = c5385x2a29ba52.f135720g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v7Var.f89709a) || (c17 = va3.j0.Ui().c(v7Var.f89709a)) == null) {
            return false;
        }
        c17.f507503e.remove(c01.z1.r());
        va3.j0.Ui().g(v7Var.f89709a, c17.f507503e, c17.f507505g, c17.f507504f, c17.f507506h, null, null);
        if (p21.l.a() == null) {
            return false;
        }
        ((dh4.t) p21.l.a()).g(v7Var.f89709a, null, null, null, 1);
        return false;
    }
}
