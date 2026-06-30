package bw5;

/* loaded from: classes9.dex */
public class d9 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.a9 f26378d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f26379e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f26380f = new boolean[3];

    static {
        new bw5.d9();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.d9 parseFrom(byte[] bArr) {
        return (bw5.d9) super.parseFrom(bArr);
    }

    public bw5.d9 c(bw5.a9 a9Var) {
        this.f26378d = a9Var;
        this.f26380f[1] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.d9)) {
            return false;
        }
        bw5.d9 d9Var = (bw5.d9) fVar;
        return n51.f.a(this.f26378d, d9Var.f26378d) && n51.f.a(this.f26379e, d9Var.f26379e);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.d9();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26380f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.a9 a9Var = this.f26378d;
            if (a9Var != null && zArr[1]) {
                fVar.i(1, a9Var.computeSize());
                this.f26378d.writeFields(fVar);
            }
            bw5.x7 x7Var = this.f26379e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f26379e.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.a9 a9Var2 = this.f26378d;
            if (a9Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, a9Var2.computeSize());
            }
            bw5.x7 x7Var2 = this.f26379e;
            return (x7Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, x7Var2.computeSize());
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
                bw5.a9 a9Var3 = new bw5.a9();
                if (bArr != null && bArr.length > 0) {
                    a9Var3.parseFrom(bArr);
                }
                this.f26378d = a9Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr2 != null && bArr2.length > 0) {
                x7Var3.parseFrom(bArr2);
            }
            this.f26379e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
