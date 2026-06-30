package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CVideoInfo */
/* loaded from: classes15.dex */
public class C27089x914afb98 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 f59030xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98();

    /* renamed from: hasSetFields */
    private final boolean[] f59031xcb94b041 = new boolean[6];

    /* renamed from: ori_videoformat */
    private int f59032x97e06859;

    /* renamed from: requestflag */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59033x4495127b;

    /* renamed from: svrflag */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59034x933eee5b;

    /* renamed from: videoformat */
    private int f59035x5e4f8432;

    /* renamed from: videopath */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f59036x4f7fc320;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110073xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110074x7c90cfc0() {
        return f59030xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110075x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110076x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 c27089x914afb98 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98) fVar;
        return n51.f.a(this.f59034x933eee5b, c27089x914afb98.f59034x933eee5b) && n51.f.a(java.lang.Integer.valueOf(this.f59035x5e4f8432), java.lang.Integer.valueOf(c27089x914afb98.f59035x5e4f8432)) && n51.f.a(java.lang.Integer.valueOf(this.f59032x97e06859), java.lang.Integer.valueOf(c27089x914afb98.f59032x97e06859)) && n51.f.a(this.f59036x4f7fc320, c27089x914afb98.f59036x4f7fc320) && n51.f.a(this.f59033x4495127b, c27089x914afb98.f59033x4495127b);
    }

    /* renamed from: getOriVideoformat */
    public int m110077xfdb11e62() {
        return this.f59032x97e06859;
    }

    /* renamed from: getRequestflag */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110078x1e6b5945() {
        return this.f59031xcb94b041[5] ? this.f59033x4495127b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getSvrflag */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110079xd10c2a25() {
        return this.f59031xcb94b041[1] ? this.f59034x933eee5b : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getVideoformat */
    public int m110080x3825cafc() {
        return this.f59035x5e4f8432;
    }

    /* renamed from: getVideopath */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m110081x4eed346a() {
        return this.f59031xcb94b041[4] ? this.f59036x4f7fc320 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m110082x6e095e9(int i17) {
        return this.f59031xcb94b041[i17];
    }

    /* renamed from: hasOriVideoformat */
    public boolean m110083x6e381aa6() {
        return m110082x6e095e9(3);
    }

    /* renamed from: hasRequestflag */
    public boolean m110084x3e8b6381() {
        return m110082x6e095e9(5);
    }

    /* renamed from: hasSvrflag */
    public boolean m110085xc62b261() {
        return m110082x6e095e9(1);
    }

    /* renamed from: hasVideoformat */
    public boolean m110086x5845d538() {
        return m110082x6e095e9(2);
    }

    /* renamed from: hasVideopath */
    public boolean m110087xec29da6() {
        return m110082x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110088x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59034x933eee5b;
            if (gVar != null && this.f59031xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f59031xcb94b041[2]) {
                fVar.e(2, this.f59035x5e4f8432);
            }
            if (this.f59031xcb94b041[3]) {
                fVar.e(3, this.f59032x97e06859);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59036x4f7fc320;
            if (gVar2 != null && this.f59031xcb94b041[4]) {
                fVar.b(4, gVar2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59033x4495127b;
            if (gVar3 != null && this.f59031xcb94b041[5]) {
                fVar.b(5, gVar3);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59034x933eee5b;
            if (gVar4 != null && this.f59031xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar4);
            }
            if (this.f59031xcb94b041[2]) {
                i18 += b36.f.e(2, this.f59035x5e4f8432);
            }
            if (this.f59031xcb94b041[3]) {
                i18 += b36.f.e(3, this.f59032x97e06859);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f59036x4f7fc320;
            if (gVar5 != null && this.f59031xcb94b041[4]) {
                i18 += b36.f.b(4, gVar5);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f59033x4495127b;
            return (gVar6 == null || !this.f59031xcb94b041[5]) ? i18 : i18 + b36.f.b(5, gVar6);
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
            this.f59034x933eee5b = aVar2.d(intValue);
            this.f59031xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f59035x5e4f8432 = aVar2.g(intValue);
            this.f59031xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f59032x97e06859 = aVar2.g(intValue);
            this.f59031xcb94b041[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f59036x4f7fc320 = aVar2.d(intValue);
            this.f59031xcb94b041[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f59033x4495127b = aVar2.d(intValue);
        this.f59031xcb94b041[5] = true;
        return 0;
    }

    /* renamed from: setOriVideoformat */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110090xc5a7866e(int i17) {
        this.f59032x97e06859 = i17;
        this.f59031xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setRequestflag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110091xb4d0ccb9(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59033x4495127b = gVar;
        this.f59031xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setSvrflag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110092x447d7799(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59034x933eee5b = gVar;
        this.f59031xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setVideoformat */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110093xce8b3e70(int i17) {
        this.f59035x5e4f8432 = i17;
        this.f59031xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setVideopath */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110094xab40f4de(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59036x4f7fc320 = gVar;
        this.f59031xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 m110089x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27089x914afb98) super.mo11468x92b714fd(bArr);
    }
}
