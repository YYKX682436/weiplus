package bw5;

/* loaded from: classes4.dex */
public class si0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33004d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f33005e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f33006f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f33007g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f33008h;

    /* renamed from: i, reason: collision with root package name */
    public long f33009i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33010m = new boolean[7];

    static {
        new bw5.si0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.si0 parseFrom(byte[] bArr) {
        return (bw5.si0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.si0)) {
            return false;
        }
        bw5.si0 si0Var = (bw5.si0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33004d), java.lang.Integer.valueOf(si0Var.f33004d)) && n51.f.a(this.f33005e, si0Var.f33005e) && n51.f.a(this.f33006f, si0Var.f33006f) && n51.f.a(this.f33007g, si0Var.f33007g) && n51.f.a(this.f33008h, si0Var.f33008h) && n51.f.a(java.lang.Long.valueOf(this.f33009i), java.lang.Long.valueOf(si0Var.f33009i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.si0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33010m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33004d);
            }
            r45.cu5 cu5Var = this.f33005e;
            if (cu5Var != null && zArr[2]) {
                fVar.i(2, cu5Var.computeSize());
                this.f33005e.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f33006f;
            if (cu5Var2 != null && zArr[3]) {
                fVar.i(3, cu5Var2.computeSize());
                this.f33006f.writeFields(fVar);
            }
            r45.cu5 cu5Var3 = this.f33007g;
            if (cu5Var3 != null && zArr[4]) {
                fVar.i(4, cu5Var3.computeSize());
                this.f33007g.writeFields(fVar);
            }
            r45.cu5 cu5Var4 = this.f33008h;
            if (cu5Var4 != null && zArr[5]) {
                fVar.i(5, cu5Var4.computeSize());
                this.f33008h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.h(6, this.f33009i);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33004d) : 0;
            r45.cu5 cu5Var5 = this.f33005e;
            if (cu5Var5 != null && zArr[2]) {
                e17 += b36.f.i(2, cu5Var5.computeSize());
            }
            r45.cu5 cu5Var6 = this.f33006f;
            if (cu5Var6 != null && zArr[3]) {
                e17 += b36.f.i(3, cu5Var6.computeSize());
            }
            r45.cu5 cu5Var7 = this.f33007g;
            if (cu5Var7 != null && zArr[4]) {
                e17 += b36.f.i(4, cu5Var7.computeSize());
            }
            r45.cu5 cu5Var8 = this.f33008h;
            if (cu5Var8 != null && zArr[5]) {
                e17 += b36.f.i(5, cu5Var8.computeSize());
            }
            return zArr[6] ? e17 + b36.f.h(6, this.f33009i) : e17;
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
                this.f33004d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr != null && bArr.length > 0) {
                        cu5Var9.b(bArr);
                    }
                    this.f33005e = cu5Var9;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var10.b(bArr2);
                    }
                    this.f33006f = cu5Var10;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr3 != null && bArr3.length > 0) {
                        cu5Var11.b(bArr3);
                    }
                    this.f33007g = cu5Var11;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var12.b(bArr4);
                    }
                    this.f33008h = cu5Var12;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f33009i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
