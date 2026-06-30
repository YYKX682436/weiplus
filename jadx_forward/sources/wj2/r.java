package wj2;

/* loaded from: classes10.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528247d;

    public r(wj2.w wVar) {
        this.f528247d = wVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wj2.w wVar = this.f528247d;
        if (wVar.f528264x == 1) {
            wj2.w.v(wVar);
            wVar.f528265y = true;
        }
        wVar.f528264x = 0;
        wVar.O();
    }
}
