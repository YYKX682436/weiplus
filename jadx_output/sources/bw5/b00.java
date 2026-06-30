package bw5;

/* loaded from: classes2.dex */
public class b00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25471d;

    /* renamed from: e, reason: collision with root package name */
    public long f25472e;

    /* renamed from: f, reason: collision with root package name */
    public long f25473f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25474g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25475h = new boolean[5];

    static {
        new bw5.b00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.b00 parseFrom(byte[] bArr) {
        return (bw5.b00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.b00)) {
            return false;
        }
        bw5.b00 b00Var = (bw5.b00) fVar;
        return n51.f.a(this.f25471d, b00Var.f25471d) && n51.f.a(java.lang.Long.valueOf(this.f25472e), java.lang.Long.valueOf(b00Var.f25472e)) && n51.f.a(java.lang.Long.valueOf(this.f25473f), java.lang.Long.valueOf(b00Var.f25473f)) && n51.f.a(java.lang.Boolean.valueOf(this.f25474g), java.lang.Boolean.valueOf(b00Var.f25474g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.b00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f25475h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25471d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25472e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f25473f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f25474g);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f25471d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25472e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f25473f);
            }
            return zArr[4] ? i18 + b36.f.a(4, this.f25474g) : i18;
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
            this.f25471d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25472e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25473f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25474g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }
}
