package tu1;

/* loaded from: classes13.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f503626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, tu1.o oVar) {
        super(1);
        this.f503626d = context;
        this.f503627e = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        byte[] pcmData = (byte[]) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcmData, "pcmData");
        if (iq.b.E() || iq.b.F(this.f503626d, false) || iq.b.H() || com.p314xaae8f345.mm.sdk.p2603x2137b148.l5.Bi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScreenCastManager", "current is in voip do not allow to send voice ");
        } else {
            byte[] copyOf = java.util.Arrays.copyOf(pcmData, pcmData.length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(copyOf, "copyOf(...)");
            java.lang.System.arraycopy(pcmData, 0, copyOf, 0, pcmData.length);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putByte("data_type", (byte) 2);
            bundle.putByteArray("data_data", copyOf);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f503627e.f503652j;
            if (n3Var != null) {
                android.os.Message message = new android.os.Message();
                message.setData(bundle);
                n3Var.mo50308x2936bf5f(message);
            }
        }
        return jz5.f0.f384359a;
    }
}
