package rg5;

/* loaded from: classes8.dex */
public final class h extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rg5.o f476787d;

    public h(rg5.o oVar) {
        this.f476787d = oVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "onAppBackground activity=" + str);
        this.f476787d.f476799f = false;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveEntryPreferenceMgr", "onAppForeground activity=" + str);
        this.f476787d.f476799f = true;
    }
}
