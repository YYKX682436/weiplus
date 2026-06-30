package bb2;

/* loaded from: classes10.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(bb2.w1 w1Var) {
        super(1);
        this.f18882d = w1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wp.i danmaku = (wp.i) obj;
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        yp.o oVar = danmaku.H;
        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.BulletViewHolder");
        bb2.b bVar = (bb2.b) oVar;
        java.lang.Object obj2 = danmaku.f448354y;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.bullet.FinderBulletInfo");
        bb2.o oVar2 = (bb2.o) obj2;
        bb2.w1 w1Var = this.f18882d;
        android.content.Context context = w1Var.f19036a.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC.class);
        if (finderBulletUIC != null) {
            finderBulletUIC.b7(w1Var.e(), oVar2.f18926a);
        }
        bVar.g(oVar2);
        w1Var.d().f438852d.N1(danmaku, bVar);
        return jz5.f0.f302826a;
    }
}
