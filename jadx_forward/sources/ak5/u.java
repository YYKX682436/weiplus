package ak5;

/* loaded from: classes8.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.v f87226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ak5.v vVar) {
        super(0);
        this.f87226d = vVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ak5.t tVar = ak5.v.f87227d;
        p75.i0 i17 = ak5.v.f87228e.i();
        p75.d dVar = dm.kb.f319649i;
        ak5.v vVar = this.f87226d;
        i17.f434190d = dVar.j(vVar.f87230a);
        java.util.List k17 = i17.a().k(tVar.a().Q4(), com.p314xaae8f345.mm.p2621x8fb0427b.db.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07 = a17.z0(vVar.f87230a);
        if (z07 != null && (z07.f69093x3a5fbd6a & 1) == 0 && z07.f69104x3e180109 != null) {
            r45.tc3 tc3Var = new r45.tc3();
            try {
                tc3Var.mo11468x92b714fd(z07.f69104x3e180109);
                vVar.c(k17, tc3Var.f467841s);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(vVar.f87231b, th6, "init parse detail err", new java.lang.Object[0]);
            }
            z07.f69093x3a5fbd6a |= 1;
            a17.mo11260x413cb2b4(z07);
        }
        return k17;
    }
}
