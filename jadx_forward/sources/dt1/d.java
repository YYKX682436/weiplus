package dt1;

/* loaded from: classes12.dex */
public final class d extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f324674i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f324675m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f324676n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f324677o;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(long r7, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r6 = this;
            java.lang.String r0 = "session_id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.String r0 = "from_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "to_username"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            r45.fr r0 = new r45.fr
            r0.<init>()
            r45.er r1 = new r45.er
            r1.<init>()
            r1.f455220d = r13
            r0.f456103v = r1
            r0.f456094m = r10
            r0.f456090f = r12
            r0.f456089e = r11
            r1 = 48
            r0.f456088d = r1
            r6.<init>(r9, r0)
            r6.f324674i = r9
            r6.f324675m = r10
            r6.f324676n = r12
            com.tencent.mm.storage.f9 r0 = new com.tencent.mm.storage.f9
            r0.<init>()
            r6.f324677o = r0
            r2 = 1
            r0.r1(r2)
            r0.u1(r10)
            long r3 = c01.w9.o(r10)
            r0.e1(r3)
            r0.j1(r2)
            r0.d1(r13)
            r0.m124850x7650bebc(r1)
            r3 = 0
            int r13 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            java.lang.Class<vg3.x3> r1 = vg3.x3.class
            if (r13 <= 0) goto L6b
            lm0.a r13 = gm0.j1.s(r1)
            vg3.x3 r13 = (vg3.x3) r13
            com.tencent.mm.plugin.messenger.foundation.h2 r13 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r13
            com.tencent.mm.storage.g9 r13 = r13.cj()
            r13.lb(r7, r0, r2)
            r0.m124849x5361953a(r7)
            goto L7c
        L6b:
            lm0.a r7 = gm0.j1.s(r1)
            vg3.x3 r7 = (vg3.x3) r7
            com.tencent.mm.plugin.messenger.foundation.h2 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) r7
            com.tencent.mm.storage.g9 r7 = r7.cj()
            r8 = 0
            long r7 = r7.N9(r0, r8)
        L7c:
            r0.m124849x5361953a(r7)
            r45.fr r13 = r6.f324658d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = c01.z1.r()
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(r2)
            r1.append(r2)
            r1.append(r10)
            r1.append(r7)
            r2 = 95
            r1.append(r2)
            long r2 = r0.mo78012x3fdd41df()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r4 = (long) r0
            long r2 = r2 / r4
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            r13.f456091g = r0
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "[CgiBypSendLocation] bizType="
            r13.<init>(r0)
            r13.append(r9)
            java.lang.String r9 = " clientId="
            r13.append(r9)
            r13.append(r7)
            java.lang.String r7 = " sessionId="
            r13.append(r7)
            r13.append(r10)
            java.lang.String r7 = " toUsername="
            r13.append(r7)
            r13.append(r12)
            java.lang.String r7 = " fromUsername="
            r13.append(r7)
            r13.append(r11)
            java.lang.String r7 = r13.toString()
            java.lang.String r8 = "Byp.CgiBypSendLocation"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.d.<init>(long, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // dt1.a
    public long H() {
        return this.f324677o.m124847x74d37ac6();
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSendLocation", "[onSendFailed] bizType=" + this.f324674i + " sessionId=" + this.f324675m + " toUsername=" + this.f324676n + ", errCode=" + i18);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f324677o;
        f9Var.r1(5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), f9Var);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f324677o;
        f9Var.r1(2);
        f9Var.o1(resp.f466663d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendLocation", "[onSendSuccessfully] bizType=" + this.f324674i + " msgSvrId=" + resp.f466663d + " sessionId=" + this.f324675m + " toUsername=" + this.f324676n);
    }
}
