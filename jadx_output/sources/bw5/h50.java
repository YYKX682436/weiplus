package bw5;

/* loaded from: classes2.dex */
public class h50 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f28082d;

    /* renamed from: e, reason: collision with root package name */
    public int f28083e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28084f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28085g = new boolean[4];

    static {
        new bw5.h50();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h50 parseFrom(byte[] bArr) {
        return (bw5.h50) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h50)) {
            return false;
        }
        bw5.h50 h50Var = (bw5.h50) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f28082d), java.lang.Long.valueOf(h50Var.f28082d)) && n51.f.a(java.lang.Integer.valueOf(this.f28083e), java.lang.Integer.valueOf(h50Var.f28083e)) && n51.f.a(this.f28084f, h50Var.f28084f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h50();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28085g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f28082d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28083e);
            }
            java.lang.String str = this.f28084f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f28082d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f28083e);
            }
            java.lang.String str2 = this.f28084f;
            return (str2 == null || !zArr[3]) ? h17 : h17 + b36.f.j(3, str2);
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
            this.f28082d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28083e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f28084f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
