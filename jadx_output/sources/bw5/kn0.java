package bw5;

/* loaded from: classes4.dex */
public class kn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f29443e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29444f;

    /* renamed from: g, reason: collision with root package name */
    public int f29445g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29446h;

    /* renamed from: i, reason: collision with root package name */
    public int f29447i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f29448m = new boolean[7];

    static {
        new bw5.kn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.kn0 parseFrom(byte[] bArr) {
        return (bw5.kn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.kn0)) {
            return false;
        }
        bw5.kn0 kn0Var = (bw5.kn0) fVar;
        return n51.f.a(this.f29442d, kn0Var.f29442d) && n51.f.a(this.f29443e, kn0Var.f29443e) && n51.f.a(this.f29444f, kn0Var.f29444f) && n51.f.a(java.lang.Integer.valueOf(this.f29445g), java.lang.Integer.valueOf(kn0Var.f29445g)) && n51.f.a(java.lang.Boolean.valueOf(this.f29446h), java.lang.Boolean.valueOf(kn0Var.f29446h)) && n51.f.a(java.lang.Integer.valueOf(this.f29447i), java.lang.Integer.valueOf(kn0Var.f29447i));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.kn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29448m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29442d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f29443e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f29444f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29445g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f29446h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f29447i);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f29442d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f29443e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f29444f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f29445g);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f29446h);
            }
            return zArr[6] ? i18 + b36.f.e(6, this.f29447i) : i18;
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
                this.f29442d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29443e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29444f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29445g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29446h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29447i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
