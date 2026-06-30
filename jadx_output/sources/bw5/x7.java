package bw5;

/* loaded from: classes9.dex */
public class x7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f34973d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.u7 f34974e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.q7 f34975f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o7 f34976g;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v7 f34978i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34980n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f34981o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.s7 f34982p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.m7 f34983q;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f34977h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f34979m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f34984r = new boolean[12];

    static {
        new bw5.x7();
    }

    public bw5.m7 b() {
        return this.f34984r[11] ? this.f34983q : new bw5.m7();
    }

    public bw5.o7 c() {
        return this.f34984r[4] ? this.f34976g : new bw5.o7();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.x7)) {
            return false;
        }
        bw5.x7 x7Var = (bw5.x7) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f34973d), java.lang.Integer.valueOf(x7Var.f34973d)) && n51.f.a(this.f34974e, x7Var.f34974e) && n51.f.a(this.f34975f, x7Var.f34975f) && n51.f.a(this.f34976g, x7Var.f34976g) && n51.f.a(this.f34977h, x7Var.f34977h) && n51.f.a(this.f34978i, x7Var.f34978i) && n51.f.a(this.f34979m, x7Var.f34979m) && n51.f.a(this.f34980n, x7Var.f34980n) && n51.f.a(java.lang.Boolean.valueOf(this.f34981o), java.lang.Boolean.valueOf(x7Var.f34981o)) && n51.f.a(this.f34982p, x7Var.f34982p) && n51.f.a(this.f34983q, x7Var.f34983q);
    }

    public bw5.q7 d() {
        return this.f34984r[3] ? this.f34975f : new bw5.q7();
    }

    public bw5.s7 e() {
        return this.f34984r[10] ? this.f34982p : new bw5.s7();
    }

    public bw5.u7 f() {
        return this.f34984r[2] ? this.f34974e : new bw5.u7();
    }

    public bw5.v7 g() {
        return this.f34984r[6] ? this.f34978i : new bw5.v7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public bw5.x7 parseFrom(byte[] bArr) {
        return (bw5.x7) super.parseFrom(bArr);
    }

    public bw5.x7 j(java.util.LinkedList linkedList) {
        this.f34977h = linkedList;
        this.f34984r[5] = true;
        return this;
    }

    public bw5.x7 k(bw5.u7 u7Var) {
        this.f34974e = u7Var;
        this.f34984r[2] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.x7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34984r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f34973d);
            }
            bw5.u7 u7Var = this.f34974e;
            if (u7Var != null && zArr[2]) {
                fVar.i(2, u7Var.computeSize());
                this.f34974e.writeFields(fVar);
            }
            bw5.q7 q7Var = this.f34975f;
            if (q7Var != null && zArr[3]) {
                fVar.i(3, q7Var.computeSize());
                this.f34975f.writeFields(fVar);
            }
            bw5.o7 o7Var = this.f34976g;
            if (o7Var != null && zArr[4]) {
                fVar.i(4, o7Var.computeSize());
                this.f34976g.writeFields(fVar);
            }
            fVar.g(5, 1, this.f34977h);
            bw5.v7 v7Var = this.f34978i;
            if (v7Var != null && zArr[6]) {
                fVar.i(6, v7Var.computeSize());
                this.f34978i.writeFields(fVar);
            }
            fVar.g(7, 8, this.f34979m);
            java.lang.String str = this.f34980n;
            if (str != null && zArr[8]) {
                fVar.j(8, str);
            }
            if (zArr[9]) {
                fVar.a(9, this.f34981o);
            }
            bw5.s7 s7Var = this.f34982p;
            if (s7Var != null && zArr[10]) {
                fVar.i(10, s7Var.computeSize());
                this.f34982p.writeFields(fVar);
            }
            bw5.m7 m7Var = this.f34983q;
            if (m7Var != null && zArr[11]) {
                fVar.i(11, m7Var.computeSize());
                this.f34983q.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f34973d) : 0;
            bw5.u7 u7Var2 = this.f34974e;
            if (u7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, u7Var2.computeSize());
            }
            bw5.q7 q7Var2 = this.f34975f;
            if (q7Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, q7Var2.computeSize());
            }
            bw5.o7 o7Var2 = this.f34976g;
            if (o7Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, o7Var2.computeSize());
            }
            int g17 = e17 + b36.f.g(5, 1, this.f34977h);
            bw5.v7 v7Var2 = this.f34978i;
            if (v7Var2 != null && zArr[6]) {
                g17 += b36.f.i(6, v7Var2.computeSize());
            }
            int g18 = g17 + b36.f.g(7, 8, this.f34979m);
            java.lang.String str2 = this.f34980n;
            if (str2 != null && zArr[8]) {
                g18 += b36.f.j(8, str2);
            }
            if (zArr[9]) {
                g18 += b36.f.a(9, this.f34981o);
            }
            bw5.s7 s7Var2 = this.f34982p;
            if (s7Var2 != null && zArr[10]) {
                g18 += b36.f.i(10, s7Var2.computeSize());
            }
            bw5.m7 m7Var2 = this.f34983q;
            return (m7Var2 == null || !zArr[11]) ? g18 : g18 + b36.f.i(11, m7Var2.computeSize());
        }
        if (i17 == 2) {
            this.f34977h.clear();
            this.f34979m.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
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
                this.f34973d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.u7 u7Var3 = new bw5.u7();
                    if (bArr != null && bArr.length > 0) {
                        u7Var3.parseFrom(bArr);
                    }
                    this.f34974e = u7Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.q7 q7Var3 = new bw5.q7();
                    if (bArr2 != null && bArr2.length > 0) {
                        q7Var3.parseFrom(bArr2);
                    }
                    this.f34975f = q7Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.o7 o7Var3 = new bw5.o7();
                    if (bArr3 != null && bArr3.length > 0) {
                        o7Var3.parseFrom(bArr3);
                    }
                    this.f34976g = o7Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f34977h.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.v7 v7Var3 = new bw5.v7();
                    if (bArr4 != null && bArr4.length > 0) {
                        v7Var3.parseFrom(bArr4);
                    }
                    this.f34978i = v7Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.w7 w7Var = new bw5.w7();
                    if (bArr5 != null && bArr5.length > 0) {
                        w7Var.parseFrom(bArr5);
                    }
                    this.f34979m.add(w7Var);
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f34980n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34981o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.s7 s7Var3 = new bw5.s7();
                    if (bArr6 != null && bArr6.length > 0) {
                        s7Var3.parseFrom(bArr6);
                    }
                    this.f34982p = s7Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.m7 m7Var3 = new bw5.m7();
                    if (bArr7 != null && bArr7.length > 0) {
                        m7Var3.parseFrom(bArr7);
                    }
                    this.f34983q = m7Var3;
                }
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
