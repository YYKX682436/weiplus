package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderMentionContact */
/* loaded from: classes10.dex */
public class C27411x364840bc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc f59946xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc();

    /* renamed from: contact */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa f59947x38b72420 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa.m114530x7c90cfc0();

    /* renamed from: isSelf */
    public boolean f59949xb9a8ab96 = false;

    /* renamed from: fans_id */
    public long f59948xbf8581fa = 0;

    /* renamed from: relation_type */
    public int f59950x1b162b9d = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114820xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114821x7c90cfc0() {
        return f59946xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114822x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114823x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc c27411x364840bc = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc) fVar;
        return n51.f.a(this.f59947x38b72420, c27411x364840bc.f59947x38b72420) && n51.f.a(java.lang.Boolean.valueOf(this.f59949xb9a8ab96), java.lang.Boolean.valueOf(c27411x364840bc.f59949xb9a8ab96)) && n51.f.a(java.lang.Long.valueOf(this.f59948xbf8581fa), java.lang.Long.valueOf(c27411x364840bc.f59948xbf8581fa)) && n51.f.a(java.lang.Integer.valueOf(this.f59950x1b162b9d), java.lang.Integer.valueOf(c27411x364840bc.f59950x1b162b9d));
    }

    /* renamed from: getContact */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa m114824x76845fea() {
        return this.f59947x38b72420;
    }

    /* renamed from: getFansId */
    public long m114825x18b013f1() {
        return this.f59948xbf8581fa;
    }

    /* renamed from: getFans_id */
    public long m114826xfd52bdc4() {
        return this.f59948xbf8581fa;
    }

    /* renamed from: getIsSelf */
    public boolean m114827x1ebfce8c() {
        return this.f59949xb9a8ab96;
    }

    /* renamed from: getRelationType */
    public int m114828x514931cc() {
        return this.f59950x1b162b9d;
    }

    /* renamed from: getRelation_type */
    public int m114829xd875e7e7() {
        return this.f59950x1b162b9d;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114830x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa c27403x23db1cfa = this.f59947x38b72420;
            if (c27403x23db1cfa != null) {
                fVar.i(1, c27403x23db1cfa.mo75928xcd1e8d8());
                this.f59947x38b72420.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f59949xb9a8ab96);
            fVar.h(3, this.f59948xbf8581fa);
            fVar.e(4, this.f59950x1b162b9d);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa c27403x23db1cfa2 = this.f59947x38b72420;
            return (c27403x23db1cfa2 != null ? 0 + b36.f.i(1, c27403x23db1cfa2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f59949xb9a8ab96) + b36.f.h(3, this.f59948xbf8581fa) + b36.f.e(4, this.f59950x1b162b9d);
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
            if (intValue == 2) {
                this.f59949xb9a8ab96 = aVar2.c(intValue);
                return 0;
            }
            if (intValue == 3) {
                this.f59948xbf8581fa = aVar2.i(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f59950x1b162b9d = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa c27403x23db1cfa3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa();
            if (bArr != null && bArr.length > 0) {
                c27403x23db1cfa3.mo11468x92b714fd(bArr);
            }
            this.f59947x38b72420 = c27403x23db1cfa3;
        }
        return 0;
    }

    /* renamed from: setContact */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114832xe9f5ad5e(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27403x23db1cfa c27403x23db1cfa) {
        this.f59947x38b72420 = c27403x23db1cfa;
        return this;
    }

    /* renamed from: setFansId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114833xbe547fd(long j17) {
        this.f59948xbf8581fa = j17;
        return this;
    }

    /* renamed from: setFans_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114834x70c40b38(long j17) {
        this.f59948xbf8581fa = j17;
        return this;
    }

    /* renamed from: setIsSelf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114835x11f50298(boolean z17) {
        this.f59949xb9a8ab96 = z17;
        return this;
    }

    /* renamed from: setRelationType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114836x87922cd8(int i17) {
        this.f59950x1b162b9d = i17;
        return this;
    }

    /* renamed from: setRelation_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114837x6b4c4e5b(int i17) {
        this.f59950x1b162b9d = i17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc m114831x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27411x364840bc) super.mo11468x92b714fd(bArr);
    }
}
