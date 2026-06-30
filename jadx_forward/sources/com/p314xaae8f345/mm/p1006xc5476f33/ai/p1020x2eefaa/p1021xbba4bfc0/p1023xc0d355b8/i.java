package com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashSet f156203d = new java.util.HashSet();

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TriggerManager", "TriggerManager onAccountInitialized");
        java.util.Iterator it = this.f156203d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h) it.next()).a();
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TriggerManager", "TriggerManager onAccountReleased");
        java.util.Iterator it = this.f156203d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.h) it.next()).b();
        }
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TriggerManager", "TriggerManager oncreate");
        java.util.HashSet hashSet = this.f156203d;
        hashSet.add(new com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.g());
        hashSet.add(new com.p314xaae8f345.mm.p1006xc5476f33.ai.p1020x2eefaa.p1021xbba4bfc0.p1023xc0d355b8.e());
    }
}
