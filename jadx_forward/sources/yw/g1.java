package yw;

/* loaded from: classes11.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.g1 f547858d = new yw.g1();

    public g1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.sl b17 = ur1.n.f511894a.b();
        boolean z17 = true;
        if (b17.f467354e != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.is_feature_open = " + b17.f467354e);
        } else {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(b17.f467353d)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterStrategy", "canShowPersonalCenter = true");
                return java.lang.Boolean.valueOf(z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizPersonalCenterStrategy", "cellInfoList.cell_list is Empty");
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
