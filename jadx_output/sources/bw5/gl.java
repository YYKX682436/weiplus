package bw5;

/* loaded from: classes2.dex */
public class gl extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f27897e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f27898f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f27899g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f27896d = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27900h = new boolean[5];

    static {
        new bw5.gl();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gl parseFrom(byte[] bArr) {
        return (bw5.gl) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gl)) {
            return false;
        }
        bw5.gl glVar = (bw5.gl) fVar;
        return n51.f.a(this.f27896d, glVar.f27896d) && n51.f.a(java.lang.Integer.valueOf(this.f27897e), java.lang.Integer.valueOf(glVar.f27897e)) && n51.f.a(this.f27898f, glVar.f27898f) && n51.f.a(this.f27899g, glVar.f27899g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gl();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f27896d;
        boolean[] zArr = this.f27900h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f27897e);
            }
            java.lang.String str = this.f27898f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f27899g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 2, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f27897e);
            }
            java.lang.String str3 = this.f27898f;
            if (str3 != null && zArr[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f27899g;
            return (str4 == null || !zArr[4]) ? g17 : g17 + b36.f.j(4, str4);
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
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f27897e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27898f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f27899g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
