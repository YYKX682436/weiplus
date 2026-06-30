package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.History */
/* loaded from: classes8.dex */
public class C4499x9a787c74 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 f18853xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74();

    /* renamed from: hasSetFields */
    private final boolean[] f18854xcb94b041 = new boolean[2];

    /* renamed from: statefile_keep_hours */
    private int f18855x29f9fc7;

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39088xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39089x7c90cfc0() {
        return f18853xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39090x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39091x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74) && n51.f.a(java.lang.Integer.valueOf(this.f18855x29f9fc7), java.lang.Integer.valueOf(((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74) fVar).f18855x29f9fc7));
    }

    /* renamed from: getStatefileKeepHours */
    public int m39092xa997fd73() {
        return this.f18855x29f9fc7;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39093x6e095e9(int i17) {
        return this.f18854xcb94b041[i17];
    }

    /* renamed from: hasStatefileKeepHours */
    public boolean m39094x49ff37b7() {
        return m39093x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39095x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f18854xcb94b041[1]) {
                fVar.e(1, this.f18855x29f9fc7);
            }
            return 0;
        }
        if (i17 == 1) {
            if (this.f18854xcb94b041[1]) {
                return 0 + b36.f.e(1, this.f18855x29f9fc7);
            }
            return 0;
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
        this.f18855x29f9fc7 = aVar2.g(intValue);
        this.f18854xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setStatefileKeepHours */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39097x40c37f7f(int i17) {
        this.f18855x29f9fc7 = i17;
        this.f18854xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m39096x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74) super.mo11468x92b714fd(bArr);
    }
}
