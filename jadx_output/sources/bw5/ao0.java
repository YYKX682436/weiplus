package bw5;

/* loaded from: classes2.dex */
public class ao0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f25288d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f25289e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25290f;

    /* renamed from: g, reason: collision with root package name */
    public long f25291g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f25292h = new boolean[5];

    static {
        new bw5.ao0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ao0 parseFrom(byte[] bArr) {
        return (bw5.ao0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ao0)) {
            return false;
        }
        bw5.ao0 ao0Var = (bw5.ao0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f25288d), java.lang.Long.valueOf(ao0Var.f25288d)) && n51.f.a(this.f25289e, ao0Var.f25289e) && n51.f.a(this.f25290f, ao0Var.f25290f) && n51.f.a(java.lang.Long.valueOf(this.f25291g), java.lang.Long.valueOf(ao0Var.f25291g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ao0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25292h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f25288d);
            }
            java.lang.String str = this.f25289e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f25290f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25291g);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f25288d) : 0;
            java.lang.String str3 = this.f25289e;
            if (str3 != null && zArr[2]) {
                h17 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f25290f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            return zArr[4] ? h17 + b36.f.h(4, this.f25291g) : h17;
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
            this.f25288d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f25289e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f25290f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f25291g = aVar2.i(intValue);
        zArr[4] = true;
        return 0;
    }
}
