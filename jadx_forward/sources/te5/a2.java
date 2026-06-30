package te5;

/* loaded from: classes5.dex */
public final class a2 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f500143d;

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View view = (android.view.View) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (booleanValue || this.f500143d != 0) {
            if (booleanValue) {
                this.f500143d = java.lang.System.currentTimeMillis();
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f500143d;
                this.f500143d = 0L;
                if (te5.d2.f500160a) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6368xb9cb36fa c6368xb9cb36fa = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6368xb9cb36fa();
                    c6368xb9cb36fa.f137171d = 0;
                    c6368xb9cb36fa.f137172e = (int) currentTimeMillis;
                    c6368xb9cb36fa.o();
                    c6368xb9cb36fa.k();
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopLoadExpReport", "no need rpt");
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
