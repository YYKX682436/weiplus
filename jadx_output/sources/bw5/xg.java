package bw5;

/* loaded from: classes2.dex */
public class xg extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35100d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35102f;

    /* renamed from: g, reason: collision with root package name */
    public int f35103g;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f35101e = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f35104h = new boolean[5];

    static {
        new bw5.xg();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.xg parseFrom(byte[] bArr) {
        return (bw5.xg) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.xg)) {
            return false;
        }
        bw5.xg xgVar = (bw5.xg) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35100d), java.lang.Long.valueOf(xgVar.f35100d)) && n51.f.a(this.f35101e, xgVar.f35101e) && n51.f.a(this.f35102f, xgVar.f35102f) && n51.f.a(java.lang.Integer.valueOf(this.f35103g), java.lang.Integer.valueOf(xgVar.f35103g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.xg();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35101e;
        boolean[] zArr = this.f35104h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35100d);
            }
            fVar.g(2, 8, linkedList);
            java.lang.String str = this.f35102f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35103g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = (zArr[1] ? 0 + b36.f.h(1, this.f35100d) : 0) + b36.f.g(2, 8, linkedList);
            java.lang.String str2 = this.f35102f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return zArr[4] ? h17 + b36.f.e(4, this.f35103g) : h17;
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
            this.f35100d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f35102f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f35103g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.xj xjVar = new bw5.xj();
            if (bArr != null && bArr.length > 0) {
                xjVar.parseFrom(bArr);
            }
            linkedList.add(xjVar);
        }
        zArr[2] = true;
        return 0;
    }
}
