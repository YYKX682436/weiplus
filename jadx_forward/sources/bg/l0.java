package bg;

/* loaded from: classes7.dex */
public class l0 implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101348a;

    public l0(bg.f fVar) {
        this.f101348a = fVar;
    }

    @Override // tf.u
    public void h() {
        bg.f fVar = this.f101348a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "playAudio mJustPlayAudio set false");
        fVar.T1.set(false);
        fVar.Q(new bg.k0(this));
    }

    @Override // tf.u
    public void j() {
        bg.f fVar = this.f101348a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "playAudio mJustPlayAudio set true");
        if (fVar.T1.getAndSet(true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "ignore playAudio");
            return;
        }
        bg.j0 j0Var = new bg.j0(this);
        bg.q0 q0Var = new bg.q0(fVar, j0Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "getSnapshotAsync");
        fVar.W1 = q0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "takeScreenshot");
        sf.i.b(fVar.f334032f, fVar.f334031e, fVar.f334030d);
        fVar.f101318y1.mo50297x7c4d7ca2(j0Var, 1000L);
    }
}
