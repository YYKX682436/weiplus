package bw5;

/* loaded from: classes2.dex */
public class de extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public long f26452d;

    /* renamed from: e, reason: collision with root package name */
    public int f26453e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.qd0 f26454f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.n30 f26455g;

    /* renamed from: h, reason: collision with root package name */
    public int f26456h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f26457i;

    /* renamed from: n, reason: collision with root package name */
    public int f26459n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f26460o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f26461p;

    /* renamed from: q, reason: collision with root package name */
    public long f26462q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.s30 f26463r;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f26458m = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f26464s = new boolean[14];

    static {
        new bw5.de();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.de parseFrom(byte[] bArr) {
        return (bw5.de) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.de)) {
            return false;
        }
        bw5.de deVar = (bw5.de) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f26452d), java.lang.Long.valueOf(deVar.f26452d)) && n51.f.a(java.lang.Integer.valueOf(this.f26453e), java.lang.Integer.valueOf(deVar.f26453e)) && n51.f.a(this.f26454f, deVar.f26454f) && n51.f.a(this.f26455g, deVar.f26455g) && n51.f.a(java.lang.Integer.valueOf(this.f26456h), java.lang.Integer.valueOf(deVar.f26456h)) && n51.f.a(java.lang.Boolean.valueOf(this.f26457i), java.lang.Boolean.valueOf(deVar.f26457i)) && n51.f.a(this.f26458m, deVar.f26458m) && n51.f.a(java.lang.Integer.valueOf(this.f26459n), java.lang.Integer.valueOf(deVar.f26459n)) && n51.f.a(this.f26460o, deVar.f26460o) && n51.f.a(this.f26461p, deVar.f26461p) && n51.f.a(java.lang.Long.valueOf(this.f26462q), java.lang.Long.valueOf(deVar.f26462q)) && n51.f.a(this.f26463r, deVar.f26463r);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.de();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f26458m;
        boolean[] zArr = this.f26464s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f26452d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f26453e);
            }
            bw5.qd0 qd0Var = this.f26454f;
            if (qd0Var != null && zArr[4]) {
                fVar.i(4, qd0Var.computeSize());
                this.f26454f.writeFields(fVar);
            }
            bw5.n30 n30Var = this.f26455g;
            if (n30Var != null && zArr[5]) {
                fVar.i(5, n30Var.computeSize());
                this.f26455g.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f26456h);
            }
            if (zArr[7]) {
                fVar.a(7, this.f26457i);
            }
            fVar.g(8, 8, linkedList);
            if (zArr[9]) {
                fVar.e(9, this.f26459n);
            }
            java.lang.String str = this.f26460o;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f26461p;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            if (zArr[12]) {
                fVar.h(12, this.f26462q);
            }
            bw5.s30 s30Var = this.f26463r;
            if (s30Var != null && zArr[13]) {
                fVar.i(13, s30Var.computeSize());
                this.f26463r.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f26452d) : 0;
            if (zArr[2]) {
                h17 += b36.f.e(2, this.f26453e);
            }
            bw5.qd0 qd0Var2 = this.f26454f;
            if (qd0Var2 != null && zArr[4]) {
                h17 += b36.f.i(4, qd0Var2.computeSize());
            }
            bw5.n30 n30Var2 = this.f26455g;
            if (n30Var2 != null && zArr[5]) {
                h17 += b36.f.i(5, n30Var2.computeSize());
            }
            if (zArr[6]) {
                h17 += b36.f.e(6, this.f26456h);
            }
            if (zArr[7]) {
                h17 += b36.f.a(7, this.f26457i);
            }
            int g17 = h17 + b36.f.g(8, 8, linkedList);
            if (zArr[9]) {
                g17 += b36.f.e(9, this.f26459n);
            }
            java.lang.String str3 = this.f26460o;
            if (str3 != null && zArr[10]) {
                g17 += b36.f.j(10, str3);
            }
            java.lang.String str4 = this.f26461p;
            if (str4 != null && zArr[11]) {
                g17 += b36.f.j(11, str4);
            }
            if (zArr[12]) {
                g17 += b36.f.h(12, this.f26462q);
            }
            bw5.s30 s30Var2 = this.f26463r;
            return (s30Var2 == null || !zArr[13]) ? g17 : g17 + b36.f.i(13, s30Var2.computeSize());
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
                this.f26452d = aVar2.i(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f26453e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
            default:
                return -1;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.qd0 qd0Var3 = new bw5.qd0();
                    if (bArr != null && bArr.length > 0) {
                        qd0Var3.parseFrom(bArr);
                    }
                    this.f26454f = qd0Var3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.n30 n30Var3 = new bw5.n30();
                    if (bArr2 != null && bArr2.length > 0) {
                        n30Var3.parseFrom(bArr2);
                    }
                    this.f26455g = n30Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f26456h = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f26457i = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.lm lmVar = new bw5.lm();
                    if (bArr3 != null && bArr3.length > 0) {
                        lmVar.parseFrom(bArr3);
                    }
                    linkedList.add(lmVar);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f26459n = aVar2.g(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f26460o = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f26461p = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f26462q = aVar2.i(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.s30 s30Var3 = new bw5.s30();
                    if (bArr4 != null && bArr4.length > 0) {
                        s30Var3.parseFrom(bArr4);
                    }
                    this.f26463r = s30Var3;
                }
                zArr[13] = true;
                return 0;
        }
    }
}
