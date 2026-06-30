package bw5;

/* loaded from: classes2.dex */
public class jm0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29040d;

    /* renamed from: e, reason: collision with root package name */
    public int f29041e;

    /* renamed from: g, reason: collision with root package name */
    public int f29043g;

    /* renamed from: h, reason: collision with root package name */
    public long f29044h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29042f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f29045i = new boolean[6];

    static {
        new bw5.jm0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jm0 parseFrom(byte[] bArr) {
        return (bw5.jm0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jm0)) {
            return false;
        }
        bw5.jm0 jm0Var = (bw5.jm0) fVar;
        return n51.f.a(this.f29040d, jm0Var.f29040d) && n51.f.a(java.lang.Integer.valueOf(this.f29041e), java.lang.Integer.valueOf(jm0Var.f29041e)) && n51.f.a(this.f29042f, jm0Var.f29042f) && n51.f.a(java.lang.Integer.valueOf(this.f29043g), java.lang.Integer.valueOf(jm0Var.f29043g)) && n51.f.a(java.lang.Long.valueOf(this.f29044h), java.lang.Long.valueOf(jm0Var.f29044h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29042f;
        int i18 = 0;
        boolean[] zArr = this.f29045i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29040d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29041e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f29043g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f29044h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f29040d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29041e);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f29043g);
            }
            return zArr[5] ? g17 + b36.f.h(5, this.f29044h) : g17;
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
            this.f29040d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29041e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                this.f29043g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f29044h = aVar2.i(intValue);
            zArr[5] = true;
            return 0;
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
        zArr[3] = true;
        return 0;
    }
}
