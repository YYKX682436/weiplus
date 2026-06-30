package bw5;

/* loaded from: classes2.dex */
public class qm extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32182d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32183e;

    /* renamed from: f, reason: collision with root package name */
    public int f32184f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32185g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32186h = new boolean[5];

    static {
        new bw5.qm();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.qm parseFrom(byte[] bArr) {
        return (bw5.qm) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.qm)) {
            return false;
        }
        bw5.qm qmVar = (bw5.qm) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32182d), java.lang.Integer.valueOf(qmVar.f32182d)) && n51.f.a(this.f32183e, qmVar.f32183e) && n51.f.a(java.lang.Integer.valueOf(this.f32184f), java.lang.Integer.valueOf(qmVar.f32184f)) && n51.f.a(this.f32185g, qmVar.f32185g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.qm();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32186h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32182d);
            }
            com.tencent.mm.protobuf.g gVar = this.f32183e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32184f);
            }
            java.lang.String str = this.f32185g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32182d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f32183e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f32184f);
            }
            java.lang.String str2 = this.f32185g;
            return (str2 == null || !zArr[4]) ? e17 : e17 + b36.f.j(4, str2);
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
            this.f32182d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32183e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32184f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32185g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
