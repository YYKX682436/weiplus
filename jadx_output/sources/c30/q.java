package c30;

/* loaded from: classes12.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c30.s f38155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f38156e;

    public q(c30.s sVar, java.lang.String str) {
        this.f38155d = sVar;
        this.f38156e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c30.s sVar = this.f38155d;
        java.lang.String str = this.f38156e;
        sVar.getClass();
        if (str.length() == 0) {
            return;
        }
        c30.k kVar = (c30.k) ((java.util.LinkedHashMap) sVar.f38160c).get(str);
        if (kVar == null) {
            sVar.f38160c.put(str, new c30.k(str));
            kVar = (c30.k) ((java.util.LinkedHashMap) sVar.f38160c).get(str);
            if (kVar == null) {
                return;
            }
        }
        c30.j jVar = kVar.f38142c;
        if (jVar == c30.j.f38135e) {
            return;
        }
        if (jVar == c30.j.f38136f) {
            sVar.f38160c.put(str, new c30.k(str));
        }
        if ((kVar.f38142c == c30.j.f38137g) && android.os.SystemClock.elapsedRealtime() - kVar.f38141b > 3600000) {
            sVar.f38160c.put(str, new c30.k(str));
        }
        if (((java.util.ArrayList) sVar.a()).size() > 10) {
            sVar.b();
            return;
        }
        wu5.c cVar = sVar.f38161d;
        if (cVar != null) {
            cVar.cancel(false);
        }
        sVar.f38161d = ((ku5.t0) ku5.t0.f312615d).l(new c30.r(sVar), 500L, "EcsWeShopInfoUpdater");
    }
}
