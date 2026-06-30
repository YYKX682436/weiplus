package wj;

/* loaded from: classes8.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f527919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f527920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wj.r0 f527922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xj.l f527923h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wj.j0 f527924i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527925m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527926n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527927o;

    public d0(android.content.Context context, android.content.Intent intent, java.lang.String str, wj.r0 r0Var, java.lang.String str2, java.lang.String str3, java.lang.String str4, xj.l lVar, wj.j0 j0Var) {
        this.f527919d = context;
        this.f527920e = intent;
        this.f527921f = str;
        this.f527922g = r0Var;
        this.f527926n = str2;
        this.f527927o = str3;
        this.f527925m = str4;
        this.f527923h = lVar;
        this.f527924i = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        android.content.Context context = this.f527919d;
        android.content.Intent intent = this.f527920e;
        java.lang.String str = this.f527921f;
        int i17 = this.f527922g.f528035d;
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571891sq);
        java.lang.String str2 = this.f527926n;
        java.lang.String str3 = this.f527927o;
        java.lang.String str4 = this.f527925m;
        xj.l lVar = this.f527923h;
        ((kt.c) i0Var).hj(context, intent, str, i17, string, new wj.b0(str2, str3, str4, lVar, this.f527924i), new wj.c0(lVar));
    }
}
