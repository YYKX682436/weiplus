package bw5;

/* loaded from: classes2.dex */
public class ag extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25182d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25184f;

    /* renamed from: g, reason: collision with root package name */
    public int f25185g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f25183e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25186h = new boolean[5];

    static {
        new bw5.ag();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ag parseFrom(byte[] bArr) {
        return (bw5.ag) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ag)) {
            return false;
        }
        bw5.ag agVar = (bw5.ag) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25182d), java.lang.Integer.valueOf(agVar.f25182d)) && n51.f.a(this.f25183e, agVar.f25183e) && n51.f.a(this.f25184f, agVar.f25184f) && n51.f.a(java.lang.Integer.valueOf(this.f25185g), java.lang.Integer.valueOf(agVar.f25185g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ag();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25183e;
        boolean[] zArr = this.f25186h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25182d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f25184f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25185g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f25182d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f25184f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f25185g) : e17;
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
            this.f25182d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f25184f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f25185g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.yr yrVar = new bw5.yr();
            if (bArr != null && bArr.length > 0) {
                yrVar.parseFrom(bArr);
            }
            linkedList.add(yrVar);
        }
        zArr[2] = true;
        return 0;
    }
}
