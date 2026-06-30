package mi1;

/* loaded from: classes7.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mi1.c0 f408058a = new mi1.c0();

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.AbstractC12505x244799f a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime, android.content.Context context, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = runtime.u0().L1;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        k91.r m07 = runtime.m0();
        boolean z18 = false;
        boolean f17 = m07 != null ? m07.f() : false;
        boolean z19 = halfScreenConfig.f158894h;
        if (!z17 ? z19 || !f17 : z19 || halfScreenConfig.b() == k91.b1.f387074e) {
            z18 = true;
        }
        int ordinal = halfScreenConfig.D.ordinal();
        if (ordinal == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12503x4dac22f0(context, z18);
        }
        if (ordinal == 1) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6.C12504x38244a7c(context, z18);
        }
        throw new jz5.j();
    }
}
