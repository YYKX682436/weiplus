package a85;

/* loaded from: classes15.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f83930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc f83931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a85.g gVar, com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc c21007x2f4a06dc) {
        super(0);
        this.f83930d = gVar;
        this.f83931e = c21007x2f4a06dc;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        a85.g gVar = this.f83930d;
        gVar.getClass();
        com.p314xaae8f345.mm.p2608xc9fa65a8.p2609x2eefaa.C21007x2f4a06dc model = this.f83931e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        x75.b bVar = (x75.b) gVar.f83934e;
        if (!bVar.f533993f && bVar.f533996i) {
            a85.a aVar = gVar.f83935f;
            aVar.x(aVar.mo1894x7e414b06(), new ir.z0(104));
            bVar.a(model, new a85.f(gVar));
        }
        return jz5.f0.f384359a;
    }
}
