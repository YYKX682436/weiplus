package com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb;

/* renamed from: com.tencent.wechat.aff.common.BaseRequestWrap */
/* loaded from: classes2.dex */
public class C27230x9584f3c8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 f59601xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8();

    /* renamed from: BaseRequest */
    public r45.he f59602x2de60e5e = r45.he.f457609m;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112230xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112231x7c90cfc0() {
        return f59601xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112232x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112233x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8) && n51.f.a(this.f59602x2de60e5e, ((com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8) fVar).f59602x2de60e5e);
    }

    /* renamed from: getBaseRequest */
    public r45.he m112234xa452ad48() {
        return this.f59602x2de60e5e;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112235x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f59602x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f59602x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f59602x2de60e5e;
            if (heVar2 != null) {
                return 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8());
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
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.he heVar3 = new r45.he();
            if (bArr != null && bArr.length > 0) {
                heVar3.mo11468x92b714fd(bArr);
            }
            this.f59602x2de60e5e = heVar3;
        }
        return 0;
    }

    /* renamed from: setBaseRequest */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112237x3ab820bc(r45.he heVar) {
        this.f59602x2de60e5e = heVar;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 m112236x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3138xaf3f29eb.C27230x9584f3c8) super.mo11468x92b714fd(bArr);
    }
}
