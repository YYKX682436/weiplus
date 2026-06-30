package bw5;

/* loaded from: classes15.dex */
public class mr0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f30366d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.nr0 f30367e;

    /* renamed from: f, reason: collision with root package name */
    public long f30368f;

    /* renamed from: g, reason: collision with root package name */
    public long f30369g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.f30 f30370h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f30372m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f30373n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f30371i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f30374o = new boolean[9];

    static {
        new bw5.mr0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mr0 parseFrom(byte[] bArr) {
        return (bw5.mr0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mr0)) {
            return false;
        }
        bw5.mr0 mr0Var = (bw5.mr0) fVar;
        return n51.f.a(this.f30366d, mr0Var.f30366d) && n51.f.a(this.f30367e, mr0Var.f30367e) && n51.f.a(java.lang.Long.valueOf(this.f30368f), java.lang.Long.valueOf(mr0Var.f30368f)) && n51.f.a(java.lang.Long.valueOf(this.f30369g), java.lang.Long.valueOf(mr0Var.f30369g)) && n51.f.a(this.f30370h, mr0Var.f30370h) && n51.f.a(this.f30371i, mr0Var.f30371i) && n51.f.a(this.f30372m, mr0Var.f30372m) && n51.f.a(this.f30373n, mr0Var.f30373n);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.mr0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f30371i;
        int i18 = 0;
        boolean[] zArr = this.f30374o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f30366d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.nr0 nr0Var = this.f30367e;
            if (nr0Var != null && zArr[2]) {
                fVar.e(2, nr0Var.f30803d);
            }
            if (zArr[3]) {
                fVar.h(3, this.f30368f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f30369g);
            }
            bw5.f30 f30Var = this.f30370h;
            if (f30Var != null && zArr[5]) {
                fVar.e(5, f30Var.f27141d);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str2 = this.f30372m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f30373n;
            if (gVar != null && zArr[8]) {
                fVar.b(8, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f30366d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            bw5.nr0 nr0Var2 = this.f30367e;
            if (nr0Var2 != null && zArr[2]) {
                i18 += b36.f.e(2, nr0Var2.f30803d);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f30368f);
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f30369g);
            }
            bw5.f30 f30Var2 = this.f30370h;
            if (f30Var2 != null && zArr[5]) {
                i18 += b36.f.e(5, f30Var2.f27141d);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            java.lang.String str4 = this.f30372m;
            if (str4 != null && zArr[7]) {
                g17 += b36.f.j(7, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f30373n;
            return (gVar2 == null || !zArr[8]) ? g17 : g17 + b36.f.b(8, gVar2);
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
                this.f30366d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                int g18 = aVar2.g(intValue);
                this.f30367e = g18 != 0 ? g18 != 1 ? null : bw5.nr0.DIRECTORY : bw5.nr0.FILE;
                zArr[2] = true;
                return 0;
            case 3:
                this.f30368f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f30369g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f30370h = bw5.f30.a(aVar2.g(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mr0 mr0Var = new bw5.mr0();
                    if (bArr != null && bArr.length > 0) {
                        mr0Var.parseFrom(bArr);
                    }
                    linkedList.add(mr0Var);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f30372m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f30373n = aVar2.d(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
