package pk2;

/* loaded from: classes3.dex */
public final class b6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f437114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f437116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(boolean z17, pk2.o9 o9Var, v65.n nVar) {
        super(2);
        this.f437114d = z17;
        this.f437115e = o9Var;
        this.f437116f = nVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.content.res.Resources resources;
        int i17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = this.f437114d;
        pk2.o9 o9Var = this.f437115e;
        if (booleanValue) {
            java.lang.String string = z17 ? o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwn) : o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dww);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (!z17) {
                db5.t7.h(o9Var.f437611d, string);
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_LIKE_ENABLE", z17);
            o9Var.j(qo0.b.f446968x4, bundle);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, z17 ? ml2.t1.f409466J : ml2.t1.K, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            if (z17) {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                ml2.r0.rj((ml2.r0) c18, 10, null, 2, null);
            } else {
                i95.m c19 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
                ml2.r0.rj((ml2.r0) c19, 9, null, 2, null);
            }
        } else {
            if (z17) {
                resources = o9Var.f437611d.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.dwm;
            } else {
                resources = o9Var.f437611d.getResources();
                i17 = com.p314xaae8f345.mm.R.C30867xcad56011.dwv;
            }
            java.lang.String string2 = resources.getString(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string2);
            db5.t7.b(o9Var.f437611d, string2 + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cud));
        }
        this.f437116f.a(java.lang.Boolean.valueOf(booleanValue));
        return jz5.f0.f384359a;
    }
}
