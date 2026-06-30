package com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e;

/* renamed from: com.tencent.ilink.network.IlinkH5TransferResult */
/* loaded from: classes4.dex */
public class C3055x7ee3ff8 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 f11035xb3e828f3 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8();

    /* renamed from: resp_data */
    private java.lang.String f11038x8a452eb9;

    /* renamed from: header */
    private java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> f11037xb734e28d = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f11036xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24269xaf65a0fc() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24270x7c90cfc0() {
        return f11035xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24271x3136c9db() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8();
    }

    /* renamed from: addAllElementHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24272x95813f49(java.util.Collection<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> collection) {
        this.f11037xb734e28d.addAll(collection);
        this.f11036xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24273xb10d4588(com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55 c3023x9b062d55) {
        this.f11037xb734e28d.add(c3023x9b062d55);
        this.f11036xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24274x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8)) {
            return false;
        }
        com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 c3055x7ee3ff8 = (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8) fVar;
        return n51.f.a(this.f11038x8a452eb9, c3055x7ee3ff8.f11038x8a452eb9) && n51.f.a(this.f11037xb734e28d, c3055x7ee3ff8.f11037xb734e28d);
    }

    /* renamed from: getHeader */
    public java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> m24275x1c4c0583() {
        return this.f11037xb734e28d;
    }

    /* renamed from: getRespData */
    public java.lang.String m24276x677d9510() {
        return this.f11036xcb94b041[1] ? this.f11038x8a452eb9 : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m24277x6e095e9(int i17) {
        return this.f11036xcb94b041[i17];
    }

    /* renamed from: hasHeader */
    public boolean m24278xdc2585c7() {
        return m24277x6e095e9(2);
    }

    /* renamed from: hasRespData */
    public boolean m24279x96f81454() {
        return m24277x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24280x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f11038x8a452eb9;
            if (str != null && this.f11036xcb94b041[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f11037xb734e28d);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f11038x8a452eb9;
            if (str2 != null && this.f11036xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            return i18 + b36.f.g(2, 8, this.f11037xb734e28d);
        }
        if (i17 == 2) {
            this.f11037xb734e28d.clear();
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
            this.f11038x8a452eb9 = aVar2.k(intValue);
            this.f11036xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55 c3023x9b062d55 = new com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55();
            if (bArr != null && bArr.length > 0) {
                c3023x9b062d55.mo11468x92b714fd(bArr);
            }
            this.f11037xb734e28d.add(c3023x9b062d55);
        }
        this.f11036xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setHeader */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24282xf81398f(java.util.LinkedList<com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3023x9b062d55> linkedList) {
        this.f11037xb734e28d = linkedList;
        this.f11036xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setRespData */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24283x6235f61c(java.lang.String str) {
        this.f11038x8a452eb9 = str;
        this.f11036xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 m24281x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p342x5fa53e3.p345x6de15a2e.C3055x7ee3ff8) super.mo11468x92b714fd(bArr);
    }
}
