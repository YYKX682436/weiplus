package bw5;

/* loaded from: classes8.dex */
public class s20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32769d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32770e;

    /* renamed from: f, reason: collision with root package name */
    public long f32771f;

    /* renamed from: g, reason: collision with root package name */
    public int f32772g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32773h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f32774i = new boolean[6];

    static {
        new bw5.s20();
    }

    public java.lang.String b() {
        return this.f32774i[5] ? this.f32773h : "";
    }

    public com.tencent.mm.protobuf.g c() {
        return this.f32774i[2] ? this.f32770e : com.tencent.mm.protobuf.g.f192155b;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s20)) {
            return false;
        }
        bw5.s20 s20Var = (bw5.s20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32769d), java.lang.Integer.valueOf(s20Var.f32769d)) && n51.f.a(this.f32770e, s20Var.f32770e) && n51.f.a(java.lang.Long.valueOf(this.f32771f), java.lang.Long.valueOf(s20Var.f32771f)) && n51.f.a(java.lang.Integer.valueOf(this.f32772g), java.lang.Integer.valueOf(s20Var.f32772g)) && n51.f.a(this.f32773h, s20Var.f32773h);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.s20 parseFrom(byte[] bArr) {
        return (bw5.s20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32774i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32769d);
            }
            com.tencent.mm.protobuf.g gVar = this.f32770e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            if (zArr[3]) {
                fVar.h(3, this.f32771f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32772g);
            }
            java.lang.String str = this.f32773h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32769d) : 0;
            com.tencent.mm.protobuf.g gVar2 = this.f32770e;
            if (gVar2 != null && zArr[2]) {
                e17 += b36.f.b(2, gVar2);
            }
            if (zArr[3]) {
                e17 += b36.f.h(3, this.f32771f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f32772g);
            }
            java.lang.String str2 = this.f32773h;
            return (str2 == null || !zArr[5]) ? e17 : e17 + b36.f.j(5, str2);
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
            this.f32769d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f32770e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f32771f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f32772g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f32773h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
