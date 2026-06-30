package d04;

/* loaded from: classes13.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 f306951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34) {
        super(1);
        this.f306951d = c17329xab0bbc34;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        d04.e1 productListCallBack;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17329xab0bbc34 c17329xab0bbc34 = this.f306951d;
        if (intValue == 0) {
            d04.e1 productListCallBack2 = c17329xab0bbc34.getProductListCallBack();
            if (productListCallBack2 != null) {
                ((d04.n2) productListCallBack2).a(4);
            }
        } else if (intValue == 1 && (productListCallBack = c17329xab0bbc34.getProductListCallBack()) != null) {
            ((d04.n2) productListCallBack).a(1);
        }
        return jz5.f0.f384359a;
    }
}
