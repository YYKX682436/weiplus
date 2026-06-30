package nj2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nj2.h f419363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nj2.h hVar) {
        super(3);
        this.f419363d = hVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        r45.kf5 kf5Var = (r45.kf5) obj2;
        java.lang.String focusId = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusId, "focusId");
        if (!booleanValue && kf5Var != null) {
            nj2.h hVar = this.f419363d;
            android.widget.TextView textView = hVar.P;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micPriceText");
                throw null;
            }
            textView.setText(java.lang.String.valueOf(kf5Var.f460191f));
            boolean z17 = kf5Var.f460195m;
            qo0.c f17 = hVar.I.f();
            qo0.b bVar = qo0.b.Q4;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_FINDER_LIVE_FORCE_USER_ID", focusId);
            bundle.putInt("PARAM_FINDER_LIVE_MIC_MODE", z17 ? 2 : 1);
            f17.mo46557x60d69242(bVar, bundle);
        }
        return jz5.f0.f384359a;
    }
}
