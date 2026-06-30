package hr3;

/* loaded from: classes9.dex */
public class p8 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f365412a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.z9 f365413b;

    public p8(boolean z17, com.p314xaae8f345.mm.ui.z9 z9Var) {
        this.f365412a = z17;
        this.f365413b = z9Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int n17 = c01.z1.n();
        boolean z17 = this.f365412a;
        c01.d9.b().p().w(34, java.lang.Integer.valueOf(z17 ? n17 & (-33554433) : n17 | com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432));
        r45.u85 u85Var = new r45.u85();
        u85Var.f468669d = com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432;
        u85Var.f468670e = !z17 ? 1 : 0;
        ((e21.z0) c01.d9.b().w()).c(new xg3.p0(39, u85Var));
        com.p314xaae8f345.mm.ui.z9 z9Var = this.f365413b;
        if (z9Var != null) {
            z9Var.mo735xb0dfc7d8(null, null);
        }
    }
}
