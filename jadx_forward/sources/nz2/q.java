package nz2;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f423101d;

    public q(nz2.x xVar, boolean z17) {
        this.f423101d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("mmkv.wallet").putBoolean("MMKV_KEY_HAS_FACE_ID", this.f423101d);
    }
}
