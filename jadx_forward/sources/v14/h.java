package v14;

/* loaded from: classes.dex */
public final class h implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v14.p f514078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514079b;

    public h(v14.p pVar, java.lang.String str) {
        this.f514078a = pVar;
        this.f514079b = str;
    }

    @Override // zb0.a0
    public void a(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        v14.p pVar = this.f514078a;
        q75.c.f(destPath, pVar.m158354x19263085());
        dp.a.m125854x26a183b(pVar.m158354x19263085(), pVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.frx, q75.c.d()), 1).show();
    }

    @Override // zb0.a0
    public void b(java.lang.String srcPath, java.lang.String destPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(srcPath, "srcPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(destPath, "destPath");
        boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(this.f514079b);
        v14.p pVar = this.f514078a;
        dp.a.m125854x26a183b(pVar.m158354x19263085(), j17 ? pVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i87) : pVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ipv), 1).show();
    }
}
