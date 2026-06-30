package x03;

/* loaded from: classes15.dex */
public class g1 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x03.p1 f532564d;

    public g1(x03.p1 p1Var) {
        this.f532564d = p1Var;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        x03.d2 d2Var = this.f532564d.f532629i;
        d2Var.f532536a = null;
        d2Var.a();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        x03.d2 d2Var = this.f532564d.f532629i;
        d2Var.f532536a = eventSink;
        d2Var.a();
    }
}
