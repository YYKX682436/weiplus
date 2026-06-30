package bw5;

/* loaded from: classes2.dex */
public class rz extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32704d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32706f;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32709i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.iz f32710m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.iz f32711n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32712o;

    /* renamed from: p, reason: collision with root package name */
    public int f32713p;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32716s;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f32705e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f32707g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f32708h = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f32714q = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f32715r = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f32717t = new boolean[15];

    static {
        new bw5.rz();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rz parseFrom(byte[] bArr) {
        return (bw5.rz) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rz)) {
            return false;
        }
        bw5.rz rzVar = (bw5.rz) fVar;
        return n51.f.a(this.f32704d, rzVar.f32704d) && n51.f.a(this.f32705e, rzVar.f32705e) && n51.f.a(this.f32706f, rzVar.f32706f) && n51.f.a(this.f32707g, rzVar.f32707g) && n51.f.a(this.f32708h, rzVar.f32708h) && n51.f.a(this.f32709i, rzVar.f32709i) && n51.f.a(this.f32710m, rzVar.f32710m) && n51.f.a(this.f32711n, rzVar.f32711n) && n51.f.a(this.f32712o, rzVar.f32712o) && n51.f.a(java.lang.Integer.valueOf(this.f32713p), java.lang.Integer.valueOf(rzVar.f32713p)) && n51.f.a(this.f32714q, rzVar.f32714q) && n51.f.a(this.f32715r, rzVar.f32715r) && n51.f.a(java.lang.Boolean.valueOf(this.f32716s), java.lang.Boolean.valueOf(rzVar.f32716s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rz();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32715r;
        java.util.LinkedList linkedList2 = this.f32714q;
        java.util.LinkedList linkedList3 = this.f32708h;
        java.util.LinkedList linkedList4 = this.f32707g;
        java.util.LinkedList linkedList5 = this.f32705e;
        int i18 = 0;
        boolean[] zArr = this.f32717t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32704d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, linkedList5);
            com.tencent.mm.protobuf.g gVar = this.f32706f;
            if (gVar != null && zArr[3]) {
                fVar.b(3, gVar);
            }
            fVar.g(4, 8, linkedList4);
            fVar.g(5, 8, linkedList3);
            java.lang.String str2 = this.f32709i;
            if (str2 != null && zArr[6]) {
                fVar.j(6, str2);
            }
            bw5.iz izVar = this.f32710m;
            if (izVar != null && zArr[7]) {
                fVar.i(7, izVar.computeSize());
                this.f32710m.writeFields(fVar);
            }
            bw5.iz izVar2 = this.f32711n;
            if (izVar2 != null && zArr[8]) {
                fVar.i(8, izVar2.computeSize());
                this.f32711n.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32712o;
            if (gVar2 != null && zArr[9]) {
                fVar.b(9, gVar2);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32713p);
            }
            fVar.g(11, 8, linkedList2);
            fVar.g(12, 8, linkedList);
            if (zArr[14]) {
                fVar.a(14, this.f32716s);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f32704d;
            if (str3 != null && zArr[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            int g17 = i18 + b36.f.g(2, 8, linkedList5);
            com.tencent.mm.protobuf.g gVar3 = this.f32706f;
            if (gVar3 != null && zArr[3]) {
                g17 += b36.f.b(3, gVar3);
            }
            int g18 = g17 + b36.f.g(4, 8, linkedList4) + b36.f.g(5, 8, linkedList3);
            java.lang.String str4 = this.f32709i;
            if (str4 != null && zArr[6]) {
                g18 += b36.f.j(6, str4);
            }
            bw5.iz izVar3 = this.f32710m;
            if (izVar3 != null && zArr[7]) {
                g18 += b36.f.i(7, izVar3.computeSize());
            }
            bw5.iz izVar4 = this.f32711n;
            if (izVar4 != null && zArr[8]) {
                g18 += b36.f.i(8, izVar4.computeSize());
            }
            com.tencent.mm.protobuf.g gVar4 = this.f32712o;
            if (gVar4 != null && zArr[9]) {
                g18 += b36.f.b(9, gVar4);
            }
            if (zArr[10]) {
                g18 += b36.f.e(10, this.f32713p);
            }
            int g19 = g18 + b36.f.g(11, 8, linkedList2) + b36.f.g(12, 8, linkedList);
            return zArr[14] ? g19 + b36.f.a(14, this.f32716s) : g19;
        }
        if (i17 == 2) {
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
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
                this.f32704d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mz mzVar = new bw5.mz();
                    if (bArr != null && bArr.length > 0) {
                        mzVar.parseFrom(bArr);
                    }
                    linkedList5.add(mzVar);
                }
                zArr[2] = true;
                return 0;
            case 3:
                this.f32706f = aVar2.d(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.pz pzVar = new bw5.pz();
                    if (bArr2 != null && bArr2.length > 0) {
                        pzVar.parseFrom(bArr2);
                    }
                    linkedList4.add(pzVar);
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.nz nzVar = new bw5.nz();
                    if (bArr3 != null && bArr3.length > 0) {
                        nzVar.parseFrom(bArr3);
                    }
                    linkedList3.add(nzVar);
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f32709i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.iz izVar5 = new bw5.iz();
                    if (bArr4 != null && bArr4.length > 0) {
                        izVar5.parseFrom(bArr4);
                    }
                    this.f32710m = izVar5;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.iz izVar6 = new bw5.iz();
                    if (bArr5 != null && bArr5.length > 0) {
                        izVar6.parseFrom(bArr5);
                    }
                    this.f32711n = izVar6;
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f32712o = aVar2.d(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32713p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.lz lzVar = new bw5.lz();
                    if (bArr6 != null && bArr6.length > 0) {
                        lzVar.parseFrom(bArr6);
                    }
                    linkedList2.add(lzVar);
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.jz jzVar = new bw5.jz();
                    if (bArr7 != null && bArr7.length > 0) {
                        jzVar.parseFrom(bArr7);
                    }
                    linkedList.add(jzVar);
                }
                zArr[12] = true;
                return 0;
            case 13:
            default:
                return -1;
            case 14:
                this.f32716s = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
        }
    }
}
