package bw5;

/* loaded from: classes2.dex */
public class jc extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.o50 f28920d;

    /* renamed from: f, reason: collision with root package name */
    public int f28922f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f28921e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f28923g = new boolean[4];

    static {
        new bw5.jc();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jc)) {
            return false;
        }
        bw5.jc jcVar = (bw5.jc) fVar;
        return n51.f.a(this.f28920d, jcVar.f28920d) && n51.f.a(this.f28921e, jcVar.f28921e) && n51.f.a(java.lang.Integer.valueOf(this.f28922f), java.lang.Integer.valueOf(jcVar.f28922f));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jc();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28923g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.o50 o50Var = this.f28920d;
            if (o50Var != null && zArr[1]) {
                fVar.i(1, o50Var.computeSize());
                this.f28920d.writeFields(fVar);
            }
            fVar.g(2, 8, this.f28921e);
            if (zArr[3]) {
                fVar.e(3, this.f28922f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.o50 o50Var2 = this.f28920d;
            if (o50Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, o50Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, this.f28921e);
            return zArr[3] ? g17 + b36.f.e(3, this.f28922f) : g17;
        }
        if (i17 == 2) {
            this.f28921e.clear();
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
                bw5.o50 o50Var3 = new bw5.o50();
                if (bArr != null && bArr.length > 0) {
                    o50Var3.parseFrom(bArr);
                }
                this.f28920d = o50Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 3) {
                return -1;
            }
            this.f28922f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.lp0 lp0Var = new bw5.lp0();
            if (bArr2 != null && bArr2.length > 0) {
                lp0Var.parseFrom(bArr2);
            }
            this.f28921e.add(lp0Var);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.jc) super.parseFrom(bArr);
    }
}
