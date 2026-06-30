package ol4;

/* loaded from: classes14.dex */
public final class e implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427686d;

    public e(ol4.q qVar) {
        this.f427686d = qVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnAudioProcessFrameOutputListener
    /* renamed from: onAudioProcessFrameOut */
    public com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a mo100987xff2eeff9(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 player, com.p314xaae8f345.p3006xb8ff1437.api.C26188x7aa7007a audioFrameBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(player, "player");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioFrameBuffer, "audioFrameBuffer");
        ol4.q qVar = this.f427686d;
        ll4.b bVar = qVar.f427737z;
        if (bVar != null) {
            bw5.y1 y1Var = new bw5.y1();
            y1Var.f116838e = audioFrameBuffer.f50944x88751aa;
            boolean[] zArr = y1Var.f116841h;
            zArr[2] = true;
            y1Var.f116839f = audioFrameBuffer.f50932x556423d0;
            zArr[3] = true;
            y1Var.f116837d = bw5.x1.PCMFormatS16LE;
            zArr[1] = true;
            y1Var.f116840g = true;
            zArr[4] = true;
            java.lang.String str = qVar.f427730s;
            int i17 = audioFrameBuffer.f50945x35e001[0];
            byte[] bArr = audioFrameBuffer.f50933x2eefaa[0];
            kl4.h hVar = qVar.A;
            com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788 a17 = hVar.a(i17, bArr);
            try {
                try {
                    ((kl4.q) bVar).a(a17, y1Var);
                    java.nio.ByteBuffer data = a17.getData();
                    data.rewind();
                    int min = java.lang.Math.min(data.remaining(), audioFrameBuffer.f50945x35e001[0]);
                    if (min == audioFrameBuffer.f50945x35e001[0]) {
                        byte[] bArr2 = new byte[min];
                        data.get(bArr2);
                        data.rewind();
                        java.lang.System.arraycopy(bArr2, 0, audioFrameBuffer.f50933x2eefaa[0], 0, min);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "notifyAudioFrameOut audio frame out callback size not match");
                    }
                    hVar.b(a17);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "audio frame out callback error: " + e17.getMessage());
                    hVar.b(a17);
                }
            } catch (java.lang.Throwable th6) {
                hVar.b(a17);
                throw th6;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18722xa53aee64 c18722xa53aee64 = qVar.f427736y;
        if (c18722xa53aee64 != null) {
            audioFrameBuffer = c18722xa53aee64.m72130xc0cff50f(audioFrameBuffer);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18723x96879d03 c18723x96879d03 = qVar.f427733v;
        if (c18723x96879d03 != null) {
            audioFrameBuffer = c18723x96879d03.m72141xc0cff50f(audioFrameBuffer);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18721x9ae6bd22 c18721x9ae6bd22 = qVar.f427735x;
        if (c18721x9ae6bd22 != null) {
            audioFrameBuffer = c18721x9ae6bd22.m72125xc0cff50f(audioFrameBuffer);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2295x6fbd6873.p2296xc53e9ae1.tts.p2297xdb7d1c3f.C18725xc88c8712 c18725xc88c8712 = qVar.f427734w;
        return c18725xc88c8712 != null ? c18725xc88c8712.m72203xc0cff50f(audioFrameBuffer) : audioFrameBuffer;
    }
}
