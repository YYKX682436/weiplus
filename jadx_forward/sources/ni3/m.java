package ni3;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni3.n f419163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ni3.n nVar) {
        super(0);
        this.f419163d = nVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ni3.n nVar = this.f419163d;
        if (nVar.m80381x45f41879()) {
            return nVar.m80380x71e92c1d();
        }
        android.view.View decorView = nVar.m158354x19263085().getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        return decorView;
    }
}
