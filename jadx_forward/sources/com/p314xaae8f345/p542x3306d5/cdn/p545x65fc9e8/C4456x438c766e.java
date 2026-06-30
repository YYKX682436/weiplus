package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.BaseResult */
/* loaded from: classes8.dex */
public class C4456x438c766e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e f18414xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e();

    /* renamed from: bizdata */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18415xfa35ab3d;

    /* renamed from: cipher */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 f18416xaeebe60b;

    /* renamed from: hasSetFields */
    private final boolean[] f18417xcb94b041 = new boolean[7];

    /* renamed from: mode */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b f18418x3339a3;

    /* renamed from: sub_tasktype */
    private int f18419xf271f55e;

    /* renamed from: taskid */
    private long f18420xcb7ef560;

    /* renamed from: tasktype */
    private int f18421xe79c7a3f;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38115xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38116x7c90cfc0() {
        return f18414xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38117x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38118x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e c4456x438c766e = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f18420xcb7ef560), java.lang.Long.valueOf(c4456x438c766e.f18420xcb7ef560)) && n51.f.a(this.f18418x3339a3, c4456x438c766e.f18418x3339a3) && n51.f.a(this.f18415xfa35ab3d, c4456x438c766e.f18415xfa35ab3d) && n51.f.a(java.lang.Integer.valueOf(this.f18421xe79c7a3f), java.lang.Integer.valueOf(c4456x438c766e.f18421xe79c7a3f)) && n51.f.a(java.lang.Integer.valueOf(this.f18419xf271f55e), java.lang.Integer.valueOf(c4456x438c766e.f18419xf271f55e)) && n51.f.a(this.f18416xaeebe60b, c4456x438c766e.f18416xaeebe60b);
    }

    /* renamed from: getBizdata */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38119x3802e707() {
        return this.f18417xcb94b041[3] ? this.f18415xfa35ab3d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getCipher */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38120x14030901() {
        return this.f18417xcb94b041[6] ? this.f18416xaeebe60b : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504.m38475xaf65a0fc();
    }

    /* renamed from: getMode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b m38121xfb82a219() {
        return this.f18417xcb94b041[2] ? this.f18418x3339a3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b.DOWNLOAD_MODE_STORAGE;
    }

    /* renamed from: getSubTasktype */
    public int m38122xfcca369() {
        return this.f18419xf271f55e;
    }

    /* renamed from: getTaskid */
    public long m38123x30961856() {
        return this.f18420xcb7ef560;
    }

    /* renamed from: getTasktype */
    public int m38124x6376b7b5() {
        return this.f18421xe79c7a3f;
    }

    /* renamed from: hasBizdata */
    public boolean m38125x73596f43() {
        return m38127x6e095e9(3);
    }

    /* renamed from: hasCipher */
    public boolean m38126xd3dc8945() {
        return m38127x6e095e9(6);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38127x6e095e9(int i17) {
        return this.f18417xcb94b041[i17];
    }

    /* renamed from: hasMode */
    public boolean m38128x2987635d() {
        return m38127x6e095e9(2);
    }

    /* renamed from: hasSubTasktype */
    public boolean m38129x2fecada5() {
        return m38127x6e095e9(5);
    }

    /* renamed from: hasTaskid */
    public boolean m38130xf06f989a() {
        return m38127x6e095e9(1);
    }

    /* renamed from: hasTasktype */
    public boolean m38131x92f136f9() {
        return m38127x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38132x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18417xcb94b041[1]) {
                fVar.h(1, this.f18420xcb7ef560);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b = this.f18418x3339a3;
            if (enumC4481x4be3466b != null && this.f18417xcb94b041[2]) {
                fVar.e(2, enumC4481x4be3466b.f18616x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18415xfa35ab3d;
            if (gVar != null && this.f18417xcb94b041[3]) {
                fVar.b(3, gVar);
            }
            if (this.f18417xcb94b041[4]) {
                fVar.e(4, this.f18421xe79c7a3f);
            }
            if (this.f18417xcb94b041[5]) {
                fVar.e(5, this.f18419xf271f55e);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x53414504 = this.f18416xaeebe60b;
            if (c4472x53414504 != null && this.f18417xcb94b041[6]) {
                fVar.i(6, c4472x53414504.mo75928xcd1e8d8());
                this.f18416xaeebe60b.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = this.f18417xcb94b041[1] ? 0 + b36.f.h(1, this.f18420xcb7ef560) : 0;
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b2 = this.f18418x3339a3;
            if (enumC4481x4be3466b2 != null && this.f18417xcb94b041[2]) {
                h17 += b36.f.e(2, enumC4481x4be3466b2.f18616x6ac9171);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18415xfa35ab3d;
            if (gVar2 != null && this.f18417xcb94b041[3]) {
                h17 += b36.f.b(3, gVar2);
            }
            if (this.f18417xcb94b041[4]) {
                h17 += b36.f.e(4, this.f18421xe79c7a3f);
            }
            if (this.f18417xcb94b041[5]) {
                h17 += b36.f.e(5, this.f18419xf271f55e);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x534145042 = this.f18416xaeebe60b;
            return (c4472x534145042 == null || !this.f18417xcb94b041[6]) ? h17 : h17 + b36.f.i(6, c4472x534145042.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f18420xcb7ef560 = aVar2.i(intValue);
                this.f18417xcb94b041[1] = true;
                return 0;
            case 2:
                this.f18418x3339a3 = com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b.m38635x382ad972(aVar2.g(intValue));
                this.f18417xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18415xfa35ab3d = aVar2.d(intValue);
                this.f18417xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18421xe79c7a3f = aVar2.g(intValue);
                this.f18417xcb94b041[4] = true;
                return 0;
            case 5:
                this.f18419xf271f55e = aVar2.g(intValue);
                this.f18417xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x534145043 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();
                    if (bArr != null && bArr.length > 0) {
                        c4472x534145043.mo11468x92b714fd(bArr);
                    }
                    this.f18416xaeebe60b = c4472x534145043;
                }
                this.f18417xcb94b041[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBizdata */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38134xab74347b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18415xfa35ab3d = gVar;
        this.f18417xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCipher */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38135x7383d0d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x53414504) {
        this.f18416xaeebe60b = c4472x53414504;
        this.f18417xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setMode */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38136x764d6925(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4481x4be3466b enumC4481x4be3466b) {
        this.f18418x3339a3 = enumC4481x4be3466b;
        this.f18417xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setSubTasktype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38137xa63216dd(int i17) {
        this.f18419xf271f55e = i17;
        this.f18417xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setTaskid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38138x23cb4c62(long j17) {
        this.f18420xcb7ef560 = j17;
        this.f18417xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setTasktype */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38139x5e2f18c1(int i17) {
        this.f18421xe79c7a3f = i17;
        this.f18417xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e m38133x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4456x438c766e) super.mo11468x92b714fd(bArr);
    }
}
