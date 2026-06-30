package bw5;

/* loaded from: classes2.dex */
public class ro0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32640d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ro f32641e;

    /* renamed from: f, reason: collision with root package name */
    public int f32642f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32643g = new boolean[4];

    static {
        new bw5.ro0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ro0 parseFrom(byte[] bArr) {
        return (bw5.ro0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ro0)) {
            return false;
        }
        bw5.ro0 ro0Var = (bw5.ro0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32640d), java.lang.Boolean.valueOf(ro0Var.f32640d)) && n51.f.a(this.f32641e, ro0Var.f32641e) && n51.f.a(java.lang.Integer.valueOf(this.f32642f), java.lang.Integer.valueOf(ro0Var.f32642f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ro0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32643g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32640d);
            }
            bw5.ro roVar = this.f32641e;
            if (roVar != null && zArr[2]) {
                fVar.i(2, roVar.computeSize());
                this.f32641e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32642f);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32640d) : 0;
            bw5.ro roVar2 = this.f32641e;
            if (roVar2 != null && zArr[2]) {
                a17 += b36.f.i(2, roVar2.computeSize());
            }
            return zArr[3] ? a17 + b36.f.e(3, this.f32642f) : a17;
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
            this.f32640d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f32642f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.ro roVar3 = new bw5.ro();
            if (bArr != null && bArr.length > 0) {
                roVar3.parseFrom(bArr);
            }
            this.f32641e = roVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
