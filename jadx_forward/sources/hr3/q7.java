package hr3;

/* loaded from: classes9.dex */
public class q7 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f365447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f365448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f365449c;

    public q7(boolean z17, android.content.Context context, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f365447a = z17;
        this.f365448b = context;
        this.f365449c = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        boolean z17 = this.f365447a;
        if (z17) {
            hr3.u7.b(true);
        }
        int n17 = c01.z1.n();
        int i17 = z17 ? n17 & (-17) : n17 | 16;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            hr3.u7.a(this.f365448b);
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f365449c;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
