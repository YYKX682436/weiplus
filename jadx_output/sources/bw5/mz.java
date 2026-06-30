package bw5;

/* loaded from: classes8.dex */
public class mz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30422d;

    /* renamed from: e, reason: collision with root package name */
    public long f30423e;

    /* renamed from: f, reason: collision with root package name */
    public long f30424f;

    /* renamed from: h, reason: collision with root package name */
    public int f30426h;

    /* renamed from: i, reason: collision with root package name */
    public int f30427i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30425g = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f30428m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final android.util.ArrayMap f30429n = new android.util.ArrayMap();

    static {
        new bw5.mz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mz parseFrom(byte[] bArr) {
        return (bw5.mz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mz)) {
            return false;
        }
        bw5.mz mzVar = (bw5.mz) fVar;
        return n51.f.a(this.f30422d, mzVar.f30422d) && n51.f.a(java.lang.Long.valueOf(this.f30423e), java.lang.Long.valueOf(mzVar.f30423e)) && n51.f.a(java.lang.Long.valueOf(this.f30424f), java.lang.Long.valueOf(mzVar.f30424f)) && n51.f.a(this.f30425g, mzVar.f30425g) && n51.f.a(java.lang.Integer.valueOf(this.f30426h), java.lang.Integer.valueOf(mzVar.f30426h)) && n51.f.a(java.lang.Integer.valueOf(this.f30427i), java.lang.Integer.valueOf(mzVar.f30427i)) && n51.f.a(this.f30428m, mzVar.f30428m);
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f30429n.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30428m;
        java.util.LinkedList linkedList2 = this.f30425g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.f30422d != null && hasFieldNumber(1)) {
                fVar.j(1, this.f30422d);
            }
            if (hasFieldNumber(2)) {
                fVar.h(2, this.f30423e);
            }
            if (hasFieldNumber(3)) {
                fVar.h(3, this.f30424f);
            }
            fVar.g(4, 8, linkedList2);
            if (hasFieldNumber(5)) {
                fVar.e(5, this.f30426h);
            }
            if (hasFieldNumber(6)) {
                fVar.e(6, this.f30427i);
            }
            fVar.g(100, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            if (this.f30422d != null && hasFieldNumber(1)) {
                i18 = 0 + b36.f.j(1, this.f30422d);
            }
            if (hasFieldNumber(2)) {
                i18 += b36.f.h(2, this.f30423e);
            }
            if (hasFieldNumber(3)) {
                i18 += b36.f.h(3, this.f30424f);
            }
            int g17 = i18 + b36.f.g(4, 8, linkedList2);
            if (hasFieldNumber(5)) {
                g17 += b36.f.e(5, this.f30426h);
            }
            if (hasFieldNumber(6)) {
                g17 += b36.f.e(6, this.f30427i);
            }
            return g17 + b36.f.g(100, 8, linkedList);
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
        android.util.ArrayMap arrayMap = this.f30429n;
        if (intValue == 100) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.oz ozVar = new bw5.oz();
                if (bArr != null && bArr.length > 0) {
                    ozVar.parseFrom(bArr);
                }
                linkedList.add(ozVar);
            }
            arrayMap.put(100, java.lang.Boolean.TRUE);
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f30422d = aVar2.k(intValue);
                arrayMap.put(1, java.lang.Boolean.TRUE);
                return 0;
            case 2:
                this.f30423e = aVar2.i(intValue);
                arrayMap.put(2, java.lang.Boolean.TRUE);
                return 0;
            case 3:
                this.f30424f = aVar2.i(intValue);
                arrayMap.put(3, java.lang.Boolean.TRUE);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.qz qzVar = new bw5.qz();
                    if (bArr2 != null && bArr2.length > 0) {
                        qzVar.parseFrom(bArr2);
                    }
                    linkedList2.add(qzVar);
                }
                arrayMap.put(4, java.lang.Boolean.TRUE);
                return 0;
            case 5:
                this.f30426h = aVar2.g(intValue);
                arrayMap.put(5, java.lang.Boolean.TRUE);
                return 0;
            case 6:
                this.f30427i = aVar2.g(intValue);
                arrayMap.put(6, java.lang.Boolean.TRUE);
                return 0;
            default:
                return -1;
        }
    }
}
