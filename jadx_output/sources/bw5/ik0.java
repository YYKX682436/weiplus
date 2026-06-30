package bw5;

/* loaded from: classes4.dex */
public class ik0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28624d;

    /* renamed from: f, reason: collision with root package name */
    public int f28626f;

    /* renamed from: g, reason: collision with root package name */
    public int f28627g;

    /* renamed from: h, reason: collision with root package name */
    public int f28628h;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f28625e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28629i = new boolean[6];

    static {
        new bw5.ik0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ik0 parseFrom(byte[] bArr) {
        return (bw5.ik0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ik0)) {
            return false;
        }
        bw5.ik0 ik0Var = (bw5.ik0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28624d), java.lang.Integer.valueOf(ik0Var.f28624d)) && n51.f.a(this.f28625e, ik0Var.f28625e) && n51.f.a(java.lang.Integer.valueOf(this.f28626f), java.lang.Integer.valueOf(ik0Var.f28626f)) && n51.f.a(java.lang.Integer.valueOf(this.f28627g), java.lang.Integer.valueOf(ik0Var.f28627g)) && n51.f.a(java.lang.Integer.valueOf(this.f28628h), java.lang.Integer.valueOf(ik0Var.f28628h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ik0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f28625e;
        boolean[] zArr = this.f28629i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28624d);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.e(3, this.f28626f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28627g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f28628h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f28624d) : 0) + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28626f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f28627g);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f28628h) : e17;
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
            this.f28624d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f28626f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f28627g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f28628h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.zj0 zj0Var = new bw5.zj0();
            if (bArr != null && bArr.length > 0) {
                zj0Var.parseFrom(bArr);
            }
            linkedList.add(zj0Var);
        }
        zArr[2] = true;
        return 0;
    }
}
