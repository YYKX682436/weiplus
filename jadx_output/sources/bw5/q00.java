package bw5;

/* loaded from: classes2.dex */
public class q00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31881d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31882e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31883f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31884g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f31885h;

    /* renamed from: i, reason: collision with root package name */
    public int f31886i;

    /* renamed from: m, reason: collision with root package name */
    public int f31887m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f31888n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.pj f31889o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.x7 f31890p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f31891q = new boolean[23];

    static {
        new bw5.q00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.q00 parseFrom(byte[] bArr) {
        return (bw5.q00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q00)) {
            return false;
        }
        bw5.q00 q00Var = (bw5.q00) fVar;
        return n51.f.a(this.f31881d, q00Var.f31881d) && n51.f.a(this.f31882e, q00Var.f31882e) && n51.f.a(this.f31883f, q00Var.f31883f) && n51.f.a(this.f31884g, q00Var.f31884g) && n51.f.a(this.f31885h, q00Var.f31885h) && n51.f.a(java.lang.Integer.valueOf(this.f31886i), java.lang.Integer.valueOf(q00Var.f31886i)) && n51.f.a(java.lang.Integer.valueOf(this.f31887m), java.lang.Integer.valueOf(q00Var.f31887m)) && n51.f.a(java.lang.Boolean.valueOf(this.f31888n), java.lang.Boolean.valueOf(q00Var.f31888n)) && n51.f.a(this.f31889o, q00Var.f31889o) && n51.f.a(this.f31890p, q00Var.f31890p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31891q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31881d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31882e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31883f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f31884g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f31885h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31886i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f31887m);
            }
            if (zArr[10]) {
                fVar.a(10, this.f31888n);
            }
            bw5.pj pjVar = this.f31889o;
            if (pjVar != null && zArr[21]) {
                fVar.i(21, pjVar.computeSize());
                this.f31889o.writeFields(fVar);
            }
            bw5.x7 x7Var = this.f31890p;
            if (x7Var != null && zArr[22]) {
                fVar.i(22, x7Var.computeSize());
                this.f31890p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f31881d;
            if (str6 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str6);
            }
            java.lang.String str7 = this.f31882e;
            if (str7 != null && zArr[2]) {
                i18 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f31883f;
            if (str8 != null && zArr[3]) {
                i18 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f31884g;
            if (str9 != null && zArr[4]) {
                i18 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f31885h;
            if (str10 != null && zArr[5]) {
                i18 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f31886i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f31887m);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f31888n);
            }
            bw5.pj pjVar2 = this.f31889o;
            if (pjVar2 != null && zArr[21]) {
                i18 += b36.f.i(21, pjVar2.computeSize());
            }
            bw5.x7 x7Var2 = this.f31890p;
            return (x7Var2 == null || !zArr[22]) ? i18 : i18 + b36.f.i(22, x7Var2.computeSize());
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
        if (intValue == 10) {
            this.f31888n = aVar2.c(intValue);
            zArr[10] = true;
            return 0;
        }
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.pj pjVar3 = new bw5.pj();
                if (bArr != null && bArr.length > 0) {
                    pjVar3.parseFrom(bArr);
                }
                this.f31889o = pjVar3;
            }
            zArr[21] = true;
            return 0;
        }
        if (intValue == 22) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.x7 x7Var3 = new bw5.x7();
                if (bArr2 != null && bArr2.length > 0) {
                    x7Var3.parseFrom(bArr2);
                }
                this.f31890p = x7Var3;
            }
            zArr[22] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f31881d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31882e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31883f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31884g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31885h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31886i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31887m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
