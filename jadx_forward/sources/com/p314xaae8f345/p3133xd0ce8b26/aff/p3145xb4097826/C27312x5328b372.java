package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderPrefetchRequest */
/* loaded from: classes4.dex */
public class C27312x5328b372 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 f59629xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372();

    /* renamed from: from_username */
    public java.lang.String f59631xfd4da1cb = "";

    /* renamed from: to_username */
    public java.lang.String f59632x5907c61a = "";

    /* renamed from: config_dir */
    public java.lang.String f59630x3194c610 = "";

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112856xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112857x7c90cfc0() {
        return f59629xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112858x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112859x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 c27312x5328b372 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372) fVar;
        return n51.f.a(this.f59631xfd4da1cb, c27312x5328b372.f59631xfd4da1cb) && n51.f.a(this.f59632x5907c61a, c27312x5328b372.f59632x5907c61a) && n51.f.a(this.f59630x3194c610, c27312x5328b372.f59630x3194c610);
    }

    /* renamed from: getConfigDir */
    public java.lang.String m112860xcf7a1b35() {
        return this.f59630x3194c610;
    }

    /* renamed from: getConfig_dir */
    public java.lang.String m112861x1fd57e06() {
        return this.f59630x3194c610;
    }

    /* renamed from: getFromUsername */
    public java.lang.String m112862xc0914d16() {
        return this.f59631xfd4da1cb;
    }

    /* renamed from: getFrom_username */
    public java.lang.String m112863xbaad5e15() {
        return this.f59631xfd4da1cb;
    }

    /* renamed from: getToUsername */
    public java.lang.String m112864xdd380867() {
        return this.f59632x5907c61a;
    }

    /* renamed from: getTo_username */
    public java.lang.String m112865x32de0ce4() {
        return this.f59632x5907c61a;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112866x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f59631xfd4da1cb;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f59632x5907c61a;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f59630x3194c610;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f59631xfd4da1cb;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f59632x5907c61a;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f59630x3194c610;
            return str6 != null ? j17 + b36.f.j(3, str6) : j17;
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
            this.f59631xfd4da1cb = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f59632x5907c61a = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f59630x3194c610 = aVar2.k(intValue);
        return 0;
    }

    /* renamed from: setConfigDir */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112868x2bcddba9(java.lang.String str) {
        this.f59630x3194c610 = str;
        return this;
    }

    /* renamed from: setConfig_dir */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112869x4df9cc12(java.lang.String str) {
        this.f59630x3194c610 = str;
        return this;
    }

    /* renamed from: setFromUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112870xf6da4822(java.lang.String str) {
        this.f59631xfd4da1cb = str;
        return this;
    }

    /* renamed from: setFrom_username */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112871x4d83c489(java.lang.String str) {
        this.f59631xfd4da1cb = str;
        return this;
    }

    /* renamed from: setToUsername */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112872xb5c5673(java.lang.String str) {
        this.f59632x5907c61a = str;
        return this;
    }

    /* renamed from: setTo_username */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112873xc9438058(java.lang.String str) {
        this.f59632x5907c61a = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 m112867x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27312x5328b372) super.mo11468x92b714fd(bArr);
    }
}
