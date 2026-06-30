package sm2;

/* loaded from: classes3.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f490945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f490946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f490945d = o4Var;
        this.f490946e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.a aVar = this.f490946e;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) aVar.findViewById(com.p314xaae8f345.mm.R.id.f564160jp);
        xu2.u uVar = viewGroup != null ? new xu2.u(viewGroup, aVar) : null;
        this.f490945d.f491159n = uVar;
        return uVar;
    }
}
