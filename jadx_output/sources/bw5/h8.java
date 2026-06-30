package bw5;

/* loaded from: classes9.dex */
public class h8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28110d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f28111e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.g8 f28112f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.d8 f28113g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.e8 f28114h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.f8 f28115i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f28116m = new boolean[7];

    static {
        new bw5.h8();
    }

    public bw5.d8 b() {
        return this.f28116m[4] ? this.f28113g : new bw5.d8();
    }

    public bw5.e8 c() {
        return this.f28116m[5] ? this.f28114h : new bw5.e8();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h8)) {
            return false;
        }
        bw5.h8 h8Var = (bw5.h8) fVar;
        return n51.f.a(this.f28110d, h8Var.f28110d) && n51.f.a(this.f28111e, h8Var.f28111e) && n51.f.a(this.f28112f, h8Var.f28112f) && n51.f.a(this.f28113g, h8Var.f28113g) && n51.f.a(this.f28114h, h8Var.f28114h) && n51.f.a(this.f28115i, h8Var.f28115i);
    }

    public bw5.g8 d() {
        return this.f28116m[3] ? this.f28112f : new bw5.g8();
    }

    public bw5.h8 e(bw5.g8 g8Var) {
        this.f28112f = g8Var;
        this.f28116m[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28116m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28110d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            com.tencent.mm.protobuf.g gVar = this.f28111e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            bw5.g8 g8Var = this.f28112f;
            if (g8Var != null && zArr[3]) {
                fVar.i(3, g8Var.computeSize());
                this.f28112f.writeFields(fVar);
            }
            bw5.d8 d8Var = this.f28113g;
            if (d8Var != null && zArr[4]) {
                fVar.i(4, d8Var.computeSize());
                this.f28113g.writeFields(fVar);
            }
            bw5.e8 e8Var = this.f28114h;
            if (e8Var != null && zArr[5]) {
                fVar.i(5, e8Var.computeSize());
                this.f28114h.writeFields(fVar);
            }
            bw5.f8 f8Var = this.f28115i;
            if (f8Var != null && zArr[6]) {
                fVar.i(6, f8Var.computeSize());
                this.f28115i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f28110d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f28111e;
            if (gVar2 != null && zArr[2]) {
                i18 += b36.f.b(2, gVar2);
            }
            bw5.g8 g8Var2 = this.f28112f;
            if (g8Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, g8Var2.computeSize());
            }
            bw5.d8 d8Var2 = this.f28113g;
            if (d8Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, d8Var2.computeSize());
            }
            bw5.e8 e8Var2 = this.f28114h;
            if (e8Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, e8Var2.computeSize());
            }
            bw5.f8 f8Var2 = this.f28115i;
            return (f8Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, f8Var2.computeSize());
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
                this.f28110d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f28111e = aVar2.d(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.g8 g8Var3 = new bw5.g8();
                    if (bArr != null && bArr.length > 0) {
                        g8Var3.parseFrom(bArr);
                    }
                    this.f28112f = g8Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.d8 d8Var3 = new bw5.d8();
                    if (bArr2 != null && bArr2.length > 0) {
                        d8Var3.parseFrom(bArr2);
                    }
                    this.f28113g = d8Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.e8 e8Var3 = new bw5.e8();
                    if (bArr3 != null && bArr3.length > 0) {
                        e8Var3.parseFrom(bArr3);
                    }
                    this.f28114h = e8Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.f8 f8Var3 = new bw5.f8();
                    if (bArr4 != null && bArr4.length > 0) {
                        f8Var3.parseFrom(bArr4);
                    }
                    this.f28115i = f8Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.h8) super.parseFrom(bArr);
    }
}
