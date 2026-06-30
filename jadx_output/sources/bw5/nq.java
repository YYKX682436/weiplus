package bw5;

/* loaded from: classes2.dex */
public class nq extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30782d;

    /* renamed from: f, reason: collision with root package name */
    public int f30784f;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f30783e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30785g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f30786h = new boolean[5];

    static {
        new bw5.nq();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.nq parseFrom(byte[] bArr) {
        return (bw5.nq) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nq)) {
            return false;
        }
        bw5.nq nqVar = (bw5.nq) fVar;
        return n51.f.a(this.f30782d, nqVar.f30782d) && n51.f.a(this.f30783e, nqVar.f30783e) && n51.f.a(java.lang.Integer.valueOf(this.f30784f), java.lang.Integer.valueOf(nqVar.f30784f)) && n51.f.a(this.f30785g, nqVar.f30785g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nq();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30785g;
        java.util.LinkedList linkedList2 = this.f30783e;
        boolean[] zArr = this.f30786h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30782d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 1, linkedList2);
            if (zArr[3]) {
                fVar.e(3, this.f30784f);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f30782d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            int g17 = i18 + b36.f.g(2, 1, linkedList2);
            if (zArr[3]) {
                g17 += b36.f.e(3, this.f30784f);
            }
            return g17 + b36.f.g(4, 1, linkedList);
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
        if (intValue == 1) {
            this.f30782d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList2.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30784f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        linkedList.add(aVar2.k(intValue));
        zArr[4] = true;
        return 0;
    }
}
