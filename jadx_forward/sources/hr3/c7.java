package hr3;

/* loaded from: classes9.dex */
public class c7 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f364979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f364980b;

    public c7(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f364979a = z17;
        this.f364980b = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f364979a;
        int i17 = z17 ? n17 & (-8193) : n17 | 8192;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(i17));
        ((e21.z0) c01.d9.b().w()).c(new e21.t(2048, "", "", 0, "", "", "", 0, 0, 0, "", "", "", i17, "", 0, "", 0));
        if (!z17) {
            m61.k.Bi().f474402d.A("facebookfriend", "delete from facebookfriend");
            c01.d9.b().p().w(65828, "");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).k("facebookapp");
            ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).J0("facebookapp");
        }
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f364980b;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
