package bw5;

/* loaded from: classes7.dex */
public class vd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f34337d;

    /* renamed from: e, reason: collision with root package name */
    public int f34338e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.u f34339f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f34340g = new boolean[4];

    static {
        new bw5.vd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vd0 parseFrom(byte[] bArr) {
        return (bw5.vd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vd0)) {
            return false;
        }
        bw5.vd0 vd0Var = (bw5.vd0) fVar;
        return n51.f.a(this.f34337d, vd0Var.f34337d) && n51.f.a(java.lang.Integer.valueOf(this.f34338e), java.lang.Integer.valueOf(vd0Var.f34338e)) && n51.f.a(this.f34339f, vd0Var.f34339f);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34340g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f34337d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.e(2, this.f34338e);
            }
            bw5.u uVar = this.f34339f;
            if (uVar != null && zArr[3]) {
                fVar.e(3, uVar.f33670d);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f34337d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f34338e);
            }
            bw5.u uVar2 = this.f34339f;
            return (uVar2 == null || !zArr[3]) ? i18 : i18 + b36.f.e(3, uVar2.f33670d);
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
            this.f34337d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34338e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        int g17 = aVar2.g(intValue);
        this.f34339f = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.u.ADDR_TYPE_WIFI_DIRECT : bw5.u.ADDR_TYPE_AWDL : bw5.u.ADDR_TYPE_WIFI;
        zArr[3] = true;
        return 0;
    }
}
