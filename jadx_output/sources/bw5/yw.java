package bw5;

/* loaded from: classes2.dex */
public class yw extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35717d;

    /* renamed from: e, reason: collision with root package name */
    public int f35718e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35719f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f35720g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f35721h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f35722i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f35723m = new boolean[7];

    static {
        new bw5.yw();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yw parseFrom(byte[] bArr) {
        return (bw5.yw) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yw)) {
            return false;
        }
        bw5.yw ywVar = (bw5.yw) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35717d), java.lang.Long.valueOf(ywVar.f35717d)) && n51.f.a(java.lang.Integer.valueOf(this.f35718e), java.lang.Integer.valueOf(ywVar.f35718e)) && n51.f.a(this.f35719f, ywVar.f35719f) && n51.f.a(this.f35720g, ywVar.f35720g) && n51.f.a(this.f35721h, ywVar.f35721h) && n51.f.a(this.f35722i, ywVar.f35722i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yw();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f35722i;
        java.util.LinkedList linkedList2 = this.f35721h;
        java.util.LinkedList linkedList3 = this.f35720g;
        boolean[] zArr = this.f35723m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35717d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f35718e);
            }
            java.lang.String str = this.f35719f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList3);
            fVar.g(5, 8, linkedList2);
            fVar.g(6, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f35717d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f35718e);
            }
            java.lang.String str2 = this.f35719f;
            if (str2 != null && zArr[3]) {
                h17 += b36.f.j(3, str2);
            }
            return h17 + b36.f.g(4, 1, linkedList3) + b36.f.g(5, 8, linkedList2) + b36.f.g(6, 1, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
        switch (intValue) {
            case 1:
                this.f35717d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35718e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35719f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList3.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.iw iwVar = new bw5.iw();
                    if (bArr != null && bArr.length > 0) {
                        iwVar.parseFrom(bArr);
                    }
                    linkedList2.add(iwVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                linkedList.add(aVar2.k(intValue));
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
