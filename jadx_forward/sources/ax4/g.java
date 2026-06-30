package ax4;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ nw4.k C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f96661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 f96662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(nw4.y2 y2Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var, nw4.k kVar) {
        super(0);
        this.f96661d = y2Var;
        this.f96662e = z0Var;
        this.C = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nw4.k kVar = this.C;
        nw4.y2 y2Var = this.f96661d;
        try {
            android.os.Bundle b17 = nw4.y2.b(y2Var.f422323a);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = this.f96662e;
            if (z0Var != null) {
                z0Var.ec();
            }
            if (z0Var != null) {
                z0Var.b(b17);
            }
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewNativePageUtil", "closeWindow ex " + e17.getMessage());
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail", null);
        }
        return jz5.f0.f384359a;
    }
}
