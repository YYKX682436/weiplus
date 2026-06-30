package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CQuicForceHost */
/* loaded from: classes8.dex */
public class C27082xe3e36ee4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 f58981xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4();

    /* renamed from: hasSetFields */
    private final boolean[] f58982xcb94b041 = new boolean[3];

    /* renamed from: host */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f58983x30f5a8;

    /* renamed from: port */
    private int f58984x349881;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109905xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109906x7c90cfc0() {
        return f58981xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109907x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109908x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 c27082xe3e36ee4 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4) fVar;
        return n51.f.a(this.f58983x30f5a8, c27082xe3e36ee4.f58983x30f5a8) && n51.f.a(java.lang.Integer.valueOf(this.f58984x349881), java.lang.Integer.valueOf(c27082xe3e36ee4.f58984x349881));
    }

    /* renamed from: getHost */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m109909xfb805e1e() {
        return this.f58982xcb94b041[1] ? this.f58983x30f5a8 : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getPort */
    public int m109910xfb8400f7() {
        return this.f58984x349881;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109911x6e095e9(int i17) {
        return this.f58982xcb94b041[i17];
    }

    /* renamed from: hasHost */
    public boolean m109912x29851f62() {
        return m109911x6e095e9(1);
    }

    /* renamed from: hasPort */
    public boolean m109913x2988c23b() {
        return m109911x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109914x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f58983x30f5a8;
            if (gVar != null && this.f58982xcb94b041[1]) {
                fVar.b(1, gVar);
            }
            if (this.f58982xcb94b041[2]) {
                fVar.e(2, this.f58984x349881);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f58983x30f5a8;
            if (gVar2 != null && this.f58982xcb94b041[1]) {
                i18 = 0 + b36.f.b(1, gVar2);
            }
            return this.f58982xcb94b041[2] ? i18 + b36.f.e(2, this.f58984x349881) : i18;
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
            this.f58983x30f5a8 = aVar2.d(intValue);
            this.f58982xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f58984x349881 = aVar2.g(intValue);
        this.f58982xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setHost */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109916x764b252a(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f58983x30f5a8 = gVar;
        this.f58982xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setPort */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109917x764ec803(int i17) {
        this.f58984x349881 = i17;
        this.f58982xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 m109915x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4) super.mo11468x92b714fd(bArr);
    }
}
