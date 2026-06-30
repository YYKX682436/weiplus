package bw5;

/* loaded from: classes2.dex */
public class gb0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lb0 f27779d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.mb0 f27780e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.v70 f27781f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.xa0 f27782g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f27783h = new boolean[5];

    static {
        new bw5.gb0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.gb0 parseFrom(byte[] bArr) {
        return (bw5.gb0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.gb0)) {
            return false;
        }
        bw5.gb0 gb0Var = (bw5.gb0) fVar;
        return n51.f.a(this.f27779d, gb0Var.f27779d) && n51.f.a(this.f27780e, gb0Var.f27780e) && n51.f.a(this.f27781f, gb0Var.f27781f) && n51.f.a(this.f27782g, gb0Var.f27782g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.gb0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f27783h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.lb0 lb0Var = this.f27779d;
            if (lb0Var != null && zArr[1]) {
                fVar.i(1, lb0Var.computeSize());
                this.f27779d.writeFields(fVar);
            }
            bw5.mb0 mb0Var = this.f27780e;
            if (mb0Var != null && zArr[2]) {
                fVar.i(2, mb0Var.computeSize());
                this.f27780e.writeFields(fVar);
            }
            bw5.v70 v70Var = this.f27781f;
            if (v70Var != null && zArr[3]) {
                fVar.i(3, v70Var.computeSize());
                this.f27781f.writeFields(fVar);
            }
            bw5.xa0 xa0Var = this.f27782g;
            if (xa0Var != null && zArr[4]) {
                fVar.i(4, xa0Var.computeSize());
                this.f27782g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.lb0 lb0Var2 = this.f27779d;
            if (lb0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, lb0Var2.computeSize());
            }
            bw5.mb0 mb0Var2 = this.f27780e;
            if (mb0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, mb0Var2.computeSize());
            }
            bw5.v70 v70Var2 = this.f27781f;
            if (v70Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, v70Var2.computeSize());
            }
            bw5.xa0 xa0Var2 = this.f27782g;
            return (xa0Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, xa0Var2.computeSize());
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
                bw5.lb0 lb0Var3 = new bw5.lb0();
                if (bArr != null && bArr.length > 0) {
                    lb0Var3.parseFrom(bArr);
                }
                this.f27779d = lb0Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.mb0 mb0Var3 = new bw5.mb0();
                if (bArr2 != null && bArr2.length > 0) {
                    mb0Var3.parseFrom(bArr2);
                }
                this.f27780e = mb0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                bw5.v70 v70Var3 = new bw5.v70();
                if (bArr3 != null && bArr3.length > 0) {
                    v70Var3.parseFrom(bArr3);
                }
                this.f27781f = v70Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            bw5.xa0 xa0Var3 = new bw5.xa0();
            if (bArr4 != null && bArr4.length > 0) {
                xa0Var3.parseFrom(bArr4);
            }
            this.f27782g = xa0Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
