package ry2;

/* loaded from: classes10.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry2.t f483017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f483018e;

    public s(ry2.t tVar, java.util.ArrayList arrayList) {
        this.f483017d = tVar;
        this.f483018e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        ry2.t tVar = this.f483017d;
        java.util.ArrayList arrayList = tVar.f483022s;
        if (arrayList != null) {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) obj;
                boolean z17 = i17 == 0;
                java.util.ArrayList arrayList2 = this.f483018e;
                java.lang.String e17 = (arrayList2 == null || arrayList2.size() <= i17 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) arrayList2.get(i17))) ? mv2.q.f413151a.e(str2, null) : (java.lang.String) arrayList2.get(i17);
                java.util.ArrayList arrayList3 = tVar.f483025v;
                java.lang.String e18 = (arrayList3 == null || (str = (java.lang.String) kz5.n0.a0(arrayList3, i17)) == null) ? null : mv2.q.f413151a.e(str, null);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
                    android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(e17, null);
                    android.graphics.Bitmap J3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(e18, null);
                    tVar.f483024u.add(e17);
                    if (e18 != null && J3 != null) {
                        tVar.f483026w.add(e18);
                    }
                    if (J2 != null) {
                        pm0.v.X(new ry2.r(i17, z17, tVar, J2));
                    }
                }
                java.util.ArrayList arrayList4 = tVar.f483022s;
                if (i17 == (arrayList4 != null ? arrayList4.size() : 0) - 1) {
                    tVar.l();
                }
                i17 = i18;
            }
        }
    }
}
