package bw5;

/* loaded from: classes8.dex */
public class bl0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f25730d;

    /* renamed from: e, reason: collision with root package name */
    public int f25731e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f25732f;

    /* renamed from: g, reason: collision with root package name */
    public long f25733g;

    /* renamed from: h, reason: collision with root package name */
    public long f25734h;

    /* renamed from: i, reason: collision with root package name */
    public long f25735i;

    /* renamed from: m, reason: collision with root package name */
    public int f25736m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f25737n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.zk0 f25738o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.al0 f25739p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f25740q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean[] f25741r = new boolean[12];

    static {
        new bw5.bl0();
    }

    public bw5.zk0 b() {
        return this.f25741r[9] ? this.f25738o : new bw5.zk0();
    }

    public java.lang.String c() {
        return this.f25741r[3] ? this.f25732f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bl0)) {
            return false;
        }
        bw5.bl0 bl0Var = (bw5.bl0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f25730d), java.lang.Integer.valueOf(bl0Var.f25730d)) && n51.f.a(java.lang.Integer.valueOf(this.f25731e), java.lang.Integer.valueOf(bl0Var.f25731e)) && n51.f.a(this.f25732f, bl0Var.f25732f) && n51.f.a(java.lang.Long.valueOf(this.f25733g), java.lang.Long.valueOf(bl0Var.f25733g)) && n51.f.a(java.lang.Long.valueOf(this.f25734h), java.lang.Long.valueOf(bl0Var.f25734h)) && n51.f.a(java.lang.Long.valueOf(this.f25735i), java.lang.Long.valueOf(bl0Var.f25735i)) && n51.f.a(java.lang.Integer.valueOf(this.f25736m), java.lang.Integer.valueOf(bl0Var.f25736m)) && n51.f.a(this.f25737n, bl0Var.f25737n) && n51.f.a(this.f25738o, bl0Var.f25738o) && n51.f.a(this.f25739p, bl0Var.f25739p) && n51.f.a(this.f25740q, bl0Var.f25740q);
    }

    public bw5.al0 d() {
        return this.f25741r[10] ? this.f25739p : new bw5.al0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public bw5.bl0 parseFrom(byte[] bArr) {
        return (bw5.bl0) super.parseFrom(bArr);
    }

    public java.lang.String getTitle() {
        return this.f25741r[8] ? this.f25737n : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.bl0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f25741r;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f25730d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f25731e);
            }
            java.lang.String str = this.f25732f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            if (zArr[4]) {
                fVar.h(4, this.f25733g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f25734h);
            }
            if (zArr[6]) {
                fVar.h(6, this.f25735i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f25736m);
            }
            java.lang.String str2 = this.f25737n;
            if (str2 != null && zArr[8]) {
                fVar.j(8, str2);
            }
            bw5.zk0 zk0Var = this.f25738o;
            if (zk0Var != null && zArr[9]) {
                fVar.i(9, zk0Var.computeSize());
                this.f25738o.writeFields(fVar);
            }
            bw5.al0 al0Var = this.f25739p;
            if (al0Var != null && zArr[10]) {
                fVar.i(10, al0Var.computeSize());
                this.f25739p.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f25740q;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f25730d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f25731e);
            }
            java.lang.String str3 = this.f25732f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            if (zArr[4]) {
                e17 += b36.f.h(4, this.f25733g);
            }
            if (zArr[5]) {
                e17 += b36.f.h(5, this.f25734h);
            }
            if (zArr[6]) {
                e17 += b36.f.h(6, this.f25735i);
            }
            if (zArr[7]) {
                e17 += b36.f.e(7, this.f25736m);
            }
            java.lang.String str4 = this.f25737n;
            if (str4 != null && zArr[8]) {
                e17 += b36.f.j(8, str4);
            }
            bw5.zk0 zk0Var2 = this.f25738o;
            if (zk0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, zk0Var2.computeSize());
            }
            bw5.al0 al0Var2 = this.f25739p;
            if (al0Var2 != null && zArr[10]) {
                e17 += b36.f.i(10, al0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f25740q;
            return (gVar2 == null || !zArr[11]) ? e17 : e17 + b36.f.b(11, gVar2);
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
                this.f25730d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f25731e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f25732f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f25733g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f25734h = aVar2.i(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f25735i = aVar2.i(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f25736m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f25737n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.zk0 zk0Var3 = new bw5.zk0();
                    if (bArr != null && bArr.length > 0) {
                        zk0Var3.parseFrom(bArr);
                    }
                    this.f25738o = zk0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.al0 al0Var3 = new bw5.al0();
                    if (bArr2 != null && bArr2.length > 0) {
                        al0Var3.parseFrom(bArr2);
                    }
                    this.f25739p = al0Var3;
                }
                zArr[10] = true;
                return 0;
            case 11:
                this.f25740q = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
            default:
                return -1;
        }
    }
}
