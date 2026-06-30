package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.Base */
/* loaded from: classes8.dex */
public class C4454x1f7af1 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 f18398xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();

    /* renamed from: bizdata */
    private com.p314xaae8f345.mm.p2495xc50a8b8b.g f18399xfa35ab3d;

    /* renamed from: chat */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 f18400x2e9358;

    /* renamed from: cipher */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 f18401xaeebe60b;

    /* renamed from: ctag */
    private java.lang.String f18402x2ec057;

    /* renamed from: debug */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 f18404x5b09653;

    /* renamed from: flowtag */
    private java.lang.String f18405xd25b07ac;

    /* renamed from: group */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f f18406x5e0f67f;

    /* renamed from: history */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 f18408x373fe494;

    /* renamed from: start_time */
    private long f18409xa23bb48a;

    /* renamed from: task_control */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 f18410x6205eca3;

    /* renamed from: customkv */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> f18403x2421809c = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18407xcb94b041 = new boolean[12];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38058xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38059x7c90cfc0() {
        return f18398xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38060x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
    }

    /* renamed from: addAllElementCustomkv */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38061xa0c99e58(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> collection) {
        this.f18403x2421809c.addAll(collection);
        this.f18407xcb94b041[2] = true;
        return this;
    }

    /* renamed from: addElementCustomkv */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38062x96d10d7(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72 c4505x21318a72) {
        this.f18403x2421809c.add(c4505x21318a72);
        this.f18407xcb94b041[2] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38063x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 c4454x1f7af1 = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1) fVar;
        return n51.f.a(this.f18404x5b09653, c4454x1f7af1.f18404x5b09653) && n51.f.a(this.f18403x2421809c, c4454x1f7af1.f18403x2421809c) && n51.f.a(this.f18402x2ec057, c4454x1f7af1.f18402x2ec057) && n51.f.a(this.f18405xd25b07ac, c4454x1f7af1.f18405xd25b07ac) && n51.f.a(this.f18408x373fe494, c4454x1f7af1.f18408x373fe494) && n51.f.a(this.f18406x5e0f67f, c4454x1f7af1.f18406x5e0f67f) && n51.f.a(this.f18399xfa35ab3d, c4454x1f7af1.f18399xfa35ab3d) && n51.f.a(this.f18410x6205eca3, c4454x1f7af1.f18410x6205eca3) && n51.f.a(this.f18401xaeebe60b, c4454x1f7af1.f18401xaeebe60b) && n51.f.a(this.f18400x2e9358, c4454x1f7af1.f18400x2e9358) && n51.f.a(java.lang.Long.valueOf(this.f18409xa23bb48a), java.lang.Long.valueOf(c4454x1f7af1.f18409xa23bb48a));
    }

    /* renamed from: getBizdata */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m38064x3802e707() {
        return this.f18407xcb94b041[7] ? this.f18399xfa35ab3d : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    }

    /* renamed from: getChat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 m38065xfb7dfbce() {
        return this.f18407xcb94b041[10] ? this.f18400x2e9358 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66.m38461xaf65a0fc();
    }

    /* renamed from: getCipher */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 m38066x14030901() {
        return this.f18407xcb94b041[9] ? this.f18401xaeebe60b : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504.m38475xaf65a0fc();
    }

    /* renamed from: getCtag */
    public java.lang.String m38067xfb7e28cd() {
        return this.f18407xcb94b041[3] ? this.f18402x2ec057 : "";
    }

    /* renamed from: getCustomkv */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> m38068x9ffbbe12() {
        return this.f18403x2421809c;
    }

    /* renamed from: getDebug */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 m38069x744e3c9d() {
        return this.f18407xcb94b041[1] ? this.f18404x5b09653 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633.m38591xaf65a0fc();
    }

    /* renamed from: getFlowtag */
    public java.lang.String m38070x10284376() {
        return this.f18407xcb94b041[4] ? this.f18405xd25b07ac : "";
    }

    /* renamed from: getGroup */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f m38071x747e9cc9() {
        return this.f18407xcb94b041[6] ? this.f18406x5e0f67f : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f.m39074xaf65a0fc();
    }

    /* renamed from: getHistory */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 m38072x750d205e() {
        return this.f18407xcb94b041[5] ? this.f18408x373fe494 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74.m39088xaf65a0fc();
    }

    /* renamed from: getStartTime */
    public long m38073x8082fb99() {
        return this.f18409xa23bb48a;
    }

    /* renamed from: getTaskControl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 m38074x8316bee2() {
        return this.f18407xcb94b041[8] ? this.f18410x6205eca3 : com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786.m39554xaf65a0fc();
    }

    /* renamed from: hasBizdata */
    public boolean m38075x73596f43() {
        return m38081x6e095e9(7);
    }

    /* renamed from: hasChat */
    public boolean m38076x2982bd12() {
        return m38081x6e095e9(10);
    }

    /* renamed from: hasCipher */
    public boolean m38077xd3dc8945() {
        return m38081x6e095e9(9);
    }

    /* renamed from: hasCtag */
    public boolean m38078x2982ea11() {
        return m38081x6e095e9(3);
    }

    /* renamed from: hasCustomkv */
    public boolean m38079xcf763d56() {
        return m38081x6e095e9(2);
    }

    /* renamed from: hasDebug */
    public boolean m38080x6e1a3d9() {
        return m38081x6e095e9(1);
    }

    /* renamed from: hasFieldNumber */
    public boolean m38081x6e095e9(int i17) {
        return this.f18407xcb94b041[i17];
    }

    /* renamed from: hasFlowtag */
    public boolean m38082x4b7ecbb2() {
        return m38081x6e095e9(4);
    }

    /* renamed from: hasGroup */
    public boolean m38083x7120405() {
        return m38081x6e095e9(6);
    }

    /* renamed from: hasHistory */
    public boolean m38084xb063a89a() {
        return m38081x6e095e9(5);
    }

    /* renamed from: hasStartTime */
    public boolean m38085x405864d5() {
        return m38081x6e095e9(11);
    }

    /* renamed from: hasTaskControl */
    public boolean m38086xa336c91e() {
        return m38081x6e095e9(8);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38087x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 c4478x3eda633 = this.f18404x5b09653;
            if (c4478x3eda633 != null && this.f18407xcb94b041[1]) {
                fVar.i(1, c4478x3eda633.mo75928xcd1e8d8());
                this.f18404x5b09653.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f18403x2421809c);
            java.lang.String str = this.f18402x2ec057;
            if (str != null && this.f18407xcb94b041[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f18405xd25b07ac;
            if (str2 != null && this.f18407xcb94b041[4]) {
                fVar.j(4, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 c4499x9a787c74 = this.f18408x373fe494;
            if (c4499x9a787c74 != null && this.f18407xcb94b041[5]) {
                fVar.i(5, c4499x9a787c74.mo75928xcd1e8d8());
                this.f18408x373fe494.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f c4498x41e065f = this.f18406x5e0f67f;
            if (c4498x41e065f != null && this.f18407xcb94b041[6]) {
                fVar.i(6, c4498x41e065f.mo75928xcd1e8d8());
                this.f18406x5e0f67f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f18399xfa35ab3d;
            if (gVar != null && this.f18407xcb94b041[7]) {
                fVar.b(7, gVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 c4527x3f679786 = this.f18410x6205eca3;
            if (c4527x3f679786 != null && this.f18407xcb94b041[8]) {
                fVar.i(8, c4527x3f679786.mo75928xcd1e8d8());
                this.f18410x6205eca3.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x53414504 = this.f18401xaeebe60b;
            if (c4472x53414504 != null && this.f18407xcb94b041[9]) {
                fVar.i(9, c4472x53414504.mo75928xcd1e8d8());
                this.f18401xaeebe60b.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 c4471x5995de66 = this.f18400x2e9358;
            if (c4471x5995de66 != null && this.f18407xcb94b041[10]) {
                fVar.i(10, c4471x5995de66.mo75928xcd1e8d8());
                this.f18400x2e9358.mo75956x3d5d1f78(fVar);
            }
            if (this.f18407xcb94b041[11]) {
                fVar.h(11, this.f18409xa23bb48a);
            }
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 c4478x3eda6332 = this.f18404x5b09653;
            if (c4478x3eda6332 != null && this.f18407xcb94b041[1]) {
                i18 = 0 + b36.f.i(1, c4478x3eda6332.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(2, 8, this.f18403x2421809c);
            java.lang.String str3 = this.f18402x2ec057;
            if (str3 != null && this.f18407xcb94b041[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f18405xd25b07ac;
            if (str4 != null && this.f18407xcb94b041[4]) {
                g17 += b36.f.j(4, str4);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 c4499x9a787c742 = this.f18408x373fe494;
            if (c4499x9a787c742 != null && this.f18407xcb94b041[5]) {
                g17 += b36.f.i(5, c4499x9a787c742.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f c4498x41e065f2 = this.f18406x5e0f67f;
            if (c4498x41e065f2 != null && this.f18407xcb94b041[6]) {
                g17 += b36.f.i(6, c4498x41e065f2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f18399xfa35ab3d;
            if (gVar2 != null && this.f18407xcb94b041[7]) {
                g17 += b36.f.b(7, gVar2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 c4527x3f6797862 = this.f18410x6205eca3;
            if (c4527x3f6797862 != null && this.f18407xcb94b041[8]) {
                g17 += b36.f.i(8, c4527x3f6797862.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x534145042 = this.f18401xaeebe60b;
            if (c4472x534145042 != null && this.f18407xcb94b041[9]) {
                g17 += b36.f.i(9, c4472x534145042.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 c4471x5995de662 = this.f18400x2e9358;
            if (c4471x5995de662 != null && this.f18407xcb94b041[10]) {
                g17 += b36.f.i(10, c4471x5995de662.mo75928xcd1e8d8());
            }
            return this.f18407xcb94b041[11] ? g17 + b36.f.h(11, this.f18409xa23bb48a) : g17;
        }
        if (i17 == 2) {
            this.f18403x2421809c.clear();
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 c4478x3eda6333 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633();
                    if (bArr != null && bArr.length > 0) {
                        c4478x3eda6333.mo11468x92b714fd(bArr);
                    }
                    this.f18404x5b09653 = c4478x3eda6333;
                }
                this.f18407xcb94b041[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72 c4505x21318a72 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72();
                    if (bArr2 != null && bArr2.length > 0) {
                        c4505x21318a72.mo11468x92b714fd(bArr2);
                    }
                    this.f18403x2421809c.add(c4505x21318a72);
                }
                this.f18407xcb94b041[2] = true;
                return 0;
            case 3:
                this.f18402x2ec057 = aVar2.k(intValue);
                this.f18407xcb94b041[3] = true;
                return 0;
            case 4:
                this.f18405xd25b07ac = aVar2.k(intValue);
                this.f18407xcb94b041[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 c4499x9a787c743 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74();
                    if (bArr3 != null && bArr3.length > 0) {
                        c4499x9a787c743.mo11468x92b714fd(bArr3);
                    }
                    this.f18408x373fe494 = c4499x9a787c743;
                }
                this.f18407xcb94b041[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f c4498x41e065f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f();
                    if (bArr4 != null && bArr4.length > 0) {
                        c4498x41e065f3.mo11468x92b714fd(bArr4);
                    }
                    this.f18406x5e0f67f = c4498x41e065f3;
                }
                this.f18407xcb94b041[6] = true;
                return 0;
            case 7:
                this.f18399xfa35ab3d = aVar2.d(intValue);
                this.f18407xcb94b041[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 c4527x3f6797863 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786();
                    if (bArr5 != null && bArr5.length > 0) {
                        c4527x3f6797863.mo11468x92b714fd(bArr5);
                    }
                    this.f18410x6205eca3 = c4527x3f6797863;
                }
                this.f18407xcb94b041[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x534145043 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504();
                    if (bArr6 != null && bArr6.length > 0) {
                        c4472x534145043.mo11468x92b714fd(bArr6);
                    }
                    this.f18401xaeebe60b = c4472x534145043;
                }
                this.f18407xcb94b041[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 c4471x5995de663 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66();
                    if (bArr7 != null && bArr7.length > 0) {
                        c4471x5995de663.mo11468x92b714fd(bArr7);
                    }
                    this.f18400x2e9358 = c4471x5995de663;
                }
                this.f18407xcb94b041[10] = true;
                return 0;
            case 11:
                this.f18409xa23bb48a = aVar2.i(intValue);
                this.f18407xcb94b041[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setBizdata */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38089xab74347b(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f18399xfa35ab3d = gVar;
        this.f18407xcb94b041[7] = true;
        return this;
    }

    /* renamed from: setChat */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38090x7648c2da(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4471x5995de66 c4471x5995de66) {
        this.f18400x2e9358 = c4471x5995de66;
        this.f18407xcb94b041[10] = true;
        return this;
    }

    /* renamed from: setCipher */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38091x7383d0d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4472x53414504 c4472x53414504) {
        this.f18401xaeebe60b = c4472x53414504;
        this.f18407xcb94b041[9] = true;
        return this;
    }

    /* renamed from: setCtag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38092x7648efd9(java.lang.String str) {
        this.f18402x2ec057 = str;
        this.f18407xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setCustomkv */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38093x9ab41f1e(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4505x21318a72> linkedList) {
        this.f18403x2421809c = linkedList;
        this.f18407xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setDebug */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38094x52dc5711(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4478x3eda633 c4478x3eda633) {
        this.f18404x5b09653 = c4478x3eda633;
        this.f18407xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setFlowtag */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38095x839990ea(java.lang.String str) {
        this.f18405xd25b07ac = str;
        this.f18407xcb94b041[4] = true;
        return this;
    }

    /* renamed from: setGroup */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38096x530cb73d(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4498x41e065f c4498x41e065f) {
        this.f18406x5e0f67f = c4498x41e065f;
        this.f18407xcb94b041[6] = true;
        return this;
    }

    /* renamed from: setHistory */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38097xe87e6dd2(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4499x9a787c74 c4499x9a787c74) {
        this.f18408x373fe494 = c4499x9a787c74;
        this.f18407xcb94b041[5] = true;
        return this;
    }

    /* renamed from: setStartTime */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38098xdcd6bc0d(long j17) {
        this.f18409xa23bb48a = j17;
        this.f18407xcb94b041[11] = true;
        return this;
    }

    /* renamed from: setTaskControl */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38099x197c3256(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4527x3f679786 c4527x3f679786) {
        this.f18410x6205eca3 = c4527x3f679786;
        this.f18407xcb94b041[8] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 m38088x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4454x1f7af1) super.mo11468x92b714fd(bArr);
    }
}
