package ns2;

/* loaded from: classes3.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns2.b f420918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ns2.j f420919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ns2.a f420920f;

    public i(ns2.b bVar, ns2.j jVar, ns2.a aVar) {
        this.f420918d = bVar;
        this.f420919e = jVar;
        this.f420920f = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 4) {
            ns2.b bVar = this.f420918d;
            bVar.f420890c.set(1, 1);
            ml2.i5 i5Var = ml2.i5.f409105g;
            ns2.j jVar = this.f420919e;
            jVar.c(bVar, i5Var, "");
            jVar.a(bVar, this.f420920f, 2);
            android.content.Context context = bVar.f420888a;
            db5.t7.i(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
    }
}
