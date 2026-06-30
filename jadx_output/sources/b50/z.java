package b50;

/* loaded from: classes9.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f18006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f18007e;

    public z(yz5.l lVar, java.util.List list) {
        this.f18006d = lVar;
        this.f18007e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f18007e;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(obj, yw.r3.f466450a.a((java.lang.String) obj, true));
        }
        this.f18006d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kz5.c1.t(linkedHashMap))));
    }
}
