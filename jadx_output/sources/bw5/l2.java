package bw5;

/* loaded from: classes11.dex */
public class l2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.m2 f29607d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f29608e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f29609f = new boolean[3];

    static {
        new bw5.l2();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.l2 parseFrom(byte[] bArr) {
        return (bw5.l2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.l2)) {
            return false;
        }
        bw5.l2 l2Var = (bw5.l2) fVar;
        return n51.f.a(this.f29607d, l2Var.f29607d) && n51.f.a(this.f29608e, l2Var.f29608e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.l2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f29609f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.m2 m2Var = this.f29607d;
            if (m2Var != null && zArr[1]) {
                fVar.e(1, m2Var.f30051d);
            }
            com.tencent.mm.protobuf.g gVar = this.f29608e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.m2 m2Var2 = this.f29607d;
            if (m2Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, m2Var2.f30051d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f29608e;
            return (gVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.b(2, gVar2);
        }
        if (i17 == 2) {
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
            this.f29607d = bw5.m2.a(aVar2.g(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f29608e = aVar2.d(intValue);
        zArr[2] = true;
        return 0;
    }
}
