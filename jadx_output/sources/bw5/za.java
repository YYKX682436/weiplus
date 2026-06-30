package bw5;

/* loaded from: classes7.dex */
public class za extends com.tencent.mm.protobuf.f {

    /* renamed from: o, reason: collision with root package name */
    public static final bw5.za f35907o = new bw5.za();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f35908d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f35909e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.f5 f35910f;

    /* renamed from: g, reason: collision with root package name */
    public int f35911g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35912h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f35913i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.ge0 f35914m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f35915n = new boolean[8];

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.za parseFrom(byte[] bArr) {
        return (bw5.za) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.za)) {
            return false;
        }
        bw5.za zaVar = (bw5.za) fVar;
        return n51.f.a(this.f35908d, zaVar.f35908d) && n51.f.a(this.f35909e, zaVar.f35909e) && n51.f.a(this.f35910f, zaVar.f35910f) && n51.f.a(java.lang.Integer.valueOf(this.f35911g), java.lang.Integer.valueOf(zaVar.f35911g)) && n51.f.a(this.f35912h, zaVar.f35912h) && n51.f.a(this.f35913i, zaVar.f35913i) && n51.f.a(this.f35914m, zaVar.f35914m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.za();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        bw5.f5 f5Var;
        int i18 = 0;
        boolean[] zArr = this.f35915n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f35908d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f35909e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.f5 f5Var2 = this.f35910f;
            if (f5Var2 != null && zArr[3]) {
                fVar.e(3, f5Var2.f27156d);
            }
            if (zArr[4]) {
                fVar.e(4, this.f35911g);
            }
            java.lang.String str3 = this.f35912h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f35913i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.ge0 ge0Var = this.f35914m;
            if (ge0Var != null && zArr[7]) {
                fVar.i(7, ge0Var.computeSize());
                this.f35914m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f35908d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            java.lang.String str6 = this.f35909e;
            if (str6 != null && zArr[2]) {
                i18 += b36.f.j(2, str6);
            }
            bw5.f5 f5Var3 = this.f35910f;
            if (f5Var3 != null && zArr[3]) {
                i18 += b36.f.e(3, f5Var3.f27156d);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f35911g);
            }
            java.lang.String str7 = this.f35912h;
            if (str7 != null && zArr[5]) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f35913i;
            if (str8 != null && zArr[6]) {
                i18 += b36.f.j(6, str8);
            }
            bw5.ge0 ge0Var2 = this.f35914m;
            return (ge0Var2 == null || !zArr[7]) ? i18 : i18 + b36.f.i(7, ge0Var2.computeSize());
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
                this.f35908d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f35909e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                switch (aVar2.g(intValue)) {
                    case 0:
                        f5Var = bw5.f5.UnknownPlatform;
                        break;
                    case 1:
                        f5Var = bw5.f5.iOS;
                        break;
                    case 2:
                        f5Var = bw5.f5.Android;
                        break;
                    case 3:
                        f5Var = bw5.f5.OHOS;
                        break;
                    case 4:
                        f5Var = bw5.f5.Mac;
                        break;
                    case 5:
                        f5Var = bw5.f5.Windows;
                        break;
                    case 6:
                        f5Var = bw5.f5.Linux;
                        break;
                    case 7:
                        f5Var = bw5.f5.OHOS_PC;
                        break;
                    default:
                        f5Var = null;
                        break;
                }
                this.f35910f = f5Var;
                zArr[3] = true;
                return 0;
            case 4:
                this.f35911g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f35912h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f35913i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ge0 ge0Var3 = new bw5.ge0();
                    if (bArr != null && bArr.length > 0) {
                        ge0Var3.parseFrom(bArr);
                    }
                    this.f35914m = ge0Var3;
                }
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }
}
