package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f220641d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 f220642e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 f220643f;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15835xa11d0ad8 c15835xa11d0ad8) {
        this.f220643f = i3Var;
        this.f220641d = j17;
        this.f220642e = c15835xa11d0ad8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220643f;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 : i3Var.f220699e) {
            if (c15731x94356d67.seq == this.f220641d) {
                if (c15731x94356d67.f36572xbfcc3e0 == null) {
                    c15731x94356d67.f36572xbfcc3e0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd();
                }
                c15731x94356d67.f36572xbfcc3e0.f36784xc460ce3 = this.f220642e;
                java.util.List list = i3Var.f220699e;
                list.set(list.indexOf(c15731x94356d67), c15731x94356d67);
                return;
            }
        }
    }
}
