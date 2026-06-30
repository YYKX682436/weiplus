package uj5;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj5.e f509979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(uj5.e eVar) {
        super(0);
        this.f509979d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        uj5.e eVar = this.f509979d;
        eVar.getClass();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.List P6 = eVar.P6(eVar.O6());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", "printLayoutInfo begin");
            java.util.Iterator it = ((java.util.ArrayList) P6).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", (java.lang.String) it.next());
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotPrintLayoutUIC", "printLayoutInfo end cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScreenShotPrintLayoutUIC", th6, "printLayoutInfo err", new java.lang.Object[0]);
        }
        return jz5.f0.f384359a;
    }
}
