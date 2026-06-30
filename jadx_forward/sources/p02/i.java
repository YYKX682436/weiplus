package p02;

/* loaded from: classes8.dex */
public class i implements vz.i1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3 f431932a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.p1363xc9fa65a8.C13237x4b7b34f3 c13237x4b7b34f3) {
        this.f431932a = c13237x4b7b34f3;
    }

    @Override // vz.i1
    public void Z(int i17, long j17) {
        h02.a c17;
        if (i17 != 9 || (c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17)) == null) {
            return;
        }
        p02.h hVar = this.f431932a.f178874g2;
        java.lang.String str = c17.f68404x28d45f97;
        java.util.ArrayList arrayList = hVar.f431931f;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(arrayList) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p02.l lVar = (p02.l) it.next();
            java.lang.String str2 = lVar.f431939d;
            if (str2 != null && str2.equals(str)) {
                lVar.f431938c = 2;
            }
        }
        hVar.m8146xced61ae5();
    }
}
