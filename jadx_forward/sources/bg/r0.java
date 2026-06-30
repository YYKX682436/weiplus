package bg;

/* loaded from: classes7.dex */
public class r0 implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f101364a;

    public r0(bg.f fVar) {
        this.f101364a = fVar;
    }

    @Override // tf.s
    public void d(tf.m mVar) {
        bg.f fVar = this.f101364a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "getSnapshotAsync");
        fVar.W1 = mVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.A(), "takeScreenshot");
        sf.i.b(fVar.f334032f, fVar.f334031e, fVar.f334030d);
    }

    @Override // tf.s
    public android.graphics.Bitmap g() {
        return this.f101364a.X1;
    }
}
