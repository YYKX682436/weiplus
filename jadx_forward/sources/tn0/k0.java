package tn0;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.w0 f502248d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(tn0.w0 w0Var) {
        super(4);
        this.f502248d = w0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        byte[] audioBuffer = (byte[]) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        long longValue = ((java.lang.Number) obj4).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioBuffer, "audioBuffer");
        tn0.w0 w0Var = this.f502248d;
        w0Var.getClass();
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = new com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame();
        tRTCAudioFrame.f57041x2eefaa = audioBuffer;
        tRTCAudioFrame.f57043x88751aa = intValue;
        tRTCAudioFrame.f57040x2c0b7d03 = intValue2;
        tRTCAudioFrame.f57044x3492916 = longValue;
        w0Var.T().mo30292xd8a054de(tRTCAudioFrame);
        return jz5.f0.f384359a;
    }
}
