package cw2;

/* loaded from: classes10.dex */
public final class ia extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 f305308d;

    public ia(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190) {
        this.f305308d = c15201xe049f190;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15201xe049f190 c15201xe049f190 = this.f305308d;
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c15201xe049f190.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(c15201xe049f190.f212275h);
        sb6.append(", netQuality:");
        sb6.append(m40067xab9ed241);
        sb6.append(", isPlaying:");
        mn0.b0 player = c15201xe049f190.getPlayer();
        boolean z17 = false;
        sb6.append(player != null && ((mn0.y) player).b(false));
        c15201xe049f190.Z(sb6.toString());
        mn0.b0 player2 = c15201xe049f190.getPlayer();
        if (player2 != null && ((mn0.y) player2).b(false)) {
            z17 = true;
        }
        if (z17 && m40067xab9ed241 != -1 && c15201xe049f190.f212275h == -2301) {
            c15201xe049f190.Z("restart");
            mn0.b0 b0Var = c15201xe049f190.player;
            if (b0Var != null) {
                mn0.b0.C(b0Var, false, false, false, 6, null);
            }
            zy2.g5.u(c15201xe049f190, null, 1, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x02c5  */
    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15376x8cd414a7(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw2.ia.mo15376x8cd414a7(int, android.os.Bundle):void");
    }
}
