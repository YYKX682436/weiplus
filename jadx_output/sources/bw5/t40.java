package bw5;

/* loaded from: classes2.dex */
public class t40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33242d;

    /* renamed from: f, reason: collision with root package name */
    public bw5.xa0 f33244f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f33243e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33245g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33246h = new boolean[5];

    static {
        new bw5.t40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t40 parseFrom(byte[] bArr) {
        return (bw5.t40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t40)) {
            return false;
        }
        bw5.t40 t40Var = (bw5.t40) fVar;
        return n51.f.a(this.f33242d, t40Var.f33242d) && n51.f.a(this.f33243e, t40Var.f33243e) && n51.f.a(this.f33244f, t40Var.f33244f) && n51.f.a(this.f33245g, t40Var.f33245g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33245g;
        java.util.LinkedList linkedList2 = this.f33243e;
        boolean[] zArr = this.f33246h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33242d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList2);
            bw5.xa0 xa0Var = this.f33244f;
            if (xa0Var != null && zArr[3]) {
                fVar.i(3, xa0Var.computeSize());
                this.f33244f.writeFields(fVar);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f33242d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList2);
            bw5.xa0 xa0Var2 = this.f33244f;
            if (xa0Var2 != null && zArr[3]) {
                g17 += b36.f.i(3, xa0Var2.computeSize());
            }
            return g17 + b36.f.g(4, 8, linkedList);
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
        if (intValue == 1) {
            this.f33242d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.v70 v70Var = new bw5.v70();
                if (bArr != null && bArr.length > 0) {
                    v70Var.parseFrom(bArr);
                }
                linkedList2.add(v70Var);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.xa0 xa0Var3 = new bw5.xa0();
                if (bArr2 != null && bArr2.length > 0) {
                    xa0Var3.parseFrom(bArr2);
                }
                this.f33244f = xa0Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.x40 x40Var = new bw5.x40();
            if (bArr3 != null && bArr3.length > 0) {
                x40Var.parseFrom(bArr3);
            }
            linkedList.add(x40Var);
        }
        zArr[4] = true;
        return 0;
    }
}
