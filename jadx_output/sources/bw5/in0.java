package bw5;

/* loaded from: classes11.dex */
public class in0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28644d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28645e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28646f;

    /* renamed from: g, reason: collision with root package name */
    public double f28647g;

    /* renamed from: h, reason: collision with root package name */
    public double f28648h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28649i = new boolean[6];

    static {
        new bw5.in0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.in0 parseFrom(byte[] bArr) {
        return (bw5.in0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.in0)) {
            return false;
        }
        bw5.in0 in0Var = (bw5.in0) fVar;
        return n51.f.a(this.f28644d, in0Var.f28644d) && n51.f.a(this.f28645e, in0Var.f28645e) && n51.f.a(this.f28646f, in0Var.f28646f) && n51.f.a(java.lang.Double.valueOf(this.f28647g), java.lang.Double.valueOf(in0Var.f28647g)) && n51.f.a(java.lang.Double.valueOf(this.f28648h), java.lang.Double.valueOf(in0Var.f28648h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.in0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28649i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28644d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28645e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f28646f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.c(4, this.f28647g);
            }
            if (zArr[5]) {
                fVar.c(5, this.f28648h);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f28644d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f28645e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f28646f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.c(4, this.f28647g);
            }
            return zArr[5] ? i18 + b36.f.c(5, this.f28648h) : i18;
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
            this.f28644d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28645e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28646f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28647g = aVar2.e(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f28648h = aVar2.e(intValue);
        zArr[5] = true;
        return 0;
    }
}
