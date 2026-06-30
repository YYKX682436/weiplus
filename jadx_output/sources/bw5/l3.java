package bw5;

/* loaded from: classes2.dex */
public class l3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f29617d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f29618e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f29619f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f29620g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f29621h = new boolean[5];

    static {
        new bw5.l3();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l3 parseFrom(byte[] bArr) {
        return (bw5.l3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l3)) {
            return false;
        }
        bw5.l3 l3Var = (bw5.l3) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f29617d), java.lang.Boolean.valueOf(l3Var.f29617d)) && n51.f.a(this.f29618e, l3Var.f29618e) && n51.f.a(this.f29619f, l3Var.f29619f) && n51.f.a(this.f29620g, l3Var.f29620g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29620g;
        java.util.LinkedList linkedList2 = this.f29619f;
        java.util.LinkedList linkedList3 = this.f29618e;
        boolean[] zArr = this.f29621h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f29617d);
            }
            fVar.g(2, 2, linkedList3);
            fVar.g(3, 2, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return (zArr[1] ? 0 + b36.f.a(1, this.f29617d) : 0) + b36.f.g(2, 2, linkedList3) + b36.f.g(3, 2, linkedList2) + b36.f.g(4, 8, linkedList);
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
        if (intValue == 1) {
            this.f29617d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            linkedList3.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            linkedList2.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.k3 k3Var = new bw5.k3();
            if (bArr != null && bArr.length > 0) {
                k3Var.parseFrom(bArr);
            }
            linkedList.add(k3Var);
        }
        zArr[4] = true;
        return 0;
    }
}
