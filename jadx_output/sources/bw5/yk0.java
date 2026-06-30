package bw5;

/* loaded from: classes2.dex */
public class yk0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f35536d;

    /* renamed from: e, reason: collision with root package name */
    public long f35537e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f35538f;

    /* renamed from: g, reason: collision with root package name */
    public long f35539g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f35540h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f35541i = new boolean[6];

    static {
        new bw5.yk0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yk0 parseFrom(byte[] bArr) {
        return (bw5.yk0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yk0)) {
            return false;
        }
        bw5.yk0 yk0Var = (bw5.yk0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f35536d), java.lang.Long.valueOf(yk0Var.f35536d)) && n51.f.a(java.lang.Long.valueOf(this.f35537e), java.lang.Long.valueOf(yk0Var.f35537e)) && n51.f.a(this.f35538f, yk0Var.f35538f) && n51.f.a(java.lang.Long.valueOf(this.f35539g), java.lang.Long.valueOf(yk0Var.f35539g)) && n51.f.a(this.f35540h, yk0Var.f35540h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.yk0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f35541i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f35536d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f35537e);
            }
            java.lang.String str = this.f35538f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f35539g);
            }
            java.lang.String str2 = this.f35540h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f35536d) : 0;
            if (zArr[2]) {
                h17 += b36.f.h(2, this.f35537e);
            }
            java.lang.String str3 = this.f35538f;
            if (str3 != null && zArr[3]) {
                h17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                h17 += b36.f.h(4, this.f35539g);
            }
            java.lang.String str4 = this.f35540h;
            return (str4 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str4);
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
            this.f35536d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f35537e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f35538f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f35539g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f35540h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }
}
