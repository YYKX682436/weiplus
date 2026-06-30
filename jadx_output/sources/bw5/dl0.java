package bw5;

/* loaded from: classes8.dex */
public class dl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f26524d;

    /* renamed from: e, reason: collision with root package name */
    public int f26525e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f26526f;

    /* renamed from: g, reason: collision with root package name */
    public long f26527g;

    /* renamed from: h, reason: collision with root package name */
    public int f26528h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f26529i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f26530m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.zk0 f26531n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.al0 f26532o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean[] f26533p = new boolean[10];

    static {
        new bw5.dl0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.dl0 parseFrom(byte[] bArr) {
        return (bw5.dl0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.dl0)) {
            return false;
        }
        bw5.dl0 dl0Var = (bw5.dl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f26524d), java.lang.Integer.valueOf(dl0Var.f26524d)) && n51.f.a(java.lang.Integer.valueOf(this.f26525e), java.lang.Integer.valueOf(dl0Var.f26525e)) && n51.f.a(this.f26526f, dl0Var.f26526f) && n51.f.a(java.lang.Long.valueOf(this.f26527g), java.lang.Long.valueOf(dl0Var.f26527g)) && n51.f.a(java.lang.Integer.valueOf(this.f26528h), java.lang.Integer.valueOf(dl0Var.f26528h)) && n51.f.a(this.f26529i, dl0Var.f26529i) && n51.f.a(this.f26530m, dl0Var.f26530m) && n51.f.a(this.f26531n, dl0Var.f26531n) && n51.f.a(this.f26532o, dl0Var.f26532o);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.dl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f26533p;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f26524d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26525e);
            }
            java.lang.String str = this.f26526f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f26527g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f26528h);
            }
            com.tencent.mm.protobuf.g gVar = this.f26529i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f26530m;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            bw5.zk0 zk0Var = this.f26531n;
            if (zk0Var != null && zArr[8]) {
                fVar.i(8, zk0Var.computeSize());
                this.f26531n.writeFields(fVar);
            }
            bw5.al0 al0Var = this.f26532o;
            if (al0Var != null && zArr[9]) {
                fVar.i(9, al0Var.computeSize());
                this.f26532o.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f26524d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f26525e);
            }
            java.lang.String str3 = this.f26526f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f26527g);
            }
            if (zArr[5]) {
                e17 += b36.f.e(5, this.f26528h);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f26529i;
            if (gVar2 != null && zArr[6]) {
                e17 += b36.f.b(6, gVar2);
            }
            java.lang.String str4 = this.f26530m;
            if (str4 != null && zArr[7]) {
                e17 += b36.f.j(7, str4);
            }
            bw5.zk0 zk0Var2 = this.f26531n;
            if (zk0Var2 != null && zArr[8]) {
                e17 += b36.f.i(8, zk0Var2.computeSize());
            }
            bw5.al0 al0Var2 = this.f26532o;
            return (al0Var2 == null || !zArr[9]) ? e17 : e17 + b36.f.i(9, al0Var2.computeSize());
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
                this.f26524d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26525e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f26526f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f26527g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f26528h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f26529i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26530m = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.zk0 zk0Var3 = new bw5.zk0();
                    if (bArr != null && bArr.length > 0) {
                        zk0Var3.parseFrom(bArr);
                    }
                    this.f26531n = zk0Var3;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.al0 al0Var3 = new bw5.al0();
                    if (bArr2 != null && bArr2.length > 0) {
                        al0Var3.parseFrom(bArr2);
                    }
                    this.f26532o = al0Var3;
                }
                zArr[9] = true;
                return 0;
            default:
                return -1;
        }
    }
}
