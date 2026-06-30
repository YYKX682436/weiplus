package bw5;

/* loaded from: classes2.dex */
public class zl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f36050d;

    /* renamed from: e, reason: collision with root package name */
    public float f36051e;

    /* renamed from: f, reason: collision with root package name */
    public long f36052f;

    /* renamed from: g, reason: collision with root package name */
    public long f36053g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f36054h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f36055i = new boolean[6];

    static {
        new bw5.zl0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.zl0 parseFrom(byte[] bArr) {
        return (bw5.zl0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zl0)) {
            return false;
        }
        bw5.zl0 zl0Var = (bw5.zl0) fVar;
        return n51.f.a(this.f36050d, zl0Var.f36050d) && n51.f.a(java.lang.Float.valueOf(this.f36051e), java.lang.Float.valueOf(zl0Var.f36051e)) && n51.f.a(java.lang.Long.valueOf(this.f36052f), java.lang.Long.valueOf(zl0Var.f36052f)) && n51.f.a(java.lang.Long.valueOf(this.f36053g), java.lang.Long.valueOf(zl0Var.f36053g)) && n51.f.a(this.f36054h, zl0Var.f36054h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f36054h;
        int i18 = 0;
        boolean[] zArr = this.f36055i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f36050d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.d(2, this.f36051e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f36052f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f36053g);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f36050d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.d(2, this.f36051e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f36052f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f36053g);
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
            this.f36050d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f36051e = aVar2.f(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f36052f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f36053g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.km0 km0Var = new bw5.km0();
            if (bArr != null && bArr.length > 0) {
                km0Var.parseFrom(bArr);
            }
            linkedList.add(km0Var);
        }
        zArr[5] = true;
        return 0;
    }
}
