package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vb implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ac f196234d;

    public vb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ac acVar) {
        this.f196234d = acVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("boxChangedObserver, ");
        sb6.append(concurrentHashMap != null ? java.lang.Integer.valueOf(concurrentHashMap.size()) : null);
        java.lang.String str = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxPlugin", "liveDataLog ".concat(str));
        if (concurrentHashMap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveBoxPlugin", "getAllBoxInfo is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ac acVar = this.f196234d;
        boolean z17 = true;
        if (acVar.f193385v.size() == concurrentHashMap.size()) {
            boolean z18 = false;
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (!acVar.f193385v.containsKey(entry.getKey()) || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(acVar.f193385v.get(entry.getKey()), entry.getValue())) {
                    z18 = true;
                }
            }
            z17 = z18;
        }
        acVar.f193385v.clear();
        acVar.f193385v.putAll(concurrentHashMap);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBoxPlugin", "mainFlowLog ".concat("status FINDER_LIVE_UPDATE_BOX_INFO"));
            acVar.f193379p.mo46557x60d69242(qo0.b.f446904j5, new android.os.Bundle());
        }
    }
}
