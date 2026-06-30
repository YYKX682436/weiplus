package kj1;

/* loaded from: classes5.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 f389840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f389841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kj1.m f389842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389843h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389844i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389845m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4, yz5.a aVar, kj1.m mVar, android.app.Activity activity2, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f389839d = activity;
        this.f389840e = c12593xa2ff72c4;
        this.f389841f = aVar;
        this.f389842g = mVar;
        this.f389843h = activity2;
        this.f389844i = str;
        this.f389845m = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        android.app.Activity activity = this.f389839d;
        java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571825qx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{this.f389840e.f170412i}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        aVar.f293262s = format;
        aVar.A = false;
        aVar.f293265v = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571823qv);
        aVar.f293266w = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571824qw);
        aVar.E = new kj1.c(this.f389841f);
        aVar.F = new kj1.d(this.f389842g, this.f389843h, this.f389844i, this.f389845m);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activity, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        return jz5.f0.f384359a;
    }
}
