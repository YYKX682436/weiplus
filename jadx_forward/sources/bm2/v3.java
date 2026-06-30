package bm2;

/* loaded from: classes3.dex */
public final class v3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.a4 f103914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.n3 f103915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f103916f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(bm2.a4 a4Var, bm2.n3 n3Var, ce2.i iVar) {
        super(0);
        this.f103914d = a4Var;
        this.f103915e = n3Var;
        this.f103916f = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tg2.h hVar = this.f103914d.f103301h;
        if (hVar != null) {
            android.view.View view = this.f103915e.f103753d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type android.view.ViewGroup");
            hVar.f((android.view.ViewGroup) view, this.f103916f);
        }
        return jz5.f0.f384359a;
    }
}
