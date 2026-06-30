package bw5;

/* loaded from: classes4.dex */
public class sd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a3 f32920d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.a3 f32921e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.a3 f32922f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f32923g;

    /* renamed from: h, reason: collision with root package name */
    public r45.cu5 f32924h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.a3 f32925i;

    /* renamed from: m, reason: collision with root package name */
    public int f32926m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.z2 f32927n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.z2 f32928o;

    /* renamed from: p, reason: collision with root package name */
    public int f32929p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f32930q = new boolean[12];

    static {
        new bw5.sd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.sd0 parseFrom(byte[] bArr) {
        return (bw5.sd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.sd0)) {
            return false;
        }
        bw5.sd0 sd0Var = (bw5.sd0) fVar;
        return n51.f.a(this.f32920d, sd0Var.f32920d) && n51.f.a(this.f32921e, sd0Var.f32921e) && n51.f.a(this.f32922f, sd0Var.f32922f) && n51.f.a(this.f32923g, sd0Var.f32923g) && n51.f.a(this.f32924h, sd0Var.f32924h) && n51.f.a(this.f32925i, sd0Var.f32925i) && n51.f.a(java.lang.Integer.valueOf(this.f32926m), java.lang.Integer.valueOf(sd0Var.f32926m)) && n51.f.a(this.f32927n, sd0Var.f32927n) && n51.f.a(this.f32928o, sd0Var.f32928o) && n51.f.a(java.lang.Integer.valueOf(this.f32929p), java.lang.Integer.valueOf(sd0Var.f32929p));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.sd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32930q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.a3 a3Var = this.f32920d;
            if (a3Var != null && zArr[1]) {
                fVar.i(1, a3Var.computeSize());
                this.f32920d.writeFields(fVar);
            }
            bw5.a3 a3Var2 = this.f32921e;
            if (a3Var2 != null && zArr[2]) {
                fVar.i(2, a3Var2.computeSize());
                this.f32921e.writeFields(fVar);
            }
            bw5.a3 a3Var3 = this.f32922f;
            if (a3Var3 != null && zArr[4]) {
                fVar.i(4, a3Var3.computeSize());
                this.f32922f.writeFields(fVar);
            }
            r45.cu5 cu5Var = this.f32923g;
            if (cu5Var != null && zArr[5]) {
                fVar.i(5, cu5Var.computeSize());
                this.f32923g.writeFields(fVar);
            }
            r45.cu5 cu5Var2 = this.f32924h;
            if (cu5Var2 != null && zArr[6]) {
                fVar.i(6, cu5Var2.computeSize());
                this.f32924h.writeFields(fVar);
            }
            bw5.a3 a3Var4 = this.f32925i;
            if (a3Var4 != null && zArr[7]) {
                fVar.i(7, a3Var4.computeSize());
                this.f32925i.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f32926m);
            }
            bw5.z2 z2Var = this.f32927n;
            if (z2Var != null && zArr[9]) {
                fVar.i(9, z2Var.computeSize());
                this.f32927n.writeFields(fVar);
            }
            bw5.z2 z2Var2 = this.f32928o;
            if (z2Var2 != null && zArr[10]) {
                fVar.i(10, z2Var2.computeSize());
                this.f32928o.writeFields(fVar);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32929p);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.a3 a3Var5 = this.f32920d;
            if (a3Var5 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, a3Var5.computeSize());
            }
            bw5.a3 a3Var6 = this.f32921e;
            if (a3Var6 != null && zArr[2]) {
                i18 += b36.f.i(2, a3Var6.computeSize());
            }
            bw5.a3 a3Var7 = this.f32922f;
            if (a3Var7 != null && zArr[4]) {
                i18 += b36.f.i(4, a3Var7.computeSize());
            }
            r45.cu5 cu5Var3 = this.f32923g;
            if (cu5Var3 != null && zArr[5]) {
                i18 += b36.f.i(5, cu5Var3.computeSize());
            }
            r45.cu5 cu5Var4 = this.f32924h;
            if (cu5Var4 != null && zArr[6]) {
                i18 += b36.f.i(6, cu5Var4.computeSize());
            }
            bw5.a3 a3Var8 = this.f32925i;
            if (a3Var8 != null && zArr[7]) {
                i18 += b36.f.i(7, a3Var8.computeSize());
            }
            if (zArr[8]) {
                i18 += b36.f.e(8, this.f32926m);
            }
            bw5.z2 z2Var3 = this.f32927n;
            if (z2Var3 != null && zArr[9]) {
                i18 += b36.f.i(9, z2Var3.computeSize());
            }
            bw5.z2 z2Var4 = this.f32928o;
            if (z2Var4 != null && zArr[10]) {
                i18 += b36.f.i(10, z2Var4.computeSize());
            }
            return zArr[11] ? i18 + b36.f.e(11, this.f32929p) : i18;
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.a3 a3Var9 = new bw5.a3();
                    if (bArr != null && bArr.length > 0) {
                        a3Var9.parseFrom(bArr);
                    }
                    this.f32920d = a3Var9;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.a3 a3Var10 = new bw5.a3();
                    if (bArr2 != null && bArr2.length > 0) {
                        a3Var10.parseFrom(bArr2);
                    }
                    this.f32921e = a3Var10;
                }
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.a3 a3Var11 = new bw5.a3();
                    if (bArr3 != null && bArr3.length > 0) {
                        a3Var11.parseFrom(bArr3);
                    }
                    this.f32922f = a3Var11;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var5.b(bArr4);
                    }
                    this.f32923g = cu5Var5;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var6.b(bArr5);
                    }
                    this.f32924h = cu5Var6;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.a3 a3Var12 = new bw5.a3();
                    if (bArr6 != null && bArr6.length > 0) {
                        a3Var12.parseFrom(bArr6);
                    }
                    this.f32925i = a3Var12;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f32926m = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.z2 z2Var5 = new bw5.z2();
                    if (bArr7 != null && bArr7.length > 0) {
                        z2Var5.parseFrom(bArr7);
                    }
                    this.f32927n = z2Var5;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    bw5.z2 z2Var6 = new bw5.z2();
                    if (bArr8 != null && bArr8.length > 0) {
                        z2Var6.parseFrom(bArr8);
                    }
                    this.f32928o = z2Var6;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f32929p = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
