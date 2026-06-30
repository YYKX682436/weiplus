package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.SyncLocation */
/* loaded from: classes8.dex */
public class C27472xa1e0a790 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 f60343xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790();

    /* renamed from: longitude */
    public float f60346x83009af = 0.0f;

    /* renamed from: latitude */
    public float f60344xaa2bac6c = 0.0f;

    /* renamed from: lbs_cache_time */
    public int f60345x4f20e92c = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116467xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116468x7c90cfc0() {
        return f60343xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116469x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116470x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 c27472xa1e0a790 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790) fVar;
        return n51.f.a(java.lang.Float.valueOf(this.f60346x83009af), java.lang.Float.valueOf(c27472xa1e0a790.f60346x83009af)) && n51.f.a(java.lang.Float.valueOf(this.f60344xaa2bac6c), java.lang.Float.valueOf(c27472xa1e0a790.f60344xaa2bac6c)) && n51.f.a(java.lang.Integer.valueOf(this.f60345x4f20e92c), java.lang.Integer.valueOf(c27472xa1e0a790.f60345x4f20e92c));
    }

    /* renamed from: getLatitude */
    public float m116471x2605e9e2() {
        return this.f60344xaa2bac6c;
    }

    /* renamed from: getLbsCacheTime */
    public int m116472xb2e19aa8() {
        return this.f60345x4f20e92c;
    }

    /* renamed from: getLbs_cache_time */
    public int m116473x3db8b622() {
        return this.f60345x4f20e92c;
    }

    /* renamed from: getLongitude */
    public float m116474x79d7af9() {
        return this.f60346x83009af;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116475x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.d(1, this.f60346x83009af);
            fVar.d(2, this.f60344xaa2bac6c);
            fVar.e(3, this.f60345x4f20e92c);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.d(1, this.f60346x83009af) + 0 + b36.f.d(2, this.f60344xaa2bac6c) + b36.f.e(3, this.f60345x4f20e92c);
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
            this.f60346x83009af = aVar2.f(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60344xaa2bac6c = aVar2.f(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f60345x4f20e92c = aVar2.g(intValue);
        return 0;
    }

    /* renamed from: setLatitude */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116477x20be4aee(float f17) {
        this.f60344xaa2bac6c = f17;
        return this;
    }

    /* renamed from: setLbsCacheTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116478xe92a95b4(int i17) {
        this.f60345x4f20e92c = i17;
        return this;
    }

    /* renamed from: setLbs_cache_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116479x5af1e2e(int i17) {
        this.f60345x4f20e92c = i17;
        return this;
    }

    /* renamed from: setLongitude */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116480x63f13b6d(float f17) {
        this.f60346x83009af = f17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 m116476x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27472xa1e0a790) super.mo11468x92b714fd(bArr);
    }
}
