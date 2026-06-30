package zx2;

/* loaded from: classes2.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx2.h f558571d;

    public g(zx2.h hVar) {
        this.f558571d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderTabUIC", "adjust align");
        zx2.h hVar = this.f558571d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79 = hVar.f558572v;
        if (c15436x4c00d79 != null) {
            c15436x4c00d79.setVisibility(0);
        }
        zx2.b0 b0Var = hVar.f215195n;
        if (b0Var != null) {
            b0Var.a(hVar.f558572v);
        }
    }
}
