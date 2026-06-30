package a16;

/* loaded from: classes16.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a16.l f613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p06.k f614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a16.l lVar, p06.k kVar) {
        super(0);
        this.f613d = lVar;
        this.f614e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        a16.l lVar = this.f613d;
        kotlin.jvm.internal.o.g(lVar, "<this>");
        p06.k additionalAnnotations = this.f614e;
        kotlin.jvm.internal.o.g(additionalAnnotations, "additionalAnnotations");
        return lVar.f649a.f631q.b((x06.l0) lVar.f652d.getValue(), additionalAnnotations);
    }
}
