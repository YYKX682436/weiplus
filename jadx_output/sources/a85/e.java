package a85;

/* loaded from: classes15.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a85.g f2397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.search.data.SimilarEmojiQueryModel f2398e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a85.g gVar, com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel) {
        super(0);
        this.f2397d = gVar;
        this.f2398e = similarEmojiQueryModel;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a85.g gVar = this.f2397d;
        gVar.getClass();
        com.tencent.mm.search.data.SimilarEmojiQueryModel model = this.f2398e;
        kotlin.jvm.internal.o.g(model, "model");
        x75.b bVar = (x75.b) gVar.f2401e;
        if (!bVar.f452460f && bVar.f452463i) {
            a85.a aVar = gVar.f2402f;
            aVar.x(aVar.getItemCount(), new ir.z0(104));
            bVar.a(model, new a85.f(gVar));
        }
        return jz5.f0.f302826a;
    }
}
