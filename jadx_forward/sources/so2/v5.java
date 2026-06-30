package so2;

/* loaded from: classes3.dex */
public final class v5 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f492210a;

    public v5(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f492210a = qVar;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.i0 i0Var = (mv2.i0) task;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SetProfileCoverViewModel", "onLoaderFin status:" + status + " url:" + i0Var.f413110g);
        fp0.u uVar = fp0.u.f346823f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f492210a;
        if (status != uVar || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(i0Var.f413110g)) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(i0Var.f413110g));
        }
    }
}
