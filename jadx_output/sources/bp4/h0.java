package bp4;

/* loaded from: classes10.dex */
public final class h0 implements ml5.i {

    /* renamed from: a, reason: collision with root package name */
    public float f23182a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.i1 f23183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ym5.x2 f23184c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f23185d;

    public h0(com.tencent.mm.plugin.vlog.model.i1 i1Var, ym5.x2 x2Var, bp4.k0 k0Var) {
        this.f23183b = i1Var;
        this.f23184c = x2Var;
        this.f23185d = k0Var;
    }

    @Override // ml5.i
    public void a() {
        this.f23182a = com.tencent.mm.plugin.vlog.model.q0.a(this.f23183b.f175624i.f175784a);
    }

    @Override // ml5.i
    public void b() {
        float f17 = this.f23182a;
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.f23183b;
        boolean z17 = f17 == com.tencent.mm.plugin.vlog.model.q0.a(i1Var.f175624i.f175784a);
        com.tencent.mm.plugin.recordvideo.jumper.MediaEditReportInfo.EditItem editItem = i1Var.f175626k;
        if (z17) {
            editItem.dragCount++;
        } else {
            editItem.scaleCount++;
        }
    }

    @Override // ml5.h
    public void onChange() {
        com.tencent.mm.plugin.vlog.model.i1 i1Var = this.f23183b;
        float[] fArr = new float[9];
        i1Var.f175624i.f175784a.getValues(fArr);
        float f17 = fArr[0];
        double d17 = fArr[3];
        float sqrt = (float) java.lang.Math.sqrt((f17 * f17) + (d17 * d17));
        com.tencent.mm.plugin.vlog.model.y yVar = i1Var.f175624i;
        if (sqrt > 0.0f) {
            l45.q presenter = this.f23184c.getPresenter();
            float[] fArr2 = new float[9];
            yVar.f175784a.getValues(fArr2);
            float f18 = fArr2[0];
            double d18 = f18 * f18;
            double d19 = fArr2[3];
            ((l45.n) presenter).f316460a.getBaseBoardView().setInitScale(1 / ((float) java.lang.Math.sqrt(d18 + (d19 * d19))));
        }
        bp4.k0 k0Var = this.f23185d;
        if (k0Var.A) {
            return;
        }
        yVar.f175787d.set(k0Var.f23210f.getContentRect());
    }
}
