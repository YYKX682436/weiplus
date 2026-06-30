package bw5;

/* loaded from: classes2.dex */
public class m50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f30082d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30084f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f30085g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30086h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f30087i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.l50 f30088m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30089n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f30090o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f30091p = new boolean[10];

    static {
        new bw5.m50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.m50 parseFrom(byte[] bArr) {
        return (bw5.m50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.m50)) {
            return false;
        }
        bw5.m50 m50Var = (bw5.m50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f30082d), java.lang.Integer.valueOf(m50Var.f30082d)) && n51.f.a(this.f30083e, m50Var.f30083e) && n51.f.a(this.f30084f, m50Var.f30084f) && n51.f.a(java.lang.Boolean.valueOf(this.f30085g), java.lang.Boolean.valueOf(m50Var.f30085g)) && n51.f.a(this.f30086h, m50Var.f30086h) && n51.f.a(this.f30087i, m50Var.f30087i) && n51.f.a(this.f30088m, m50Var.f30088m) && n51.f.a(java.lang.Boolean.valueOf(this.f30089n), java.lang.Boolean.valueOf(m50Var.f30089n)) && n51.f.a(this.f30090o, m50Var.f30090o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.m50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30091p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f30082d);
            }
            java.lang.String str = this.f30083e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f30084f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.a(4, this.f30085g);
            }
            java.lang.String str3 = this.f30086h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f30087i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            bw5.l50 l50Var = this.f30088m;
            if (l50Var != null && zArr[7]) {
                fVar.i(7, l50Var.computeSize());
                this.f30088m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.a(8, this.f30089n);
            }
            java.lang.String str5 = this.f30090o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f30082d) : 0;
            java.lang.String str6 = this.f30083e;
            if (str6 != null && zArr[2]) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f30084f;
            if (str7 != null && zArr[3]) {
                e17 += b36.f.j(3, str7);
            }
            if (zArr[4]) {
                e17 += b36.f.a(4, this.f30085g);
            }
            java.lang.String str8 = this.f30086h;
            if (str8 != null && zArr[5]) {
                e17 += b36.f.j(5, str8);
            }
            java.lang.String str9 = this.f30087i;
            if (str9 != null && zArr[6]) {
                e17 += b36.f.j(6, str9);
            }
            bw5.l50 l50Var2 = this.f30088m;
            if (l50Var2 != null && zArr[7]) {
                e17 += b36.f.i(7, l50Var2.computeSize());
            }
            if (zArr[8]) {
                e17 += b36.f.a(8, this.f30089n);
            }
            java.lang.String str10 = this.f30090o;
            return (str10 == null || !zArr[9]) ? e17 : e17 + b36.f.j(9, str10);
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
                this.f30082d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30083e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30084f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30085g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30086h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f30087i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.l50 l50Var3 = new bw5.l50();
                    if (bArr != null && bArr.length > 0) {
                        l50Var3.parseFrom(bArr);
                    }
                    this.f30088m = l50Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f30089n = aVar2.c(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f30090o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
