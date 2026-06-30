package c30;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.s f119688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119689e;

    public q(c30.s sVar, java.lang.String str) {
        this.f119688d = sVar;
        this.f119689e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.s sVar = this.f119688d;
        java.lang.String str = this.f119689e;
        sVar.getClass();
        if (str.length() == 0) {
            return;
        }
        c30.k kVar = (c30.k) ((java.util.LinkedHashMap) sVar.f119693c).get(str);
        if (kVar == null) {
            sVar.f119693c.put(str, new c30.k(str));
            kVar = (c30.k) ((java.util.LinkedHashMap) sVar.f119693c).get(str);
            if (kVar == null) {
                return;
            }
        }
        c30.j jVar = kVar.f119675c;
        if (jVar == c30.j.f119668e) {
            return;
        }
        if (jVar == c30.j.f119669f) {
            sVar.f119693c.put(str, new c30.k(str));
        }
        if ((kVar.f119675c == c30.j.f119670g) && android.os.SystemClock.elapsedRealtime() - kVar.f119674b > 3600000) {
            sVar.f119693c.put(str, new c30.k(str));
        }
        if (((java.util.ArrayList) sVar.a()).size() > 10) {
            sVar.b();
            return;
        }
        wu5.c cVar = sVar.f119694d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        sVar.f119694d = ((ku5.t0) ku5.t0.f394148d).l(new c30.r(sVar), 500L, "EcsWeShopInfoUpdater");
    }
}
