package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CTlvMeta */
/* loaded from: classes8.dex */
public class C27086x75cb07b2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 f59001xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2();

    /* renamed from: checksum */
    private int f59002x5b9b5c43;

    /* renamed from: hasSetFields */
    private final boolean[] f59003xcb94b041 = new boolean[5];

    /* renamed from: length */
    private long f59004xbe0e3ae6;

    /* renamed from: offset */
    private long f59005xc3376493;

    /* renamed from: type */
    private int f59006x368f3a;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109980xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109981x7c90cfc0() {
        return f59001xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109982x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109983x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 c27086x75cb07b2 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59006x368f3a), java.lang.Integer.valueOf(c27086x75cb07b2.f59006x368f3a)) && n51.f.a(java.lang.Integer.valueOf(this.f59002x5b9b5c43), java.lang.Integer.valueOf(c27086x75cb07b2.f59002x5b9b5c43)) && n51.f.a(java.lang.Long.valueOf(this.f59005xc3376493), java.lang.Long.valueOf(c27086x75cb07b2.f59005xc3376493)) && n51.f.a(java.lang.Long.valueOf(this.f59004xbe0e3ae6), java.lang.Long.valueOf(c27086x75cb07b2.f59004xbe0e3ae6));
    }

    /* renamed from: getChecksum */
    public int m109984xd77599b9() {
        return this.f59002x5b9b5c43;
    }

    /* renamed from: getLength */
    public long m109985x23255ddc() {
        return this.f59004xbe0e3ae6;
    }

    /* renamed from: getOffset */
    public long m109986x284e8789() {
        return this.f59005xc3376493;
    }

    /* renamed from: getType */
    public int m109987xfb85f7b0() {
        return this.f59006x368f3a;
    }

    /* renamed from: hasChecksum */
    public boolean m109988x6f018fd() {
        return m109989x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m109989x6e095e9(int i17) {
        return this.f59003xcb94b041[i17];
    }

    /* renamed from: hasLength */
    public boolean m109990xe2fede20() {
        return m109989x6e095e9(4);
    }

    /* renamed from: hasOffset */
    public boolean m109991xe82807cd() {
        return m109989x6e095e9(3);
    }

    /* renamed from: hasType */
    public boolean m109992x298ab8f4() {
        return m109989x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109993x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f59003xcb94b041[1]) {
                fVar.e(1, this.f59006x368f3a);
            }
            if (this.f59003xcb94b041[2]) {
                fVar.e(2, this.f59002x5b9b5c43);
            }
            if (this.f59003xcb94b041[3]) {
                fVar.h(3, this.f59005xc3376493);
            }
            if (this.f59003xcb94b041[4]) {
                fVar.h(4, this.f59004xbe0e3ae6);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.f59003xcb94b041[1] ? 0 + b36.f.e(1, this.f59006x368f3a) : 0;
            if (this.f59003xcb94b041[2]) {
                e17 += b36.f.e(2, this.f59002x5b9b5c43);
            }
            if (this.f59003xcb94b041[3]) {
                e17 += b36.f.h(3, this.f59005xc3376493);
            }
            return this.f59003xcb94b041[4] ? e17 + b36.f.h(4, this.f59004xbe0e3ae6) : e17;
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
            this.f59006x368f3a = aVar2.g(intValue);
            this.f59003xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f59002x5b9b5c43 = aVar2.g(intValue);
            this.f59003xcb94b041[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f59005xc3376493 = aVar2.i(intValue);
            this.f59003xcb94b041[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f59004xbe0e3ae6 = aVar2.i(intValue);
        this.f59003xcb94b041[4] = true;
        return 0;
    }

    /* renamed from: setChecksum */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109995xd22dfac5(int i17) {
        this.f59002x5b9b5c43 = i17;
        this.f59003xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setLength */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109996x165a91e8(long j17) {
        this.f59004xbe0e3ae6 = j17;
        this.f59003xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setOffset */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109997x1b83bb95(long j17) {
        this.f59005xc3376493 = j17;
        this.f59003xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109998x7650bebc(int i17) {
        this.f59006x368f3a = i17;
        this.f59003xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 m109994x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27086x75cb07b2) super.mo11468x92b714fd(bArr);
    }
}
