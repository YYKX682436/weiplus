package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkServerIplist */
/* loaded from: classes2.dex */
public class C27111x2d675acb extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb f59214xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb();

    /* renamed from: svr_iplist */
    private java.util.LinkedList<java.lang.String> f59216xb1c8c615 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f59215xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110469xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110470x7c90cfc0() {
        return f59214xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110471x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb();
    }

    /* renamed from: addAllElementSvrIplist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110472xa6594758(java.util.Collection<java.lang.String> collection) {
        this.f59216xb1c8c615.addAll(collection);
        this.f59215xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementSvrIplist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110473x522424b9(java.lang.String str) {
        this.f59216xb1c8c615.add(str);
        this.f59215xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110474x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb) && n51.f.a(this.f59216xb1c8c615, ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb) fVar).f59216xb1c8c615);
    }

    /* renamed from: getSvrIplist */
    public java.util.LinkedList<java.lang.String> m110475x8d6b1ede() {
        return this.f59216xb1c8c615;
    }

    /* renamed from: hasFieldNumber */
    public boolean m110476x6e095e9(int i17) {
        return this.f59215xcb94b041[i17];
    }

    /* renamed from: hasSvrIplist */
    public boolean m110477x4d40881a() {
        return m110476x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110478x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 1, this.f59216xb1c8c615);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, this.f59216xb1c8c615) + 0;
        }
        if (i17 == 2) {
            this.f59216xb1c8c615.clear();
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
        this.f59216xb1c8c615.add(aVar2.k(intValue));
        this.f59215xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setSvrIplist */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110480xe9bedf52(java.util.LinkedList<java.lang.String> linkedList) {
        this.f59216xb1c8c615 = linkedList;
        this.f59215xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb m110479x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27111x2d675acb) super.mo11468x92b714fd(bArr);
    }
}
