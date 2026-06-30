package rp2;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f480114d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962) {
        super(1);
        this.f480114d = c14522x8ffd8962;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.s7 it = (r45.s7) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f480114d;
        mn0.b0 player = c14522x8ffd8962.getPlayer();
        if (player != null) {
            android.content.Context context = c14522x8ffd8962.getContext();
            if (!java.lang.Boolean.valueOf(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112).booleanValue()) {
                context = null;
            }
            if (context == null) {
                context = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a.b();
            }
            ((mn0.y) player).r(c14522x8ffd8962.i(context), c14522x8ffd8962.P, it.m75939xb282bd08(0), it.m75939xb282bd08(1));
        }
        return jz5.f0.f384359a;
    }
}
