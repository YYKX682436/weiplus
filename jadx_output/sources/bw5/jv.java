package bw5;

/* loaded from: classes2.dex */
public class jv extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29144e;

    /* renamed from: g, reason: collision with root package name */
    public int f29146g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29145f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29147h = new boolean[5];

    static {
        new bw5.jv();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jv parseFrom(byte[] bArr) {
        return (bw5.jv) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jv)) {
            return false;
        }
        bw5.jv jvVar = (bw5.jv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29143d), java.lang.Integer.valueOf(jvVar.f29143d)) && n51.f.a(this.f29144e, jvVar.f29144e) && n51.f.a(this.f29145f, jvVar.f29145f) && n51.f.a(java.lang.Integer.valueOf(this.f29146g), java.lang.Integer.valueOf(jvVar.f29146g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jv();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29145f;
        boolean[] zArr = this.f29147h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29143d);
            }
            java.lang.String str = this.f29144e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[4]) {
                fVar.e(4, this.f29146g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f29143d) : 0;
            java.lang.String str2 = this.f29144e;
            if (str2 != null && zArr[2]) {
                e17 += b36.f.j(2, str2);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            return zArr[4] ? g17 + b36.f.e(4, this.f29146g) : g17;
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
            this.f29143d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29144e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 4) {
                return -1;
            }
            this.f29146g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.iv ivVar = new bw5.iv();
            if (bArr != null && bArr.length > 0) {
                ivVar.parseFrom(bArr);
            }
            linkedList.add(ivVar);
        }
        zArr[3] = true;
        return 0;
    }
}
