package go5;

/* loaded from: classes14.dex */
public final class g0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public int f355665a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final cv.u0 f355666b = new cv.u0(this, 4);

    /* renamed from: c, reason: collision with root package name */
    public boolean f355667c;

    public g0() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        new tq4.b(context);
        this.f355667c = true;
    }

    public final void a() {
        this.f355667c = false;
        i95.m c17 = i95.n0.c(cv.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cv.w0.f9((cv.w0) c17, 3, null, 2, null);
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        cv.v0 it = (cv.v0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "accept: AudioRouteInfo:" + it + " isRingMode:" + this.f355667c);
        int i17 = it.f304051c;
        int i18 = it.f304049a;
        if (i17 == 1) {
            er4.c cVar = new er4.c();
            cVar.f337596g = it.f304052d;
            boolean[] zArr = cVar.f337597h;
            zArr[4] = true;
            cVar.f337594e = it.a();
            zArr[2] = true;
            cVar.f337593d = er4.d.a(i18);
            zArr[1] = true;
            cVar.f337595f = true;
            zArr[3] = true;
            this.f355665a = i18;
            if (i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_BLUETOOTH CONNECTED");
                ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.s(cVar, new go5.d0(this, it));
            return;
        }
        if (i17 == 2) {
            er4.c cVar2 = new er4.c();
            cVar2.f337596g = it.f304052d;
            boolean[] zArr2 = cVar2.f337597h;
            zArr2[4] = true;
            cVar2.f337594e = it.a();
            zArr2[2] = true;
            cVar2.f337593d = er4.d.a(i18);
            zArr2[1] = true;
            cVar2.f337595f = false;
            zArr2[3] = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_DISCONNECTED");
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.t(cVar2, go5.f0.f355663a);
            return;
        }
        if (i17 != 3) {
            if (i17 == 4 && i18 == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioRouter", "AUDIO_DEVICE_BLUETOOTH ACTIVE");
                if (this.f355667c) {
                    ((jp5.o) i95.n0.c(jp5.o.class)).Hd();
                    return;
                }
                return;
            }
            return;
        }
        er4.c cVar3 = new er4.c();
        cVar3.f337596g = it.f304052d;
        boolean[] zArr3 = cVar3.f337597h;
        zArr3[4] = true;
        cVar3.f337594e = it.a();
        zArr3[2] = true;
        cVar3.f337593d = er4.d.a(i18);
        zArr3[1] = true;
        cVar3.f337595f = false;
        zArr3[3] = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.r(cVar3, go5.e0.f355662a);
    }
}
