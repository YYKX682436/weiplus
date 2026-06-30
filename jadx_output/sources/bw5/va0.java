package bw5;

/* loaded from: classes2.dex */
public class va0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f34260d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f34261e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f34262f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f34263g;

    /* renamed from: h, reason: collision with root package name */
    public long f34264h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mc0 f34265i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f34266m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f34267n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f34268o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f34269p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f34270q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f34271r = new boolean[12];

    static {
        new bw5.va0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.va0 parseFrom(byte[] bArr) {
        return (bw5.va0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.va0)) {
            return false;
        }
        bw5.va0 va0Var = (bw5.va0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f34260d), java.lang.Long.valueOf(va0Var.f34260d)) && n51.f.a(this.f34261e, va0Var.f34261e) && n51.f.a(this.f34262f, va0Var.f34262f) && n51.f.a(this.f34263g, va0Var.f34263g) && n51.f.a(java.lang.Long.valueOf(this.f34264h), java.lang.Long.valueOf(va0Var.f34264h)) && n51.f.a(this.f34265i, va0Var.f34265i) && n51.f.a(java.lang.Boolean.valueOf(this.f34266m), java.lang.Boolean.valueOf(va0Var.f34266m)) && n51.f.a(this.f34267n, va0Var.f34267n) && n51.f.a(this.f34268o, va0Var.f34268o) && n51.f.a(java.lang.Boolean.valueOf(this.f34269p), java.lang.Boolean.valueOf(va0Var.f34269p)) && n51.f.a(this.f34270q, va0Var.f34270q);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.va0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34271r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f34260d);
            }
            java.lang.String str = this.f34261e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f34262f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f34263g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.h(5, this.f34264h);
            }
            bw5.mc0 mc0Var = this.f34265i;
            if (mc0Var != null && zArr[6]) {
                fVar.i(6, mc0Var.computeSize());
                this.f34265i.writeFields(fVar);
            }
            if (zArr[7]) {
                fVar.a(7, this.f34266m);
            }
            java.lang.String str4 = this.f34267n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            java.lang.String str5 = this.f34268o;
            if (str5 != null && zArr[9]) {
                fVar.j(9, str5);
            }
            if (zArr[10]) {
                fVar.a(10, this.f34269p);
            }
            java.lang.String str6 = this.f34270q;
            if (str6 != null && zArr[11]) {
                fVar.j(11, str6);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f34260d) : 0;
            java.lang.String str7 = this.f34261e;
            if (str7 != null && zArr[2]) {
                h17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f34262f;
            if (str8 != null && zArr[3]) {
                h17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f34263g;
            if (str9 != null && zArr[4]) {
                h17 += b36.f.j(4, str9);
            }
            if (zArr[5]) {
                h17 += b36.f.h(5, this.f34264h);
            }
            bw5.mc0 mc0Var2 = this.f34265i;
            if (mc0Var2 != null && zArr[6]) {
                h17 += b36.f.i(6, mc0Var2.computeSize());
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f34266m);
            }
            java.lang.String str10 = this.f34267n;
            if (str10 != null && zArr[8]) {
                h17 += b36.f.j(8, str10);
            }
            java.lang.String str11 = this.f34268o;
            if (str11 != null && zArr[9]) {
                h17 += b36.f.j(9, str11);
            }
            if (zArr[10]) {
                h17 += b36.f.a(10, this.f34269p);
            }
            java.lang.String str12 = this.f34270q;
            return (str12 == null || !zArr[11]) ? h17 : h17 + b36.f.j(11, str12);
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
                this.f34260d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f34261e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f34262f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f34263g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f34264h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f34265i = mc0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f34266m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f34267n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f34268o = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f34269p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f34270q = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
