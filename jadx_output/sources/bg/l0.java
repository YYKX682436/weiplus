package bg;

/* loaded from: classes7.dex */
public class l0 implements tf.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19815a;

    public l0(bg.f fVar) {
        this.f19815a = fVar;
    }

    @Override // tf.u
    public void h() {
        bg.f fVar = this.f19815a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "playAudio mJustPlayAudio set false");
        fVar.T1.set(false);
        fVar.Q(new bg.k0(this));
    }

    @Override // tf.u
    public void j() {
        bg.f fVar = this.f19815a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "playAudio mJustPlayAudio set true");
        if (fVar.T1.getAndSet(true)) {
            com.tencent.mars.xlog.Log.i(fVar.A(), "ignore playAudio");
            return;
        }
        bg.j0 j0Var = new bg.j0(this);
        bg.q0 q0Var = new bg.q0(fVar, j0Var);
        com.tencent.mars.xlog.Log.i(fVar.A(), "getSnapshotAsync");
        fVar.W1 = q0Var;
        com.tencent.mars.xlog.Log.i(fVar.A(), "takeScreenshot");
        sf.i.b(fVar.f252499f, fVar.f252498e, fVar.f252497d);
        fVar.f19785y1.postDelayed(j0Var, 1000L);
    }
}
