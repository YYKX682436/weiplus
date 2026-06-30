package zn0;

/* loaded from: classes3.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zn0.s f555897d;

    public l(zn0.s sVar) {
        this.f555897d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zn0.s sVar = this.f555897d;
        zn0.k kVar = sVar.f555922g;
        zn0.k kVar2 = zn0.k.f555892d;
        if (kVar == kVar2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "self.currentState is None");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePublishMediaStream", "currentState: " + sVar.f555922g);
            int ordinal = sVar.f555922g.ordinal();
            if (ordinal == 1) {
                sVar.f555922g = kVar2;
                sVar.g(zn0.j.f555888d, null, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                java.lang.String str = sVar.f555918c;
                if (!(str == null || str.length() == 0)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId is not nil: " + sVar.f555918c);
                    sVar.f555918c = null;
                }
                sVar.f555923h++;
                sVar.i();
            } else if (ordinal == 2) {
                sVar.f555922g = kVar2;
                java.lang.String str2 = sVar.f555918c;
                if (str2 == null || str2.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "publishMediaStreamTaskId.length is 0");
                } else {
                    sVar.g(zn0.j.f555889e, sVar.f555918c, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                    sVar.f555923h++;
                    sVar.j();
                }
            } else if (ordinal != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLivePublishMediaStream", "Invalid currentState: " + sVar.f555922g);
            } else {
                sVar.f555922g = kVar2;
                sVar.g(zn0.j.f555890f, sVar.f555918c, -16661, "WeChat Live wait PublishMediaStream result timeout", 0);
                sVar.h();
            }
        }
        sVar.f555929n = null;
    }
}
