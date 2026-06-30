package kj2;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.s f389965d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kj2.s sVar) {
        super(1);
        this.f389965d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        kj2.s sVar = this.f389965d;
        if (sVar.m174009x3a33aac1().a0().K() == null || sVar.m145851x309290b1() != pm2.a.f438395r) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4 = sVar.m151491x9fd65ab4();
            if (m151491x9fd65ab4 != null) {
                m151491x9fd65ab4.m56876x52d2f021(intValue);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab42 = sVar.m151491x9fd65ab4();
            if (m151491x9fd65ab42 != null) {
                m151491x9fd65ab42.m56876x52d2f021(sVar.U);
            }
        }
        return jz5.f0.f384359a;
    }
}
