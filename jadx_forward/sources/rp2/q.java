package rp2;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f480127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962) {
        super(1);
        this.f480127d = c14522x8ffd8962;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        int i17 = 2;
        java.lang.Integer[] numArr = {2003, java.lang.Integer.valueOf(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46353xae58057)};
        int i18 = 0;
        while (true) {
            if (i18 >= 2) {
                z17 = false;
                break;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(numArr[i18], valueOf)) {
                z17 = true;
                break;
            }
            i18++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f480127d;
        if (!z17) {
            i17 = intValue < 0 ? 1 : c14522x8ffd8962.getPlayStatus();
        }
        c14522x8ffd8962.m58397x7abc1648(i17);
        return jz5.f0.f384359a;
    }
}
