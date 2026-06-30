package a16;

/* loaded from: classes16.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a16.l f611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o06.i f612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a16.l lVar, o06.i iVar) {
        super(0);
        this.f611d = lVar;
        this.f612e = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p06.k additionalAnnotations = this.f612e.getAnnotations();
        a16.l lVar = this.f611d;
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(additionalAnnotations, "additionalAnnotations");
        return lVar.f649a.f631q.b((x06.l0) lVar.f652d.getValue(), additionalAnnotations);
    }
}
