package nj2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f419362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nj2.h hVar) {
        super(0);
        this.f419362d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nj2.h hVar = this.f419362d;
        android.view.View view = hVar.R;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.r1l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new nj2.j(view, hVar, findViewById, hVar.H, hVar.f419368J);
    }
}
