package bw5;

/* loaded from: classes2.dex */
public class wc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34643d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34645f;

    /* renamed from: g, reason: collision with root package name */
    public int f34646g;

    /* renamed from: h, reason: collision with root package name */
    public long f34647h;

    /* renamed from: i, reason: collision with root package name */
    public int f34648i;

    /* renamed from: m, reason: collision with root package name */
    public int f34649m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34650n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34651o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.pi0 f34652p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f34653q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f34654r;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f34644e = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f34655s = new boolean[13];

    static {
        new bw5.wc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.wc0 parseFrom(byte[] bArr) {
        return (bw5.wc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wc0)) {
            return false;
        }
        bw5.wc0 wc0Var = (bw5.wc0) fVar;
        return n51.f.a(this.f34643d, wc0Var.f34643d) && n51.f.a(this.f34644e, wc0Var.f34644e) && n51.f.a(this.f34645f, wc0Var.f34645f) && n51.f.a(java.lang.Integer.valueOf(this.f34646g), java.lang.Integer.valueOf(wc0Var.f34646g)) && n51.f.a(java.lang.Long.valueOf(this.f34647h), java.lang.Long.valueOf(wc0Var.f34647h)) && n51.f.a(java.lang.Integer.valueOf(this.f34648i), java.lang.Integer.valueOf(wc0Var.f34648i)) && n51.f.a(java.lang.Integer.valueOf(this.f34649m), java.lang.Integer.valueOf(wc0Var.f34649m)) && n51.f.a(this.f34650n, wc0Var.f34650n) && n51.f.a(this.f34651o, wc0Var.f34651o) && n51.f.a(this.f34652p, wc0Var.f34652p) && n51.f.a(this.f34653q, wc0Var.f34653q) && n51.f.a(java.lang.Boolean.valueOf(this.f34654r), java.lang.Boolean.valueOf(wc0Var.f34654r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34655s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34643d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f34644e);
            java.lang.String str2 = this.f34645f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34646g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34647h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f34648i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f34649m);
            }
            java.lang.String str3 = this.f34650n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f34651o;
            if (str4 != null && zArr[9]) {
                fVar.j(9, str4);
            }
            bw5.pi0 pi0Var = this.f34652p;
            if (pi0Var != null && zArr[10]) {
                fVar.i(10, pi0Var.computeSize());
                this.f34652p.writeFields(fVar);
            }
            java.lang.String str5 = this.f34653q;
            if (str5 != null && zArr[11]) {
                fVar.j(11, str5);
            }
            if (!zArr[12]) {
                return 0;
            }
            fVar.a(12, this.f34654r);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f34643d;
            int j17 = ((str6 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str6)) + b36.f.g(2, 8, this.f34644e);
            java.lang.String str7 = this.f34645f;
            if (str7 != null && zArr[3]) {
                j17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f34646g);
            }
            if (zArr[5]) {
                j17 += b36.f.h(5, this.f34647h);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f34648i);
            }
            if (zArr[7]) {
                j17 += b36.f.e(7, this.f34649m);
            }
            java.lang.String str8 = this.f34650n;
            if (str8 != null && zArr[8]) {
                j17 += b36.f.j(8, str8);
            }
            java.lang.String str9 = this.f34651o;
            if (str9 != null && zArr[9]) {
                j17 += b36.f.j(9, str9);
            }
            bw5.pi0 pi0Var2 = this.f34652p;
            if (pi0Var2 != null && zArr[10]) {
                j17 += b36.f.i(10, pi0Var2.computeSize());
            }
            java.lang.String str10 = this.f34653q;
            if (str10 != null && zArr[11]) {
                j17 += b36.f.j(11, str10);
            }
            return zArr[12] ? j17 + b36.f.a(12, this.f34654r) : j17;
        }
        if (i17 == 2) {
            this.f34644e.clear();
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
                this.f34643d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.zc0 zc0Var = new bw5.zc0();
                    if (bArr != null && bArr.length > 0) {
                        zc0Var.parseFrom(bArr);
                    }
                    this.f34644e.add(zc0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f34645f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34646g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34647h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f34648i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f34649m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34650n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34651o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    bw5.pi0 pi0Var3 = new bw5.pi0();
                    if (bArr2 != null && bArr2.length > 0) {
                        pi0Var3.parseFrom(bArr2);
                    }
                    this.f34652p = pi0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f34653q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f34654r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
