package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.TaskStateInfo */
/* loaded from: classes8.dex */
public class C4528x25d56cba extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba f19048xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba();

    /* renamed from: cellular_recv_bytes */
    private long f19049x2dbf4ec7;

    /* renamed from: cellular_send_bytes */
    private long f19050xe08582e9;

    /* renamed from: hasSetFields */
    private final boolean[] f19051xcb94b041 = new boolean[6];

    /* renamed from: task_state */
    private int f19052x4e3e6557;

    /* renamed from: wifi_recv_bytes */
    private long f19053x5787d03c;

    /* renamed from: wifi_send_bytes */
    private long f19054xa4e045e;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39583xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39584x7c90cfc0() {
        return f19048xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39585x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39586x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba c4528x25d56cba = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f19052x4e3e6557), java.lang.Integer.valueOf(c4528x25d56cba.f19052x4e3e6557)) && n51.f.a(java.lang.Long.valueOf(this.f19053x5787d03c), java.lang.Long.valueOf(c4528x25d56cba.f19053x5787d03c)) && n51.f.a(java.lang.Long.valueOf(this.f19054xa4e045e), java.lang.Long.valueOf(c4528x25d56cba.f19054xa4e045e)) && n51.f.a(java.lang.Long.valueOf(this.f19049x2dbf4ec7), java.lang.Long.valueOf(c4528x25d56cba.f19049x2dbf4ec7)) && n51.f.a(java.lang.Long.valueOf(this.f19050xe08582e9), java.lang.Long.valueOf(c4528x25d56cba.f19050xe08582e9));
    }

    /* renamed from: getCellularRecvBytes */
    public long m39587xe5c57b25() {
        return this.f19049x2dbf4ec7;
    }

    /* renamed from: getCellularSendBytes */
    public long m39588xa1373ac3() {
        return this.f19050xe08582e9;
    }

    /* renamed from: getTaskState */
    public int m39589x98cbb56() {
        return this.f19052x4e3e6557;
    }

    /* renamed from: getWifiRecvBytes */
    public long m39590x5650ada() {
        return this.f19053x5787d03c;
    }

    /* renamed from: getWifiSendBytes */
    public long m39591xc0d6ca78() {
        return this.f19054xa4e045e;
    }

    /* renamed from: hasCellularRecvBytes */
    public boolean m39592xd22be861() {
        return m39594x6e095e9(4);
    }

    /* renamed from: hasCellularSendBytes */
    public boolean m39593x8d9da7ff() {
        return m39594x6e095e9(5);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39594x6e095e9(int i17) {
        return this.f19051xcb94b041[i17];
    }

    /* renamed from: hasTaskState */
    public boolean m39595xc9622492() {
        return m39594x6e095e9(1);
    }

    /* renamed from: hasWifiRecvBytes */
    public boolean m39596x9dab7616() {
        return m39594x6e095e9(2);
    }

    /* renamed from: hasWifiSendBytes */
    public boolean m39597x591d35b4() {
        return m39594x6e095e9(3);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39598x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f19051xcb94b041[1]) {
                fVar.e(1, this.f19052x4e3e6557);
            }
            if (this.f19051xcb94b041[2]) {
                fVar.h(2, this.f19053x5787d03c);
            }
            if (this.f19051xcb94b041[3]) {
                fVar.h(3, this.f19054xa4e045e);
            }
            if (this.f19051xcb94b041[4]) {
                fVar.h(4, this.f19049x2dbf4ec7);
            }
            if (this.f19051xcb94b041[5]) {
                fVar.h(5, this.f19050xe08582e9);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f19051xcb94b041[1] ? 0 + b36.f.e(1, this.f19052x4e3e6557) : 0;
            if (this.f19051xcb94b041[2]) {
                e17 += b36.f.h(2, this.f19053x5787d03c);
            }
            if (this.f19051xcb94b041[3]) {
                e17 += b36.f.h(3, this.f19054xa4e045e);
            }
            if (this.f19051xcb94b041[4]) {
                e17 += b36.f.h(4, this.f19049x2dbf4ec7);
            }
            return this.f19051xcb94b041[5] ? e17 + b36.f.h(5, this.f19050xe08582e9) : e17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f19052x4e3e6557 = aVar2.g(intValue);
            this.f19051xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f19053x5787d03c = aVar2.i(intValue);
            this.f19051xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f19054xa4e045e = aVar2.i(intValue);
            this.f19051xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f19049x2dbf4ec7 = aVar2.i(intValue);
            this.f19051xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f19050xe08582e9 = aVar2.i(intValue);
        this.f19051xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setCellularRecvBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39600xc15b8799(long j17) {
        this.f19049x2dbf4ec7 = j17;
        this.f19051xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setCellularSendBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39601x7ccd4737(long j17) {
        this.f19050xe08582e9 = j17;
        this.f19051xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTaskState */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39602x65e07bca(int i17) {
        this.f19052x4e3e6557 = i17;
        this.f19051xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setWifiRecvBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39603x983b714e(long j17) {
        this.f19053x5787d03c = j17;
        this.f19051xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setWifiSendBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39604x53ad30ec(long j17) {
        this.f19054xa4e045e = j17;
        this.f19051xcb94b041[3] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba m39599x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4528x25d56cba) super.mo11468x92b714fd(bArr);
    }
}
