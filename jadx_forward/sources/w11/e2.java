package w11;

/* loaded from: classes12.dex */
public class e2 implements com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.IAutoUnlockCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w11.d2 f523547a;

    public e2(w11.d2 d2Var) {
        this.f523547a = d2Var;
    }

    @Override // com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4549xd1736fd9.IAutoUnlockCallback
    /* renamed from: autoUnlockCallback */
    public void mo40018x38c86b38() {
        w11.d2 d2Var = this.f523547a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SyncService", "ERROR: %s auto unlock syncWakerLock", d2Var.f523536e);
        w11.u uVar = d2Var.f523536e;
        if (uVar == null) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.d(11098, 3550, "" + z65.c.f551988a + ';' + a21.a.a());
            fVar.mo68477x336bdfd8(99L, 48L, 1L, false);
            return;
        }
        if ((uVar instanceof z11.b) || (uVar instanceof w11.v)) {
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.d(11098, 3551, "" + z65.c.f551988a + ';' + a21.a.a());
            fVar2.mo68477x336bdfd8(99L, 49L, 1L, false);
            return;
        }
        if (uVar instanceof z11.c) {
            jx3.f fVar3 = jx3.f.INSTANCE;
            fVar3.d(11098, 3552, "" + z65.c.f551988a + ';' + a21.a.a());
            fVar3.mo68477x336bdfd8(99L, 50L, 1L, false);
            return;
        }
        if (uVar instanceof z11.a) {
            jx3.f fVar4 = jx3.f.INSTANCE;
            fVar4.d(11098, 3553, "" + z65.c.f551988a + ';' + a21.a.a());
            fVar4.mo68477x336bdfd8(99L, 51L, 1L, false);
            return;
        }
        jx3.f fVar5 = jx3.f.INSTANCE;
        fVar5.d(11098, 3554, "" + z65.c.f551988a + ';' + a21.a.a());
        fVar5.mo68477x336bdfd8(99L, 52L, 1L, false);
    }
}
