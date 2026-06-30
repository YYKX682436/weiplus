package ju5;

/* loaded from: classes15.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f383680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ju5.y f383681f;

    public s(ju5.y yVar, int i17, java.lang.CharSequence charSequence) {
        this.f383681f = yVar;
        this.f383679d = i17;
        this.f383680e = charSequence;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f383681f.f383700c.f383706h;
        if (dVar != null) {
            ((pe4.g) dVar).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterControllerFingerprint", "hy: on mp authen error errCode: %d, errMsg: %s", java.lang.Integer.valueOf(this.f383679d), this.f383680e);
        }
    }
}
