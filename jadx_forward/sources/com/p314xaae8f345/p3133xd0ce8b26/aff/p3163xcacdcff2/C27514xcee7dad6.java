package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.MarkStatusReadResponse */
/* loaded from: classes8.dex */
public class C27514xcee7dad6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 f60372xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6();

    /* renamed from: error_code */
    private int f60373x617e99c4;

    /* renamed from: error_msg */
    private java.lang.String f60374x13a964ca;

    /* renamed from: hasSetFields */
    private final boolean[] f60375xcb94b041 = new boolean[4];

    /* renamed from: result */
    private boolean f60376xc84dc81d;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116891xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116892x7c90cfc0() {
        return f60372xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116893x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116894x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 c27514xcee7dad6 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60376xc84dc81d), java.lang.Boolean.valueOf(c27514xcee7dad6.f60376xc84dc81d)) && n51.f.a(java.lang.Integer.valueOf(this.f60373x617e99c4), java.lang.Integer.valueOf(c27514xcee7dad6.f60373x617e99c4)) && n51.f.a(this.f60374x13a964ca, c27514xcee7dad6.f60374x13a964ca);
    }

    /* renamed from: getErrorCode */
    public int m116895x130a215f() {
        return this.f60373x617e99c4;
    }

    /* renamed from: getErrorMsg */
    public java.lang.String m116896xcf10fdcf() {
        return this.f60375xcb94b041[3] ? this.f60374x13a964ca : "";
    }

    /* renamed from: getResult */
    public boolean m116897x2d64eb13() {
        return this.f60376xc84dc81d;
    }

    /* renamed from: hasErrorCode */
    public boolean m116898xd2df8a9b() {
        return m116900x6e095e9(2);
    }

    /* renamed from: hasErrorMsg */
    public boolean m116899xfe8b7d13() {
        return m116900x6e095e9(3);
    }

    /* renamed from: hasFieldNumber */
    public boolean m116900x6e095e9(int i17) {
        return this.f60375xcb94b041[i17];
    }

    /* renamed from: hasResult */
    public boolean m116901xed3e6b57() {
        return m116900x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116902x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f60375xcb94b041[1]) {
                fVar.a(1, this.f60376xc84dc81d);
            }
            if (this.f60375xcb94b041[2]) {
                fVar.e(2, this.f60373x617e99c4);
            }
            java.lang.String str = this.f60374x13a964ca;
            if (str != null && this.f60375xcb94b041[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = this.f60375xcb94b041[1] ? 0 + b36.f.a(1, this.f60376xc84dc81d) : 0;
            if (this.f60375xcb94b041[2]) {
                a17 += b36.f.e(2, this.f60373x617e99c4);
            }
            java.lang.String str2 = this.f60374x13a964ca;
            return (str2 == null || !this.f60375xcb94b041[3]) ? a17 : a17 + b36.f.j(3, str2);
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
            this.f60376xc84dc81d = aVar2.c(intValue);
            this.f60375xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f60373x617e99c4 = aVar2.g(intValue);
            this.f60375xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f60374x13a964ca = aVar2.k(intValue);
        this.f60375xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setErrorCode */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116904x6f5de1d3(int i17) {
        this.f60373x617e99c4 = i17;
        this.f60375xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setErrorMsg */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116905xc9c95edb(java.lang.String str) {
        this.f60374x13a964ca = str;
        this.f60375xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setResult */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116906x209a1f1f(boolean z17) {
        this.f60376xc84dc81d = z17;
        this.f60375xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 m116903x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27514xcee7dad6) super.mo11468x92b714fd(bArr);
    }
}
