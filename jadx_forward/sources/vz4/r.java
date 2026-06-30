package vz4;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523276d;

    public r(java.lang.String str) {
        this.f523276d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.HashSet hashSet = new java.util.HashSet();
        java.lang.String str = this.f523276d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            hashSet.add(str);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(vz4.b.c())) {
            hashSet.add(vz4.b.c());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2461x14f51cd8.f.b(hashSet, 0, -1, false);
    }
}
