package bw5;

/* loaded from: classes2.dex */
public class p80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31493d;

    /* renamed from: e, reason: collision with root package name */
    public long f31494e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31495f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f31496g;

    /* renamed from: h, reason: collision with root package name */
    public long f31497h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31498i;

    /* renamed from: m, reason: collision with root package name */
    public long f31499m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.o80 f31500n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f31501o = new boolean[9];

    static {
        new bw5.p80();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p80)) {
            return false;
        }
        bw5.p80 p80Var = (bw5.p80) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31493d), java.lang.Integer.valueOf(p80Var.f31493d)) && n51.f.a(java.lang.Long.valueOf(this.f31494e), java.lang.Long.valueOf(p80Var.f31494e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31495f), java.lang.Boolean.valueOf(p80Var.f31495f)) && n51.f.a(this.f31496g, p80Var.f31496g) && n51.f.a(java.lang.Long.valueOf(this.f31497h), java.lang.Long.valueOf(p80Var.f31497h)) && n51.f.a(java.lang.Boolean.valueOf(this.f31498i), java.lang.Boolean.valueOf(p80Var.f31498i)) && n51.f.a(java.lang.Long.valueOf(this.f31499m), java.lang.Long.valueOf(p80Var.f31499m)) && n51.f.a(this.f31500n, p80Var.f31500n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31501o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31493d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31494e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31495f);
            }
            java.lang.String str = this.f31496g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.h(5, this.f31497h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f31498i);
            }
            if (zArr[7]) {
                fVar.h(7, this.f31499m);
            }
            bw5.o80 o80Var = this.f31500n;
            if (o80Var != null && zArr[8]) {
                fVar.i(8, o80Var.computeSize());
                this.f31500n.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f31493d) : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f31494e);
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f31495f);
            }
            java.lang.String str2 = this.f31496g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f31497h);
            }
            if (zArr[6]) {
                e17 += b36.f.a(6, this.f31498i);
            }
            if (zArr[7]) {
                e17 += b36.f.h(7, this.f31499m);
            }
            bw5.o80 o80Var2 = this.f31500n;
            return (o80Var2 == null || !zArr[8]) ? e17 : e17 + b36.f.i(8, o80Var2.computeSize());
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
                this.f31493d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31494e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f31495f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31496g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f31497h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f31498i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31499m = aVar2.i(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.o80 o80Var3 = new bw5.o80();
                    if (bArr != null && bArr.length > 0) {
                        o80Var3.parseFrom(bArr);
                    }
                    this.f31500n = o80Var3;
                }
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.p80) super.parseFrom(bArr);
    }
}
