package zn0;

/* loaded from: classes3.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555898d;

    public m(zn0.s sVar) {
        this.f555898d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn0.s sVar = this.f555898d;
        if (sVar.f555925j) {
            sVar.f555925j = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Call realPublishMediaStream");
            if (sVar.f555921f != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "Has nextDataWrap");
                sVar.f555920e = sVar.f555921f;
                sVar.f555921f = null;
            }
            sVar.f();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "shouldPublishMediaStreamAfterDelay is false");
        }
        sVar.f555928m = null;
    }
}
