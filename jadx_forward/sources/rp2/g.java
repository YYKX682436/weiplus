package rp2;

/* loaded from: classes10.dex */
public final class g extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 f480115d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962) {
        this.f480115d = c14522x8ffd8962;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1583x373aa5.C14522x8ffd8962 c14522x8ffd8962 = this.f480115d;
        int m40067xab9ed241 = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c14522x8ffd8962.getContext());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onNetStatus curPlayStatus:");
        sb6.append(c14522x8ffd8962.f203063n);
        sb6.append(", netQuality:");
        sb6.append(m40067xab9ed241);
        sb6.append(", isPlaying:");
        mn0.b0 player = c14522x8ffd8962.getPlayer();
        sb6.append(player != null && ((mn0.y) player).b(false));
        c14522x8ffd8962.r(sb6.toString());
        mn0.b0 player2 = c14522x8ffd8962.getPlayer();
        if ((player2 != null && ((mn0.y) player2).b(false)) && m40067xab9ed241 != -1 && c14522x8ffd8962.f203063n == -2301) {
            c14522x8ffd8962.t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0272  */
    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo15376x8cd414a7(int r27, android.os.Bundle r28) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp2.g.mo15376x8cd414a7(int, android.os.Bundle):void");
    }
}
