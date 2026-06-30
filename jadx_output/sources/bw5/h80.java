package bw5;

/* loaded from: classes2.dex */
public class h80 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f28117d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f28118e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o50 f28119f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.e80 f28120g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28121h = new boolean[5];

    static {
        new bw5.h80();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h80 parseFrom(byte[] bArr) {
        return (bw5.h80) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h80)) {
            return false;
        }
        bw5.h80 h80Var = (bw5.h80) fVar;
        return n51.f.a(this.f28117d, h80Var.f28117d) && n51.f.a(this.f28118e, h80Var.f28118e) && n51.f.a(this.f28119f, h80Var.f28119f) && n51.f.a(this.f28120g, h80Var.f28120g);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h80();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28121h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f28117d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f28118e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            bw5.o50 o50Var = this.f28119f;
            if (o50Var != null && zArr[3]) {
                fVar.i(3, o50Var.computeSize());
                this.f28119f.writeFields(fVar);
            }
            bw5.e80 e80Var = this.f28120g;
            if (e80Var != null && zArr[4]) {
                fVar.i(4, e80Var.computeSize());
                this.f28120g.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f28117d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f28118e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            bw5.o50 o50Var2 = this.f28119f;
            if (o50Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, o50Var2.computeSize());
            }
            bw5.e80 e80Var2 = this.f28120g;
            return (e80Var2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, e80Var2.computeSize());
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
            this.f28117d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28118e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.parseFrom(bArr);
                }
                this.f28119f = o50Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.e80 e80Var3 = new bw5.e80();
            if (bArr2 != null && bArr2.length > 0) {
                e80Var3.parseFrom(bArr2);
            }
            this.f28120g = e80Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
