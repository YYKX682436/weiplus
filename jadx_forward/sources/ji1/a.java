package ji1;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f381444d;

    public a(ji1.b bVar, android.content.Intent intent) {
        this.f381444d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String stringExtra = this.f381444d.getStringExtra("extra_item");
        ki1.b bVar = (ki1.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(ki1.b.class);
        if (stringExtra == null || bVar == null) {
            return;
        }
        bVar.getClass();
        ki1.a aVar = new ki1.a();
        aVar.f65908x29df9a74 = stringExtra;
        if (!bVar.get(aVar, "token") || (str = aVar.f65908x29df9a74) == null || !str.equals(stringExtra)) {
            aVar = null;
        }
        if (aVar == null) {
            return;
        }
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = aVar.f65905x28d46377;
        b1Var.f398545a = aVar.f65909xdec927b;
        b1Var.f398549c = aVar.f65910x94d24c6d;
        b1Var.f398551d = aVar.f65904x119cf7dc;
        b1Var.f398565k = 1223;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6 h6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class);
        if (h6Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) h6Var).bj(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, b1Var);
        }
    }
}
