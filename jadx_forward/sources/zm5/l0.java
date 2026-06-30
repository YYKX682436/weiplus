package zm5;

/* loaded from: classes14.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c1.k f555776d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(c1.k kVar) {
        super(1);
        this.f555776d = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryMainUIC", "isShow: " + booleanValue);
        if (!booleanValue) {
            c1.j.a(this.f555776d, false, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
