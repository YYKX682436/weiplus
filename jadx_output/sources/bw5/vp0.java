package bw5;

/* loaded from: classes2.dex */
public class vp0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.v60 f34455d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.xq0 f34456e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f34457f;

    /* renamed from: g, reason: collision with root package name */
    public int f34458g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f34459h = new boolean[5];

    static {
        new bw5.vp0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vp0 parseFrom(byte[] bArr) {
        return (bw5.vp0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vp0)) {
            return false;
        }
        bw5.vp0 vp0Var = (bw5.vp0) fVar;
        return n51.f.a(this.f34455d, vp0Var.f34455d) && n51.f.a(this.f34456e, vp0Var.f34456e) && n51.f.a(this.f34457f, vp0Var.f34457f) && n51.f.a(java.lang.Integer.valueOf(this.f34458g), java.lang.Integer.valueOf(vp0Var.f34458g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.vp0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f34459h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.v60 v60Var = this.f34455d;
            if (v60Var != null && zArr[1]) {
                fVar.i(1, v60Var.computeSize());
                this.f34455d.writeFields(fVar);
            }
            bw5.xq0 xq0Var = this.f34456e;
            if (xq0Var != null && zArr[2]) {
                fVar.i(2, xq0Var.computeSize());
                this.f34456e.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f34457f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            if (zArr[4]) {
                fVar.e(4, this.f34458g);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.v60 v60Var2 = this.f34455d;
            if (v60Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, v60Var2.computeSize());
            }
            bw5.xq0 xq0Var2 = this.f34456e;
            if (xq0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, xq0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f34457f;
            if (gVar2 != null && zArr[3]) {
                i18 += b36.f.b(3, gVar2);
            }
            return zArr[4] ? i18 + b36.f.e(4, this.f34458g) : i18;
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
                bw5.v60 v60Var3 = new bw5.v60();
                if (bArr != null && bArr.length > 0) {
                    v60Var3.parseFrom(bArr);
                }
                this.f34455d = v60Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f34457f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            this.f34458g = aVar2.g(intValue);
            zArr[4] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.xq0 xq0Var3 = new bw5.xq0();
            if (bArr2 != null && bArr2.length > 0) {
                xq0Var3.parseFrom(bArr2);
            }
            this.f34456e = xq0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
