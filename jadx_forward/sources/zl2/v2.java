package zl2;

/* loaded from: classes3.dex */
public final class v2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f555534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555535c;

    public v2(yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        this.f555533a = lVar;
        this.f555534b = lVar2;
        this.f555535c = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.String str = this.f555535c;
        yz5.l lVar = this.f555533a;
        if (lVar != null) {
            ff0.t tVar = (ff0.t) i95.n0.c(ff0.t.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap);
            zl2.s2 s2Var = new zl2.s2(lVar, str);
            ((dl4.m0) tVar).getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new dl4.q(bitmap, s2Var));
        }
        yz5.l lVar2 = this.f555534b;
        if (lVar2 != null) {
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).hj(str, new android.view.View(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a), bitmap, new zl2.u2(str, lVar2));
        }
    }
}
