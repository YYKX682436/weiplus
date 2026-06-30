package tu1;

/* loaded from: classes13.dex */
public final class h implements com.p314xaae8f345.mm.sdk.p2603x2137b148.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tu1.o f503632d;

    public h(tu1.o oVar) {
        this.f503632d = oVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.os.Bundle data = it.getData();
        if (data != null) {
            byte b17 = data.getByte("data_type");
            byte[] byteArray = data.getByteArray("data_data");
            if (!(byteArray != null)) {
                byteArray = null;
            }
            if (byteArray != null) {
                tu1.o oVar = this.f503632d;
                if (b17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "onVideoFrame Ready");
                    wu1.c cVar = oVar.f503659q;
                    if (cVar != null) {
                        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.b(b17, byteArray, (byte) 0));
                        num = valueOf.intValue() != 0 ? valueOf : null;
                        if (num != null) {
                            num.intValue();
                            xu1.c cVar2 = xu1.c.f538729m;
                            oVar.f503660r = cVar2;
                            yz5.l lVar = oVar.f503661s;
                            if (lVar != null) {
                                lVar.mo146xb9724478(cVar2);
                            }
                        }
                    }
                } else if (b17 == 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenCastManager", "onAudioFrame Ready");
                    wu1.c cVar3 = oVar.f503659q;
                    if (cVar3 != null) {
                        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cVar3.b(b17, byteArray, (byte) 0));
                        num = valueOf2.intValue() != 0 ? valueOf2 : null;
                        if (num != null) {
                            num.intValue();
                            xu1.c cVar4 = xu1.c.f538729m;
                            oVar.f503660r = cVar4;
                            yz5.l lVar2 = oVar.f503661s;
                            if (lVar2 != null) {
                                lVar2.mo146xb9724478(cVar4);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
