package j00;

/* loaded from: classes9.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378474f;

    public x0(j00.k1 k1Var, java.lang.String str, java.lang.String str2) {
        this.f378472d = k1Var;
        this.f378473e = str;
        this.f378474f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f378472d.Ui(this.f378473e, this.f378474f);
    }
}
