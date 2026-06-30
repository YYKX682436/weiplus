package bw5;

/* loaded from: classes2.dex */
public class tq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33575d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33577f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.yr f33578g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f33576e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33579h = new boolean[54];

    static {
        new bw5.tq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.tq parseFrom(byte[] bArr) {
        return (bw5.tq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.tq)) {
            return false;
        }
        bw5.tq tqVar = (bw5.tq) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33575d), java.lang.Integer.valueOf(tqVar.f33575d)) && n51.f.a(this.f33576e, tqVar.f33576e) && n51.f.a(this.f33577f, tqVar.f33577f) && n51.f.a(this.f33578g, tqVar.f33578g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.tq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33576e;
        boolean[] zArr = this.f33579h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33575d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f33577f;
            if (str != null && zArr[51]) {
                fVar.j(51, str);
            }
            bw5.yr yrVar = this.f33578g;
            if (yrVar != null && zArr[53]) {
                fVar.i(53, yrVar.computeSize());
                this.f33578g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f33575d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f33577f;
            if (str2 != null && zArr[51]) {
                e17 += b36.f.j(51, str2);
            }
            bw5.yr yrVar2 = this.f33578g;
            return (yrVar2 == null || !zArr[53]) ? e17 : e17 + b36.f.i(53, yrVar2.computeSize());
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
            this.f33575d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sq sqVar = new bw5.sq();
                if (bArr != null && bArr.length > 0) {
                    sqVar.parseFrom(bArr);
                }
                linkedList.add(sqVar);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 51) {
            this.f33577f = aVar2.k(intValue);
            zArr[51] = true;
            return 0;
        }
        if (intValue != 53) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.yr yrVar3 = new bw5.yr();
            if (bArr2 != null && bArr2.length > 0) {
                yrVar3.parseFrom(bArr2);
            }
            this.f33578g = yrVar3;
        }
        zArr[53] = true;
        return 0;
    }
}
