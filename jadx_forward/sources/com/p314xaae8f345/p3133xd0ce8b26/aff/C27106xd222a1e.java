package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkPullLogCmd */
/* loaded from: classes15.dex */
public class C27106xd222a1e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e f59170xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e();

    /* renamed from: end_time */
    private int f59171x66d9d3b1;

    /* renamed from: ext_buffer */
    private java.lang.String f59172x4261901e;

    /* renamed from: ilink_capath */
    private java.lang.String f59175x9ae8255f;

    /* renamed from: include_devlog */
    private boolean f59177xc870c686;

    /* renamed from: start_time */
    private int f59178xa23bb48a;

    /* renamed from: upload_token */
    private java.lang.String f59179xafdae63b;

    /* renamed from: use_nettype */
    private int f59180x42f3179f;

    /* renamed from: ilink_appids */
    private java.util.LinkedList<java.lang.String> f59174x9851f0d3 = new java.util.LinkedList<>();

    /* renamed from: ilink_logs */
    private java.util.LinkedList<java.lang.String> f59176xd14b208b = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f59173xcb94b041 = new boolean[10];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110362xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110363x7c90cfc0() {
        return f59170xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110364x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e();
    }

    /* renamed from: addAllElementIlinkAppids */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110365x94fc9f7e(java.util.Collection<java.lang.String> collection) {
        this.f59174x9851f0d3.addAll(collection);
        this.f59173xcb94b041[5] = true;
        return this;
    }

    /* renamed from: addAllElementIlinkLogs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110366x2f977df6(java.util.Collection<java.lang.String> collection) {
        this.f59176xd14b208b.addAll(collection);
        this.f59173xcb94b041[9] = true;
        return this;
    }

    /* renamed from: addElementIlinkAppids */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110367x7985a89f(java.lang.String str) {
        this.f59174x9851f0d3.add(str);
        this.f59173xcb94b041[5] = true;
        return this;
    }

    /* renamed from: addElementIlinkLogs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110368xdb625b57(java.lang.String str) {
        this.f59176xd14b208b.add(str);
        this.f59173xcb94b041[9] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110369x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e c27106xd222a1e = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59178xa23bb48a), java.lang.Integer.valueOf(c27106xd222a1e.f59178xa23bb48a)) && n51.f.a(java.lang.Integer.valueOf(this.f59171x66d9d3b1), java.lang.Integer.valueOf(c27106xd222a1e.f59171x66d9d3b1)) && n51.f.a(this.f59179xafdae63b, c27106xd222a1e.f59179xafdae63b) && n51.f.a(java.lang.Integer.valueOf(this.f59180x42f3179f), java.lang.Integer.valueOf(c27106xd222a1e.f59180x42f3179f)) && n51.f.a(this.f59174x9851f0d3, c27106xd222a1e.f59174x9851f0d3) && n51.f.a(java.lang.Boolean.valueOf(this.f59177xc870c686), java.lang.Boolean.valueOf(c27106xd222a1e.f59177xc870c686)) && n51.f.a(this.f59172x4261901e, c27106xd222a1e.f59172x4261901e) && n51.f.a(this.f59175x9ae8255f, c27106xd222a1e.f59175x9ae8255f) && n51.f.a(this.f59176xd14b208b, c27106xd222a1e.f59176xd14b208b);
    }

    /* renamed from: getEndTime */
    public int m110370xde00a612() {
        return this.f59171x66d9d3b1;
    }

    /* renamed from: getExtBuffer */
    public java.lang.String m110371x9f8d9f0b() {
        return this.f59173xcb94b041[7] ? this.f59172x4261901e : "";
    }

    /* renamed from: getIlinkAppids */
    public java.util.LinkedList<java.lang.String> m110372xfef6ad84() {
        return this.f59174x9851f0d3;
    }

    /* renamed from: getIlinkCapath */
    public java.lang.String m110373x18ce210() {
        return this.f59173xcb94b041[8] ? this.f59175x9ae8255f : "";
    }

    /* renamed from: getIlinkLogs */
    public java.util.LinkedList<java.lang.String> m110374x16a9557c() {
        return this.f59176xd14b208b;
    }

    /* renamed from: getIncludeDevlog */
    public boolean m110375x32c10a21() {
        return this.f59177xc870c686;
    }

    /* renamed from: getStartTime */
    public int m110376x8082fb99() {
        return this.f59178xa23bb48a;
    }

    /* renamed from: getUploadToken */
    public java.lang.String m110377x18b39b42() {
        return this.f59173xcb94b041[3] ? this.f59179xafdae63b : "";
    }

    /* renamed from: getUseNettype */
    public int m110378xfb7eb6c6() {
        return this.f59180x42f3179f;
    }

    /* renamed from: hasEndTime */
    public boolean m110379x19572e4e() {
        return m110381x6e095e9(2);
    }

    /* renamed from: hasExtBuffer */
    public boolean m110380x5f630847() {
        return m110381x6e095e9(7);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110381x6e095e9(int i17) {
        return this.f59173xcb94b041[i17];
    }

    /* renamed from: hasIlinkAppids */
    public boolean m110382x1f16b7c0() {
        return m110381x6e095e9(5);
    }

    /* renamed from: hasIlinkCapath */
    public boolean m110383x21acec4c() {
        return m110381x6e095e9(8);
    }

    /* renamed from: hasIlinkLogs */
    public boolean m110384xd67ebeb8() {
        return m110381x6e095e9(9);
    }

    /* renamed from: hasIncludeDevlog */
    public boolean m110385xcb07755d() {
        return m110381x6e095e9(6);
    }

    /* renamed from: hasStartTime */
    public boolean m110386x405864d5() {
        return m110381x6e095e9(1);
    }

    /* renamed from: hasUploadToken */
    public boolean m110387x38d3a57e() {
        return m110381x6e095e9(3);
    }

    /* renamed from: hasUseNettype */
    public boolean m110388x3656750a() {
        return m110381x6e095e9(4);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110389x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f59173xcb94b041[1]) {
                fVar.e(1, this.f59178xa23bb48a);
            }
            if (this.f59173xcb94b041[2]) {
                fVar.e(2, this.f59171x66d9d3b1);
            }
            java.lang.String str = this.f59179xafdae63b;
            if (str != null && this.f59173xcb94b041[3]) {
                fVar.j(3, str);
            }
            if (this.f59173xcb94b041[4]) {
                fVar.e(4, this.f59180x42f3179f);
            }
            fVar.g(5, 1, this.f59174x9851f0d3);
            if (this.f59173xcb94b041[6]) {
                fVar.a(6, this.f59177xc870c686);
            }
            java.lang.String str2 = this.f59172x4261901e;
            if (str2 != null && this.f59173xcb94b041[7]) {
                fVar.j(7, str2);
            }
            java.lang.String str3 = this.f59175x9ae8255f;
            if (str3 != null && this.f59173xcb94b041[8]) {
                fVar.j(8, str3);
            }
            fVar.g(9, 1, this.f59176xd14b208b);
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f59173xcb94b041[1] ? 0 + b36.f.e(1, this.f59178xa23bb48a) : 0;
            if (this.f59173xcb94b041[2]) {
                e17 += b36.f.e(2, this.f59171x66d9d3b1);
            }
            java.lang.String str4 = this.f59179xafdae63b;
            if (str4 != null && this.f59173xcb94b041[3]) {
                e17 += b36.f.j(3, str4);
            }
            if (this.f59173xcb94b041[4]) {
                e17 += b36.f.e(4, this.f59180x42f3179f);
            }
            int g17 = e17 + b36.f.g(5, 1, this.f59174x9851f0d3);
            if (this.f59173xcb94b041[6]) {
                g17 += b36.f.a(6, this.f59177xc870c686);
            }
            java.lang.String str5 = this.f59172x4261901e;
            if (str5 != null && this.f59173xcb94b041[7]) {
                g17 += b36.f.j(7, str5);
            }
            java.lang.String str6 = this.f59175x9ae8255f;
            if (str6 != null && this.f59173xcb94b041[8]) {
                g17 += b36.f.j(8, str6);
            }
            return g17 + b36.f.g(9, 1, this.f59176xd14b208b);
        }
        if (i17 == 2) {
            this.f59174x9851f0d3.clear();
            this.f59176xd14b208b.clear();
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
                this.f59178xa23bb48a = aVar2.g(intValue);
                this.f59173xcb94b041[1] = true;
                return 0;
            case 2:
                this.f59171x66d9d3b1 = aVar2.g(intValue);
                this.f59173xcb94b041[2] = true;
                return 0;
            case 3:
                this.f59179xafdae63b = aVar2.k(intValue);
                this.f59173xcb94b041[3] = true;
                return 0;
            case 4:
                this.f59180x42f3179f = aVar2.g(intValue);
                this.f59173xcb94b041[4] = true;
                return 0;
            case 5:
                this.f59174x9851f0d3.add(aVar2.k(intValue));
                this.f59173xcb94b041[5] = true;
                return 0;
            case 6:
                this.f59177xc870c686 = aVar2.c(intValue);
                this.f59173xcb94b041[6] = true;
                return 0;
            case 7:
                this.f59172x4261901e = aVar2.k(intValue);
                this.f59173xcb94b041[7] = true;
                return 0;
            case 8:
                this.f59175x9ae8255f = aVar2.k(intValue);
                this.f59173xcb94b041[8] = true;
                return 0;
            case 9:
                this.f59176xd14b208b.add(aVar2.k(intValue));
                this.f59173xcb94b041[9] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setEndTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110391x5171f386(int i17) {
        this.f59171x66d9d3b1 = i17;
        this.f59173xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setExtBuffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110392xfbe15f7f(java.lang.String str) {
        this.f59172x4261901e = str;
        this.f59173xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setIlinkAppids */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110393x955c20f8(java.util.LinkedList<java.lang.String> linkedList) {
        this.f59174x9851f0d3 = linkedList;
        this.f59173xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setIlinkCapath */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110394x97f25584(java.lang.String str) {
        this.f59175x9ae8255f = str;
        this.f59173xcb94b041[8] = true;
        return this;
    }

    /* renamed from: setIlinkLogs */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110395x72fd15f0(java.util.LinkedList<java.lang.String> linkedList) {
        this.f59176xd14b208b = linkedList;
        this.f59173xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setIncludeDevlog */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110396xc5977095(boolean z17) {
        this.f59177xc870c686 = z17;
        this.f59173xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setStartTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110397xdcd6bc0d(int i17) {
        this.f59178xa23bb48a = i17;
        this.f59173xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setUploadToken */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110398xaf190eb6(java.lang.String str) {
        this.f59179xafdae63b = str;
        this.f59173xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setUseNettype */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110399x29a304d2(int i17) {
        this.f59180x42f3179f = i17;
        this.f59173xcb94b041[4] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e m110390x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27106xd222a1e) super.mo11468x92b714fd(bArr);
    }
}
