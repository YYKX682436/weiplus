package ai4;

/* loaded from: classes11.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.q0 f5140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5142f;

    public f0(l75.q0 q0Var, java.lang.String str, java.lang.String str2) {
        this.f5140d = q0Var;
        this.f5141e = str;
        this.f5142f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.q0 q0Var = this.f5140d;
        qi4.b bVar = q0Var instanceof qi4.b ? (qi4.b) q0Var : null;
        if (bVar != null) {
            java.lang.String str = this.f5141e;
            if (str == null) {
                str = "";
            }
            bVar.L3(str, -1, this.f5142f);
        }
    }
}
