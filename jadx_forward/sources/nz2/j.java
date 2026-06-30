package nz2;

/* loaded from: classes9.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f423093d;

    public j(nz2.n nVar, boolean z17) {
        this.f423093d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FINGER", this.f423093d);
    }
}
