package z12;

/* loaded from: classes12.dex */
public class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {
    public d() {
        z12.e.f550815g = 0;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        if (z12.e.f550815g < 100) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().a("17", 6, z12.e.f550815g, "");
            z12.e.f550815g += 2;
            return true;
        }
        z12.e.f550815g = 0;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        z85.d b17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().b();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247 c21051xbc71d247 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21051xbc71d247();
        c21051xbc71d247.f68396x5bec8145 = "17";
        c21051xbc71d247.f68391x4a7ba5e9 = "emoji_custom_all";
        c21051xbc71d247.f68403x2262335f = 1;
        c21051xbc71d247.f68400x226199c3 = 1;
        c21051xbc71d247.f68379x4b6e59f8 = 0;
        c21051xbc71d247.f68395x4a7eba98 = 4;
        c21051xbc71d247.f68388x4a782aca = 1;
        c21051xbc71d247.f68382xd33ad9b9 = java.lang.System.currentTimeMillis();
        b17.mo880xb970c2b9(c21051xbc71d247);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).Ri().a("17", 7, z12.e.f550815g, "");
        z12.e.g();
        return false;
    }
}
