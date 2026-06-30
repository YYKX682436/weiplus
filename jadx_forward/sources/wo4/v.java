package wo4;

/* loaded from: classes10.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f529824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(wo4.y yVar) {
        super(1);
        this.f529824d = yVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        gs0.b iMediaCodecTransEncoder = (gs0.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iMediaCodecTransEncoder, "iMediaCodecTransEncoder");
        wo4.y yVar = this.f529824d;
        iMediaCodecTransEncoder.f356506c = new wo4.t(yVar);
        iMediaCodecTransEncoder.f356507d = new wo4.u(yVar);
        iMediaCodecTransEncoder.f356509f = true;
        return jz5.f0.f384359a;
    }
}
