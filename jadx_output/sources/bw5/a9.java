package bw5;

/* loaded from: classes9.dex */
public class a9 extends com.tencent.mm.protobuf.f {

    /* renamed from: e, reason: collision with root package name */
    public int f25088e;

    /* renamed from: f, reason: collision with root package name */
    public double f25089f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f25087d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f25090g = new boolean[4];

    static {
        new bw5.a9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.a9 parseFrom(byte[] bArr) {
        return (bw5.a9) super.parseFrom(bArr);
    }

    public bw5.a9 c(double d17) {
        this.f25089f = d17;
        this.f25090g[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.a9)) {
            return false;
        }
        bw5.a9 a9Var = (bw5.a9) fVar;
        return n51.f.a(this.f25087d, a9Var.f25087d) && n51.f.a(java.lang.Integer.valueOf(this.f25088e), java.lang.Integer.valueOf(a9Var.f25088e)) && n51.f.a(java.lang.Double.valueOf(this.f25089f), java.lang.Double.valueOf(a9Var.f25089f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.a9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25087d;
        boolean[] zArr = this.f25090g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            if (zArr[2]) {
                fVar.e(2, this.f25088e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f25089f);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            if (zArr[2]) {
                g17 += b36.f.e(2, this.f25088e);
            }
            return zArr[3] ? g17 + b36.f.c(3, this.f25089f) : g17;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f25088e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f25089f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.c9 c9Var = new bw5.c9();
            if (bArr != null && bArr.length > 0) {
                c9Var.parseFrom(bArr);
            }
            linkedList.add(c9Var);
        }
        zArr[1] = true;
        return 0;
    }
}
