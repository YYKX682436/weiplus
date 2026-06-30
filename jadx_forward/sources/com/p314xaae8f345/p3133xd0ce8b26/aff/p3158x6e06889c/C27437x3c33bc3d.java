package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewLifeActionRequest */
/* loaded from: classes15.dex */
public class C27437x3c33bc3d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d f60154xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d();

    /* renamed from: cmdId */
    public java.lang.String f60155x5a623f5 = "";

    /* renamed from: proto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 f60156x65fc9e8 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063.m115697x7c90cfc0();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115705xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115706x7c90cfc0() {
        return f60154xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115707x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115708x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d c27437x3c33bc3d = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d) fVar;
        return n51.f.a(this.f60155x5a623f5, c27437x3c33bc3d.f60155x5a623f5) && n51.f.a(this.f60156x65fc9e8, c27437x3c33bc3d.f60156x65fc9e8);
    }

    /* renamed from: getCmdId */
    public java.lang.String m115709x7443ca3f() {
        return this.f60155x5a623f5;
    }

    /* renamed from: getProto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 m115710x74fd7032() {
        return this.f60156x65fc9e8;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115711x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60155x5a623f5;
            if (str != null) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x18241063 = this.f60156x65fc9e8;
            if (c27436x18241063 != null) {
                fVar.i(2, c27436x18241063.mo75928xcd1e8d8());
                this.f60156x65fc9e8.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f60155x5a623f5;
            int j17 = str2 != null ? 0 + b36.f.j(1, str2) : 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x182410632 = this.f60156x65fc9e8;
            return c27436x182410632 != null ? j17 + b36.f.i(2, c27436x182410632.mo75928xcd1e8d8()) : j17;
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
            this.f60155x5a623f5 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x182410633 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063();
            if (bArr != null && bArr.length > 0) {
                c27436x182410633.mo11468x92b714fd(bArr);
            }
            this.f60156x65fc9e8 = c27436x182410633;
        }
        return 0;
    }

    /* renamed from: setCmdId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115713x52d1e4b3(java.lang.String str) {
        this.f60155x5a623f5 = str;
        return this;
    }

    /* renamed from: setProto */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115714x538b8aa6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27436x18241063 c27436x18241063) {
        this.f60156x65fc9e8 = c27436x18241063;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d m115712x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27437x3c33bc3d) super.mo11468x92b714fd(bArr);
    }
}
