package me5;

/* loaded from: classes4.dex */
public class j extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407500e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407501f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407503h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407504i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407505m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407506n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f407507o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407508p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ me5.n f407509q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(me5.n nVar, int i17, r35.m3 m3Var, java.lang.ref.WeakReference weakReference, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.util.Map map, android.os.Bundle bundle, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f407509q = nVar;
        this.f407500e = weakReference;
        this.f407501f = str;
        this.f407502g = str2;
        this.f407503h = str3;
        this.f407504i = str4;
        this.f407505m = str5;
        this.f407506n = map;
        this.f407507o = bundle;
        this.f407508p = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        android.content.Context context = (android.content.Context) this.f407500e.get();
        if (context == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        k0Var.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ayh), this.f407501f, this.f407502g), 17, i65.a.b(context, 14), null);
        k0Var.f293405n = new me5.h(this, context);
        k0Var.f293414s = new me5.i(this, k0Var, context);
        k0Var.v();
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        this.f407509q.getClass();
        ((ih3.e) k1Var).Di("link_revoke_unbindapp", this.f407506n, this.f407507o, this.f407500e, this.f407508p);
    }
}
