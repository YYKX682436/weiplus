package bw5;

/* loaded from: classes7.dex */
public class ud0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ie f33849d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wd0 f33850e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.zd0 f33851f;

    /* renamed from: g, reason: collision with root package name */
    public long f33852g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33853h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.n20 f33854i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33855m = new boolean[7];

    static {
        new bw5.ud0();
    }

    public bw5.wd0 b() {
        return this.f33855m[2] ? this.f33850e : new bw5.wd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ud0 parseFrom(byte[] bArr) {
        return (bw5.ud0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ud0)) {
            return false;
        }
        bw5.ud0 ud0Var = (bw5.ud0) fVar;
        return n51.f.a(this.f33849d, ud0Var.f33849d) && n51.f.a(this.f33850e, ud0Var.f33850e) && n51.f.a(this.f33851f, ud0Var.f33851f) && n51.f.a(java.lang.Long.valueOf(this.f33852g), java.lang.Long.valueOf(ud0Var.f33852g)) && n51.f.a(this.f33853h, ud0Var.f33853h) && n51.f.a(this.f33854i, ud0Var.f33854i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ud0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33855m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f33849d;
            if (ieVar != null && zArr[1]) {
                fVar.i(1, ieVar.computeSize());
                this.f33849d.writeFields(fVar);
            }
            bw5.wd0 wd0Var = this.f33850e;
            if (wd0Var != null && zArr[2]) {
                fVar.i(2, wd0Var.computeSize());
                this.f33850e.writeFields(fVar);
            }
            bw5.zd0 zd0Var = this.f33851f;
            if (zd0Var != null && zArr[3]) {
                fVar.i(3, zd0Var.computeSize());
                this.f33851f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f33852g);
            }
            java.lang.String str = this.f33853h;
            if (str != null && zArr[5]) {
                fVar.j(5, str);
            }
            bw5.n20 n20Var = this.f33854i;
            if (n20Var != null && zArr[6]) {
                fVar.i(6, n20Var.computeSize());
                this.f33854i.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f33849d;
            if (ieVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, ieVar2.computeSize());
            }
            bw5.wd0 wd0Var2 = this.f33850e;
            if (wd0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, wd0Var2.computeSize());
            }
            bw5.zd0 zd0Var2 = this.f33851f;
            if (zd0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, zd0Var2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f33852g);
            }
            java.lang.String str2 = this.f33853h;
            if (str2 != null && zArr[5]) {
                i18 += b36.f.j(5, str2);
            }
            bw5.n20 n20Var2 = this.f33854i;
            return (n20Var2 == null || !zArr[6]) ? i18 : i18 + b36.f.i(6, n20Var2.computeSize());
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
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.parseFrom(bArr);
                    }
                    this.f33849d = ieVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.wd0 wd0Var3 = new bw5.wd0();
                    if (bArr2 != null && bArr2.length > 0) {
                        wd0Var3.parseFrom(bArr2);
                    }
                    this.f33850e = wd0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.zd0 zd0Var3 = new bw5.zd0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zd0Var3.parseFrom(bArr3);
                    }
                    this.f33851f = zd0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f33852g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33853h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.n20 n20Var3 = new bw5.n20();
                    if (bArr4 != null && bArr4.length > 0) {
                        n20Var3.parseFrom(bArr4);
                    }
                    this.f33854i = n20Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
