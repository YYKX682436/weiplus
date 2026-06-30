package kj1;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 f389873d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389874e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f389875f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f389876g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kj1.m f389877h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389878i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f389879m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4, android.app.Activity activity, android.app.Activity activity2, yz5.a aVar, kj1.m mVar, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f389873d = c12593xa2ff72c4;
        this.f389874e = activity;
        this.f389875f = activity2;
        this.f389876g = aVar;
        this.f389877h = mVar;
        this.f389878i = str;
        this.f389879m = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.cgi.C12593xa2ff72c4 c12593xa2ff72c4 = this.f389873d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c12593xa2ff72c4.f170412i);
        android.app.Activity activity = this.f389874e;
        java.lang.String string = K0 ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571826qy) : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571825qx, c12593xa2ff72c4.f170412i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = string;
        aVar.A = false;
        android.app.Activity activity2 = this.f389875f;
        aVar.f293265v = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571823qv);
        aVar.f293266w = activity2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571824qw);
        aVar.E = new kj1.h(this.f389876g);
        aVar.F = new kj1.i(this.f389877h, activity, this.f389878i, this.f389879m);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(activity2, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
        return jz5.f0.f384359a;
    }
}
