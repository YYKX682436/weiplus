package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkSyncCmdList */
/* loaded from: classes4.dex */
public class C3070xc8ed3e1a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a f11157xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a();

    /* renamed from: cmdlist */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a> f11158x34bd04d8 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f11159xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24570xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24571x7c90cfc0() {
        return f11157xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24572x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a();
    }

    /* renamed from: addAllElementCmdlist */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24573x1ffc3f9c(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a> collection) {
        this.f11158x34bd04d8.addAll(collection);
        this.f11159xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementCmdlist */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24574x75f1013d(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a c3047xecae462a) {
        this.f11158x34bd04d8.add(c3047xecae462a);
        this.f11159xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24575x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a) && n51.f.a(this.f11158x34bd04d8, ((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a) fVar).f11158x34bd04d8);
    }

    /* renamed from: getCmdlist */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a> m24576x728a40a2() {
        return this.f11158x34bd04d8;
    }

    /* renamed from: hasCmdlist */
    public boolean m24577xade0c8de() {
        return m24578x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m24578x6e095e9(int i17) {
        return this.f11159xcb94b041[i17];
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24579x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f11158x34bd04d8);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f11158x34bd04d8) + 0;
        }
        if (i17 == 2) {
            this.f11158x34bd04d8.clear();
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
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a c3047xecae462a = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a();
            if (bArr != null && bArr.length > 0) {
                c3047xecae462a.mo11468x92b714fd(bArr);
            }
            this.f11158x34bd04d8.add(c3047xecae462a);
        }
        this.f11159xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setCmdlist */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24581xe5fb8e16(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3047xecae462a> linkedList) {
        this.f11158x34bd04d8 = linkedList;
        this.f11159xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a m24580x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3070xc8ed3e1a) super.mo11468x92b714fd(bArr);
    }
}
