package rv0;

/* loaded from: classes5.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.r f481466d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.d f481467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ex0.r rVar, rv0.d dVar) {
        super(0);
        this.f481466d = rVar;
        this.f481467e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ex0.r rVar = this.f481466d;
        ex0.o oVar = rVar instanceof ex0.o ? (ex0.o) rVar : null;
        if (oVar != null) {
            float C = oVar.C() * 100;
            if (C < 0.0f) {
                C = 0.0f;
            }
            if (C > 100.0f) {
                C = 100.0f;
            }
            this.f481467e.m163152x27f73e1c(C);
        }
        return jz5.f0.f384359a;
    }
}
