package aw2;

/* loaded from: classes10.dex */
public final class j implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14756d;

    public j(aw2.n nVar) {
        this.f14756d = nVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            aw2.n nVar = this.f14756d;
            g4Var.d(4, nVar.f14776d.getResources().getColor(com.tencent.mm.R.color.f478714f5), nVar.f14776d.getResources().getString(com.tencent.mm.R.string.cjn));
            java.lang.String e17 = xy2.c.e(nVar.f14776d);
            mv2.m mVar = mv2.m.f331605a;
            java.lang.String string = mVar.c(e17) ? mVar.b(e17) ? nVar.f14776d.getResources().getString(com.tencent.mm.R.string.ewe) : mVar.a(e17) ? nVar.f14776d.getResources().getString(com.tencent.mm.R.string.ewd) : nVar.f14776d.getResources().getString(com.tencent.mm.R.string.f491354li0) : (mVar.b(e17) && mVar.a(e17)) ? nVar.f14776d.getResources().getString(com.tencent.mm.R.string.ert) : mVar.b(e17) ? nVar.f14776d.getResources().getString(com.tencent.mm.R.string.ew8) : mVar.a(e17) ? nVar.f14776d.getResources().getString(com.tencent.mm.R.string.e1r) : nVar.f14776d.getResources().getString(com.tencent.mm.R.string.f491356li2);
            kotlin.jvm.internal.o.d(string);
            g4Var.d(5, nVar.f14776d.getResources().getColor(com.tencent.mm.R.color.f478714f5), string);
        }
    }
}
