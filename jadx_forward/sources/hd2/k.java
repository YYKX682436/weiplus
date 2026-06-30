package hd2;

/* loaded from: classes8.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e f362022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362023e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e, android.view.View view) {
        super(1);
        this.f362022d = c14133xabc4217e;
        this.f362023e = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap b07;
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        android.view.View container = this.f362023e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(container, "$container");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e c14133xabc4217e = this.f362022d;
        android.content.Context mo7438x76847179 = c14133xabc4217e.mo7438x76847179();
        if (mo7438x76847179 != null && (b07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(container)) != null) {
            java.lang.String fj6 = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).fj();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(b07, 80, android.graphics.Bitmap.CompressFormat.JPEG, fj6, true);
            hd2.p pVar = new hd2.p(c14133xabc4217e, username, mo7438x76847179, fj6, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(username) ? 3 : 2);
            jd5.a aVar = new jd5.a();
            aVar.p(fj6);
            n13.t tVar = new n13.t();
            tVar.f415666a = pVar;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(mo7438x76847179, aVar, username, tVar);
        }
        return jz5.f0.f384359a;
    }
}
