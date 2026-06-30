package bw5;

/* loaded from: classes11.dex */
public class so0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33082d;

    /* renamed from: e, reason: collision with root package name */
    public int f33083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33084f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f33085g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f33086h = new boolean[5];

    static {
        new bw5.so0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.so0 parseFrom(byte[] bArr) {
        return (bw5.so0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.so0)) {
            return false;
        }
        bw5.so0 so0Var = (bw5.so0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33082d), java.lang.Integer.valueOf(so0Var.f33082d)) && n51.f.a(java.lang.Integer.valueOf(this.f33083e), java.lang.Integer.valueOf(so0Var.f33083e)) && n51.f.a(this.f33084f, so0Var.f33084f) && n51.f.a(this.f33085g, so0Var.f33085g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.so0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f33085g;
        boolean[] zArr = this.f33086h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33082d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33083e);
            }
            java.lang.String str = this.f33084f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33082d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f33083e);
            }
            java.lang.String str2 = this.f33084f;
            if (str2 != null && zArr[3]) {
                e17 += b36.f.j(3, str2);
            }
            return e17 + b36.f.g(4, 8, linkedList);
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
            this.f33082d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33083e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f33084f = aVar2.k(intValue);
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
            bw5.ci0 ci0Var = new bw5.ci0();
            if (bArr != null && bArr.length > 0) {
                ci0Var.parseFrom(bArr);
            }
            linkedList.add(ci0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
