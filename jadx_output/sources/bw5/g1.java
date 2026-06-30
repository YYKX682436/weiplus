package bw5;

/* loaded from: classes9.dex */
public class g1 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f27603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f27604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27605f;

    /* renamed from: i, reason: collision with root package name */
    public bw5.b1 f27608i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.b1 f27609m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.b1 f27610n;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f27606g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f27607h = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f27611o = new boolean[9];

    static {
        new bw5.g1();
    }

    public bw5.b1 b() {
        return this.f27611o[6] ? this.f27608i : new bw5.b1();
    }

    public bw5.b1 c() {
        return this.f27611o[8] ? this.f27610n : new bw5.b1();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g1)) {
            return false;
        }
        bw5.g1 g1Var = (bw5.g1) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f27603d), java.lang.Long.valueOf(g1Var.f27603d)) && n51.f.a(this.f27604e, g1Var.f27604e) && n51.f.a(this.f27605f, g1Var.f27605f) && n51.f.a(this.f27606g, g1Var.f27606g) && n51.f.a(this.f27607h, g1Var.f27607h) && n51.f.a(this.f27608i, g1Var.f27608i) && n51.f.a(this.f27609m, g1Var.f27609m) && n51.f.a(this.f27610n, g1Var.f27610n);
    }

    public bw5.b1 d() {
        return this.f27611o[7] ? this.f27609m : new bw5.b1();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.g1 parseFrom(byte[] bArr) {
        return (bw5.g1) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g1();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27607h;
        java.util.LinkedList linkedList2 = this.f27606g;
        boolean[] zArr = this.f27611o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f27603d);
            }
            java.lang.String str = this.f27604e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f27605f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            fVar.g(4, 8, linkedList2);
            fVar.g(5, 8, linkedList);
            bw5.b1 b1Var = this.f27608i;
            if (b1Var != null && zArr[6]) {
                fVar.i(6, b1Var.computeSize());
                this.f27608i.writeFields(fVar);
            }
            bw5.b1 b1Var2 = this.f27609m;
            if (b1Var2 != null && zArr[7]) {
                fVar.i(7, b1Var2.computeSize());
                this.f27609m.writeFields(fVar);
            }
            bw5.b1 b1Var3 = this.f27610n;
            if (b1Var3 != null && zArr[8]) {
                fVar.i(8, b1Var3.computeSize());
                this.f27610n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f27603d) : 0;
            java.lang.String str3 = this.f27604e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f27605f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            int g17 = h17 + b36.f.g(4, 8, linkedList2) + b36.f.g(5, 8, linkedList);
            bw5.b1 b1Var4 = this.f27608i;
            if (b1Var4 != null && zArr[6]) {
                g17 += b36.f.i(6, b1Var4.computeSize());
            }
            bw5.b1 b1Var5 = this.f27609m;
            if (b1Var5 != null && zArr[7]) {
                g17 += b36.f.i(7, b1Var5.computeSize());
            }
            bw5.b1 b1Var6 = this.f27610n;
            return (b1Var6 == null || !zArr[8]) ? g17 : g17 + b36.f.i(8, b1Var6.computeSize());
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
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
                this.f27603d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f27604e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f27605f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.c1 c1Var = new bw5.c1();
                    if (bArr != null && bArr.length > 0) {
                        c1Var.parseFrom(bArr);
                    }
                    linkedList2.add(c1Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.d1 d1Var = new bw5.d1();
                    if (bArr2 != null && bArr2.length > 0) {
                        d1Var.parseFrom(bArr2);
                    }
                    linkedList.add(d1Var);
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.b1 b1Var7 = new bw5.b1();
                    if (bArr3 != null && bArr3.length > 0) {
                        b1Var7.parseFrom(bArr3);
                    }
                    this.f27608i = b1Var7;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.b1 b1Var8 = new bw5.b1();
                    if (bArr4 != null && bArr4.length > 0) {
                        b1Var8.parseFrom(bArr4);
                    }
                    this.f27609m = b1Var8;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.b1 b1Var9 = new bw5.b1();
                    if (bArr5 != null && bArr5.length > 0) {
                        b1Var9.parseFrom(bArr5);
                    }
                    this.f27610n = b1Var9;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
