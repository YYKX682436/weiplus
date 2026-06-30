package yn1;

/* loaded from: classes11.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545354d;

    public s0(java.lang.String str) {
        this.f545354d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Using account path=");
        sb6.append(yn1.z0.f545466a.g());
        sb6.append(", and delete guestCachePath=");
        java.lang.String str = this.f545354d;
        sb6.append(str);
        sb6.append(", ");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationGlobalHolder", sb6.toString());
        com.p314xaae8f345.mm.vfs.w6.g(str, true);
    }
}
