package bw5;

/* loaded from: classes2.dex */
public class sm extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public bw5.y30 f33046e;

    /* renamed from: f, reason: collision with root package name */
    public int f33047f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33048g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f33045d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33049h = new boolean[5];

    static {
        new bw5.sm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sm parseFrom(byte[] bArr) {
        return (bw5.sm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sm)) {
            return false;
        }
        bw5.sm smVar = (bw5.sm) fVar;
        return n51.f.a(this.f33045d, smVar.f33045d) && n51.f.a(this.f33046e, smVar.f33046e) && n51.f.a(java.lang.Integer.valueOf(this.f33047f), java.lang.Integer.valueOf(smVar.f33047f)) && n51.f.a(this.f33048g, smVar.f33048g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33045d;
        boolean[] zArr = this.f33049h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            bw5.y30 y30Var = this.f33046e;
            if (y30Var != null && zArr[2]) {
                fVar.i(2, y30Var.computeSize());
                this.f33046e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f33047f);
            }
            java.lang.String str = this.f33048g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            bw5.y30 y30Var2 = this.f33046e;
            if (y30Var2 != null && zArr[2]) {
                g17 += b36.f.i(2, y30Var2.computeSize());
            }
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f33047f);
            }
            java.lang.String str2 = this.f33048g;
            return (str2 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str2);
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
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ml mlVar = new bw5.ml();
                if (bArr != null && bArr.length > 0) {
                    mlVar.parseFrom(bArr);
                }
                linkedList.add(mlVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f33047f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f33048g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.y30 y30Var3 = new bw5.y30();
            if (bArr2 != null && bArr2.length > 0) {
                y30Var3.parseFrom(bArr2);
            }
            this.f33046e = y30Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
