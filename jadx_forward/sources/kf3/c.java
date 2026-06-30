package kf3;

/* loaded from: classes9.dex */
public class c extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f388856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f388857b;

    public c(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f388856a = z17;
        this.f388857b = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f388856a;
        int i17 = z17 ? n17 & (-65537) : n17 | 65536;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            kf3.e.a();
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f388857b;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
