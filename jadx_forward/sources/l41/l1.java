package l41;

/* loaded from: classes.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final l41.l1 f397398d = new l41.l1();

    public l1() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        if (booleanValue) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", java.lang.Boolean.valueOf(booleanValue));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuLocationReqController", "reportLocation success=%s", java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f384359a;
    }
}
