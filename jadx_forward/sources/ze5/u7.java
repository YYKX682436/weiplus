package ze5;

/* loaded from: classes9.dex */
public final class u7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f553764d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(yb5.d dVar) {
        super(1);
        this.f553764d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        sb5.r2 r2Var = (sb5.r2) this.f553764d.f542241c.a(sb5.r2.class);
        if (r2Var != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp hpVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hp) r2Var;
            if (!booleanValue) {
                fd5.d m07 = hpVar.m0();
                if (m07 != null) {
                    m07.c(false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawMdScroll", "onStreamFeedingStateChanged: feeding ended, setLayoutToLast(false)");
            }
        }
        return jz5.f0.f384359a;
    }
}
