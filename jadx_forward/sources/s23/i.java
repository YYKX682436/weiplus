package s23;

/* loaded from: classes4.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.i f483838d = new s23.i();

    public i() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        dx1.g.f326022a.j("SnsPublishProcess", booleanValue ? "blankCnt" : "refuseCnt", 1, bx1.u.f117843e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateHandleNew", "onSendItemClick deny permission, cancel: " + booleanValue);
        s23.n.f483851p = false;
        return jz5.f0.f384359a;
    }
}
