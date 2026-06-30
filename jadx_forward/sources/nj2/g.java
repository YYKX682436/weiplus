package nj2;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.h f419367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, nj2.h hVar) {
        super(0);
        this.f419366d = context;
        this.f419367e = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f419366d;
        nj2.h hVar = this.f419367e;
        gk2.e eVar = hVar.H;
        android.view.View view = hVar.R;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.qy8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new mj2.f(context, hVar, eVar, findViewById, hVar.I, hVar.f419368J, null, 64, null);
    }
}
