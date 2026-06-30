package bg;

/* loaded from: classes7.dex */
public class r0 implements tf.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19831a;

    public r0(bg.f fVar) {
        this.f19831a = fVar;
    }

    @Override // tf.s
    public void d(tf.m mVar) {
        bg.f fVar = this.f19831a;
        com.tencent.mars.xlog.Log.i(fVar.A(), "getSnapshotAsync");
        fVar.W1 = mVar;
        com.tencent.mars.xlog.Log.i(fVar.A(), "takeScreenshot");
        sf.i.b(fVar.f252499f, fVar.f252498e, fVar.f252497d);
    }

    @Override // tf.s
    public android.graphics.Bitmap g() {
        return this.f19831a.X1;
    }
}
