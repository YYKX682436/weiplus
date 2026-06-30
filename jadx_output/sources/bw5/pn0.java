package bw5;

/* loaded from: classes2.dex */
public class pn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.sm0 f31761d;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31763f;

    /* renamed from: g, reason: collision with root package name */
    public int f31764g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.qn0 f31765h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f31766i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f31767m;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f31762e = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final boolean[] f31768n = new boolean[8];

    static {
        new bw5.pn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pn0)) {
            return false;
        }
        bw5.pn0 pn0Var = (bw5.pn0) fVar;
        return n51.f.a(this.f31761d, pn0Var.f31761d) && n51.f.a(this.f31762e, pn0Var.f31762e) && n51.f.a(java.lang.Boolean.valueOf(this.f31763f), java.lang.Boolean.valueOf(pn0Var.f31763f)) && n51.f.a(java.lang.Integer.valueOf(this.f31764g), java.lang.Integer.valueOf(pn0Var.f31764g)) && n51.f.a(this.f31765h, pn0Var.f31765h) && n51.f.a(this.f31766i, pn0Var.f31766i) && n51.f.a(java.lang.Boolean.valueOf(this.f31767m), java.lang.Boolean.valueOf(pn0Var.f31767m));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.pn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31762e;
        int i18 = 0;
        boolean[] zArr = this.f31768n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.sm0 sm0Var = this.f31761d;
            if (sm0Var != null && zArr[1]) {
                fVar.i(1, sm0Var.computeSize());
                this.f31761d.writeFields(fVar);
            }
            fVar.g(2, 8, linkedList);
            if (zArr[3]) {
                fVar.a(3, this.f31763f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f31764g);
            }
            bw5.qn0 qn0Var = this.f31765h;
            if (qn0Var != null && zArr[5]) {
                fVar.e(5, qn0Var.f32202d);
            }
            java.lang.String str = this.f31766i;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            if (zArr[7]) {
                fVar.a(7, this.f31767m);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.sm0 sm0Var2 = this.f31761d;
            if (sm0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, sm0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList);
            if (zArr[3]) {
                g17 += b36.f.a(3, this.f31763f);
            }
            if (zArr[4]) {
                g17 += b36.f.e(4, this.f31764g);
            }
            bw5.qn0 qn0Var2 = this.f31765h;
            if (qn0Var2 != null && zArr[5]) {
                g17 += b36.f.e(5, qn0Var2.f32202d);
            }
            java.lang.String str2 = this.f31766i;
            if (str2 != null && zArr[6]) {
                g17 += b36.f.j(6, str2);
            }
            return zArr[7] ? g17 + b36.f.a(7, this.f31767m) : g17;
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.sm0 sm0Var3 = new bw5.sm0();
                    if (bArr != null && bArr.length > 0) {
                        sm0Var3.parseFrom(bArr);
                    }
                    this.f31761d = sm0Var3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.on0 on0Var = new bw5.on0();
                    if (bArr2 != null && bArr2.length > 0) {
                        on0Var.parseFrom(bArr2);
                    }
                    linkedList.add(on0Var);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f31763f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f31764g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                this.f31765h = g18 != 1 ? g18 != 2 ? null : bw5.qn0.Modify : bw5.qn0.New;
                zArr[5] = true;
                return 0;
            case 6:
                this.f31766i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f31767m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.pn0) super.parseFrom(bArr);
    }
}
