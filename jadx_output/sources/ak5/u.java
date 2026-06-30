package ak5;

/* loaded from: classes8.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak5.v f5693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ak5.v vVar) {
        super(0);
        this.f5693d = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ak5.t tVar = ak5.v.f5694d;
        p75.i0 i17 = ak5.v.f5695e.i();
        p75.d dVar = dm.kb.f238116i;
        ak5.v vVar = this.f5693d;
        i17.f352657d = dVar.j(vVar.f5697a);
        java.util.List k17 = i17.a().k(tVar.a().Q4(), com.tencent.mm.storage.db.class);
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        com.tencent.mm.storage.a3 z07 = a17.z0(vVar.f5697a);
        if (z07 != null && (z07.field_compactFlag & 1) == 0 && z07.field_roomInfoDetailResByte != null) {
            r45.tc3 tc3Var = new r45.tc3();
            try {
                tc3Var.parseFrom(z07.field_roomInfoDetailResByte);
                vVar.c(k17, tc3Var.f386308s);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace(vVar.f5698b, th6, "init parse detail err", new java.lang.Object[0]);
            }
            z07.field_compactFlag |= 1;
            a17.replace(z07);
        }
        return k17;
    }
}
