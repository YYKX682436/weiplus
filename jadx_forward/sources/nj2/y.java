package nj2;

/* loaded from: classes10.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419399d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.z f419400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, nj2.z zVar) {
        super(0);
        this.f419399d = context;
        this.f419400e = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f419399d;
        nj2.z zVar = this.f419400e;
        gk2.e eVar = zVar.f419401h;
        android.view.View view = zVar.f419408r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.qy8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return new mj2.m(context, zVar, eVar, findViewById, zVar.f419402i, zVar.f419403m, new nj2.x(zVar));
    }
}
