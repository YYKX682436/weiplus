package lx;

/* loaded from: classes9.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f403529e;

    public w3(yz5.l lVar, java.util.List list) {
        this.f403528d = lVar;
        this.f403529e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.util.List list = this.f403529e;
        int d17 = kz5.b1.d(kz5.d0.q(list, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        for (java.lang.Object obj : list) {
            linkedHashMap.put(obj, yw.r3.f547983a.a((java.lang.String) obj, true));
        }
        this.f403528d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(kz5.c1.t(linkedHashMap))));
    }
}
