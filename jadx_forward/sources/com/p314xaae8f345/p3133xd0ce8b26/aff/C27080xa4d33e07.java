package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CHostIPHint */
/* loaded from: classes8.dex */
public class C27080xa4d33e07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 f58974xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07();

    /* renamed from: host_map */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc> f58976xee1ab645 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f58975xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109875xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109876x7c90cfc0() {
        return f58974xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109877x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07();
    }

    /* renamed from: addAllElementHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109878x2cbbb158(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc> collection) {
        this.f58976xee1ab645.addAll(collection);
        this.f58975xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109879x82b072f9(com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc c27081x15e3e1bc) {
        this.f58976xee1ab645.add(c27081x15e3e1bc);
        this.f58975xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109880x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07) && n51.f.a(this.f58976xee1ab645, ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07) fVar).f58976xee1ab645);
    }

    /* renamed from: getHostMap */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc> m109881x7f49b25e() {
        return this.f58976xee1ab645;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109882x6e095e9(int i17) {
        return this.f58975xcb94b041[i17];
    }

    /* renamed from: hasHostMap */
    public boolean m109883xbaa03a9a() {
        return m109882x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109884x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f58976xee1ab645);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f58976xee1ab645) + 0;
        }
        if (i17 == 2) {
            this.f58976xee1ab645.clear();
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc c27081x15e3e1bc = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc();
            if (bArr != null && bArr.length > 0) {
                c27081x15e3e1bc.mo11468x92b714fd(bArr);
            }
            this.f58976xee1ab645.add(c27081x15e3e1bc);
        }
        this.f58975xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109886xf2baffd2(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27081x15e3e1bc> linkedList) {
        this.f58976xee1ab645 = linkedList;
        this.f58975xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109885x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07) super.mo11468x92b714fd(bArr);
    }
}
