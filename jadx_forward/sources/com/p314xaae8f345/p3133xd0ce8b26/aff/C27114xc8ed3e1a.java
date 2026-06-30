package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkSyncCmdList */
/* loaded from: classes4.dex */
public class C27114xc8ed3e1a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a f59233xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a();

    /* renamed from: cmdlist */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a> f59234x34bd04d8 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f59235xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110534xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110535x7c90cfc0() {
        return f59233xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110536x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a();
    }

    /* renamed from: addAllElementCmdlist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110537x1ffc3f9c(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a> collection) {
        this.f59234x34bd04d8.addAll(collection);
        this.f59235xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementCmdlist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110538x75f1013d(com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a c27093xecae462a) {
        this.f59234x34bd04d8.add(c27093xecae462a);
        this.f59235xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110539x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a) && n51.f.a(this.f59234x34bd04d8, ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a) fVar).f59234x34bd04d8);
    }

    /* renamed from: getCmdlist */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a> m110540x728a40a2() {
        return this.f59234x34bd04d8;
    }

    /* renamed from: hasCmdlist */
    public boolean m110541xade0c8de() {
        return m110542x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m110542x6e095e9(int i17) {
        return this.f59235xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110543x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f59234x34bd04d8);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f59234x34bd04d8) + 0;
        }
        if (i17 == 2) {
            this.f59234x34bd04d8.clear();
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a c27093xecae462a = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a();
            if (bArr != null && bArr.length > 0) {
                c27093xecae462a.mo11468x92b714fd(bArr);
            }
            this.f59234x34bd04d8.add(c27093xecae462a);
        }
        this.f59235xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setCmdlist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110545xe5fb8e16(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27093xecae462a> linkedList) {
        this.f59234x34bd04d8 = linkedList;
        this.f59235xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a m110544x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27114xc8ed3e1a) super.mo11468x92b714fd(bArr);
    }
}
