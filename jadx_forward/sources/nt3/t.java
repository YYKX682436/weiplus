package nt3;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f421342d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nt3.a0 a0Var) {
        super(4);
        this.f421342d = a0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Boolean) obj4).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.media.MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        nt3.a0 a0Var = this.f421342d;
        int i17 = a0Var.H + 1;
        a0Var.H = i17;
        long j17 = a0Var.f421257o;
        if (j17 >= 0) {
            longValue -= j17 * 1000;
        }
        if (!a0Var.f421253k) {
            ls0.b1 b1Var = a0Var.f421263u;
            if (i17 == 1) {
                b1Var.f((-1) * java.lang.Math.round(((float) 1000) / a0Var.f421252j) * 1000);
            }
            b1Var.f(longValue);
        }
        return jz5.f0.f384359a;
    }
}
