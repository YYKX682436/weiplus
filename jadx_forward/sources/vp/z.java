package vp;

/* loaded from: classes16.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f520405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.a0 f520406e;

    public z(vp.a0 a0Var, java.util.List list) {
        this.f520406e = a0Var;
        this.f520405d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (android.util.Pair pair : this.f520405d) {
            wp.a aVar = (wp.a) pair.first;
            yp.o oVar = (yp.o) pair.second;
            vp.a0 a0Var = this.f520406e;
            if (oVar != null) {
                xp.d dVar = a0Var.f520264f.f520299d;
                if (!aVar.n()) {
                    wp.b e17 = dVar.c(aVar).e(aVar, oVar);
                    aVar.f529871i = e17.f529889a + (xp.d.f().f537381e * 2);
                    aVar.f529872j = e17.f529890b + (xp.d.f().f537380d * 2);
                    wp.f fVar = (wp.f) aVar;
                    fVar.f529885w = false;
                    fVar.G = ((int) (fVar.h() + fVar.f529871i)) / ((float) fVar.f529867e.f556446a);
                }
            }
            vp.c0 c0Var = a0Var.f520263e;
            if (c0Var != null) {
                c0Var.a(aVar);
            }
        }
    }
}
