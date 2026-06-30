package l91;

/* loaded from: classes4.dex */
public final class d extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f398797e = l91.a.f398795s;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f398798d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l75.k0 db6) {
        super(db6, l91.a.f398794r, "AppBrandPrefetchWxaAttrsMarkTable", dm.d0.f317811h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f398798d = db6;
    }

    public final void y0(java.util.List usernameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usernameList, "usernameList");
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = this.f398798d;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!(str == null || str.length() == 0)) {
                z0(new l91.b(str));
            }
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }

    public final void z0(l91.c key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        long i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        l91.a aVar = new l91.a();
        aVar.f66199xcacd07f2 = i17;
        if (key instanceof l91.b) {
            java.lang.String str = ((l91.b) key).f398796a;
            aVar.f66200xdec927b = str;
            aVar.f66198x28d45f97 = k91.k4.e(str);
        }
        super.mo11260x413cb2b4(aVar);
    }
}
