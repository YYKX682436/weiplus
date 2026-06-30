package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class y90 implements fz2.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 f218075d;

    public y90(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15482x9b531b34 c15482x9b531b34) {
        this.f218075d = c15482x9b531b34;
    }

    @Override // fz2.b
    public void M7(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "onHeadsetStateChange on:" + z17);
        java.util.Iterator it = this.f218075d.f215216s.iterator();
        while (it.hasNext()) {
            ((fz2.b) it.next()).M7(z17);
        }
    }
}
