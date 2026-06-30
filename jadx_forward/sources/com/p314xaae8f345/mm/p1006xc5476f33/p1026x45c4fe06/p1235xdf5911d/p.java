package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d;

@j95.b(m140513x1e06fd29 = {wx.c1.class})
/* loaded from: classes4.dex */
public final class p extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s5, wx.g1 {
    public p() {
        jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.o.f173783d);
    }

    @Override // wx.g1
    public void R9() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "onCallEnd");
    }

    @Override // wx.g1
    public void lb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u uVar, java.lang.String str, byte[] bArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp: cdpAction = " + uVar + ", callId = " + str + ", context = " + bArr);
        if (uVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp cdpAction is null");
            return;
        }
        if (str != null) {
            if (!(str.length() == 0)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5 u5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.u5.class);
                boolean[] zArr = uVar.f298010i;
                java.lang.String i17 = (zArr[1] ? uVar.f298005d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).i();
                java.lang.String i18 = (zArr[2] ? uVar.f298006e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b).i();
                java.util.LinkedList linkedList = uVar.f298007f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linkedList, "getCdpRequest(...)");
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.p314xaae8f345.mm.p2495xc50a8b8b.g) it.next()).i());
                }
                r45.w3 w3Var = new r45.w3();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.u0) u5Var;
                u0Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.x1 x1Var = u0Var.f173850d;
                x1Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandWxAssistantService", "onReceive: command:" + i18 + ' ' + i17 + ' ' + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
                p3325xe03a0797.p3326xc267989b.l.d(x1Var.f173874b, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.o1(arrayList, str, x1Var, i17, i18, w3Var, null), 3, null);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandWxAssistantRUDPService", "onRecvWeAppCdp callId is null");
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "onAccountInitialized");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "install");
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "onAccountReleased");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "uninstall");
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "onCreate");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "install");
    }

    public void wi(java.lang.String callId, byte[] resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callId, "callId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandWxAssistantRUDPService", "sendCdpResp callId:" + callId + " cdpResp:" + resp.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AppBrandWxAssistantRUDPService", "sendCdpResp: no active session");
    }
}
