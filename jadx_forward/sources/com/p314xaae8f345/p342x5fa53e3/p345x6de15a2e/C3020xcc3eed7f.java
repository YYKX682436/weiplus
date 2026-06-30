package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.H5TransferRouteInfo */
/* loaded from: classes8.dex */
public class C3020xcc3eed7f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f f10638xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f();

    /* renamed from: route_item_list */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4> f10640x571907d4 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10639xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23145xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23146x7c90cfc0() {
        return f10638xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23147x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f();
    }

    /* renamed from: addAllElementRouteItemList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23148xfce3b37e(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4> collection) {
        this.f10640x571907d4.addAll(collection);
        this.f10639xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementRouteItemList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23149xe34ef85f(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 c3021xcc3f03e4) {
        this.f10640x571907d4.add(c3021xcc3f03e4);
        this.f10639xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23150x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f) && n51.f.a(this.f10640x571907d4, ((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f) fVar).f10640x571907d4);
    }

    /* renamed from: getRouteItemList */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4> m23151xd0925804() {
        return this.f10640x571907d4;
    }

    /* renamed from: hasFieldNumber */
    public boolean m23152x6e095e9(int i17) {
        return this.f10639xcb94b041[i17];
    }

    /* renamed from: hasRouteItemList */
    public boolean m23153x68d8c340() {
        return m23152x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23154x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f10640x571907d4);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f10640x571907d4) + 0;
        }
        if (i17 == 2) {
            this.f10640x571907d4.clear();
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
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4 c3021xcc3f03e4 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4();
            if (bArr != null && bArr.length > 0) {
                c3021xcc3f03e4.mo11468x92b714fd(bArr);
            }
            this.f10640x571907d4.add(c3021xcc3f03e4);
        }
        this.f10639xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setRouteItemList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23156x6368be78(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3021xcc3f03e4> linkedList) {
        this.f10640x571907d4 = linkedList;
        this.f10639xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f m23155x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3020xcc3eed7f) super.mo11468x92b714fd(bArr);
    }
}
