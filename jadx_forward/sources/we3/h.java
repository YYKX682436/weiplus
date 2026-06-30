package we3;

/* loaded from: classes7.dex */
public final class h implements com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ we3.k f526809d;

    public h(we3.k kVar) {
        this.f526809d = kVar;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        if (i17 == 2012) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPlayEvent, event: ");
        sb6.append(i17);
        sb6.append(", playId: ");
        we3.k kVar = this.f526809d;
        sb6.append(kVar.f526813b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBFinderLivePlayerItem", sb6.toString());
        if (i17 == 2003) {
            ve3.q.c(kVar, "onLiveFirstFrame", null, 2, null);
        } else if (i17 == 2006) {
            ve3.q.c(kVar, "onLiveEnd", null, 2, null);
        } else {
            if (i17 != 2103) {
                return;
            }
            ve3.q.c(kVar, "onLiveWarningReconnect", null, 2, null);
        }
    }
}
