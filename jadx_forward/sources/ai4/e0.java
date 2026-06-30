package ai4;

/* loaded from: classes11.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.q0 f86669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86671f;

    public e0(l75.q0 q0Var, java.lang.String str, java.lang.String str2) {
        this.f86669d = q0Var;
        this.f86670e = str;
        this.f86671f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.q0 q0Var = this.f86669d;
        qi4.b bVar = q0Var instanceof qi4.b ? (qi4.b) q0Var : null;
        if (bVar != null) {
            java.lang.String str = this.f86670e;
            if (str == null) {
                str = "";
            }
            bVar.L3(str, -1, this.f86671f);
        }
    }
}
