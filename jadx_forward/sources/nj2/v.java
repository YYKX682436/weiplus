package nj2;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f419395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nj2.z f419396e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, nj2.z zVar) {
        super(0);
        this.f419395d = context;
        this.f419396e = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context = this.f419395d;
        nj2.z zVar = this.f419396e;
        gk2.e eVar = zVar.f419401h;
        android.view.View view = zVar.f419408r;
        if (view != null) {
            return new lj2.n(context, eVar, view.findViewById(com.p314xaae8f345.mm.R.id.tmj), zVar.f419402i, zVar, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }
}
