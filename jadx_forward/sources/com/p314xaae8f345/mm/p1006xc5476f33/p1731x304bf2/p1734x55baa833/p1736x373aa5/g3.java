package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes15.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f220664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d f220665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 f220666f;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15828x8e93965d c15828x8e93965d) {
        this.f220666f = i3Var;
        this.f220664d = j17;
        this.f220665e = c15828x8e93965d;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.i3 i3Var = this.f220666f;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 : i3Var.f220699e) {
            if (c15731x94356d67.seq == this.f220664d) {
                if (c15731x94356d67.f36572xbfcc3e0 == null) {
                    c15731x94356d67.f36572xbfcc3e0 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15792xf92d0ffd();
                }
                c15731x94356d67.f36572xbfcc3e0.f36783xce4135be = this.f220665e;
                java.util.List list = i3Var.f220699e;
                list.set(list.indexOf(c15731x94356d67), c15731x94356d67);
                return;
            }
        }
    }
}
