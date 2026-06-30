package cw2;

/* loaded from: classes10.dex */
public final class z3 extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b f305664d;

    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b) {
        this.f305664d = c15182x1607686b;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        cw2.wa waVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        r45.nw1 liveInfo;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15182x1607686b c15182x1607686b = this.f305664d;
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c15182x1607686b.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(c15182x1607686b.f212135g);
        sb6.append(", netQuality:");
        sb6.append(m40067xab9ed241);
        sb6.append(", isPlaying:");
        mn0.b0 txLivePlayer = c15182x1607686b.getTxLivePlayer();
        sb6.append(txLivePlayer != null && ((mn0.y) txLivePlayer).b(false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", sb6.toString());
        mn0.b0 txLivePlayer2 = c15182x1607686b.getTxLivePlayer();
        if (!(txLivePlayer2 != null && ((mn0.y) txLivePlayer2).b(false)) || m40067xab9ed241 == -1 || c15182x1607686b.f212135g != -2301 || (waVar = c15182x1607686b.f212140n) == null) {
            return;
        }
        java.lang.String str = waVar.f305627a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || str == null) {
            return;
        }
        mn0.b0 txLivePlayer3 = c15182x1607686b.getTxLivePlayer();
        if (txLivePlayer3 != null) {
            mn0.b0.C(txLivePlayer3, false, false, false, 6, null);
        }
        if (zl2.r4.f555483a.x0()) {
            cw2.wa waVar2 = c15182x1607686b.f212140n;
            if ((waVar2 == null || (c14989xf862ae88 = waVar2.f305632f) == null || (liveInfo = c14989xf862ae88.getLiveInfo()) == null || liveInfo.m75939xb282bd08(2) != 2) ? false : true) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AbsTXLivePlayListener", "onNetStatus try to start play but live status is end!");
                return;
            }
        }
        if (str == null) {
            str = "";
        }
        c15182x1607686b.Z(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03cf  */
    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15376x8cd414a7(int r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.z3.mo15376x8cd414a7(int, android.os.Bundle):void");
    }
}
