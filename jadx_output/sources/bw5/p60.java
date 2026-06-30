package bw5;

/* loaded from: classes2.dex */
public class p60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31477d;

    /* renamed from: e, reason: collision with root package name */
    public int f31478e;

    /* renamed from: f, reason: collision with root package name */
    public int f31479f;

    /* renamed from: g, reason: collision with root package name */
    public final android.util.ArrayMap f31480g = new android.util.ArrayMap();

    static {
        new bw5.p60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p60 parseFrom(byte[] bArr) {
        return (bw5.p60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p60)) {
            return false;
        }
        bw5.p60 p60Var = (bw5.p60) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31477d), java.lang.Integer.valueOf(p60Var.f31477d)) && n51.f.a(java.lang.Integer.valueOf(this.f31478e), java.lang.Integer.valueOf(p60Var.f31478e)) && n51.f.a(java.lang.Integer.valueOf(this.f31479f), java.lang.Integer.valueOf(p60Var.f31479f));
    }

    public boolean hasFieldNumber(int i17) {
        return java.lang.Boolean.TRUE.equals(this.f31480g.get(java.lang.Integer.valueOf(i17)));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (hasFieldNumber(1)) {
                fVar.e(1, this.f31477d);
            }
            if (hasFieldNumber(2)) {
                fVar.e(2, this.f31478e);
            }
            if (hasFieldNumber(100)) {
                fVar.e(100, this.f31479f);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = hasFieldNumber(1) ? 0 + b36.f.e(1, this.f31477d) : 0;
            if (hasFieldNumber(2)) {
                e17 += b36.f.e(2, this.f31478e);
            }
            return hasFieldNumber(100) ? e17 + b36.f.e(100, this.f31479f) : e17;
        }
        if (i17 == 2) {
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
        android.util.ArrayMap arrayMap = this.f31480g;
        if (intValue == 1) {
            this.f31477d = aVar2.g(intValue);
            arrayMap.put(1, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue == 2) {
            this.f31478e = aVar2.g(intValue);
            arrayMap.put(2, java.lang.Boolean.TRUE);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        this.f31479f = aVar2.g(intValue);
        arrayMap.put(100, java.lang.Boolean.TRUE);
        return 0;
    }
}
