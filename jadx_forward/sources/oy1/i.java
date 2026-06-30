package oy1;

/* loaded from: classes13.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.net.ConnectivityManager f431407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oy1.l f431408e;

    public i(android.net.ConnectivityManager connectivityManager, oy1.l lVar) {
        this.f431407d = connectivityManager;
        this.f431408e = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.hasCapability(12) == true) goto L10;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r3 = this;
            android.net.ConnectivityManager r0 = r3.f431407d
            android.net.Network r1 = r0.getActiveNetwork()
            r2 = 0
            if (r1 == 0) goto L1d
            android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)
            if (r0 == 0) goto L19
            r1 = 12
            boolean r0 = r0.hasCapability(r1)
            r1 = 1
            if (r0 != r1) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L1d
            return
        L1d:
            oy1.l r0 = r3.f431408e
            r0.e(r2)
            java.lang.String r0 = "MicroMsg.BaseCgiReport"
            java.lang.String r1 = "net work onLost"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oy1.i.run():void");
    }
}
