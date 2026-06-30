package bw5;

/* loaded from: classes2.dex */
public class ru extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f32685d;

    /* renamed from: e, reason: collision with root package name */
    public int f32686e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32687f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f32688g = new boolean[4];

    static {
        new bw5.ru();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ru parseFrom(byte[] bArr) {
        return (bw5.ru) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ru)) {
            return false;
        }
        bw5.ru ruVar = (bw5.ru) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f32685d), java.lang.Boolean.valueOf(ruVar.f32685d)) && n51.f.a(java.lang.Integer.valueOf(this.f32686e), java.lang.Integer.valueOf(ruVar.f32686e)) && n51.f.a(this.f32687f, ruVar.f32687f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ru();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32688g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f32685d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32686e);
            }
            com.tencent.mm.protobuf.g gVar = this.f32687f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f32685d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f32686e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32687f;
            return (gVar2 == null || !zArr[3]) ? a17 : a17 + b36.f.b(3, gVar2);
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
            this.f32685d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32686e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f32687f = aVar2.d(intValue);
        zArr[3] = true;
        return 0;
    }
}
