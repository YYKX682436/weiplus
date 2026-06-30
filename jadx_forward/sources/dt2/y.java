package dt2;

/* loaded from: classes3.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.a0 f324746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dt2.a0 a0Var) {
        super(2);
        this.f324746d = a0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo seiInfo = (com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.TPVideoSeiInfo) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(seiInfo, "seiInfo");
        dt2.a0 a0Var = this.f324746d;
        byte[] bArr = seiInfo.f50907x75ae1ca1;
        ((ku5.t0) ku5.t0.f394148d).h(new dt2.x(intValue, bArr, a0Var), "Sei_Message_Handler");
        return jz5.f0.f384359a;
    }
}
