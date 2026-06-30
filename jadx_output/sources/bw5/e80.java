package bw5;

/* loaded from: classes2.dex */
public class e80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26780d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f26781e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.c80 f26782f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.d80 f26783g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f26784h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mb0 f26785i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.f80 f26786m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f26787n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.lb0 f26788o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f26789p = new boolean[10];

    static {
        new bw5.e80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.e80 parseFrom(byte[] bArr) {
        return (bw5.e80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.e80)) {
            return false;
        }
        bw5.e80 e80Var = (bw5.e80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26780d), java.lang.Integer.valueOf(e80Var.f26780d)) && n51.f.a(this.f26781e, e80Var.f26781e) && n51.f.a(this.f26782f, e80Var.f26782f) && n51.f.a(this.f26783g, e80Var.f26783g) && n51.f.a(this.f26784h, e80Var.f26784h) && n51.f.a(this.f26785i, e80Var.f26785i) && n51.f.a(this.f26786m, e80Var.f26786m) && n51.f.a(this.f26787n, e80Var.f26787n) && n51.f.a(this.f26788o, e80Var.f26788o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.e80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26789p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26780d);
            }
            java.lang.String str = this.f26781e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.c80 c80Var = this.f26782f;
            if (c80Var != null && zArr[3]) {
                fVar.i(3, c80Var.computeSize());
                this.f26782f.writeFields(fVar);
            }
            bw5.d80 d80Var = this.f26783g;
            if (d80Var != null && zArr[4]) {
                fVar.i(4, d80Var.computeSize());
                this.f26783g.writeFields(fVar);
            }
            java.lang.String str2 = this.f26784h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.mb0 mb0Var = this.f26785i;
            if (mb0Var != null && zArr[6]) {
                fVar.i(6, mb0Var.computeSize());
                this.f26785i.writeFields(fVar);
            }
            bw5.f80 f80Var = this.f26786m;
            if (f80Var != null && zArr[7]) {
                fVar.i(7, f80Var.computeSize());
                this.f26786m.writeFields(fVar);
            }
            java.lang.String str3 = this.f26787n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            bw5.lb0 lb0Var = this.f26788o;
            if (lb0Var != null && zArr[9]) {
                fVar.i(9, lb0Var.computeSize());
                this.f26788o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26780d) : 0;
            java.lang.String str4 = this.f26781e;
            if (str4 != null && zArr[2]) {
                e17 += b36.f.j(2, str4);
            }
            bw5.c80 c80Var2 = this.f26782f;
            if (c80Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, c80Var2.computeSize());
            }
            bw5.d80 d80Var2 = this.f26783g;
            if (d80Var2 != null && zArr[4]) {
                e17 += b36.f.i(4, d80Var2.computeSize());
            }
            java.lang.String str5 = this.f26784h;
            if (str5 != null && zArr[5]) {
                e17 += b36.f.j(5, str5);
            }
            bw5.mb0 mb0Var2 = this.f26785i;
            if (mb0Var2 != null && zArr[6]) {
                e17 += b36.f.i(6, mb0Var2.computeSize());
            }
            bw5.f80 f80Var2 = this.f26786m;
            if (f80Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, f80Var2.computeSize());
            }
            java.lang.String str6 = this.f26787n;
            if (str6 != null && zArr[8]) {
                e17 += b36.f.j(8, str6);
            }
            bw5.lb0 lb0Var2 = this.f26788o;
            return (lb0Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, lb0Var2.computeSize());
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
                this.f26780d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26781e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.c80 c80Var3 = new bw5.c80();
                    if (bArr != null && bArr.length > 0) {
                        c80Var3.parseFrom(bArr);
                    }
                    this.f26782f = c80Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.d80 d80Var3 = new bw5.d80();
                    if (bArr2 != null && bArr2.length > 0) {
                        d80Var3.parseFrom(bArr2);
                    }
                    this.f26783g = d80Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f26784h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.mb0 mb0Var3 = new bw5.mb0();
                    if (bArr3 != null && bArr3.length > 0) {
                        mb0Var3.parseFrom(bArr3);
                    }
                    this.f26785i = mb0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.f80 f80Var3 = new bw5.f80();
                    if (bArr4 != null && bArr4.length > 0) {
                        f80Var3.parseFrom(bArr4);
                    }
                    this.f26786m = f80Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f26787n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.lb0 lb0Var3 = new bw5.lb0();
                    if (bArr5 != null && bArr5.length > 0) {
                        lb0Var3.parseFrom(bArr5);
                    }
                    this.f26788o = lb0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
