package up2;

/* loaded from: classes2.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14542xcd9688c0 f511330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14542xcd9688c0 c14542xcd9688c0) {
        super(3);
        this.f511330d = c14542xcd9688c0;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        sp2.k kVar;
        dk2.ic option = (dk2.ic) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        vp2.h0 item = (vp2.h0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        kVar = this.f511330d.outsideOperator;
        kVar.n(option, intValue, item);
        return jz5.f0.f384359a;
    }
}
