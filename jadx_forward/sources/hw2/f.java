package hw2;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.t f367060d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hw2.t tVar) {
        super(1);
        this.f367060d = tVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_1_BOOLEAN", booleanValue);
        hw2.t tVar = this.f367060d;
        tVar.f367094f.w(ju3.c0.f383440v, bundle);
        if (!booleanValue) {
            android.view.KeyEvent.Callback findViewById = tVar.e().findViewById(com.p314xaae8f345.mm.R.id.ept);
            os5.p pVar = findViewById instanceof os5.p ? (os5.p) findViewById : null;
            android.view.KeyEvent.Callback findViewById2 = tVar.e().findViewById(com.p314xaae8f345.mm.R.id.epl);
            os5.o oVar = findViewById2 instanceof os5.o ? (os5.o) findViewById2 : null;
            if (pVar != null) {
                pVar.mo57267x7a708d2(true);
            }
            if (oVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14302xfcce20b7) oVar).b(false);
            }
        }
        return jz5.f0.f384359a;
    }
}
