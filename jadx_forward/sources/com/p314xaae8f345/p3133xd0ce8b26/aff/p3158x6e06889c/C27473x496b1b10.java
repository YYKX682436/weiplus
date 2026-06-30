package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.WebSearchRequestSyncConfig */
/* loaded from: classes8.dex */
public class C27473x496b1b10 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 f60347xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10();

    /* renamed from: hasEntranceReddot */
    public boolean f60348xa41396a8 = false;

    /* renamed from: waitWebSearchCtrlInfoList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> f60349xdf790fbe = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116482xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116483x7c90cfc0() {
        return f60347xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116484x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10();
    }

    /* renamed from: addAllElementWaitWebSearchCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116485x2990a182(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> collection) {
        this.f60349xdf790fbe.addAll(collection);
        return this;
    }

    /* renamed from: addElementWaitWebSearchCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116486x365e9ce3(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7 c27420xb907d6b7) {
        this.f60349xdf790fbe.add(c27420xb907d6b7);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116487x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 c27473x496b1b10 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60348xa41396a8), java.lang.Boolean.valueOf(c27473x496b1b10.f60348xa41396a8)) && n51.f.a(this.f60349xdf790fbe, c27473x496b1b10.f60349xdf790fbe);
    }

    /* renamed from: getHasEntranceReddot */
    public boolean m116488xf7481df2() {
        return this.f60348xa41396a8;
    }

    /* renamed from: getWaitWebSearchCtrlInfoList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> m116489xb0fead08() {
        return this.f60349xdf790fbe;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116490x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f60348xa41396a8);
            fVar.g(2, 8, this.f60349xdf790fbe);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f60348xa41396a8) + 0 + b36.f.g(2, 8, this.f60349xdf790fbe);
        }
        if (i17 == 2) {
            this.f60349xdf790fbe.clear();
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
            this.f60348xa41396a8 = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
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
            this.f60349xdf790fbe.add(c27420xb907d6b7);
        }
        return 0;
    }

    /* renamed from: setHasEntranceReddot */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116492xd2de2a66(boolean z17) {
        this.f60348xa41396a8 = z17;
        return this;
    }

    /* renamed from: setWaitWebSearchCtrlInfoList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116493xfacb057c(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27420xb907d6b7> linkedList) {
        this.f60349xdf790fbe = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 m116491x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27473x496b1b10) super.mo11468x92b714fd(bArr);
    }
}
