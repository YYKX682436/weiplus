package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkAppAuthClientInfo */
/* loaded from: classes4.dex */
public class C3026xbe47a9df extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df f10671xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df();

    /* renamed from: host_list */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96> f10673xd53bbcd5 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f10672xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23269xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23270x7c90cfc0() {
        return f10671xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23271x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df();
    }

    /* renamed from: addAllElementHostList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23272x6aba2422(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96> collection) {
        this.f10673xd53bbcd5.addAll(collection);
        this.f10672xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementHostList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23273xd35d96a1(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96 c3022xf1eb1e96) {
        this.f10673xd53bbcd5.add(c3022xf1eb1e96);
        this.f10672xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23274x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df) && n51.f.a(this.f10673xd53bbcd5, ((com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df) fVar).f10673xd53bbcd5);
    }

    /* renamed from: getHostList */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96> m23275x69ec43dc() {
        return this.f10673xd53bbcd5;
    }

    /* renamed from: hasFieldNumber */
    public boolean m23276x6e095e9(int i17) {
        return this.f10672xcb94b041[i17];
    }

    /* renamed from: hasHostList */
    public boolean m23277x9966c320() {
        return m23276x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23278x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f10673xd53bbcd5);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f10673xd53bbcd5) + 0;
        }
        if (i17 == 2) {
            this.f10673xd53bbcd5.clear();
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
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96 c3022xf1eb1e96 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96();
            if (bArr != null && bArr.length > 0) {
                c3022xf1eb1e96.mo11468x92b714fd(bArr);
            }
            this.f10673xd53bbcd5.add(c3022xf1eb1e96);
        }
        this.f10672xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setHostList */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23280x64a4a4e8(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3022xf1eb1e96> linkedList) {
        this.f10673xd53bbcd5 = linkedList;
        this.f10672xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df m23279x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3026xbe47a9df) super.mo11468x92b714fd(bArr);
    }
}
