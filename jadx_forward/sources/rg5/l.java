package rg5;

/* loaded from: classes8.dex */
public final class l implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f476791d;

    public l(rg5.o oVar) {
        this.f476791d = oVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        rg5.o oVar = this.f476791d;
        try {
            boolean e17 = oVar.e();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "rcv redDot. enableLiveEntry=" + e17 + " inForeground=" + oVar.f476799f);
            if (e17 && oVar.f476799f) {
                oVar.d(aVar);
            }
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveEntryPreferenceMgr", "handle rcv redDot fail, " + e18);
        }
    }
}
