package t22;

/* loaded from: classes10.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p64 f496610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t22.e f496611e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496612f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.p64 p64Var, t22.e eVar, java.lang.String str) {
        super(0);
        this.f496610d = p64Var;
        this.f496611e = eVar;
        this.f496612f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.p64 p64Var = this.f496610d;
        t22.e eVar = this.f496611e;
        if (p64Var != null) {
            eVar.f496619d.dismiss();
            o22.i.d(eVar.f496616a, null, 1111, 0, this.f496612f, "");
            eVar.f496617b.a(false);
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(eVar.f496616a);
            android.content.Context context = eVar.f496616a;
            u1Var.g(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jjz));
            u1Var.n(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1));
            u1Var.l(new t22.a(eVar));
            u1Var.q(false);
        }
        return jz5.f0.f384359a;
    }
}
