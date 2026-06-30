package bw5;

/* loaded from: classes4.dex */
public class nn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: n, reason: collision with root package name */
    public static final bw5.nn0 f30749n = new bw5.nn0();

    /* renamed from: d, reason: collision with root package name */
    public boolean f30750d;

    /* renamed from: e, reason: collision with root package name */
    public int f30751e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f30752f;

    /* renamed from: h, reason: collision with root package name */
    public bw5.kn0 f30754h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f30753g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f30755i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f30756m = new boolean[7];

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.nn0)) {
            return false;
        }
        bw5.nn0 nn0Var = (bw5.nn0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f30750d), java.lang.Boolean.valueOf(nn0Var.f30750d)) && n51.f.a(java.lang.Integer.valueOf(this.f30751e), java.lang.Integer.valueOf(nn0Var.f30751e)) && n51.f.a(this.f30752f, nn0Var.f30752f) && n51.f.a(this.f30753g, nn0Var.f30753g) && n51.f.a(this.f30754h, nn0Var.f30754h) && n51.f.a(this.f30755i, nn0Var.f30755i);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.nn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30755i;
        java.util.LinkedList linkedList2 = this.f30753g;
        boolean[] zArr = this.f30756m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f30750d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f30751e);
            }
            java.lang.String str = this.f30752f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            fVar.g(4, 8, linkedList2);
            bw5.kn0 kn0Var = this.f30754h;
            if (kn0Var != null && zArr[5]) {
                fVar.i(5, kn0Var.computeSize());
                this.f30754h.writeFields(fVar);
            }
            fVar.g(6, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f30750d) : 0;
            if (zArr[2]) {
                a17 += b36.f.e(2, this.f30751e);
            }
            java.lang.String str2 = this.f30752f;
            if (str2 != null && zArr[3]) {
                a17 += b36.f.j(3, str2);
            }
            int g17 = a17 + b36.f.g(4, 8, linkedList2);
            bw5.kn0 kn0Var2 = this.f30754h;
            if (kn0Var2 != null && zArr[5]) {
                g17 += b36.f.i(5, kn0Var2.computeSize());
            }
            return g17 + b36.f.g(6, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f30750d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f30751e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f30752f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.ln0 ln0Var = new bw5.ln0();
                    if (bArr != null && bArr.length > 0) {
                        ln0Var.parseFrom(bArr);
                    }
                    linkedList2.add(ln0Var);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.kn0 kn0Var3 = new bw5.kn0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kn0Var3.parseFrom(bArr2);
                    }
                    this.f30754h = kn0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.kn0 kn0Var4 = new bw5.kn0();
                    if (bArr3 != null && bArr3.length > 0) {
                        kn0Var4.parseFrom(bArr3);
                    }
                    linkedList.add(kn0Var4);
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.nn0) super.parseFrom(bArr);
    }
}
