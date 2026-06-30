package ad5;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f84766e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84767f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84768g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ad5.d f84769h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a, java.util.List list, yz5.q qVar, ad5.d dVar) {
        super(0);
        this.f84765d = context;
        this.f84766e = c20976x6ba6452a;
        this.f84767f = list;
        this.f84768g = qVar;
        this.f84769h = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.content.Context context = this.f84765d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
        e4Var.f293313g = 2;
        e4Var.f293311e = false;
        v65.i.b(this.f84766e, null, new ad5.b(this.f84767f, e4Var.c(), this.f84768g, this.f84769h, null), 1, null);
        return jz5.f0.f384359a;
    }
}
