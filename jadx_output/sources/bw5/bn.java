package bw5;

/* loaded from: classes2.dex */
public class bn extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f25754d;

    /* renamed from: e, reason: collision with root package name */
    public long f25755e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25756f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ql f25757g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.an f25758h;

    /* renamed from: m, reason: collision with root package name */
    public int f25760m;

    /* renamed from: n, reason: collision with root package name */
    public long f25761n;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f25759i = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final boolean[] f25762o = new boolean[9];

    static {
        new bw5.bn();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bn parseFrom(byte[] bArr) {
        return (bw5.bn) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bn)) {
            return false;
        }
        bw5.bn bnVar = (bw5.bn) fVar;
        return n51.f.a(this.f25754d, bnVar.f25754d) && n51.f.a(java.lang.Long.valueOf(this.f25755e), java.lang.Long.valueOf(bnVar.f25755e)) && n51.f.a(this.f25756f, bnVar.f25756f) && n51.f.a(this.f25757g, bnVar.f25757g) && n51.f.a(this.f25758h, bnVar.f25758h) && n51.f.a(this.f25759i, bnVar.f25759i) && n51.f.a(java.lang.Integer.valueOf(this.f25760m), java.lang.Integer.valueOf(bnVar.f25760m)) && n51.f.a(java.lang.Long.valueOf(this.f25761n), java.lang.Long.valueOf(bnVar.f25761n));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bn();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f25759i;
        int i18 = 0;
        boolean[] zArr = this.f25762o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f25754d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f25755e);
            }
            java.lang.String str2 = this.f25756f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            bw5.ql qlVar = this.f25757g;
            if (qlVar != null && zArr[4]) {
                fVar.i(4, qlVar.computeSize());
                this.f25757g.writeFields(fVar);
            }
            bw5.an anVar = this.f25758h;
            if (anVar != null && zArr[5]) {
                fVar.e(5, anVar.f25276d);
            }
            fVar.g(6, 8, linkedList);
            if (zArr[7]) {
                fVar.e(7, this.f25760m);
            }
            if (zArr[8]) {
                fVar.h(8, this.f25761n);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f25754d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f25755e);
            }
            java.lang.String str4 = this.f25756f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            bw5.ql qlVar2 = this.f25757g;
            if (qlVar2 != null && zArr[4]) {
                i18 += b36.f.i(4, qlVar2.computeSize());
            }
            bw5.an anVar2 = this.f25758h;
            if (anVar2 != null && zArr[5]) {
                i18 += b36.f.e(5, anVar2.f25276d);
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            if (zArr[7]) {
                g17 += b36.f.e(7, this.f25760m);
            }
            return zArr[8] ? g17 + b36.f.h(8, this.f25761n) : g17;
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
                this.f25754d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25755e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25756f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.ql qlVar3 = new bw5.ql();
                    if (bArr != null && bArr.length > 0) {
                        qlVar3.parseFrom(bArr);
                    }
                    this.f25757g = qlVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                int g18 = aVar2.g(intValue);
                this.f25758h = g18 != 0 ? g18 != 1 ? g18 != 2 ? null : bw5.an.Accept : bw5.an.Apply : bw5.an.Unknown;
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.um umVar = new bw5.um();
                    if (bArr2 != null && bArr2.length > 0) {
                        umVar.parseFrom(bArr2);
                    }
                    linkedList.add(umVar);
                }
                zArr[6] = true;
                return 0;
            case 7:
                this.f25760m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25761n = aVar2.i(intValue);
                zArr[8] = true;
                return 0;
            default:
                return -1;
        }
    }
}
