package u32;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u32.p f505844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f505845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u32.a1 f505846f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int[] f505847g;

    public j(u32.p pVar, int i17, u32.a1 a1Var, int[] iArr) {
        this.f505844d = pVar;
        this.f505845e = i17;
        this.f505846f = a1Var;
        this.f505847g = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (u32.p.a(this.f505844d, this.f505845e, this.f505846f, this.f505847g)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.exdevice.BluetoothSDKAdapter", "instance.scanImp failed!!!");
    }
}
