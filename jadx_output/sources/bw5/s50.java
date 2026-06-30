package bw5;

/* loaded from: classes2.dex */
public class s50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32810d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32811e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32812f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32813g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f32814h = new boolean[5];

    static {
        new bw5.s50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s50 parseFrom(byte[] bArr) {
        return (bw5.s50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s50)) {
            return false;
        }
        bw5.s50 s50Var = (bw5.s50) fVar;
        return n51.f.a(this.f32810d, s50Var.f32810d) && n51.f.a(this.f32811e, s50Var.f32811e) && n51.f.a(this.f32812f, s50Var.f32812f) && n51.f.a(this.f32813g, s50Var.f32813g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32814h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32810d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f32811e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            java.lang.String str2 = this.f32812f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f32813g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f32810d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32811e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            java.lang.String str5 = this.f32812f;
            if (str5 != null && zArr[3]) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f32813g;
            return (str6 == null || !zArr[4]) ? i18 : i18 + b36.f.j(4, str6);
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
            this.f32810d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32811e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32812f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f32813g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
