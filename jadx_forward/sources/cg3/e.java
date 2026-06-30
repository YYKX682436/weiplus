package cg3;

/* loaded from: classes3.dex */
public final class e implements com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cg3.g f122686a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cg3.d f122687b;

    public e(cg3.g gVar, cg3.d dVar) {
        this.f122686a = gVar;
        this.f122687b = dVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0
    public void a(java.util.ArrayList srcDataList, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.C17261xe88a6357 info, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcDataList, "srcDataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        cg3.g gVar = this.f122686a;
        gVar.V6().a().a();
        cg3.a aVar = (cg3.a) gVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.n5(this.f122687b, info, z17);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.f0
    public void b(java.util.ArrayList srcDataList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcDataList, "srcDataList");
    }
}
