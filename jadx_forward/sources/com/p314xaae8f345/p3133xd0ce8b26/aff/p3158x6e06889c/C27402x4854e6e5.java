package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderCommonReddotSyncResponse */
/* loaded from: classes8.dex */
public class C27402x4854e6e5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 f59864xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5();

    /* renamed from: BaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 f59865x92037252 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252.m113894x7c90cfc0();

    /* renamed from: ContinueFlag */
    public int f59867xdcd948d3 = 0;

    /* renamed from: KeyBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 f59868x85c2c3b4 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();

    /* renamed from: CmdList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> f59866x97e710d8 = new java.util.LinkedList<>();

    /* renamed from: entrance_expose_switch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e f59869x741a0246 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e.m114028x7c90cfc0();

    /* renamed from: last_buffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59870x5c610a09 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114504xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114505x7c90cfc0() {
        return f59864xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114506x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5();
    }

    /* renamed from: addAllElementCmdList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114507x1fedb3bc(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> collection) {
        this.f59866x97e710d8.addAll(collection);
        return this;
    }

    /* renamed from: addElementCmdList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114508x75e2755d(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47) {
        this.f59866x97e710d8.add(c27398x1fd13c47);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114509x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 c27402x4854e6e5 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5) fVar;
        return n51.f.a(this.f59865x92037252, c27402x4854e6e5.f59865x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f59867xdcd948d3), java.lang.Integer.valueOf(c27402x4854e6e5.f59867xdcd948d3)) && n51.f.a(this.f59868x85c2c3b4, c27402x4854e6e5.f59868x85c2c3b4) && n51.f.a(this.f59866x97e710d8, c27402x4854e6e5.f59866x97e710d8) && n51.f.a(this.f59869x741a0246, c27402x4854e6e5.f59869x741a0246) && n51.f.a(this.f59870x5c610a09, c27402x4854e6e5.f59870x5c610a09);
    }

    /* renamed from: getBaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 m114510xe92ab0a8() {
        return this.f59865x92037252;
    }

    /* renamed from: getCmdList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> m114511x727bb4c2() {
        return this.f59866x97e710d8;
    }

    /* renamed from: getContinueFlag */
    public int m114512x34008729() {
        return this.f59867xdcd948d3;
    }

    /* renamed from: getEntranceExposeSwitch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e m114513x19de0e64() {
        return this.f59869x741a0246;
    }

    /* renamed from: getEntrance_expose_switch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e m114514xdde8793c() {
        return this.f59869x741a0246;
    }

    /* renamed from: getKeyBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 m114515x2174fa8a() {
        return this.f59868x85c2c3b4;
    }

    /* renamed from: getLastBuffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114516x44e5026c() {
        return this.f59870x5c610a09;
    }

    /* renamed from: getLast_buffer */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m114517x363750d3() {
        return this.f59870x5c610a09;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114518x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 c27384x92037252 = this.f59865x92037252;
            if (c27384x92037252 != null) {
                fVar.i(1, c27384x92037252.mo75928xcd1e8d8());
                this.f59865x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f59867xdcd948d3);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 c27455xbcb70000 = this.f59868x85c2c3b4;
            if (c27455xbcb70000 != null) {
                fVar.i(4, c27455xbcb70000.mo75928xcd1e8d8());
                this.f59868x85c2c3b4.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f59866x97e710d8);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e = this.f59869x741a0246;
            if (c27390x807ff37e != null) {
                fVar.i(6, c27390x807ff37e.mo75928xcd1e8d8());
                this.f59869x741a0246.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59870x5c610a09;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 c27384x920372522 = this.f59865x92037252;
            int i18 = (c27384x920372522 != null ? 0 + b36.f.i(1, c27384x920372522.mo75928xcd1e8d8()) : 0) + b36.f.e(3, this.f59867xdcd948d3);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 c27455xbcb700002 = this.f59868x85c2c3b4;
            if (c27455xbcb700002 != null) {
                i18 += b36.f.i(4, c27455xbcb700002.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(5, 8, this.f59866x97e710d8);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e2 = this.f59869x741a0246;
            if (c27390x807ff37e2 != null) {
                g17 += b36.f.i(6, c27390x807ff37e2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59870x5c610a09;
            return gVar2 != null ? g17 + b36.f.b(7, gVar2) : g17;
        }
        if (i17 == 2) {
            this.f59866x97e710d8.clear();
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
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 c27384x920372523 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252();
                if (bArr != null && bArr.length > 0) {
                    c27384x920372523.mo11468x92b714fd(bArr);
                }
                this.f59865x92037252 = c27384x920372523;
            }
            return 0;
        }
        if (intValue == 3) {
            this.f59867xdcd948d3 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 c27455xbcb700003 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000();
                if (bArr2 != null && bArr2.length > 0) {
                    c27455xbcb700003.mo11468x92b714fd(bArr2);
                }
                this.f59868x85c2c3b4 = c27455xbcb700003;
            }
            return 0;
        }
        if (intValue == 5) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47 c27398x1fd13c47 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47();
                if (bArr3 != null && bArr3.length > 0) {
                    c27398x1fd13c47.mo11468x92b714fd(bArr3);
                }
                this.f59866x97e710d8.add(c27398x1fd13c47);
            }
            return 0;
        }
        if (intValue != 6) {
            if (intValue != 7) {
                return -1;
            }
            this.f59870x5c610a09 = aVar2.d(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e();
            if (bArr4 != null && bArr4.length > 0) {
                c27390x807ff37e3.mo11468x92b714fd(bArr4);
            }
            this.f59869x741a0246 = c27390x807ff37e3;
        }
        return 0;
    }

    /* renamed from: setBaseResponse */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114520x1f73abb4(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27384x92037252 c27384x92037252) {
        this.f59865x92037252 = c27384x92037252;
        return this;
    }

    /* renamed from: setCmdList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114521xe5ed0236(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27398x1fd13c47> linkedList) {
        this.f59866x97e710d8 = linkedList;
        return this;
    }

    /* renamed from: setContinueFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114522x6a498235(int i17) {
        this.f59867xdcd948d3 = i17;
        return this;
    }

    /* renamed from: setEntranceExposeSwitch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114523x94313d70(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e) {
        this.f59869x741a0246 = c27390x807ff37e;
        return this;
    }

    /* renamed from: setEntrance_expose_switch */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114524x102c1548(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27390x807ff37e c27390x807ff37e) {
        this.f59869x741a0246 = c27390x807ff37e;
        return this;
    }

    /* renamed from: setKeyBuf */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114525x14aa2e96(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27455xbcb70000 c27455xbcb70000) {
        this.f59868x85c2c3b4 = c27455xbcb70000;
        return this;
    }

    /* renamed from: setLastBuffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114526x73095078(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59870x5c610a09 = gVar;
        return this;
    }

    /* renamed from: setLast_buffer */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114527xcc9cc447(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59870x5c610a09 = gVar;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 m114519x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27402x4854e6e5) super.mo11468x92b714fd(bArr);
    }
}
