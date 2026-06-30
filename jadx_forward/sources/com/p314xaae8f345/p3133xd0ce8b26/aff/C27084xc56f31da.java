package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkC2CQuicTaskParams */
/* loaded from: classes8.dex */
public class C27084xc56f31da extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da f58989xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da();

    /* renamed from: host_map_hint */
    private com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 f58992xdf510441;

    /* renamed from: quic_host_map */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685> f58993x49ba6b26 = new java.util.LinkedList<>();

    /* renamed from: force_quic_host */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4> f58990x9f065eb5 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f58991xcb94b041 = new boolean[4];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109936xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109937x7c90cfc0() {
        return f58989xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109938x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da();
    }

    /* renamed from: addAllElementForceQuicHost */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109939x516528d5(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4> collection) {
        this.f58990x9f065eb5.addAll(collection);
        this.f58991xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addAllElementQuicHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109940x6f3ac33a(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685> collection) {
        this.f58993x49ba6b26.addAll(collection);
        this.f58991xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementForceQuicHost */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109941x37d06db6(com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 c27082xe3e36ee4) {
        this.f58990x9f065eb5.add(c27082xe3e36ee4);
        this.f58991xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementQuicHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109942x53c3cc5b(com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 c27083x3d199685) {
        this.f58993x49ba6b26.add(c27083x3d199685);
        this.f58991xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109943x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da c27084xc56f31da = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da) fVar;
        return n51.f.a(this.f58993x49ba6b26, c27084xc56f31da.f58993x49ba6b26) && n51.f.a(this.f58990x9f065eb5, c27084xc56f31da.f58990x9f065eb5) && n51.f.a(this.f58992xdf510441, c27084xc56f31da.f58992xdf510441);
    }

    /* renamed from: getForceQuicHost */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4> m109944x2513cd5b() {
        return this.f58990x9f065eb5;
    }

    /* renamed from: getHostMapHint */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 m109945x846fa605() {
        return this.f58991xcb94b041[3] ? this.f58992xdf510441 : com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07.m109875xaf65a0fc();
    }

    /* renamed from: getQuicHostMap */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685> m109946xd934d140() {
        return this.f58993x49ba6b26;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109947x6e095e9(int i17) {
        return this.f58991xcb94b041[i17];
    }

    /* renamed from: hasForceQuicHost */
    public boolean m109948xbd5a3897() {
        return m109947x6e095e9(2);
    }

    /* renamed from: hasHostMapHint */
    public boolean m109949xa48fb041() {
        return m109947x6e095e9(3);
    }

    /* renamed from: hasQuicHostMap */
    public boolean m109950xf954db7c() {
        return m109947x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109951x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.f58993x49ba6b26);
            fVar.g(2, 8, this.f58990x9f065eb5);
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 c27080xa4d33e07 = this.f58992xdf510441;
            if (c27080xa4d33e07 != null && this.f58991xcb94b041[3]) {
                fVar.i(3, c27080xa4d33e07.mo75928xcd1e8d8());
                this.f58992xdf510441.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.f58993x49ba6b26) + 0 + b36.f.g(2, 8, this.f58990x9f065eb5);
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 c27080xa4d33e072 = this.f58992xdf510441;
            return (c27080xa4d33e072 == null || !this.f58991xcb94b041[3]) ? g17 : g17 + b36.f.i(3, c27080xa4d33e072.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            this.f58993x49ba6b26.clear();
            this.f58990x9f065eb5.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685 c27083x3d199685 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685();
                if (bArr != null && bArr.length > 0) {
                    c27083x3d199685.mo11468x92b714fd(bArr);
                }
                this.f58993x49ba6b26.add(c27083x3d199685);
            }
            this.f58991xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4 c27082xe3e36ee4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4();
                if (bArr2 != null && bArr2.length > 0) {
                    c27082xe3e36ee4.mo11468x92b714fd(bArr2);
                }
                this.f58990x9f065eb5.add(c27082xe3e36ee4);
            }
            this.f58991xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 c27080xa4d33e073 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07();
            if (bArr3 != null && bArr3.length > 0) {
                c27080xa4d33e073.mo11468x92b714fd(bArr3);
            }
            this.f58992xdf510441 = c27080xa4d33e073;
        }
        this.f58991xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setForceQuicHost */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109953xb7ea33cf(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27082xe3e36ee4> linkedList) {
        this.f58990x9f065eb5 = linkedList;
        this.f58991xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setHostMapHint */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109954x1ad51979(com.p314xaae8f345.p3133xd0ce8b26.aff.C27080xa4d33e07 c27080xa4d33e07) {
        this.f58992xdf510441 = c27080xa4d33e07;
        this.f58991xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setQuicHostMap */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109955x6f9a44b4(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27083x3d199685> linkedList) {
        this.f58993x49ba6b26 = linkedList;
        this.f58991xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da m109952x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27084xc56f31da) super.mo11468x92b714fd(bArr);
    }
}
