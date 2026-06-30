package cg3;

/* loaded from: classes3.dex */
public final class e implements com.tencent.mm.plugin.scanner.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cg3.g f41153a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cg3.d f41154b;

    public e(cg3.g gVar, cg3.d dVar) {
        this.f41153a = gVar;
        this.f41154b = dVar;
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void a(java.util.ArrayList srcDataList, com.tencent.mm.plugin.scanner.ImageQBarDataBean info, boolean z17) {
        kotlin.jvm.internal.o.g(srcDataList, "srcDataList");
        kotlin.jvm.internal.o.g(info, "info");
        cg3.g gVar = this.f41153a;
        gVar.V6().a().a();
        cg3.a aVar = (cg3.a) gVar.U6(cg3.a.class);
        if (aVar != null) {
            aVar.n5(this.f41154b, info, z17);
        }
    }

    @Override // com.tencent.mm.plugin.scanner.f0
    public void b(java.util.ArrayList srcDataList) {
        kotlin.jvm.internal.o.g(srcDataList, "srcDataList");
    }
}
