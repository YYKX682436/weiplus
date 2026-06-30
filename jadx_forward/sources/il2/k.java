package il2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f373601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.r f373602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.ViewGroup viewGroup, il2.r rVar) {
        super(0);
        this.f373601d = viewGroup;
        this.f373602e = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f373601d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new kl2.q(context, this.f373602e);
    }
}
