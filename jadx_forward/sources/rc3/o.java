package rc3;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475574d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f475576f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(rc3.w0 w0Var, int i17, boolean z17) {
        super(0);
        this.f475574d = w0Var;
        this.f475575e = i17;
        this.f475576f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jc3.g0 g0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f475574d.f475638z, "canvas view " + this.f475575e + " first frame rendered");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b = this.f475574d.f475624i;
        if (c16416x87606a7b != null && (g0Var = c16416x87606a7b.f229361r) != null) {
            g0Var.c(this.f475575e, this.f475576f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.C16416x87606a7b c16416x87606a7b2 = this.f475574d.f475624i;
        if (c16416x87606a7b2 != null && c16416x87606a7b2.f229363t != null) {
            int i17 = this.f475575e;
            boolean z17 = this.f475576f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclMBFrameBiz", "onCanvasViewFirstFrameRendered canvasId: " + i17 + ", surfaceReady:" + z17);
            if (!z17) {
                android.util.SparseIntArray sparseIntArray = fh1.x0.M;
                synchronized (sparseIntArray) {
                    sparseIntArray.put(i17, 1);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
