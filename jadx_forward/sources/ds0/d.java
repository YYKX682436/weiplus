package ds0;

/* loaded from: classes5.dex */
public final class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ds0.d0 f324323d;

    public d(ds0.d0 d0Var) {
        this.f324323d = d0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (it.what != 1024) {
            return false;
        }
        java.lang.Object obj = it.obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.media.codec.MediaCodecAACCodec.EncoderData");
        ds0.c cVar = (ds0.c) obj;
        ds0.d0 d0Var = this.f324323d;
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start encode data ");
        sb6.append(cVar.f324319a.length);
        sb6.append(", pts:");
        long j17 = cVar.f324320b;
        sb6.append(j17);
        sb6.append(", isLast: ");
        boolean z17 = cVar.f324321c;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCodecAACCodec", sb6.toString());
        gs0.a aVar = d0Var.f324330g;
        if (aVar != null) {
            aVar.c(cVar.f324319a, j17, z17);
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAudioEncoder");
        throw null;
    }
}
