package nj2;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.z f419392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(nj2.z zVar) {
        super(0);
        this.f419392d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nj2.z zVar = this.f419392d;
        android.view.View view = zVar.f419408r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.r1l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new nj2.r(view, zVar, findViewById, zVar.f419401h, zVar.f419403m);
    }
}
