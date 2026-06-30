package bw5;

/* loaded from: classes2.dex */
public class n70 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bc0 f30531d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f30532e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.m70 f30533f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30534g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f30535h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30536i = new boolean[7];

    static {
        new bw5.n70();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.n70 parseFrom(byte[] bArr) {
        return (bw5.n70) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.n70)) {
            return false;
        }
        bw5.n70 n70Var = (bw5.n70) fVar;
        return n51.f.a(this.f30531d, n70Var.f30531d) && n51.f.a(this.f30532e, n70Var.f30532e) && n51.f.a(this.f30533f, n70Var.f30533f) && n51.f.a(this.f30534g, n70Var.f30534g) && n51.f.a(this.f30535h, n70Var.f30535h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.n70();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30535h;
        boolean[] zArr = this.f30536i;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bc0 bc0Var = this.f30531d;
            if (bc0Var != null && zArr[2]) {
                fVar.i(2, bc0Var.computeSize());
                this.f30531d.writeFields(fVar);
            }
            java.lang.String str = this.f30532e;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.m70 m70Var = this.f30533f;
            if (m70Var != null && zArr[4]) {
                fVar.i(4, m70Var.computeSize());
                this.f30533f.writeFields(fVar);
            }
            java.lang.String str2 = this.f30534g;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            fVar.g(6, 2, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.bc0 bc0Var2 = this.f30531d;
            if (bc0Var2 != null && zArr[2]) {
                i18 = 0 + b36.f.i(2, bc0Var2.computeSize());
            }
            java.lang.String str3 = this.f30532e;
            if (str3 != null && zArr[3]) {
                i18 += b36.f.j(3, str3);
            }
            bw5.m70 m70Var2 = this.f30533f;
            if (m70Var2 != null && zArr[4]) {
                i18 += b36.f.i(4, m70Var2.computeSize());
            }
            java.lang.String str4 = this.f30534g;
            if (str4 != null && zArr[5]) {
                i18 += b36.f.j(5, str4);
            }
            return i18 + b36.f.g(6, 2, linkedList);
        }
        if (i17 == 2) {
            linkedList.clear();
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
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.bc0 bc0Var3 = new bw5.bc0();
                if (bArr != null && bArr.length > 0) {
                    bc0Var3.parseFrom(bArr);
                }
                this.f30531d = bc0Var3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f30532e = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            if (intValue == 5) {
                this.f30534g = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            }
            if (intValue != 6) {
                return -1;
            }
            linkedList.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            zArr[6] = true;
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.m70 m70Var3 = new bw5.m70();
            if (bArr2 != null && bArr2.length > 0) {
                m70Var3.parseFrom(bArr2);
            }
            this.f30533f = m70Var3;
        }
        zArr[4] = true;
        return 0;
    }
}
