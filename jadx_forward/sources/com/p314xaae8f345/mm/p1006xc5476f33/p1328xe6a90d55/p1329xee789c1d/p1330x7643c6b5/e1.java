package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class e1 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177427a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var) {
        this.f177427a = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        android.media.AudioTrack audioTrack;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "onResult");
        if (this.f177427a.U) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "call end, stop ring");
            wq4.k0 k0Var = this.f177427a.f177553i;
            if (k0Var != null) {
                k0Var.e();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177525d = this.f177427a.f177551g.f177502a.f177539c.f();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar = this.f177427a.f177551g;
        int i18 = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177526e = oVar.f177503b == null ? 0 : oVar.f177503b.f501685e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = this.f177427a.f177551g.f177502a.f177539c.f338565l;
        int i19 = -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177527f = eVar2 != null ? eVar2.g() : -1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar2 = this.f177427a.f177551g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177528g = oVar2.f177502a.f177539c.f338564k ? 1 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177529h = oVar2.f177503b == null ? 0 : oVar2.f177503b.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p pVar = this.f177427a.f177551g.f177502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177530i = (pVar == null || (eVar = pVar.f177539c.f338565l) == null) ? 0 : eVar.L;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar3 = pVar.f177539c.f338565l;
        if (eVar3 != null) {
            android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
            if (audioManager != null && (audioTrack = eVar3.f257985o) != null) {
                i18 = audioManager.getStreamVolume(audioTrack.getStreamType());
            }
            i19 = i18;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177531j = i19;
        r45.t70 t70Var = new r45.t70();
        t70Var.f467708d = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177522a;
        t70Var.f467710f = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177523b;
        t70Var.f467711g = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177524c;
        t70Var.f467719r = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177529h;
        t70Var.f467724w = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177530i;
        t70Var.f467718q = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177528g;
        t70Var.f467714m = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177526e;
        t70Var.f467712h = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177525d;
        t70Var.f467715n = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177527f;
        t70Var.f467720s = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o0.f177531j;
        this.f177427a.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.d1(this, i17));
        return t70Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0
    public byte[] c(java.lang.Object obj) {
        r45.t70 t70Var = (r45.t70) obj;
        if (t70Var != null) {
            try {
                return t70Var.mo14344x5f01b1f6();
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OpenVoice.OpenVoiceService", e17, "hy: error when convert to byte array", new java.lang.Object[0]);
            }
        }
        return new byte[0];
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.e0
    public boolean d() {
        return true;
    }
}
