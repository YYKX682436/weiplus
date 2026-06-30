package zh1;

/* loaded from: classes8.dex */
public final class o implements zh1.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f554457d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 f554458e;

    /* renamed from: f, reason: collision with root package name */
    public final zh1.w0 f554459f;

    public o(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12473xe2bfc4b5 openMaterialCollection, zh1.w0 openMaterialReporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialCollection, "openMaterialCollection");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openMaterialReporter, "openMaterialReporter");
        this.f554457d = context;
        this.f554458e = openMaterialCollection;
        this.f554459f = openMaterialReporter;
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12476xea20f622 materialModel = this.f554458e.f167782d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialModel, "materialModel");
        zh1.w0 w0Var = this.f554459f;
        ((di1.f) w0Var).e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "showInner materialModel:" + materialModel);
        fb0.k kVar = (fb0.k) i95.n0.c(fb0.k.class);
        long j17 = ((di1.f) w0Var).f314162a;
        java.lang.String str = ((di1.f) w0Var).f314173l;
        long a17 = ((di1.f) w0Var).a();
        java.lang.String mimeType = materialModel.f167802d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mimeType, "mimeType");
        java.lang.String materialExtension = materialModel.f167803e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialExtension, "materialExtension");
        java.lang.String materialPath = materialModel.f167804f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(materialPath, "materialPath");
        ((gb0.n) kVar).getClass();
        android.content.Context context = this.f554457d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ib0.e.f371562a.a(context, new gb0.k(context, j17, str, a17, mimeType, materialExtension, materialPath));
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "dead");
    }

    @Override // zh1.v0
    public void e(zh1.u0 u0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "setListener");
    }

    @Override // zh1.v0
    /* renamed from: hide */
    public void mo178968x30dd42() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "hide");
    }

    @Override // zh1.v0
    public void r() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "showDirectly");
        a();
    }

    @Override // zh1.v0
    /* renamed from: show */
    public void mo178969x35dafd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOpenMaterialBottomSheetNew", "show");
        a();
    }
}
