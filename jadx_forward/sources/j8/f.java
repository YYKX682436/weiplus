package j8;

/* loaded from: classes15.dex */
public class f implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j8.g f379629d;

    public f(j8.g gVar) {
        this.f379629d = gVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onCancel */
    public void mo14279x3d6f0539(java.lang.Object obj) {
        j8.g gVar = this.f379629d;
        gVar.f379636m.b();
        gVar.f379636m = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.StreamHandler
    /* renamed from: onListen */
    public void mo14280x4d3de486(java.lang.Object obj, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink) {
        java.lang.Boolean bool;
        boolean z17 = false;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            if (map.containsKey("useSensor") && (bool = (java.lang.Boolean) map.get("useSensor")) != null && bool.booleanValue()) {
                z17 = true;
            }
        }
        j8.e eVar = new j8.e(this, eventSink);
        j8.g gVar = this.f379629d;
        if (z17) {
            io.p3284xd2ae381c.Log.i("NDOP", "listening using sensor listener");
            gVar.f379636m = new j8.n(gVar.f379637n, eVar, j8.m.normal);
        } else {
            io.p3284xd2ae381c.Log.i("NDOP", "listening using window listener");
            gVar.f379636m = new j8.j(gVar.f379632f, gVar.f379637n, eVar);
        }
        gVar.f379636m.a();
    }
}
