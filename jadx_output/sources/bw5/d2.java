package bw5;

/* loaded from: classes11.dex */
public class d2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f26280d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26281e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26282f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f26283g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.v70 f26284h;

    /* renamed from: i, reason: collision with root package name */
    public int f26285i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e2 f26286m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f26287n = new boolean[8];

    static {
        new bw5.d2();
    }

    public bw5.o50 b() {
        return this.f26287n[4] ? this.f26283g : new bw5.o50();
    }

    public bw5.v70 c() {
        return this.f26287n[5] ? this.f26284h : new bw5.v70();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d2)) {
            return false;
        }
        bw5.d2 d2Var = (bw5.d2) fVar;
        return n51.f.a(this.f26280d, d2Var.f26280d) && n51.f.a(this.f26281e, d2Var.f26281e) && n51.f.a(this.f26282f, d2Var.f26282f) && n51.f.a(this.f26283g, d2Var.f26283g) && n51.f.a(this.f26284h, d2Var.f26284h) && n51.f.a(java.lang.Integer.valueOf(this.f26285i), java.lang.Integer.valueOf(d2Var.f26285i)) && n51.f.a(this.f26286m, d2Var.f26286m);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.d2 parseFrom(byte[] bArr) {
        return (bw5.d2) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f26287n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f26280d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f26281e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f26282f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.o50 o50Var = this.f26283g;
            if (o50Var != null && zArr[4]) {
                fVar.i(4, o50Var.computeSize());
                this.f26283g.writeFields(fVar);
            }
            bw5.v70 v70Var = this.f26284h;
            if (v70Var != null && zArr[5]) {
                fVar.i(5, v70Var.computeSize());
                this.f26284h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26285i);
            }
            bw5.e2 e2Var = this.f26286m;
            if (e2Var != null && zArr[7]) {
                fVar.i(7, e2Var.computeSize());
                this.f26286m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f26280d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f26281e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26282f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.o50 o50Var2 = this.f26283g;
            if (o50Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, o50Var2.computeSize());
            }
            bw5.v70 v70Var2 = this.f26284h;
            if (v70Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, v70Var2.computeSize());
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f26285i);
            }
            bw5.e2 e2Var2 = this.f26286m;
            return (e2Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, e2Var2.computeSize());
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
                this.f26280d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26281e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26282f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.o50 o50Var3 = new bw5.o50();
                    if (bArr != null && bArr.length > 0) {
                        o50Var3.parseFrom(bArr);
                    }
                    this.f26283g = o50Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.parseFrom(bArr2);
                    }
                    this.f26284h = v70Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f26285i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.e2 e2Var3 = new bw5.e2();
                    if (bArr3 != null && bArr3.length > 0) {
                        e2Var3.parseFrom(bArr3);
                    }
                    this.f26286m = e2Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    public java.lang.String v() {
        return this.f26287n[2] ? this.f26281e : "";
    }
}
