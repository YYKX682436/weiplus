package bw5;

/* loaded from: classes8.dex */
public class zh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.yh0 f35999d;

    /* renamed from: e, reason: collision with root package name */
    public int f36000e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f36001f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f36002g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f36003h = new boolean[7];

    static {
        new bw5.zh0();
    }

    public bw5.yh0 b() {
        return this.f36003h[3] ? this.f35999d : new bw5.yh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.zh0 parseFrom(byte[] bArr) {
        return (bw5.zh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.zh0)) {
            return false;
        }
        bw5.zh0 zh0Var = (bw5.zh0) fVar;
        return n51.f.a(this.f35999d, zh0Var.f35999d) && n51.f.a(java.lang.Integer.valueOf(this.f36000e), java.lang.Integer.valueOf(zh0Var.f36000e)) && n51.f.a(this.f36001f, zh0Var.f36001f) && n51.f.a(this.f36002g, zh0Var.f36002g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.zh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f36002g;
        boolean[] zArr = this.f36003h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.yh0 yh0Var = this.f35999d;
            if (yh0Var != null && zArr[3]) {
                fVar.i(3, yh0Var.computeSize());
                this.f35999d.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f36000e);
            }
            java.lang.String str = this.f36001f;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.yh0 yh0Var2 = this.f35999d;
            if (yh0Var2 != null && zArr[3]) {
                i18 = 0 + b36.f.i(3, yh0Var2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f36000e);
            }
            java.lang.String str2 = this.f36001f;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            return i18 + b36.f.g(6, 1, linkedList);
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
        if (intValue != 3) {
            if (intValue == 4) {
                this.f36000e = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue == 5) {
                this.f36001f = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            linkedList.add(aVar2.k(intValue));
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.yh0 yh0Var3 = new bw5.yh0();
            if (bArr != null && bArr.length > 0) {
                yh0Var3.parseFrom(bArr);
            }
            this.f35999d = yh0Var3;
        }
        zArr[3] = true;
        return 0;
    }
}
