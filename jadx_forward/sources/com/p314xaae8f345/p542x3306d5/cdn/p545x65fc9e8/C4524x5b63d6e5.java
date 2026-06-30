package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.SnsUploadOptions */
/* loaded from: classes8.dex */
public class C4524x5b63d6e5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 f19016xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5();

    /* renamed from: emoji_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f19017x2caa6403;

    /* renamed from: hasSetFields */
    private final boolean[] f19018xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39479xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39480x7c90cfc0() {
        return f19016xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39481x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39482x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5) && n51.f.a(this.f19017x2caa6403, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5) fVar).f19017x2caa6403);
    }

    /* renamed from: getEmojiData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m39483x63eac25a() {
        return this.f19018xcb94b041[1] ? this.f19017x2caa6403 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasEmojiData */
    public boolean m39484x23c02b96() {
        return m39485x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39485x6e095e9(int i17) {
        return this.f19018xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39486x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f19017x2caa6403;
            if (gVar != null && this.f19018xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f19017x2caa6403;
            if (gVar2 == null || !this.f19018xcb94b041[1]) {
                return 0;
            }
            return 0 + b36.f.b(1, gVar2);
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
        if (intValue != 1) {
            return -1;
        }
        this.f19017x2caa6403 = aVar2.d(intValue);
        this.f19018xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setEmojiData */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39488xc03e82ce(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f19017x2caa6403 = gVar;
        this.f19018xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 m39487x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4524x5b63d6e5) super.mo11468x92b714fd(bArr);
    }
}
