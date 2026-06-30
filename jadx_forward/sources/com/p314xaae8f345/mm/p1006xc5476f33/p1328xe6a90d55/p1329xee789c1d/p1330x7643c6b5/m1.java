package com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5;

/* loaded from: classes14.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b f177479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f177480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 f177481f;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar, boolean z17) {
        this.f177481f = p0Var;
        this.f177479d = bVar;
        this.f177480e = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f177481f.f177557o != com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r2.InRoom) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceService", "hy: not in room!");
            com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar = this.f177479d;
            if (bVar != null) {
                bVar.a(-10086, com.p314xaae8f345.p414x32b0ec.C3856x24bb8022.ErrorCode.f15116xa552212a, "not in room", "");
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.o oVar = this.f177481f.f177551g;
        boolean z17 = this.f177480e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "set record mute from %b to %b", java.lang.Boolean.valueOf(oVar.f177513l), java.lang.Boolean.valueOf(z17));
        boolean z18 = oVar.f177513l;
        oVar.f177513l = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0 p0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.p0.INSTANCE;
        p0Var.getClass();
        boolean z19 = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = z17 ? "mute" : "unMute";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: onMicMute %s", objArr);
        p0Var.n(new com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.r1(p0Var, z17));
        if (z18 != z17) {
            if (z17) {
                if (oVar.f177503b != null) {
                    boolean l17 = oVar.f177503b.l();
                    oVar.f177503b = null;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.g0.b(402, new byte[1], 1);
                    z19 = l17;
                }
                if (!z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "Failed to stop recorder");
                }
            } else {
                if (oVar.f177503b == null) {
                    oVar.a();
                    z19 = oVar.f177503b.k();
                }
                if (!z19) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenVoice.OpenVoiceAudioMgr", "Failed to start record");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b bVar2 = this.f177479d;
        if (bVar2 != null) {
            if (z19) {
                bVar2.a(0, 0, "ok", "");
            } else {
                bVar2.a(-10086, -15, "set mute failed", "");
            }
        }
    }
}
