package bw5;

/* loaded from: classes2.dex */
public class ya0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f35414d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35415e;

    /* renamed from: f, reason: collision with root package name */
    public int f35416f;

    /* renamed from: g, reason: collision with root package name */
    public int f35417g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35418h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35419i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e80 f35420m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f35421n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f35422o = new boolean[9];

    static {
        new bw5.ya0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ya0 parseFrom(byte[] bArr) {
        return (bw5.ya0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ya0)) {
            return false;
        }
        bw5.ya0 ya0Var = (bw5.ya0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f35414d), java.lang.Integer.valueOf(ya0Var.f35414d)) && n51.f.a(this.f35415e, ya0Var.f35415e) && n51.f.a(java.lang.Integer.valueOf(this.f35416f), java.lang.Integer.valueOf(ya0Var.f35416f)) && n51.f.a(java.lang.Integer.valueOf(this.f35417g), java.lang.Integer.valueOf(ya0Var.f35417g)) && n51.f.a(this.f35418h, ya0Var.f35418h) && n51.f.a(this.f35419i, ya0Var.f35419i) && n51.f.a(this.f35420m, ya0Var.f35420m) && n51.f.a(this.f35421n, ya0Var.f35421n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ya0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35422o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f35414d);
            }
            java.lang.String str = this.f35415e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            if (zArr[3]) {
                fVar.e(3, this.f35416f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35417g);
            }
            java.lang.String str2 = this.f35418h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f35419i;
            if (str3 != null && zArr[6]) {
                fVar.j(6, str3);
            }
            bw5.e80 e80Var = this.f35420m;
            if (e80Var != null && zArr[7]) {
                fVar.i(7, e80Var.computeSize());
                this.f35420m.writeFields(fVar);
            }
            java.lang.String str4 = this.f35421n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f35414d) : 0;
            java.lang.String str5 = this.f35415e;
            if (str5 != null && zArr[2]) {
                e17 += b36.f.j(2, str5);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f35416f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f35417g);
            }
            java.lang.String str6 = this.f35418h;
            if (str6 != null && zArr[5]) {
                e17 += b36.f.j(5, str6);
            }
            java.lang.String str7 = this.f35419i;
            if (str7 != null && zArr[6]) {
                e17 += b36.f.j(6, str7);
            }
            bw5.e80 e80Var2 = this.f35420m;
            if (e80Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, e80Var2.computeSize());
            }
            java.lang.String str8 = this.f35421n;
            return (str8 == null || !zArr[8]) ? e17 : e17 + b36.f.j(8, str8);
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
                this.f35414d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35415e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f35416f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f35417g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35418h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35419i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.e80 e80Var3 = new bw5.e80();
                    if (bArr != null && bArr.length > 0) {
                        e80Var3.parseFrom(bArr);
                    }
                    this.f35420m = e80Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f35421n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
