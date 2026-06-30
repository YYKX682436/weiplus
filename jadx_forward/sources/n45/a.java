package n45;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n45.b f416616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(n45.b bVar) {
        super(0);
        this.f416616d = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        n45.b bVar = this.f416616d;
        synchronized (bVar.f416617d) {
            jz5.l lVar = (jz5.l) kz5.n0.k0(bVar.f416617d);
            if (lVar != null) {
                java.lang.Object obj = lVar.f384366d;
                int i17 = ((qk.h6) ((l23.a) obj)).f66763x28ef0850;
                java.lang.String str = ((qk.h6) ((l23.a) obj)).f66769xf47740ff;
                super/*n23.a*/.b(lVar);
            }
            bVar.f416617d.clear();
        }
        return jz5.f0.f384359a;
    }
}
