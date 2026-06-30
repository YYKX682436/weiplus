package bw5;

/* loaded from: classes2.dex */
public class c20 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25885d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25886e;

    /* renamed from: f, reason: collision with root package name */
    public int f25887f;

    /* renamed from: g, reason: collision with root package name */
    public int f25888g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.v00 f25889h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.v00 f25890i;

    /* renamed from: m, reason: collision with root package name */
    public int f25891m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25892n;

    /* renamed from: o, reason: collision with root package name */
    public int f25893o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.ui f25894p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f25895q = new boolean[22];

    static {
        new bw5.c20();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c20 parseFrom(byte[] bArr) {
        return (bw5.c20) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c20)) {
            return false;
        }
        bw5.c20 c20Var = (bw5.c20) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25885d), java.lang.Integer.valueOf(c20Var.f25885d)) && n51.f.a(this.f25886e, c20Var.f25886e) && n51.f.a(java.lang.Integer.valueOf(this.f25887f), java.lang.Integer.valueOf(c20Var.f25887f)) && n51.f.a(java.lang.Integer.valueOf(this.f25888g), java.lang.Integer.valueOf(c20Var.f25888g)) && n51.f.a(this.f25889h, c20Var.f25889h) && n51.f.a(this.f25890i, c20Var.f25890i) && n51.f.a(java.lang.Integer.valueOf(this.f25891m), java.lang.Integer.valueOf(c20Var.f25891m)) && n51.f.a(this.f25892n, c20Var.f25892n) && n51.f.a(java.lang.Integer.valueOf(this.f25893o), java.lang.Integer.valueOf(c20Var.f25893o)) && n51.f.a(this.f25894p, c20Var.f25894p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c20();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25895q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25885d);
            }
            java.lang.String str = this.f25886e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25887f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f25888g);
            }
            bw5.v00 v00Var = this.f25889h;
            if (v00Var != null && zArr[5]) {
                fVar.i(5, v00Var.computeSize());
                this.f25889h.writeFields(fVar);
            }
            bw5.v00 v00Var2 = this.f25890i;
            if (v00Var2 != null && zArr[6]) {
                fVar.i(6, v00Var2.computeSize());
                this.f25890i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25891m);
            }
            java.lang.String str2 = this.f25892n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            if (zArr[20]) {
                fVar.e(20, this.f25893o);
            }
            bw5.ui uiVar = this.f25894p;
            if (uiVar != null && zArr[21]) {
                fVar.i(21, uiVar.computeSize());
                this.f25894p.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25885d) : 0;
            java.lang.String str3 = this.f25886e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f25887f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f25888g);
            }
            bw5.v00 v00Var3 = this.f25889h;
            if (v00Var3 != null && zArr[5]) {
                e17 += b36.f.i(5, v00Var3.computeSize());
            }
            bw5.v00 v00Var4 = this.f25890i;
            if (v00Var4 != null && zArr[6]) {
                e17 += b36.f.i(6, v00Var4.computeSize());
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f25891m);
            }
            java.lang.String str4 = this.f25892n;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            if (zArr[20]) {
                e17 += b36.f.e(20, this.f25893o);
            }
            bw5.ui uiVar2 = this.f25894p;
            return (uiVar2 == null || !zArr[21]) ? e17 : e17 + b36.f.i(21, uiVar2.computeSize());
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
        if (intValue == 20) {
            this.f25893o = aVar2.g(intValue);
            zArr[20] = true;
            return 0;
        }
        if (intValue == 21) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.ui uiVar3 = new bw5.ui();
                if (bArr != null && bArr.length > 0) {
                    uiVar3.parseFrom(bArr);
                }
                this.f25894p = uiVar3;
            }
            zArr[21] = true;
            return 0;
        }
        switch (intValue) {
            case 1:
                this.f25885d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25886e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25887f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25888g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.v00 v00Var5 = new bw5.v00();
                    if (bArr2 != null && bArr2.length > 0) {
                        v00Var5.parseFrom(bArr2);
                    }
                    this.f25889h = v00Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.v00 v00Var6 = new bw5.v00();
                    if (bArr3 != null && bArr3.length > 0) {
                        v00Var6.parseFrom(bArr3);
                    }
                    this.f25890i = v00Var6;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f25891m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25892n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
