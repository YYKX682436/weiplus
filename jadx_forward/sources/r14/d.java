package r14;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r14.y f450143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f450144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r14.y yVar, java.lang.String str) {
        super(1);
        this.f450143d = yVar;
        this.f450144e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String imgPath = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgPath, "imgPath");
        java.lang.String str = this.f450144e;
        r14.y yVar = this.f450143d;
        r14.c cVar = new r14.c(str, yVar, imgPath);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(imgPath);
        n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = yVar.f450166a;
        n13.t tVar = new n13.t();
        tVar.f415666a = cVar;
        tVar.f415671f.f415672a = 8;
        ((dk5.y) a0Var).wi(abstractActivityC21394xb3d2c0cf, aVar, str, tVar);
        return jz5.f0.f384359a;
    }
}
