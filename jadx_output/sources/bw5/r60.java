package bw5;

/* loaded from: classes2.dex */
public class r60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32418d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32419e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c80 f32420f;

    /* renamed from: g, reason: collision with root package name */
    public int f32421g;

    /* renamed from: h, reason: collision with root package name */
    public long f32422h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32423i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f32424m = new boolean[7];

    static {
        new bw5.r60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.r60 parseFrom(byte[] bArr) {
        return (bw5.r60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.r60)) {
            return false;
        }
        bw5.r60 r60Var = (bw5.r60) fVar;
        return n51.f.a(this.f32418d, r60Var.f32418d) && n51.f.a(this.f32419e, r60Var.f32419e) && n51.f.a(this.f32420f, r60Var.f32420f) && n51.f.a(java.lang.Integer.valueOf(this.f32421g), java.lang.Integer.valueOf(r60Var.f32421g)) && n51.f.a(java.lang.Long.valueOf(this.f32422h), java.lang.Long.valueOf(r60Var.f32422h)) && n51.f.a(this.f32423i, r60Var.f32423i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.r60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32424m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32418d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32419e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.c80 c80Var = this.f32420f;
            if (c80Var != null && zArr[3]) {
                fVar.i(3, c80Var.computeSize());
                this.f32420f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32421g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f32422h);
            }
            java.lang.String str3 = this.f32423i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f32418d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f32419e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            bw5.c80 c80Var2 = this.f32420f;
            if (c80Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, c80Var2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f32421g);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f32422h);
            }
            java.lang.String str6 = this.f32423i;
            return (str6 == null || !zArr[6]) ? i18 : i18 + b36.f.j(6, str6);
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
        switch (intValue) {
            case 1:
                this.f32418d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32419e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.c80 c80Var3 = new bw5.c80();
                    if (bArr != null && bArr.length > 0) {
                        c80Var3.parseFrom(bArr);
                    }
                    this.f32420f = c80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f32421g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32422h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32423i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
