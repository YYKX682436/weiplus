package bw5;

/* loaded from: classes2.dex */
public class c40 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25915d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.ev f25916e;

    /* renamed from: f, reason: collision with root package name */
    public int f25917f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25918g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.ju f25919h;

    /* renamed from: i, reason: collision with root package name */
    public int f25920i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25921m;

    /* renamed from: n, reason: collision with root package name */
    public int f25922n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f25923o = new boolean[9];

    static {
        new bw5.c40();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c40)) {
            return false;
        }
        bw5.c40 c40Var = (bw5.c40) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25915d), java.lang.Long.valueOf(c40Var.f25915d)) && n51.f.a(this.f25916e, c40Var.f25916e) && n51.f.a(java.lang.Integer.valueOf(this.f25917f), java.lang.Integer.valueOf(c40Var.f25917f)) && n51.f.a(this.f25918g, c40Var.f25918g) && n51.f.a(this.f25919h, c40Var.f25919h) && n51.f.a(java.lang.Integer.valueOf(this.f25920i), java.lang.Integer.valueOf(c40Var.f25920i)) && n51.f.a(this.f25921m, c40Var.f25921m) && n51.f.a(java.lang.Integer.valueOf(this.f25922n), java.lang.Integer.valueOf(c40Var.f25922n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c40();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25923o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25915d);
            }
            bw5.ev evVar = this.f25916e;
            if (evVar != null && zArr[2]) {
                fVar.i(2, evVar.computeSize());
                this.f25916e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.e(3, this.f25917f);
            }
            com.tencent.mm.protobuf.g gVar = this.f25918g;
            if (gVar != null && zArr[4]) {
                fVar.b(4, gVar);
            }
            bw5.ju juVar = this.f25919h;
            if (juVar != null && zArr[5]) {
                fVar.i(5, juVar.computeSize());
                this.f25919h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25920i);
            }
            java.lang.String str = this.f25921m;
            if (str != null && zArr[7]) {
                fVar.j(7, str);
            }
            if (zArr[8]) {
                fVar.e(8, this.f25922n);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25915d) : 0;
            bw5.ev evVar2 = this.f25916e;
            if (evVar2 != null && zArr[2]) {
                h17 += b36.f.i(2, evVar2.computeSize());
            }
            if (zArr[3]) {
                h17 += b36.f.e(3, this.f25917f);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25918g;
            if (gVar2 != null && zArr[4]) {
                h17 += b36.f.b(4, gVar2);
            }
            bw5.ju juVar2 = this.f25919h;
            if (juVar2 != null && zArr[5]) {
                h17 += b36.f.i(5, juVar2.computeSize());
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f25920i);
            }
            java.lang.String str2 = this.f25921m;
            if (str2 != null && zArr[7]) {
                h17 += b36.f.j(7, str2);
            }
            return zArr[8] ? h17 + b36.f.e(8, this.f25922n) : h17;
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
                this.f25915d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ev evVar3 = new bw5.ev();
                    if (bArr != null && bArr.length > 0) {
                        evVar3.parseFrom(bArr);
                    }
                    this.f25916e = evVar3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f25917f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25918g = aVar2.d(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.ju juVar3 = new bw5.ju();
                    if (bArr2 != null && bArr2.length > 0) {
                        juVar3.parseFrom(bArr2);
                    }
                    this.f25919h = juVar3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f25920i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25921m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25922n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.c40) super.parseFrom(bArr);
    }
}
