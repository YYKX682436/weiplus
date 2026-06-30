package bw5;

/* loaded from: classes4.dex */
public class rh0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32533d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f32534e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f32535f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f32536g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32537h;

    /* renamed from: i, reason: collision with root package name */
    public long f32538i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f32539m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f32540n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.vh0 f32541o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f32542p = new boolean[10];

    static {
        new bw5.rh0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rh0 parseFrom(byte[] bArr) {
        return (bw5.rh0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rh0)) {
            return false;
        }
        bw5.rh0 rh0Var = (bw5.rh0) fVar;
        return n51.f.a(this.f32533d, rh0Var.f32533d) && n51.f.a(this.f32534e, rh0Var.f32534e) && n51.f.a(this.f32535f, rh0Var.f32535f) && n51.f.a(this.f32536g, rh0Var.f32536g) && n51.f.a(this.f32537h, rh0Var.f32537h) && n51.f.a(java.lang.Long.valueOf(this.f32538i), java.lang.Long.valueOf(rh0Var.f32538i)) && n51.f.a(this.f32539m, rh0Var.f32539m) && n51.f.a(this.f32540n, rh0Var.f32540n) && n51.f.a(this.f32541o, rh0Var.f32541o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rh0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f32542p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32533d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f32534e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f32535f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f32536g;
            if (str4 != null && zArr[4]) {
                fVar.j(4, str4);
            }
            java.lang.String str5 = this.f32537h;
            if (str5 != null && zArr[5]) {
                fVar.j(5, str5);
            }
            if (zArr[6]) {
                fVar.h(6, this.f32538i);
            }
            java.lang.String str6 = this.f32539m;
            if (str6 != null && zArr[7]) {
                fVar.j(7, str6);
            }
            bw5.x7 x7Var = this.f32540n;
            if (x7Var != null && zArr[8]) {
                fVar.i(8, x7Var.computeSize());
                this.f32540n.writeFields(fVar);
            }
            bw5.vh0 vh0Var = this.f32541o;
            if (vh0Var != null && zArr[9]) {
                fVar.i(9, vh0Var.computeSize());
                this.f32541o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f32533d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f32534e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f32535f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            java.lang.String str10 = this.f32536g;
            if (str10 != null && zArr[4]) {
                i18 += b36.f.j(4, str10);
            }
            java.lang.String str11 = this.f32537h;
            if (str11 != null && zArr[5]) {
                i18 += b36.f.j(5, str11);
            }
            if (zArr[6]) {
                i18 += b36.f.h(6, this.f32538i);
            }
            java.lang.String str12 = this.f32539m;
            if (str12 != null && zArr[7]) {
                i18 += b36.f.j(7, str12);
            }
            bw5.x7 x7Var2 = this.f32540n;
            if (x7Var2 != null && zArr[8]) {
                i18 += b36.f.i(8, x7Var2.computeSize());
            }
            bw5.vh0 vh0Var2 = this.f32541o;
            return (vh0Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, vh0Var2.computeSize());
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
                this.f32533d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f32534e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32535f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32536g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32537h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f32538i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32539m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var3.parseFrom(bArr);
                    }
                    this.f32540n = x7Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.vh0 vh0Var3 = new bw5.vh0();
                    if (bArr2 != null && bArr2.length > 0) {
                        vh0Var3.parseFrom(bArr2);
                    }
                    this.f32541o = vh0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
