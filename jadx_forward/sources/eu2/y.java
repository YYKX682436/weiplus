package eu2;

/* loaded from: classes2.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f338347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eu2.b0 f338348e;

    public y(long j17, eu2.b0 b0Var) {
        this.f338347d = j17;
        this.f338348e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSystemPlayerController", "[updateSystemPlayerWhenScreenOff] cancel notification, delayMs= " + this.f338347d + '!');
        this.f338348e.Ni();
    }
}
