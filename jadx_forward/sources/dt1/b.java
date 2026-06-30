package dt1;

/* loaded from: classes12.dex */
public final class b extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f324662i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f324663m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f324664n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f324665o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb f324666p;

    /* renamed from: q, reason: collision with root package name */
    public final long f324667q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f324668r;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb r11, long r12, java.lang.String r14) {
        /*
            r6 = this;
            java.lang.String r0 = "session_id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.lang.String r0 = "from_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "to_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "emoji"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "talker"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r45.ar r1 = new r45.ar
            r1.<init>()
            r0.f456101t = r1
            r0.f456094m = r8
            r0.f456090f = r10
            r0.f456089e = r9
            r1 = 47
            r0.f456088d = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = c01.z1.r()
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r2)
            r1.append(r2)
            r1.append(r8)
            r1.append(r12)
            r2 = 95
            r1.append(r2)
            long r2 = c01.id.c()
            r4 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r4
            long r2 = r2 / r4
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f456091g = r1
            java.lang.String r1 = c01.ia.n()
            r0.f456092h = r1
            r6.<init>(r7, r0)
            r6.f324662i = r7
            r6.f324663m = r8
            r6.f324664n = r9
            r6.f324665o = r10
            r6.f324666p = r11
            r6.f324667q = r12
            r6.f324668r = r14
            r45.fr r7 = r6.f324658d
            r45.ar r7 = r7.f456101t
            java.lang.String r8 = r11.mo42933xb5885648()
            r7.f451743d = r8
            int r8 = r11.mo42936xfb85f7b0()
            r7.f451746g = r8
            int r8 = r11.mo42935xfb854877()
            r7.f451744e = r8
            java.lang.String r8 = r11.j()
            r7.f451747h = r8
            r8 = 0
            r7.f451749m = r8
            pt0.e0 r7 = pt0.f0.f439742b1
            com.tencent.mm.storage.f9 r7 = r7.n(r14, r12)
            if (r7 == 0) goto Lc4
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r9)
            java.lang.String r9 = r7.j()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.d1(r8)
            java.lang.Class<vg3.x3> r8 = vg3.x3.class
            lm0.a r8 = gm0.j1.s(r8)
            vg3.x3 r8 = (vg3.x3) r8
            com.tencent.mm.plugin.messenger.foundation.h2 r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r8
            com.tencent.mm.storage.g9 r8 = r8.cj()
            r9 = 1
            r8.lb(r12, r7, r9)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.b.<init>(int, java.lang.String, java.lang.String, java.lang.String, com.tencent.mm.api.IEmojiInfo, long, java.lang.String):void");
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSendEmoij", "[onSendFailed] bizType=" + this.f324662i + " sessionId=" + this.f324663m + " toUsername=" + this.f324665o + " fromUsername=" + this.f324664n + " errCode:" + i18 + " errMsg:" + str);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str2 = this.f324668r;
        long j17 = this.f324667q;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(str2, j17);
        n17.r1(5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, n17, true);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendEmoij", "[onSendSuccessfully] bizType=" + this.f324662i + " msgSvrId=" + resp.f466663d + "  sessionId=" + this.f324663m + " toUsername=" + this.f324665o + " fromUsername=" + this.f324664n);
        pt0.e0 e0Var = pt0.f0.f439742b1;
        java.lang.String str = this.f324668r;
        long j17 = this.f324667q;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(str, j17);
        n17.r1(2);
        n17.o1(resp.f466663d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, n17, true);
    }
}
