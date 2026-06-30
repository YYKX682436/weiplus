package ju5;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f383684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.y f383685f;

    public t(ju5.y yVar, int i17, java.lang.CharSequence charSequence) {
        this.f383685f = yVar;
        this.f383683d = i17;
        this.f383684e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f383685f.f383700c.f383706h != null) {
            java.lang.CharSequence charSequence = this.f383684e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterControllerFingerprint", "hy: mp on authen help errCode: %d, errMsg:%s", java.lang.Integer.valueOf(this.f383683d), charSequence == null ? "unknown error" : charSequence.toString());
        }
    }
}
