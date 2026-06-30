package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.MarkStatusReadRequest */
/* loaded from: classes10.dex */
public class C27513xfe50855a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a f60368xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a();

    /* renamed from: hasSetFields */
    private final boolean[] f60369xcb94b041 = new boolean[3];

    /* renamed from: status_id */
    private java.lang.String f60370x849b4488;

    /* renamed from: status_owner_username */
    private java.lang.String f60371xc12f9ccf;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116877xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116878x7c90cfc0() {
        return f60368xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116879x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116880x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a c27513xfe50855a = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a) fVar;
        return n51.f.a(this.f60370x849b4488, c27513xfe50855a.f60370x849b4488) && n51.f.a(this.f60371xc12f9ccf, c27513xfe50855a.f60371xc12f9ccf);
    }

    /* renamed from: getStatusId */
    public java.lang.String m116881xca73e223() {
        return this.f60369xcb94b041[1] ? this.f60370x849b4488 : "";
    }

    /* renamed from: getStatusOwnerUsername */
    public java.lang.String m116882x9ff1b2a1() {
        return this.f60369xcb94b041[2] ? this.f60371xc12f9ccf : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m116883x6e095e9(int i17) {
        return this.f60369xcb94b041[i17];
    }

    /* renamed from: hasStatusId */
    public boolean m116884xf9ee6167() {
        return m116883x6e095e9(1);
    }

    /* renamed from: hasStatusOwnerUsername */
    public boolean m116885xc71c0dd() {
        return m116883x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116886x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60370x849b4488;
            if (str != null && this.f60369xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f60371xc12f9ccf;
            if (str2 != null && this.f60369xcb94b041[2]) {
                fVar.j(2, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f60370x849b4488;
            if (str3 != null && this.f60369xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f60371xc12f9ccf;
            return (str4 == null || !this.f60369xcb94b041[2]) ? i18 : i18 + b36.f.j(2, str4);
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
            this.f60370x849b4488 = aVar2.k(intValue);
            this.f60369xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f60371xc12f9ccf = aVar2.k(intValue);
        this.f60369xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setStatusId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116888xc52c432f(java.lang.String str) {
        this.f60370x849b4488 = str;
        this.f60369xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setStatusOwnerUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116889xee367215(java.lang.String str) {
        this.f60371xc12f9ccf = str;
        this.f60369xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a m116887x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27513xfe50855a) super.mo11468x92b714fd(bArr);
    }
}
