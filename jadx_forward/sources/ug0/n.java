package ug0;

/* loaded from: classes8.dex */
public final class n implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug0.q f509000d;

    public n(ug0.q qVar) {
        this.f509000d = qVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearchCommonSyncRedDotFSC", "onObserveRedDotPathDB, changed: " + aVar.f186864e);
        j75.f Ai = this.f509000d.f381800d.Ai();
        if (Ai != null) {
            Ai.B3(new tg0.j2(aVar));
        }
    }
}
