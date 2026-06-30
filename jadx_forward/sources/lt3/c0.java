package lt3;

/* loaded from: classes10.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.r f402737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt3.f0 f402738e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(yz5.r rVar, lt3.f0 f0Var) {
        super(4);
        this.f402737d = rVar;
        this.f402738e = f0Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String mixVideo = (java.lang.String) obj;
        java.lang.String mixThumb = (java.lang.String) obj2;
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        int intValue = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixVideo, "mixVideo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixThumb, "mixThumb");
        yz5.r rVar = this.f402737d;
        if (rVar != null) {
            rVar.C(mixVideo, mixThumb, java.lang.Boolean.valueOf(booleanValue), java.lang.Integer.valueOf(intValue));
        }
        lt3.f0 f0Var = this.f402738e;
        android.os.HandlerThread handlerThread = f0Var.f402770z;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.VideoMixer", "[onFinish] quit mixThread=" + f0Var.f402770z);
        f0Var.f402746b = null;
        return jz5.f0.f384359a;
    }
}
