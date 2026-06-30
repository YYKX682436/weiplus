package k35;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f385429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k35.c f385430e;

    public b(k35.c cVar, java.lang.String str) {
        this.f385430e = cVar;
        this.f385429d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        k35.c cVar = this.f385430e;
        java.lang.String str = this.f385429d;
        cVar.getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) <= 0) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactBlackListHelper", "onContactStorageNotifyChange isBLackListContact: %s, isSnsBlack: %s,", java.lang.Boolean.valueOf(n17.o2()), java.lang.Boolean.valueOf(n17.x2()));
        java.util.Set set = k35.c.f385432f;
        synchronized (set) {
            if (n17.o2()) {
                ((java.util.HashSet) set).add(str);
            } else {
                ((java.util.HashSet) set).remove(str);
            }
        }
        java.util.Set set2 = k35.c.f385433g;
        synchronized (set2) {
            if (n17.x2()) {
                ((java.util.HashSet) set2).add(str);
            } else {
                ((java.util.HashSet) set2).remove(str);
            }
        }
    }
}
