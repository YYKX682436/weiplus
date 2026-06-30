package bw5;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f27584d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.j f27585e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f27586f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.h f27587g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27588h = new boolean[5];

    static {
        new bw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.g parseFrom(byte[] bArr) {
        return (bw5.g) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.g)) {
            return false;
        }
        bw5.g gVar = (bw5.g) fVar;
        return n51.f.a(this.f27584d, gVar.f27584d) && n51.f.a(this.f27585e, gVar.f27585e) && n51.f.a(this.f27586f, gVar.f27586f) && n51.f.a(this.f27587g, gVar.f27587g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.g();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f27588h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f27584d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.j jVar = this.f27585e;
            if (jVar != null && zArr[2]) {
                fVar.e(2, jVar.f28744d);
            }
            com.tencent.mm.protobuf.g gVar = this.f27586f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.h hVar = this.f27587g;
            if (hVar != null && zArr[4]) {
                fVar.i(4, hVar.computeSize());
                this.f27587g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f27584d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.j jVar2 = this.f27585e;
            if (jVar2 != null && zArr[2]) {
                i18 += b36.f.e(2, jVar2.f28744d);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f27586f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.h hVar2 = this.f27587g;
            return (hVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, hVar2.computeSize());
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
            this.f27584d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            int g17 = aVar2.g(intValue);
            this.f27585e = g17 != 0 ? g17 != 1 ? null : bw5.j.AIGenerationBillTypeAIMusicGeneration : bw5.j.AIGenerationBillTypeDefault;
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f27586f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.h hVar3 = new bw5.h();
            if (bArr != null && bArr.length > 0) {
                hVar3.parseFrom(bArr);
            }
            this.f27587g = hVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
