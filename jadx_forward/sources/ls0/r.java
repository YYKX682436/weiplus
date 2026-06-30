package ls0;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f402418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ls0.v vVar) {
        super(1);
        this.f402418d = vVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.media.MediaFormat mediaFormat = (android.media.MediaFormat) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaFormat, "mediaFormat");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402418d.f402468g, "onFormatChanged, format:" + mediaFormat);
        ls0.v vVar = this.f402418d;
        synchronized (vVar.f402466e) {
            if (!vVar.f402465d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f402468g, "stopDecoder");
                fs0.g gVar = vVar.f402463b;
                if (gVar != null) {
                    gVar.c();
                }
                android.os.HandlerThread handlerThread = vVar.f402469h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                vVar.f402467f.mo50293x3498a0(new ls0.q(vVar, mediaFormat));
                vVar.f402465d = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
