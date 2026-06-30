package du3;

/* loaded from: classes3.dex */
public final class j3 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ du3.t3 f325169d;

    public j3(du3.t3 t3Var) {
        this.f325169d = t3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        hk0.e eVar = ((hk0.g) obj).f363267a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "doddleState >> doodleType: " + eVar.f363257a + ", ");
        int ordinal = eVar.f363257a.ordinal();
        qk.g6 g6Var = qk.g6.DOODLE;
        du3.t3 t3Var = this.f325169d;
        if (ordinal == 1) {
            l45.q qVar = t3Var.f325259p;
            if (qVar != null) {
                new l45.a((l45.n) qVar).a(g6Var);
            }
            l45.q qVar2 = t3Var.f325259p;
            if (qVar2 != null) {
                new l45.a((l45.n) qVar2).b(g6Var, eVar.f363259c, java.lang.Boolean.TRUE);
                return;
            }
            return;
        }
        if (ordinal != 2) {
            t3Var.G();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "unSelect all brush");
            return;
        }
        l45.q qVar3 = t3Var.f325259p;
        if (qVar3 != null) {
            new l45.a((l45.n) qVar3).a(g6Var);
        }
        l45.q qVar4 = t3Var.f325259p;
        if (qVar4 != null) {
            new l45.a((l45.n) qVar4).b(g6Var, -3, null);
        }
    }
}
