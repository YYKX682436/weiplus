package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.EducationTipsSaveData */
/* loaded from: classes2.dex */
public class C27304x8be6edc7 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 f59609xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7();

    /* renamed from: show_count */
    public int f59611x42369d4d = 0;

    /* renamed from: last_show_timestame */
    public long f59610x9cb7c312 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112763xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112764x7c90cfc0() {
        return f59609xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112765x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112766x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 c27304x8be6edc7 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f59611x42369d4d), java.lang.Integer.valueOf(c27304x8be6edc7.f59611x42369d4d)) && n51.f.a(java.lang.Long.valueOf(this.f59610x9cb7c312), java.lang.Long.valueOf(c27304x8be6edc7.f59610x9cb7c312));
    }

    /* renamed from: getLastShowTimestame */
    public long m112767x95e202e2() {
        return this.f59610x9cb7c312;
    }

    /* renamed from: getLast_show_timestame */
    public long m112768xf4e79fdc() {
        return this.f59610x9cb7c312;
    }

    /* renamed from: getShowCount */
    public int m112769x8c6e4d5c() {
        return this.f59611x42369d4d;
    }

    /* renamed from: getShow_count */
    public int m112770x30775543() {
        return this.f59611x42369d4d;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112771x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f59611x42369d4d);
            fVar.h(2, this.f59610x9cb7c312);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f59611x42369d4d) + 0 + b36.f.h(2, this.f59610x9cb7c312);
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
            this.f59611x42369d4d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f59610x9cb7c312 = aVar2.i(intValue);
        return 0;
    }

    /* renamed from: setLastShowTimestame */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112773x71780f56(long j17) {
        this.f59610x9cb7c312 = j17;
        return this;
    }

    /* renamed from: setLast_show_timestame */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112774x432c5f50(long j17) {
        this.f59610x9cb7c312 = j17;
        return this;
    }

    /* renamed from: setShowCount */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112775xe8c20dd0(int i17) {
        this.f59611x42369d4d = i17;
        return this;
    }

    /* renamed from: setShow_count */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112776x5e9ba34f(int i17) {
        this.f59611x42369d4d = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 m112772x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27304x8be6edc7) super.mo11468x92b714fd(bArr);
    }
}
