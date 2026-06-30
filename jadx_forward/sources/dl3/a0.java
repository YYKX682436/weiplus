package dl3;

/* loaded from: classes13.dex */
public class a0 implements com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a {

    /* renamed from: d, reason: collision with root package name */
    public n01.b f316805d = null;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl3.d0 f316806e;

    public a0(dl3.d0 d0Var) {
        this.f316806e = d0Var;
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onBufferingUpdate */
    public void mo93843x3e084f2c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onCompletion */
    public void mo93844xa6db431b(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onCompletion");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onError */
    public void mo93845xaf8aa769(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17, int i18, int i19) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i19);
        dl3.d0 d0Var = this.f316806e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "onError what:%d, extra:%d, errCode:%d, audioId:%s", valueOf, valueOf2, valueOf3, d0Var.f316813c);
        if (this.f316805d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "onError, currentParam is null");
            return;
        }
        boolean m40088x550b09c5 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40088x550b09c5(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        if (i18 == 80 && m40088x550b09c5) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "connect success, but download is fail!");
        }
        int i27 = d0Var.f316823m;
        if (i27 >= 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.QQAudioPlayer", "errorCount %d", java.lang.Integer.valueOf(i27));
            return;
        }
        d0Var.f316817g = false;
        d0Var.f316823m = i27 + 1;
        d0Var.f316824n = i18;
        d0Var.f316832v = java.lang.System.currentTimeMillis();
        d0Var.t(i18);
        if (d0Var.f316813c.equalsIgnoreCase(this.f316805d.f415369a)) {
            d0Var.mo67222x66343656();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new dl3.y(this));
        }
        d0Var.l(i18);
        dl3.c0 c0Var = d0Var.f316820j;
        if (c0Var != null) {
            c0Var.f316811d = true;
            d0Var.f316820j = null;
        }
        if (i17 == 91 && i18 == 55) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "unknow format ,delete file");
            java.lang.String str = d0Var.f316822l;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = gl3.h.f354364a;
            com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.p2915x36f002.C25457x87fce1b0.i("MicroMsg.Music.PieceFileCache", "deleteFileByUrl");
            gl3.i.a(xl3.c.d(str));
        }
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onPrepared */
    public void mo93846x58d5b73c(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onPrepared");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onSeekComplete */
    public void mo93847xe1fdf750(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        this.f316806e.f316830t.mo50293x3498a0(new dl3.x(this, i17));
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStarted */
    public void mo93848xde9141a2(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.QQAudioPlayer", "onStarted");
    }

    @Override // com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.InterfaceC25343x8e10fe3a
    /* renamed from: onStateChanged */
    public void mo93849xaba1ac62(com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.AbstractC25320x37471834 abstractC25320x37471834, int i17) {
        this.f316806e.f316830t.mo50293x3498a0(new dl3.z(this, i17));
    }
}
