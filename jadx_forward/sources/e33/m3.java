package e33;

/* loaded from: classes10.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    public int f328891a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final e33.v2 f328892b;

    public m3(e33.v2 v2Var) {
        this.f328892b = v2Var;
    }

    public final void a(int i17) {
        java.util.ArrayList arrayList = this.f328892b.f329035m;
        if (arrayList == null || arrayList.size() <= i17 || i17 < 0) {
            return;
        }
        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).f219967i;
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).f219966h;
        java.lang.String str2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).f219963e;
        t23.p0.h().e(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? str2 : str, ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).mo63659xfb85f7b0(), str2, j17, ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17)).f219968m);
    }
}
