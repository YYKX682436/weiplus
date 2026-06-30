package bw5;

/* loaded from: classes2.dex */
public class ji0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28987d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28988e;

    /* renamed from: f, reason: collision with root package name */
    public long f28989f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28990g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28991h = new boolean[5];

    static {
        new bw5.ji0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ji0 parseFrom(byte[] bArr) {
        return (bw5.ji0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ji0)) {
            return false;
        }
        bw5.ji0 ji0Var = (bw5.ji0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28987d), java.lang.Boolean.valueOf(ji0Var.f28987d)) && n51.f.a(java.lang.Boolean.valueOf(this.f28988e), java.lang.Boolean.valueOf(ji0Var.f28988e)) && n51.f.a(java.lang.Long.valueOf(this.f28989f), java.lang.Long.valueOf(ji0Var.f28989f)) && n51.f.a(this.f28990g, ji0Var.f28990g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ji0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28991h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28987d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f28988e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f28989f);
            }
            java.lang.String str = this.f28990g;
            if (str != null && zArr[4]) {
                fVar.j(4, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28987d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f28988e);
            }
            if (zArr[3]) {
                a17 += b36.f.h(3, this.f28989f);
            }
            java.lang.String str2 = this.f28990g;
            return (str2 == null || !zArr[4]) ? a17 : a17 + b36.f.j(4, str2);
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
            this.f28987d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28988e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28989f = aVar2.i(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28990g = aVar2.k(intValue);
        zArr[4] = true;
        return 0;
    }
}
