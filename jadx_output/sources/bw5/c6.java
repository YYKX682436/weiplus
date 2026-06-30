package bw5;

/* loaded from: classes8.dex */
public class c6 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25937d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f25938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f25939f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f25940g;

    /* renamed from: h, reason: collision with root package name */
    public int f25941h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f25942i = new boolean[6];

    static {
        new bw5.c6();
    }

    public bw5.x7 b() {
        return this.f25942i[2] ? this.f25938e : new bw5.x7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.c6 parseFrom(byte[] bArr) {
        return (bw5.c6) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.c6)) {
            return false;
        }
        bw5.c6 c6Var = (bw5.c6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25937d), java.lang.Integer.valueOf(c6Var.f25937d)) && n51.f.a(this.f25938e, c6Var.f25938e) && n51.f.a(java.lang.Boolean.valueOf(this.f25939f), java.lang.Boolean.valueOf(c6Var.f25939f)) && n51.f.a(this.f25940g, c6Var.f25940g) && n51.f.a(java.lang.Integer.valueOf(this.f25941h), java.lang.Integer.valueOf(c6Var.f25941h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.c6();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25942i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25937d);
            }
            bw5.x7 x7Var = this.f25938e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f25938e.writeFields(fVar);
            }
            if (zArr[3]) {
                fVar.a(3, this.f25939f);
            }
            java.lang.String str = this.f25940g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            if (zArr[5]) {
                fVar.e(5, this.f25941h);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25937d) : 0;
            bw5.x7 x7Var2 = this.f25938e;
            if (x7Var2 != null && zArr[2]) {
                e17 += b36.f.i(2, x7Var2.computeSize());
            }
            if (zArr[3]) {
                e17 += b36.f.a(3, this.f25939f);
            }
            java.lang.String str2 = this.f25940g;
            if (str2 != null && zArr[4]) {
                e17 += b36.f.j(4, str2);
            }
            return zArr[5] ? e17 + b36.f.e(5, this.f25941h) : e17;
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
            this.f25937d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f25939f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f25940g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f25941h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f25938e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
