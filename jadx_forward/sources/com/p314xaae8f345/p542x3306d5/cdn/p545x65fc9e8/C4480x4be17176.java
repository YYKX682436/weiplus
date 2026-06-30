package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.DownloadInfo */
/* loaded from: classes2.dex */
public class C4480x4be17176 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 f18601xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176();

    /* renamed from: begin_tickcount */
    private long f18602x3e3ded7c;

    /* renamed from: end_tickcount */
    private long f18603x3441e72e;

    /* renamed from: hasSetFields */
    private final boolean[] f18604xcb94b041 = new boolean[5];

    /* renamed from: recved_bytes */
    private long f18605x48c810b1;

    /* renamed from: transfor_ms */
    private long f18606x88d11984;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38614xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38615x7c90cfc0() {
        return f18601xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38616x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38617x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 c4480x4be17176 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f18605x48c810b1), java.lang.Long.valueOf(c4480x4be17176.f18605x48c810b1)) && n51.f.a(java.lang.Long.valueOf(this.f18606x88d11984), java.lang.Long.valueOf(c4480x4be17176.f18606x88d11984)) && n51.f.a(java.lang.Long.valueOf(this.f18602x3e3ded7c), java.lang.Long.valueOf(c4480x4be17176.f18602x3e3ded7c)) && n51.f.a(java.lang.Long.valueOf(this.f18603x3441e72e), java.lang.Long.valueOf(c4480x4be17176.f18603x3441e72e));
    }

    /* renamed from: getBeginTickcount */
    public long m38618x141c9bdf() {
        return this.f18602x3e3ded7c;
    }

    /* renamed from: getEndTickcount */
    public long m38619x4414696d() {
        return this.f18603x3441e72e;
    }

    /* renamed from: getRecvedBytes */
    public long m38620x4e3ded30() {
        return this.f18605x48c810b1;
    }

    /* renamed from: getTransforMs */
    public long m38621x874fb69d() {
        return this.f18606x88d11984;
    }

    /* renamed from: hasBeginTickcount */
    public boolean m38622x84a39823() {
        return m38624x6e095e9(3);
    }

    /* renamed from: hasEndTickcount */
    public boolean m38623x27f5a6b1() {
        return m38624x6e095e9(4);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38624x6e095e9(int i17) {
        return this.f18604xcb94b041[i17];
    }

    /* renamed from: hasRecvedBytes */
    public boolean m38625x6e5df76c() {
        return m38624x6e095e9(1);
    }

    /* renamed from: hasTransforMs */
    public boolean m38626xc22774e1() {
        return m38624x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38627x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18604xcb94b041[1]) {
                fVar.h(1, this.f18605x48c810b1);
            }
            if (this.f18604xcb94b041[2]) {
                fVar.h(2, this.f18606x88d11984);
            }
            if (this.f18604xcb94b041[3]) {
                fVar.h(3, this.f18602x3e3ded7c);
            }
            if (this.f18604xcb94b041[4]) {
                fVar.h(4, this.f18603x3441e72e);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f18604xcb94b041[1] ? 0 + b36.f.h(1, this.f18605x48c810b1) : 0;
            if (this.f18604xcb94b041[2]) {
                h17 += b36.f.h(2, this.f18606x88d11984);
            }
            if (this.f18604xcb94b041[3]) {
                h17 += b36.f.h(3, this.f18602x3e3ded7c);
            }
            return this.f18604xcb94b041[4] ? h17 + b36.f.h(4, this.f18603x3441e72e) : h17;
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
            this.f18605x48c810b1 = aVar2.i(intValue);
            this.f18604xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f18606x88d11984 = aVar2.i(intValue);
            this.f18604xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f18602x3e3ded7c = aVar2.i(intValue);
            this.f18604xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f18603x3441e72e = aVar2.i(intValue);
        this.f18604xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setBeginTickcount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38629xdc1303eb(long j17) {
        this.f18602x3e3ded7c = j17;
        this.f18604xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setEndTickcount */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38630x7a5d6479(long j17) {
        this.f18603x3441e72e = j17;
        this.f18604xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setRecvedBytes */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38631xe4a360a4(long j17) {
        this.f18605x48c810b1 = j17;
        this.f18604xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setTransforMs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38632xb57404a9(long j17) {
        this.f18606x88d11984 = j17;
        this.f18604xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 m38628x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4480x4be17176) super.mo11468x92b714fd(bArr);
    }
}
