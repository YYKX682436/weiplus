package dt1;

/* loaded from: classes12.dex */
public final class f extends dt1.a {

    /* renamed from: i, reason: collision with root package name */
    public final int f324682i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f324683m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f324684n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f324685o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 f324686p;

    static {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public f(int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dt1.f.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    @Override // dt1.a
    public long H() {
        return this.f324686p.m124847x74d37ac6();
    }

    @Override // dt1.a
    public void I(int i17, int i18, java.lang.String str, r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Byp.CgiBypSendText", "[onSendFailed] bizType=" + this.f324682i + " sessionId=" + this.f324683m + " toUsername=" + this.f324685o + " fromUsername=" + this.f324684n + " text=,errCode" + i18);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f324686p;
        f9Var.r1(5);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), f9Var);
    }

    @Override // dt1.a
    public void J(r45.rr resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f324686p;
        f9Var.r1(2);
        f9Var.o1(resp.f466663d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(f9Var.m124847x74d37ac6(), f9Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.CgiBypSendText", "[onSendSuccessfully] bizType=" + this.f324682i + " msgSvrId=" + resp.f466663d + " text= sessionId=" + this.f324683m + " toUsername=" + this.f324685o + " fromUsername=" + this.f324684n);
    }
}
