package kk4;

/* loaded from: classes14.dex */
public final class d0 implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk4.f0 f390054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener f390055e;

    public d0(kk4.f0 f0Var, com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener) {
        this.f390054d = f0Var;
        this.f390055e = iOnPreparedListener;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        lk4.a aVar = this.f390054d.f390072o;
        if (aVar != null) {
            int mo100924x2d67b867 = (int) interfaceC26164x73fc6bc6.mo100924x2d67b867(103);
            int mo100924x2d67b8672 = (int) interfaceC26164x73fc6bc6.mo100924x2d67b867(105);
            lk4.b bVar = (lk4.b) aVar;
            bVar.f400551e = ((((mo100924x2d67b867 * mo100924x2d67b8672) * 20) / 1000) * 16) / 8;
            int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
            int Ni = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).getClass();
            java.lang.String scene = bVar.f400547a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
            long wi6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
            bVar.f400550d = wi6;
            int aj6 = wi6 > 0 ? ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).aj(bVar.f400550d, Di, Ni, bVar.f400548b, mo100924x2d67b8672, mo100924x2d67b867) : 0;
            bVar.f400552f = aj6 == 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f400549c, "init expectedFrameSize:" + bVar.f400551e + " channel: " + mo100924x2d67b867 + " sampleRate: " + mo100924x2d67b8672 + ", hearingAid Init ret: " + aj6 + ", type: " + Di + ", device: " + Ni + ", scene: " + scene);
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener iOnPreparedListener = this.f390055e;
        if (iOnPreparedListener != null) {
            iOnPreparedListener.mo53283x58d5b73c(interfaceC26164x73fc6bc6);
        }
    }
}
