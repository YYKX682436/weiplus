package bw5;

/* loaded from: classes8.dex */
public class t2 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f33217d;

    /* renamed from: e, reason: collision with root package name */
    public int f33218e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.g f33219f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.v70 f33220g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.k f33221h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f33222i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f33223m = new boolean[7];

    static {
        new bw5.t2();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t2)) {
            return false;
        }
        bw5.t2 t2Var = (bw5.t2) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f33217d), java.lang.Boolean.valueOf(t2Var.f33217d)) && n51.f.a(java.lang.Integer.valueOf(this.f33218e), java.lang.Integer.valueOf(t2Var.f33218e)) && n51.f.a(this.f33219f, t2Var.f33219f) && n51.f.a(this.f33220g, t2Var.f33220g) && n51.f.a(this.f33221h, t2Var.f33221h) && n51.f.a(this.f33222i, t2Var.f33222i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.t2();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33223m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f33217d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f33218e);
            }
            bw5.g gVar = this.f33219f;
            if (gVar != null && zArr[3]) {
                fVar.i(3, gVar.computeSize());
                this.f33219f.writeFields(fVar);
            }
            bw5.v70 v70Var = this.f33220g;
            if (v70Var != null && zArr[4]) {
                fVar.i(4, v70Var.computeSize());
                this.f33220g.writeFields(fVar);
            }
            bw5.k kVar = this.f33221h;
            if (kVar != null && zArr[5]) {
                fVar.e(5, kVar.f29187d);
            }
            java.lang.String str = this.f33222i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f33217d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f33218e);
            }
            bw5.g gVar2 = this.f33219f;
            if (gVar2 != null && zArr[3]) {
                a17 += b36.f.i(3, gVar2.computeSize());
            }
            bw5.v70 v70Var2 = this.f33220g;
            if (v70Var2 != null && zArr[4]) {
                a17 += b36.f.i(4, v70Var2.computeSize());
            }
            bw5.k kVar2 = this.f33221h;
            if (kVar2 != null && zArr[5]) {
                a17 += b36.f.e(5, kVar2.f29187d);
            }
            java.lang.String str2 = this.f33222i;
            return (str2 == null || !zArr[6]) ? a17 : a17 + b36.f.j(6, str2);
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
        switch (intValue) {
            case 1:
                this.f33217d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33218e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.g gVar3 = new bw5.g();
                    if (bArr != null && bArr.length > 0) {
                        gVar3.parseFrom(bArr);
                    }
                    this.f33219f = gVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.v70 v70Var3 = new bw5.v70();
                    if (bArr2 != null && bArr2.length > 0) {
                        v70Var3.parseFrom(bArr2);
                    }
                    this.f33220g = v70Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f33221h = bw5.k.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f33222i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.t2) super.parseFrom(bArr);
    }
}
