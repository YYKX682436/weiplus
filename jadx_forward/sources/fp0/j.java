package fp0;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.d f346792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.u f346793f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fp0.o oVar, fp0.d dVar, fp0.u uVar) {
        super(0);
        this.f346791d = oVar;
        this.f346792e = dVar;
        this.f346793f = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        for (fp0.p pVar : this.f346791d.f346805d) {
            fp0.d dVar = this.f346792e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(dVar, "null cannot be cast to non-null type T of com.tencent.mm.loader.loader.LoaderCore.dispatch.<no name provided>.invoke$lambda$0");
            pVar.a(dVar, this.f346793f);
        }
        return jz5.f0.f384359a;
    }
}
