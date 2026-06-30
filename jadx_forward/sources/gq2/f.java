package gq2;

/* loaded from: classes2.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.j f356089d;

    public f(gq2.j jVar) {
        this.f356089d = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gq2.j jVar = this.f356089d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace78 = jVar.f356098h;
        if (c15359x536ace78 != null && c15359x536ace78.isAttachedToWindow()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace782 = jVar.f356098h;
            if (c15359x536ace782 != null && c15359x536ace782.m8301xa9089c07() == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTabViewPagerConvert", "onBindViewHolder: view pager post delay set page cache");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15359x536ace78 c15359x536ace783 = jVar.f356098h;
                if (c15359x536ace783 == null) {
                    return;
                }
                c15359x536ace783.m8321x40341e13(jVar.f356101n.size());
            }
        }
    }
}
