package bw5;

/* loaded from: classes2.dex */
public class wp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.vp0 f34817d;

    /* renamed from: e, reason: collision with root package name */
    public long f34818e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34819f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v60 f34820g;

    /* renamed from: h, reason: collision with root package name */
    public int f34821h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f34822i = new boolean[6];

    static {
        new bw5.wp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.wp0)) {
            return false;
        }
        bw5.wp0 wp0Var = (bw5.wp0) fVar;
        return n51.f.a(this.f34817d, wp0Var.f34817d) && n51.f.a(java.lang.Long.valueOf(this.f34818e), java.lang.Long.valueOf(wp0Var.f34818e)) && n51.f.a(this.f34819f, wp0Var.f34819f) && n51.f.a(this.f34820g, wp0Var.f34820g) && n51.f.a(java.lang.Integer.valueOf(this.f34821h), java.lang.Integer.valueOf(wp0Var.f34821h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.wp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f34822i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.vp0 vp0Var = this.f34817d;
            if (vp0Var != null && zArr[1]) {
                fVar.i(1, vp0Var.computeSize());
                this.f34817d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f34818e);
            }
            com.tencent.mm.protobuf.g gVar = this.f34819f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            bw5.v60 v60Var = this.f34820g;
            if (v60Var != null && zArr[4]) {
                fVar.i(4, v60Var.computeSize());
                this.f34820g.writeFields(fVar);
            }
            if (zArr[5]) {
                fVar.e(5, this.f34821h);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.vp0 vp0Var2 = this.f34817d;
            if (vp0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, vp0Var2.computeSize());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f34818e);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34819f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            bw5.v60 v60Var2 = this.f34820g;
            if (v60Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, v60Var2.computeSize());
            }
            return zArr[5] ? i18 + b36.f.e(5, this.f34821h) : i18;
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.vp0 vp0Var3 = new bw5.vp0();
                if (bArr != null && bArr.length > 0) {
                    vp0Var3.parseFrom(bArr);
                }
                this.f34817d = vp0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f34818e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f34819f = aVar2.d(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            this.f34821h = aVar2.g(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.v60 v60Var3 = new bw5.v60();
            if (bArr2 != null && bArr2.length > 0) {
                v60Var3.parseFrom(bArr2);
            }
            this.f34820g = v60Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.wp0) super.parseFrom(bArr);
    }
}
