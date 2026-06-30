package fg;

/* loaded from: classes5.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f343282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fg.f f343283e;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, fg.f fVar) {
        this.f343282d = h0Var;
        this.f343283e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Integer num = (java.lang.Integer) this.f343282d.f391656d;
        if (num != null) {
            int intValue = num.intValue();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DelegateEditText", "updateStyle, maxLength: " + intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1 g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.v1.g(this.f343283e);
            g17.f124094f = 0;
            g17.f124093e = intValue;
            g17.f124089a = false;
            g17.f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1;
            g17.d(null);
        }
    }
}
