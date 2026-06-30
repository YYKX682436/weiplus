package bg;

/* loaded from: classes7.dex */
public class o0 implements tf.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bg.f f19823a;

    public o0(bg.f fVar) {
        this.f19823a = fVar;
    }

    @Override // tf.t
    public java.lang.String e() {
        com.tencent.mars.xlog.Log.i(this.f19823a.A(), "getPosterPath, posterPath: " + this.f19823a.V1);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f19823a.V1)) {
            this.f19823a.V1 = "" + this.f19823a.f19764h.getDuration();
        }
        return this.f19823a.V1;
    }

    @Override // tf.t
    public java.lang.String getTitle() {
        com.tencent.mars.xlog.Log.i(this.f19823a.A(), "getTitle, title: " + this.f19823a.U1);
        return this.f19823a.U1;
    }
}
