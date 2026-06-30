package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.BaseRequest */
/* loaded from: classes2.dex */
public class C27383x2de60e5e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e f59719xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e();

    /* renamed from: ClientVersion */
    public int f59720x5da1266d;

    /* renamed from: DeviceID */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59721x45f74e11;

    /* renamed from: DeviceType */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59722xa561e2d0;

    /* renamed from: Scene */
    public int f59723x4c0286c;

    /* renamed from: SessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59724xd9df7009;
    public int Uin;

    public C27383x2de60e5e() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
        this.f59724xd9df7009 = gVar;
        this.Uin = 0;
        this.f59721x45f74e11 = gVar;
        this.f59720x5da1266d = 0;
        this.f59722xa561e2d0 = gVar;
        this.f59723x4c0286c = 0;
    }

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113874xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113875x7c90cfc0() {
        return f59719xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113876x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113877x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e c27383x2de60e5e = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e) fVar;
        return n51.f.a(this.f59724xd9df7009, c27383x2de60e5e.f59724xd9df7009) && n51.f.a(java.lang.Integer.valueOf(this.Uin), java.lang.Integer.valueOf(c27383x2de60e5e.Uin)) && n51.f.a(this.f59721x45f74e11, c27383x2de60e5e.f59721x45f74e11) && n51.f.a(java.lang.Integer.valueOf(this.f59720x5da1266d), java.lang.Integer.valueOf(c27383x2de60e5e.f59720x5da1266d)) && n51.f.a(this.f59722xa561e2d0, c27383x2de60e5e.f59722xa561e2d0) && n51.f.a(java.lang.Integer.valueOf(this.f59723x4c0286c), java.lang.Integer.valueOf(c27383x2de60e5e.f59723x4c0286c));
    }

    /* renamed from: getClientVersion */
    public int m113878xeb61b2d7() {
        return this.f59720x5da1266d;
    }

    /* renamed from: getDeviceID */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m113879xbdf72767() {
        return this.f59721x45f74e11;
    }

    /* renamed from: getDeviceType */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m113880x1cd0bea6() {
        return this.f59722xa561e2d0;
    }

    /* renamed from: getScene */
    public int m113881x7520bed6() {
        return this.f59723x4c0286c;
    }

    /* renamed from: getSessionKey */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m113882x514e4bdf() {
        return this.f59724xd9df7009;
    }

    /* renamed from: getUin */
    public int m113883xb5887524() {
        return this.Uin;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113884x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59724xd9df7009;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            fVar.e(2, this.Uin);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59721x45f74e11;
            if (gVar2 != null) {
                fVar.b(3, gVar2);
            }
            fVar.e(4, this.f59720x5da1266d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f59722xa561e2d0;
            if (gVar3 != null) {
                fVar.b(5, gVar3);
            }
            fVar.e(6, this.f59723x4c0286c);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f59724xd9df7009;
            int b17 = (gVar4 != null ? 0 + b36.f.b(1, gVar4) : 0) + b36.f.e(2, this.Uin);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f59721x45f74e11;
            if (gVar5 != null) {
                b17 += b36.f.b(3, gVar5);
            }
            int e17 = b17 + b36.f.e(4, this.f59720x5da1266d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f59722xa561e2d0;
            if (gVar6 != null) {
                e17 += b36.f.b(5, gVar6);
            }
            return e17 + b36.f.e(6, this.f59723x4c0286c);
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
                this.f59724xd9df7009 = aVar2.d(intValue);
                return 0;
            case 2:
                this.Uin = aVar2.g(intValue);
                return 0;
            case 3:
                this.f59721x45f74e11 = aVar2.d(intValue);
                return 0;
            case 4:
                this.f59720x5da1266d = aVar2.g(intValue);
                return 0;
            case 5:
                this.f59722xa561e2d0 = aVar2.d(intValue);
                return 0;
            case 6:
                this.f59723x4c0286c = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setClientVersion */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113886x7e38194b(int i17) {
        this.f59720x5da1266d = i17;
        return this;
    }

    /* renamed from: setDeviceID */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113887xb8af8873(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59721x45f74e11 = gVar;
        return this;
    }

    /* renamed from: setDeviceType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113888x4af50cb2(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59722xa561e2d0 = gVar;
        return this;
    }

    /* renamed from: setScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113889x53aed94a(int i17) {
        this.f59723x4c0286c = i17;
        return this;
    }

    /* renamed from: setSessionKey */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113890x7f7299eb(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59724xd9df7009 = gVar;
        return this;
    }

    /* renamed from: setUin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113891xca029c98(int i17) {
        this.Uin = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e m113885x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27383x2de60e5e) super.mo11468x92b714fd(bArr);
    }
}
