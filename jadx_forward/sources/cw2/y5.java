package cw2;

/* loaded from: classes14.dex */
public final class y5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.z5 f305651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f305653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f305654g;

    public y5(cw2.z5 z5Var, int i17, int i18, int i19) {
        this.f305651d = z5Var;
        this.f305652e = i17;
        this.f305653f = i18;
        this.f305654g = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw2.b6 b6Var = this.f305651d.f305668c;
        if (b6Var != null) {
            b6Var.f305132e = this.f305652e;
            b6Var.f305133f = this.f305653f;
            b6Var.f305134g = this.f305654g;
        }
    }
}
