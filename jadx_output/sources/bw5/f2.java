package bw5;

/* loaded from: classes2.dex */
public class f2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27115d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.b70 f27117f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o60 f27118g;

    /* renamed from: h, reason: collision with root package name */
    public int f27119h;

    /* renamed from: i, reason: collision with root package name */
    public int f27120i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f27116e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f27121m = new boolean[7];

    static {
        new bw5.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.f2)) {
            return false;
        }
        bw5.f2 f2Var = (bw5.f2) fVar;
        return n51.f.a(this.f27115d, f2Var.f27115d) && n51.f.a(this.f27116e, f2Var.f27116e) && n51.f.a(this.f27117f, f2Var.f27117f) && n51.f.a(this.f27118g, f2Var.f27118g) && n51.f.a(java.lang.Integer.valueOf(this.f27119h), java.lang.Integer.valueOf(f2Var.f27119h)) && n51.f.a(java.lang.Integer.valueOf(this.f27120i), java.lang.Integer.valueOf(f2Var.f27120i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.f2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27116e;
        int i18 = 0;
        boolean[] zArr = this.f27121m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27115d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList);
            bw5.b70 b70Var = this.f27117f;
            if (b70Var != null && zArr[3]) {
                fVar.i(3, b70Var.computeSize());
                this.f27117f.writeFields(fVar);
            }
            bw5.o60 o60Var = this.f27118g;
            if (o60Var != null && zArr[4]) {
                fVar.i(4, o60Var.computeSize());
                this.f27118g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f27119h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f27120i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27115d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            bw5.b70 b70Var2 = this.f27117f;
            if (b70Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, b70Var2.computeSize());
            }
            bw5.o60 o60Var2 = this.f27118g;
            if (o60Var2 != null && zArr[4]) {
                g17 += b36.f.i(4, o60Var2.computeSize());
            }
            if (zArr[5]) {
                g17 += b36.f.e(5, this.f27119h);
            }
            return zArr[6] ? g17 + b36.f.e(6, this.f27120i) : g17;
        }
        if (i17 == 2) {
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
                this.f27115d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x40 x40Var = new bw5.x40();
                    if (bArr != null && bArr.length > 0) {
                        x40Var.parseFrom(bArr);
                    }
                    linkedList.add(x40Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.b70 b70Var3 = new bw5.b70();
                    if (bArr2 != null && bArr2.length > 0) {
                        b70Var3.parseFrom(bArr2);
                    }
                    this.f27117f = b70Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.o60 o60Var3 = new bw5.o60();
                    if (bArr3 != null && bArr3.length > 0) {
                        o60Var3.parseFrom(bArr3);
                    }
                    this.f27118g = o60Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f27119h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f27120i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.f2) super.parseFrom(bArr);
    }
}
