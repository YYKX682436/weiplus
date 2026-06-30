package bw5;

/* loaded from: classes2.dex */
public class s40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32790d;

    /* renamed from: e, reason: collision with root package name */
    public int f32791e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.r40 f32792f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.q40 f32793g;

    /* renamed from: h, reason: collision with root package name */
    public int f32794h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.p40 f32795i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32796m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f32797n = new boolean[10];

    static {
        new bw5.s40();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.s40 parseFrom(byte[] bArr) {
        return (bw5.s40) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s40)) {
            return false;
        }
        bw5.s40 s40Var = (bw5.s40) fVar;
        return n51.f.a(this.f32790d, s40Var.f32790d) && n51.f.a(java.lang.Integer.valueOf(this.f32791e), java.lang.Integer.valueOf(s40Var.f32791e)) && n51.f.a(this.f32792f, s40Var.f32792f) && n51.f.a(this.f32793g, s40Var.f32793g) && n51.f.a(java.lang.Integer.valueOf(this.f32794h), java.lang.Integer.valueOf(s40Var.f32794h)) && n51.f.a(this.f32795i, s40Var.f32795i) && n51.f.a(this.f32796m, s40Var.f32796m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32797n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32790d;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32791e);
            }
            bw5.r40 r40Var = this.f32792f;
            if (r40Var != null && zArr[5]) {
                fVar.i(5, r40Var.computeSize());
                this.f32792f.writeFields(fVar);
            }
            bw5.q40 q40Var = this.f32793g;
            if (q40Var != null && zArr[6]) {
                fVar.i(6, q40Var.computeSize());
                this.f32793g.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f32794h);
            }
            bw5.p40 p40Var = this.f32795i;
            if (p40Var != null && zArr[8]) {
                fVar.i(8, p40Var.computeSize());
                this.f32795i.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f32796m;
            if (gVar != null && zArr[9]) {
                fVar.b(9, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32790d;
            if (str2 != null && zArr[2]) {
                i18 = 0 + b36.f.j(2, str2);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f32791e);
            }
            bw5.r40 r40Var2 = this.f32792f;
            if (r40Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, r40Var2.computeSize());
            }
            bw5.q40 q40Var2 = this.f32793g;
            if (q40Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, q40Var2.computeSize());
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f32794h);
            }
            bw5.p40 p40Var2 = this.f32795i;
            if (p40Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, p40Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32796m;
            return (gVar2 == null || !zArr[9]) ? i18 : i18 + b36.f.b(9, gVar2);
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
            case 2:
                this.f32790d = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32791e = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
            default:
                return -1;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.r40 r40Var3 = new bw5.r40();
                    if (bArr != null && bArr.length > 0) {
                        r40Var3.parseFrom(bArr);
                    }
                    this.f32792f = r40Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.q40 q40Var3 = new bw5.q40();
                    if (bArr2 != null && bArr2.length > 0) {
                        q40Var3.parseFrom(bArr2);
                    }
                    this.f32793g = q40Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f32794h = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.p40 p40Var3 = new bw5.p40();
                    if (bArr3 != null && bArr3.length > 0) {
                        p40Var3.parseFrom(bArr3);
                    }
                    this.f32795i = p40Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f32796m = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
        }
    }
}
