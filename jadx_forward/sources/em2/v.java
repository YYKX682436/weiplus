package em2;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em2.w f336709d;

    public v(em2.w wVar) {
        this.f336709d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        em2.w wVar = this.f336709d;
        if (wVar.f336711b == 1) {
            wVar.getClass();
            boolean z17 = (c01.z1.i() & 1073741824) == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "getPlayDesktopSwitch " + z17);
            if (!z17) {
                wVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveMiniWindowReporter", "skip report enter because user setting");
                return;
            }
        }
        wVar.b();
    }
}
