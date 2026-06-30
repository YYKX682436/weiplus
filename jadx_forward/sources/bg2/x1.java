package bg2;

/* loaded from: classes3.dex */
public final class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.d2 f102165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f102167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102168g;

    public x1(bg2.d2 d2Var, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, r45.qt2 qt2Var) {
        this.f102165d = d2Var;
        this.f102166e = context;
        this.f102167f = c19792x256d2725;
        this.f102168g = qt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.d2 d2Var = this.f102165d;
        d2Var.Z6(this.f102166e, this.f102167f, this.f102168g, true, d2Var.f101559y).l();
    }
}
