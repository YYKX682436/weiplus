package bw5;

/* loaded from: classes8.dex */
public class k70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f29272d;

    /* renamed from: e, reason: collision with root package name */
    public int f29273e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f29274f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29275g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29276h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29277i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.xa0 f29278m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f29279n = new boolean[14];

    static {
        new bw5.k70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.k70 parseFrom(byte[] bArr) {
        return (bw5.k70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.k70)) {
            return false;
        }
        bw5.k70 k70Var = (bw5.k70) fVar;
        return n51.f.a(this.f29272d, k70Var.f29272d) && n51.f.a(java.lang.Integer.valueOf(this.f29273e), java.lang.Integer.valueOf(k70Var.f29273e)) && n51.f.a(this.f29274f, k70Var.f29274f) && n51.f.a(java.lang.Boolean.valueOf(this.f29275g), java.lang.Boolean.valueOf(k70Var.f29275g)) && n51.f.a(java.lang.Boolean.valueOf(this.f29276h), java.lang.Boolean.valueOf(k70Var.f29276h)) && n51.f.a(java.lang.Boolean.valueOf(this.f29277i), java.lang.Boolean.valueOf(k70Var.f29277i)) && n51.f.a(this.f29278m, k70Var.f29278m);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.k70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f29279n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f29272d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f29273e);
            }
            java.lang.String str2 = this.f29274f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[5]) {
                fVar.a(5, this.f29275g);
            }
            if (zArr[11]) {
                fVar.a(11, this.f29276h);
            }
            if (zArr[12]) {
                fVar.a(12, this.f29277i);
            }
            bw5.xa0 xa0Var = this.f29278m;
            if (xa0Var != null && zArr[13]) {
                fVar.i(13, xa0Var.computeSize());
                this.f29278m.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f29272d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f29273e);
            }
            java.lang.String str4 = this.f29274f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            if (zArr[5]) {
                i18 += b36.f.a(5, this.f29275g);
            }
            if (zArr[11]) {
                i18 += b36.f.a(11, this.f29276h);
            }
            if (zArr[12]) {
                i18 += b36.f.a(12, this.f29277i);
            }
            bw5.xa0 xa0Var2 = this.f29278m;
            return (xa0Var2 == null || !zArr[13]) ? i18 : i18 + b36.f.i(13, xa0Var2.computeSize());
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
        if (intValue == 1) {
            this.f29272d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f29273e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f29274f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 5) {
            this.f29275g = aVar2.c(intValue);
            zArr[5] = true;
            return 0;
        }
        switch (intValue) {
            case 11:
                this.f29276h = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29277i = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.xa0 xa0Var3 = new bw5.xa0();
                    if (bArr != null && bArr.length > 0) {
                        xa0Var3.parseFrom(bArr);
                    }
                    this.f29278m = xa0Var3;
                }
                zArr[13] = true;
                return 0;
            default:
                return -1;
        }
    }
}
