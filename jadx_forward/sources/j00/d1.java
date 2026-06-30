package j00;

/* loaded from: classes9.dex */
public final class d1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378277f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f378278g;

    public d1(j00.k1 k1Var, java.lang.String str, java.lang.String str2, boolean z17) {
        this.f378275d = k1Var;
        this.f378276e = str;
        this.f378277f = str2;
        this.f378278g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f378275d.ij(this.f378276e, this.f378277f, this.f378278g, null);
    }
}
