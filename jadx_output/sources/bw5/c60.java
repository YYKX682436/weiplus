package bw5;

/* loaded from: classes2.dex */
public class c60 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25943d;

    /* renamed from: e, reason: collision with root package name */
    public int f25944e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25945f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25946g;

    /* renamed from: h, reason: collision with root package name */
    public long f25947h;

    /* renamed from: i, reason: collision with root package name */
    public int f25948i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f25949m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25950n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.m80 f25951o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f25952p = new boolean[10];

    static {
        new bw5.c60();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.c60 parseFrom(byte[] bArr) {
        return (bw5.c60) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c60)) {
            return false;
        }
        bw5.c60 c60Var = (bw5.c60) fVar;
        return n51.f.a(this.f25943d, c60Var.f25943d) && n51.f.a(java.lang.Integer.valueOf(this.f25944e), java.lang.Integer.valueOf(c60Var.f25944e)) && n51.f.a(this.f25945f, c60Var.f25945f) && n51.f.a(this.f25946g, c60Var.f25946g) && n51.f.a(java.lang.Long.valueOf(this.f25947h), java.lang.Long.valueOf(c60Var.f25947h)) && n51.f.a(java.lang.Integer.valueOf(this.f25948i), java.lang.Integer.valueOf(c60Var.f25948i)) && n51.f.a(this.f25949m, c60Var.f25949m) && n51.f.a(this.f25950n, c60Var.f25950n) && n51.f.a(this.f25951o, c60Var.f25951o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c60();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25952p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25943d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25944e);
            }
            com.tencent.mm.protobuf.g gVar = this.f25945f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            java.lang.String str2 = this.f25946g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25947h);
            }
            if (zArr[6]) {
                fVar.e(6, this.f25948i);
            }
            java.lang.String str3 = this.f25949m;
            if (str3 != null && zArr[7]) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f25950n;
            if (str4 != null && zArr[8]) {
                fVar.j(8, str4);
            }
            bw5.m80 m80Var = this.f25951o;
            if (m80Var != null && zArr[9]) {
                fVar.i(9, m80Var.computeSize());
                this.f25951o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f25943d;
            if (str5 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str5);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f25944e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25945f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            java.lang.String str6 = this.f25946g;
            if (str6 != null && zArr[4]) {
                i18 += b36.f.j(4, str6);
            }
            if (zArr[5]) {
                i18 += b36.f.h(5, this.f25947h);
            }
            if (zArr[6]) {
                i18 += b36.f.e(6, this.f25948i);
            }
            java.lang.String str7 = this.f25949m;
            if (str7 != null && zArr[7]) {
                i18 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f25950n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            bw5.m80 m80Var2 = this.f25951o;
            return (m80Var2 == null || !zArr[9]) ? i18 : i18 + b36.f.i(9, m80Var2.computeSize());
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
                this.f25943d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25944e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25945f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25946g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25947h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25948i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25949m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25950n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.m80 m80Var3 = new bw5.m80();
                    if (bArr != null && bArr.length > 0) {
                        m80Var3.parseFrom(bArr);
                    }
                    this.f25951o = m80Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
