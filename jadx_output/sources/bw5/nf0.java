package bw5;

/* loaded from: classes4.dex */
public class nf0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f30664d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f30665e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30666f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f30667g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f30668h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f30669i = new boolean[6];

    static {
        new bw5.nf0();
    }

    public bw5.x7 b() {
        return this.f30669i[2] ? this.f30665e : new bw5.x7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.nf0 parseFrom(byte[] bArr) {
        return (bw5.nf0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nf0)) {
            return false;
        }
        bw5.nf0 nf0Var = (bw5.nf0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f30664d), java.lang.Long.valueOf(nf0Var.f30664d)) && n51.f.a(this.f30665e, nf0Var.f30665e) && n51.f.a(this.f30666f, nf0Var.f30666f) && n51.f.a(this.f30667g, nf0Var.f30667g) && n51.f.a(this.f30668h, nf0Var.f30668h);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nf0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f30669i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f30664d);
            }
            bw5.x7 x7Var = this.f30665e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f30665e.writeFields(fVar);
            }
            java.lang.String str = this.f30666f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f30667g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f30668h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f30664d) : 0;
            bw5.x7 x7Var2 = this.f30665e;
            if (x7Var2 != null && zArr[2]) {
                h17 += b36.f.i(2, x7Var2.computeSize());
            }
            java.lang.String str4 = this.f30666f;
            if (str4 != null && zArr[3]) {
                h17 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f30667g;
            if (str5 != null && zArr[4]) {
                h17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f30668h;
            return (str6 == null || !zArr[5]) ? h17 : h17 + b36.f.j(5, str6);
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
            this.f30664d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                this.f30666f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            }
            if (intValue == 4) {
                this.f30667g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            this.f30668h = aVar2.k(intValue);
            zArr[5] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.x7 x7Var3 = new bw5.x7();
            if (bArr != null && bArr.length > 0) {
                x7Var3.parseFrom(bArr);
            }
            this.f30665e = x7Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
