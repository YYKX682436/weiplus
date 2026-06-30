package d04;

/* loaded from: classes13.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 f306978d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34) {
        super(1);
        this.f306978d = c17329xab0bbc34;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int m68788x51c2b4;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34 = this.f306978d;
        if (intValue == 0) {
            d04.e1 productListCallBack = c17329xab0bbc34.getProductListCallBack();
            if (productListCallBack != null) {
                ((d04.n2) productListCallBack).a(6);
            }
        } else if (intValue == 1) {
            m68788x51c2b4 = c17329xab0bbc34.m68788x51c2b4();
            c17329xab0bbc34.m68791x7d873e61(m68788x51c2b4 - 0);
            d04.e1 productListCallBack2 = c17329xab0bbc34.getProductListCallBack();
            if (productListCallBack2 != null) {
                ((d04.n2) productListCallBack2).a(0);
            }
        }
        return jz5.f0.f384359a;
    }
}
