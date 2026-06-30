package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewLifeRequestSyncActionResult */
/* loaded from: classes8.dex */
public class C27446xd8569ca1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 f60240xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1();

    /* renamed from: lastPrefetchTime */
    public long f60243x8c412b1a = 0;

    /* renamed from: isPrefetchFreqLimit */
    public boolean f60242x9be15fe2 = false;

    /* renamed from: hasNewLifeEntranceReddot */
    public boolean f60241x8d0dded0 = false;

    /* renamed from: waitNewLifeCtrlInfoList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> f60244x15bab51e = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116063xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116064x7c90cfc0() {
        return f60240xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116065x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1();
    }

    /* renamed from: addAllElementWaitNewLifeCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116066xe153e7e2(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> collection) {
        this.f60244x15bab51e.addAll(collection);
        return this;
    }

    /* renamed from: addElementWaitNewLifeCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116067x9a7b4783(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7 c27420xb907d6b7) {
        this.f60244x15bab51e.add(c27420xb907d6b7);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116068x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 c27446xd8569ca1 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f60243x8c412b1a), java.lang.Long.valueOf(c27446xd8569ca1.f60243x8c412b1a)) && n51.f.a(java.lang.Boolean.valueOf(this.f60242x9be15fe2), java.lang.Boolean.valueOf(c27446xd8569ca1.f60242x9be15fe2)) && n51.f.a(java.lang.Boolean.valueOf(this.f60241x8d0dded0), java.lang.Boolean.valueOf(c27446xd8569ca1.f60241x8d0dded0)) && n51.f.a(this.f60244x15bab51e, c27446xd8569ca1.f60244x15bab51e);
    }

    /* renamed from: getHasNewLifeEntranceReddot */
    public boolean m116069xbd1a7046() {
        return this.f60241x8d0dded0;
    }

    /* renamed from: getIsPrefetchFreqLimit */
    public boolean m116070xf4113cac() {
        return this.f60242x9be15fe2;
    }

    /* renamed from: getLastPrefetchTime */
    public long m116071x34199290() {
        return this.f60243x8c412b1a;
    }

    /* renamed from: getWaitNewLifeCtrlInfoList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> m116072xe5bb1ce8() {
        return this.f60244x15bab51e;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116073x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f60243x8c412b1a);
            fVar.a(2, this.f60242x9be15fe2);
            fVar.a(3, this.f60241x8d0dded0);
            fVar.g(4, 8, this.f60244x15bab51e);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f60243x8c412b1a) + 0 + b36.f.a(2, this.f60242x9be15fe2) + b36.f.a(3, this.f60241x8d0dded0) + b36.f.g(4, 8, this.f60244x15bab51e);
        }
        if (i17 == 2) {
            this.f60244x15bab51e.clear();
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
            this.f60243x8c412b1a = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f60242x9be15fe2 = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f60241x8d0dded0 = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7 c27420xb907d6b7 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7();
            if (bArr != null && bArr.length > 0) {
                c27420xb907d6b7.mo11468x92b714fd(bArr);
            }
            this.f60244x15bab51e.add(c27420xb907d6b7);
        }
        return 0;
    }

    /* renamed from: setHasNewLifeEntranceReddot */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116075x6ce73952(boolean z17) {
        this.f60241x8d0dded0 = z17;
        return this;
    }

    /* renamed from: setIsPrefetchFreqLimit */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116076x4255fc20(boolean z17) {
        this.f60242x9be15fe2 = z17;
        return this;
    }

    /* renamed from: setLastPrefetchTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116077xd816279c(long j17) {
        this.f60243x8c412b1a = j17;
        return this;
    }

    /* renamed from: setWaitNewLifeCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116078xfbeb025c(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> linkedList) {
        this.f60244x15bab51e = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 m116074x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27446xd8569ca1) super.mo11468x92b714fd(bArr);
    }
}
