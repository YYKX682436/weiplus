package bw5;

/* loaded from: classes2.dex */
public class ob0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31035d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f31036e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31037f;

    /* renamed from: g, reason: collision with root package name */
    public long f31038g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.nb0 f31039h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31040i;

    /* renamed from: m, reason: collision with root package name */
    public int f31041m;

    /* renamed from: n, reason: collision with root package name */
    public int f31042n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f31043o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f31044p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f31045q = new boolean[16];

    static {
        new bw5.ob0();
    }

    public bw5.nb0 b() {
        return this.f31045q[7] ? this.f31039h : new bw5.nb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.ob0 parseFrom(byte[] bArr) {
        return (bw5.ob0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ob0)) {
            return false;
        }
        bw5.ob0 ob0Var = (bw5.ob0) fVar;
        return n51.f.a(this.f31035d, ob0Var.f31035d) && n51.f.a(this.f31036e, ob0Var.f31036e) && n51.f.a(this.f31037f, ob0Var.f31037f) && n51.f.a(java.lang.Long.valueOf(this.f31038g), java.lang.Long.valueOf(ob0Var.f31038g)) && n51.f.a(this.f31039h, ob0Var.f31039h) && n51.f.a(this.f31040i, ob0Var.f31040i) && n51.f.a(java.lang.Integer.valueOf(this.f31041m), java.lang.Integer.valueOf(ob0Var.f31041m)) && n51.f.a(java.lang.Integer.valueOf(this.f31042n), java.lang.Integer.valueOf(ob0Var.f31042n)) && n51.f.a(this.f31043o, ob0Var.f31043o) && n51.f.a(this.f31044p, ob0Var.f31044p);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ob0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f31045q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31035d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f31036e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f31037f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.h(4, this.f31038g);
            }
            bw5.nb0 nb0Var = this.f31039h;
            if (nb0Var != null && zArr[7]) {
                fVar.i(7, nb0Var.computeSize());
                this.f31039h.writeFields(fVar);
            }
            java.lang.String str4 = this.f31040i;
            if (str4 != null && zArr[10]) {
                fVar.j(10, str4);
            }
            if (zArr[11]) {
                fVar.e(11, this.f31041m);
            }
            if (zArr[12]) {
                fVar.e(12, this.f31042n);
            }
            java.lang.String str5 = this.f31043o;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            java.lang.String str6 = this.f31044p;
            if (str6 != null && zArr[15]) {
                fVar.j(15, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f31035d;
            if (str7 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str7);
            }
            java.lang.String str8 = this.f31036e;
            if (str8 != null && zArr[2]) {
                i18 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f31037f;
            if (str9 != null && zArr[3]) {
                i18 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f31038g);
            }
            bw5.nb0 nb0Var2 = this.f31039h;
            if (nb0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, nb0Var2.computeSize());
            }
            java.lang.String str10 = this.f31040i;
            if (str10 != null && zArr[10]) {
                i18 += b36.f.j(10, str10);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f31041m);
            }
            if (zArr[12]) {
                i18 += b36.f.e(12, this.f31042n);
            }
            java.lang.String str11 = this.f31043o;
            if (str11 != null && zArr[14]) {
                i18 += b36.f.j(14, str11);
            }
            java.lang.String str12 = this.f31044p;
            return (str12 == null || !zArr[15]) ? i18 : i18 + b36.f.j(15, str12);
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
                this.f31035d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31036e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31037f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31038g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 6:
            case 8:
            case 9:
            case 13:
            default:
                return -1;
            case 7:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.nb0 nb0Var3 = new bw5.nb0();
                    if (bArr != null && bArr.length > 0) {
                        nb0Var3.parseFrom(bArr);
                    }
                    this.f31039h = nb0Var3;
                }
                zArr[7] = true;
                return 0;
            case 10:
                this.f31040i = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f31041m = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f31042n = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 14:
                this.f31043o = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f31044p = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
        }
    }
}
