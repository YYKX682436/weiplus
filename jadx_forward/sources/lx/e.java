package lx;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 f403261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.k f403262e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11, lx.k kVar) {
        super(0);
        this.f403261d = c5437xe8b43b11;
        this.f403262e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f403261d.f135780g.f87970a != 0) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            lx.k kVar = this.f403262e;
            android.app.Activity activity = kVar.f403355d;
            lx.c cVar = new lx.c(kVar);
            lx.d dVar = new lx.d(kVar);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8 k8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.k8.f183861a;
            java.lang.String selfUsername = g92.b.f351302e.U();
            ya2.k1 k1Var = new ya2.k1(cVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selfUsername, "selfUsername");
            java.lang.String concat = "23-".concat(selfUsername);
            pq5.g l17 = new db2.a4(selfUsername, 23).l();
            if (activity != null) {
                l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) activity);
            }
            k8Var.a(l17, concat, k1Var, dVar);
            k8Var.b(concat);
        }
        return jz5.f0.f384359a;
    }
}
