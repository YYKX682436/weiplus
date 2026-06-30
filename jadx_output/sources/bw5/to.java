package bw5;

/* loaded from: classes2.dex */
public class to extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f33539d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33540e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.j10 f33541f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33542g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.so f33543h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f33544i = new boolean[6];

    static {
        new bw5.to();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.to parseFrom(byte[] bArr) {
        return (bw5.to) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.to)) {
            return false;
        }
        bw5.to toVar = (bw5.to) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f33539d), java.lang.Integer.valueOf(toVar.f33539d)) && n51.f.a(this.f33540e, toVar.f33540e) && n51.f.a(this.f33541f, toVar.f33541f) && n51.f.a(this.f33542g, toVar.f33542g) && n51.f.a(this.f33543h, toVar.f33543h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.to();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33544i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f33539d);
            }
            java.lang.String str = this.f33540e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            bw5.j10 j10Var = this.f33541f;
            if (j10Var != null && zArr[3]) {
                fVar.i(3, j10Var.computeSize());
                this.f33541f.writeFields(fVar);
            }
            java.lang.String str2 = this.f33542g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.so soVar = this.f33543h;
            if (soVar != null && zArr[5]) {
                fVar.i(5, soVar.computeSize());
                this.f33543h.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f33539d) : 0;
            java.lang.String str3 = this.f33540e;
            if (str3 != null && zArr[2]) {
                e17 += b36.f.j(2, str3);
            }
            bw5.j10 j10Var2 = this.f33541f;
            if (j10Var2 != null && zArr[3]) {
                e17 += b36.f.i(3, j10Var2.computeSize());
            }
            java.lang.String str4 = this.f33542g;
            if (str4 != null && zArr[4]) {
                e17 += b36.f.j(4, str4);
            }
            bw5.so soVar2 = this.f33543h;
            return (soVar2 == null || !zArr[5]) ? e17 : e17 + b36.f.i(5, soVar2.computeSize());
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
            this.f33539d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f33540e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.j10 j10Var3 = new bw5.j10();
                if (bArr != null && bArr.length > 0) {
                    j10Var3.parseFrom(bArr);
                }
                this.f33541f = j10Var3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f33542g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.so soVar3 = new bw5.so();
            if (bArr2 != null && bArr2.length > 0) {
                soVar3.parseFrom(bArr2);
            }
            this.f33543h = soVar3;
        }
        zArr[5] = true;
        return 0;
    }
}
