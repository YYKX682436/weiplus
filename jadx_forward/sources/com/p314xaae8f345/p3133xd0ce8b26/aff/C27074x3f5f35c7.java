package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CCdnKv */
/* loaded from: classes10.dex */
public class C27074x3f5f35c7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 f58774xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7();

    /* renamed from: hasSetFields */
    private final boolean[] f58775xcb94b041 = new boolean[3];

    /* renamed from: key_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58776x1dd72d8a;

    /* renamed from: value_data */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58777x79c355b8;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109246xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109247x7c90cfc0() {
        return f58774xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109248x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109249x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 c27074x3f5f35c7 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7) fVar;
        return n51.f.a(this.f58776x1dd72d8a, c27074x3f5f35c7.f58776x1dd72d8a) && n51.f.a(this.f58777x79c355b8, c27074x3f5f35c7.f58777x79c355b8);
    }

    /* renamed from: getKeyData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109250xd2af673() {
        return this.f58775xcb94b041[1] ? this.f58776x1dd72d8a : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getValueData */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109251xd1c24605() {
        return this.f58775xcb94b041[2] ? this.f58777x79c355b8 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109252x6e095e9(int i17) {
        return this.f58775xcb94b041[i17];
    }

    /* renamed from: hasKeyData */
    public boolean m109253x48817eaf() {
        return m109252x6e095e9(1);
    }

    /* renamed from: hasValueData */
    public boolean m109254x9197af41() {
        return m109252x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109255x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58776x1dd72d8a;
            if (gVar != null && this.f58775xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58777x79c355b8;
            if (gVar2 != null && this.f58775xcb94b041[2]) {
                fVar.b(2, gVar2);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f58776x1dd72d8a;
            if (gVar3 != null && this.f58775xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f58777x79c355b8;
            return (gVar4 == null || !this.f58775xcb94b041[2]) ? i18 : i18 + b36.f.b(2, gVar4);
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
            this.f58776x1dd72d8a = aVar2.d(intValue);
            this.f58775xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f58777x79c355b8 = aVar2.d(intValue);
        this.f58775xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setKeyData */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109257x809c43e7(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58776x1dd72d8a = gVar;
        this.f58775xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setValueData */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109258x2e160679(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58777x79c355b8 = gVar;
        this.f58775xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 m109256x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27074x3f5f35c7) super.mo11468x92b714fd(bArr);
    }
}
