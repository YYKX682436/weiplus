package kc2;

/* loaded from: classes15.dex */
public final class d0 extends kc2.c0 {

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f387884s;

    /* renamed from: t, reason: collision with root package name */
    public final kc2.x1 f387885t;

    /* renamed from: u, reason: collision with root package name */
    public final kc2.x1 f387886u;

    /* renamed from: v, reason: collision with root package name */
    public final kc2.x1 f387887v;

    /* renamed from: w, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f387888w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d0(kc2.g1 r8, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 r9, zy2.fa r10, java.lang.String r11, java.lang.String r12, java.util.List r13, int r14, p3321xbce91901.jvm.p3324x21ffc6bd.i r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L6
            java.lang.String r11 = ""
        L6:
            r4 = r11
            r11 = r14 & 16
            if (r11 == 0) goto Ld
            java.lang.String r12 = "Game.Entrance"
        Ld:
            r5 = r12
            r11 = r14 & 32
            if (r11 == 0) goto L19
            java.lang.String r11 = "more_tab_game_recommend"
            java.util.List r13 = kz5.b0.c(r11)
        L19:
            r6 = r13
            java.lang.String r11 = "manager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r11)
            java.lang.String r11 = "handler"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r11)
            java.lang.String r11 = "redDotManager"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r11)
            java.lang.String r11 = "leftEntrancePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r11)
            java.lang.String r11 = "rightEntrancePath"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r11)
            java.lang.String r11 = "findTabPreferenceKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r11)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "FinderKaraInfoManager.GameCenter"
            r7.f387884s = r8
            kc2.x1 r8 = kc2.x1.C
            r7.f387885t = r8
            kc2.x1 r8 = kc2.x1.B
            r7.f387886u = r8
            kc2.x1 r8 = kc2.x1.D
            r7.f387887v = r8
            com.tencent.mm.storage.u3 r8 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_KARA_GAMECENTER_LAST_EXIT_STRING_SYNC
            r7.f387888w = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.d0.<init>(kc2.g1, com.tencent.mm.sdk.platformtools.n3, zy2.fa, java.lang.String, java.lang.String, java.util.List, int, kotlin.jvm.internal.i):void");
    }

    @Override // kc2.c0
    public kc2.x1 b() {
        return this.f387885t;
    }

    @Override // kc2.c0
    public kc2.x1 d() {
        return this.f387886u;
    }

    @Override // kc2.c0
    public com.p314xaae8f345.mm.p2621x8fb0427b.u3 g() {
        return this.f387888w;
    }

    @Override // kc2.c0
    public kc2.x1 i() {
        return this.f387887v;
    }

    @Override // kc2.c0
    public java.lang.String m() {
        return this.f387884s;
    }

    @Override // kc2.c0
    public boolean n() {
        if (!((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.h0) ((m33.b1) i95.n0.c(m33.b1.class))).Vi(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerPathChecker", "isShowGameEntrance switch off");
            return false;
        }
        if (!((c01.z1.j() & 8388608) != 0)) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.RedDotManagerPathChecker", "isShowGameEntrance setting close");
        return false;
    }
}
