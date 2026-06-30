package bw5;

/* loaded from: classes2.dex */
public class pi0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f31664d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31665e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31666f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f31668h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f31667g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31669i = new boolean[6];

    static {
        new bw5.pi0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pi0 parseFrom(byte[] bArr) {
        return (bw5.pi0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pi0)) {
            return false;
        }
        bw5.pi0 pi0Var = (bw5.pi0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f31664d), java.lang.Boolean.valueOf(pi0Var.f31664d)) && n51.f.a(java.lang.Boolean.valueOf(this.f31665e), java.lang.Boolean.valueOf(pi0Var.f31665e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31666f), java.lang.Boolean.valueOf(pi0Var.f31666f)) && n51.f.a(this.f31667g, pi0Var.f31667g) && n51.f.a(java.lang.Boolean.valueOf(this.f31668h), java.lang.Boolean.valueOf(pi0Var.f31668h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pi0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31667g;
        boolean[] zArr = this.f31669i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f31664d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f31665e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31666f);
            }
            fVar.g(4, 2, linkedList);
            if (zArr[5]) {
                fVar.a(5, this.f31668h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f31664d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f31665e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f31666f);
            }
            int g17 = a17 + b36.f.g(4, 2, linkedList);
            return zArr[5] ? g17 + b36.f.a(5, this.f31668h) : g17;
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
            this.f31664d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31665e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31666f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f31668h = aVar2.c(intValue);
        zArr[5] = true;
        return 0;
    }
}
