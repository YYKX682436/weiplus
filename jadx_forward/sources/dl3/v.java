package dl3;

/* loaded from: classes13.dex */
public abstract class v implements com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l, dl3.w {

    /* renamed from: a, reason: collision with root package name */
    public boolean f316880a;

    /* renamed from: b, reason: collision with root package name */
    public dl3.f f316881b = null;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public b21.o f() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public boolean h() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.p1909xc53e9ae1.p1910x2e06d1.l
    public void j(boolean z17) {
        mo67221xc84dc82d();
    }

    public abstract java.lang.String k();

    /* JADX WARN: Removed duplicated region for block: B:16:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(int r18) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dl3.v.l(int):void");
    }

    public void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPauseEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 2;
        g0Var.f88252d = "pause";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f88251c = d0Var.f316813c;
        g0Var.f88253e = k();
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
        dl3.f fVar = this.f316881b;
        if (fVar != null) {
            java.lang.String str = d0Var.f316813c;
            dl3.i iVar = ((dl3.l) fVar).f316869a;
            dl3.d0 o17 = iVar.o(str);
            if (o17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onPause player is null");
                return;
            }
            iVar.O(str, o17);
            iVar.w(str, o17);
            dl3.i.c(iVar);
            iVar.F(1800000);
        }
    }

    public void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onPrepareEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 7;
        g0Var.f88252d = "canplay";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f88250b = d0Var.mo67219x51e8b0a();
        g0Var.f88251c = d0Var.f316813c;
        g0Var.f88253e = k();
        if (!dl3.i.s().f316851k.contains(d0Var.f316813c)) {
            c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "removeSendPreparedEvent audioId:%s", d0Var.f316813c);
        dl3.i.s().f316851k.remove(d0Var.f316813c);
    }

    public void o() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onSeekToEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 6;
        g0Var.f88252d = "seeked";
        g0Var.f88251c = ((dl3.d0) this).f316813c;
        g0Var.f88253e = k();
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
    }

    public void p() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Audio.BaseAudioPlayer", "onStopEvent");
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3 c5175x3ee93aa3 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5175x3ee93aa3();
        am.g0 g0Var = c5175x3ee93aa3.f135523g;
        g0Var.f88249a = 3;
        g0Var.f88252d = "stop";
        dl3.d0 d0Var = (dl3.d0) this;
        g0Var.f88251c = d0Var.f316813c;
        g0Var.f88253e = k();
        c5175x3ee93aa3.b(android.os.Looper.getMainLooper());
        dl3.f fVar = this.f316881b;
        if (fVar != null) {
            java.lang.String str = d0Var.f316813c;
            dl3.i iVar = ((dl3.l) fVar).f316869a;
            dl3.d0 o17 = iVar.o(str);
            if (o17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Audio.AudioPlayerMgr", "onStop player is null");
                return;
            }
            iVar.O(str, o17);
            iVar.w(str, o17);
            dl3.i.c(iVar);
            iVar.F(1800000);
            iVar.T(str);
            iVar.A(str);
        }
    }
}
