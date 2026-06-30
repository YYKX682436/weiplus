package sp2;

/* loaded from: classes2.dex */
public final class u0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.h0 f492760d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(vp2.h0 h0Var) {
        super(1);
        this.f492760d = h0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        dk2.hc selectedOption = (dk2.hc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedOption, "selectedOption");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onFirstResponseOptionSelected: " + selectedOption);
        try {
            dk2.dc dcVar = this.f492760d.f520459f;
            if (dcVar != null) {
                dcVar.c(selectedOption);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveEntranceFragmentViewCallback", "onFirstResponseOptionSelected: " + e17);
        }
        return jz5.f0.f384359a;
    }
}
