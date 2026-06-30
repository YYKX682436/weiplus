package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f220630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f220631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f220632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 f220633g;

    public e3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var, int i17, boolean z17, boolean z18) {
        this.f220633g = i3Var;
        this.f220630d = i17;
        this.f220631e = z17;
        this.f220632f = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220633g;
        long j17 = this.f220630d == 1 ? i3Var.f220709r.f220507t2 : i3Var.f220709r.K2;
        if (j17 > 0) {
            int i17 = 0;
            if (i3Var.f220709r.F2.size() > 0) {
                for (int size = i3Var.f220709r.F2.size() - 1; size >= 0 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220709r.F2.get(size)).seq > j17 && !com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3.x(i3Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220709r.F2.get(size)); size--) {
                    i17++;
                }
            } else {
                if (i3Var.f220699e.size() <= 0) {
                    return;
                }
                for (int size2 = i3Var.f220699e.size() - 1; size2 >= 0 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220699e.get(size2)).seq > j17 && !com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3.x(i3Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67) i3Var.f220699e.get(size2)); size2--) {
                    i17++;
                }
            }
            if (this.f220631e) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30 c5766xc8f5ea30 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5766xc8f5ea30();
                c5766xc8f5ea30.f136083g.f89734a = i17;
                c5766xc8f5ea30.e();
            }
            if (this.f220632f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15859x7405890d.n1(i3Var.f220709r, i17);
            }
        }
    }
}
