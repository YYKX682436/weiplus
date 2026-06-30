package sk4;

/* loaded from: classes15.dex */
public final class l implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sk4.p f490516a;

    public l(sk4.p pVar) {
        this.f490516a = pVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AudioRecorderImpl", "onRecError " + i17 + ' ' + i18);
    }

    @Override // tl.c
    public void b(byte[] pcm, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pcm, "pcm");
        sk4.p pVar = this.f490516a;
        pVar.f490528m++;
        sk4.c cVar = new sk4.c();
        cVar.f381964d = pVar.f490528m;
        cVar.mo105982x3f27f04a(0);
        this.f490516a.getClass();
        double d17 = 0.0d;
        for (int i18 = 0; i18 < i17; i18 += 2) {
            double abs = java.lang.Math.abs((short) ((pcm[i18] & 255) | ((pcm[i18 + 1] & 255) << 8)));
            if (abs > d17) {
                d17 = abs;
            }
        }
        cVar.f381965e = (float) ((d17 / 32767.0d) * 100);
        cVar.mo105982x3f27f04a(1);
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(pcm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wrap, "wrap(...)");
        cVar.f490502g = new com.p314xaae8f345.p3118xeeebfacc.C26831x7765d788(wrap);
        ((ku5.t0) ku5.t0.f394148d).h(new sk4.k(this.f490516a, cVar, i17), "MicroMsg.AudioRecorderImpl");
    }
}
