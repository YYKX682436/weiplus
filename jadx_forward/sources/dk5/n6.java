package dk5;

/* loaded from: classes8.dex */
public final class n6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f316300e;

    public n6(java.lang.String str, yz5.p pVar) {
        this.f316299d = str;
        this.f316300e = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zo3.p.wi();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(zo3.p.Ai());
        sb6.append("content_");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendWXMediaMessageHelper", "doCheckAndCopyFile filename: " + sb7 + ", ret: " + com.p314xaae8f345.mm.vfs.w6.d(this.f316299d, sb7, false));
        this.f316300e.mo149xb9724478(2, sb7);
    }
}
