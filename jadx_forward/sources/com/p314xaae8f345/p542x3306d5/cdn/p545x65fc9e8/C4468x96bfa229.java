package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.CdnFlowInfo */
/* loaded from: classes2.dex */
public class C4468x96bfa229 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 f18524xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229();

    /* renamed from: cellular_bytes */
    private long f18525x46e5c556;

    /* renamed from: hasSetFields */
    private final boolean[] f18526xcb94b041 = new boolean[3];

    /* renamed from: wifi_bytes */
    private long f18527x1c156ec1;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38404xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38405x7c90cfc0() {
        return f18524xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38406x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38407x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 c4468x96bfa229 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f18527x1c156ec1), java.lang.Long.valueOf(c4468x96bfa229.f18527x1c156ec1)) && n51.f.a(java.lang.Long.valueOf(this.f18525x46e5c556), java.lang.Long.valueOf(c4468x96bfa229.f18525x46e5c556));
    }

    /* renamed from: getCellularBytes */
    public long m38408x4a7e056b() {
        return this.f18525x46e5c556;
    }

    /* renamed from: getWifiBytes */
    public long m38409x515bb7a0() {
        return this.f18527x1c156ec1;
    }

    /* renamed from: hasCellularBytes */
    public boolean m38410xe2c470a7() {
        return m38411x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38411x6e095e9(int i17) {
        return this.f18526xcb94b041[i17];
    }

    /* renamed from: hasWifiBytes */
    public boolean m38412x113120dc() {
        return m38411x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38413x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18526xcb94b041[1]) {
                fVar.h(1, this.f18527x1c156ec1);
            }
            if (this.f18526xcb94b041[2]) {
                fVar.h(2, this.f18525x46e5c556);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f18526xcb94b041[1] ? 0 + b36.f.h(1, this.f18527x1c156ec1) : 0;
            return this.f18526xcb94b041[2] ? h17 + b36.f.h(2, this.f18525x46e5c556) : h17;
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
            this.f18527x1c156ec1 = aVar2.i(intValue);
            this.f18526xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f18525x46e5c556 = aVar2.i(intValue);
        this.f18526xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setCellularBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38415xdd546bdf(long j17) {
        this.f18525x46e5c556 = j17;
        this.f18526xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setWifiBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38416xadaf7814(long j17) {
        this.f18527x1c156ec1 = j17;
        this.f18526xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 m38414x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4468x96bfa229) super.mo11468x92b714fd(bArr);
    }
}
