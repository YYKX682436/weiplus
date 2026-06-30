package ls0;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.v f402412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ls0.v vVar) {
        super(4);
        this.f402412d = vVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        long longValue = ((java.lang.Number) obj2).longValue();
        ((java.lang.Boolean) obj4).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((android.media.MediaCodec.BufferInfo) obj3, "<anonymous parameter 2>");
        java.lang.String str = this.f402412d.f402468g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDecode, format:");
        fs0.g gVar = this.f402412d.f402463b;
        sb6.append(gVar != null ? gVar.f347770g : null);
        sb6.append(", pts:");
        sb6.append(longValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ls0.v vVar = this.f402412d;
        synchronized (vVar.f402466e) {
            fs0.g gVar2 = vVar.f402463b;
            android.media.MediaFormat mediaFormat = gVar2 != null ? gVar2.f347770g : null;
            if (!vVar.f402465d) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(vVar.f402468g, "stopDecoder");
                fs0.g gVar3 = vVar.f402463b;
                if (gVar3 != null) {
                    gVar3.c();
                }
                android.os.HandlerThread handlerThread = vVar.f402469h;
                if (handlerThread != null) {
                    handlerThread.quitSafely();
                }
                vVar.f402467f.mo50293x3498a0(new ls0.o(vVar, mediaFormat));
                vVar.f402465d = true;
            }
        }
        return jz5.f0.f384359a;
    }
}
