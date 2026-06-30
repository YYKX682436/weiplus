package ds0;

/* loaded from: classes10.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f324350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ds0.d0 d0Var) {
        super(2);
        this.f324350d = d0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        byte[] audioData = (byte[]) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioData, "audioData");
        ds0.d0.e(this.f324350d, audioData, longValue);
        return jz5.f0.f384359a;
    }
}
