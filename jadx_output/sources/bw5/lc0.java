package bw5;

/* loaded from: classes8.dex */
public class lc0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f29737d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29738e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f29739f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f29740g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f29741h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f29742i;

    /* renamed from: m, reason: collision with root package name */
    public int f29743m;

    /* renamed from: o, reason: collision with root package name */
    public boolean f29745o;

    /* renamed from: p, reason: collision with root package name */
    public int f29746p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29748r;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f29744n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f29747q = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final boolean[] f29749s = new boolean[13];

    static {
        new bw5.lc0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.lc0 parseFrom(byte[] bArr) {
        return (bw5.lc0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.lc0)) {
            return false;
        }
        bw5.lc0 lc0Var = (bw5.lc0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f29737d), java.lang.Boolean.valueOf(lc0Var.f29737d)) && n51.f.a(java.lang.Boolean.valueOf(this.f29738e), java.lang.Boolean.valueOf(lc0Var.f29738e)) && n51.f.a(java.lang.Boolean.valueOf(this.f29739f), java.lang.Boolean.valueOf(lc0Var.f29739f)) && n51.f.a(java.lang.Boolean.valueOf(this.f29740g), java.lang.Boolean.valueOf(lc0Var.f29740g)) && n51.f.a(java.lang.Boolean.valueOf(this.f29741h), java.lang.Boolean.valueOf(lc0Var.f29741h)) && n51.f.a(java.lang.Boolean.valueOf(this.f29742i), java.lang.Boolean.valueOf(lc0Var.f29742i)) && n51.f.a(java.lang.Integer.valueOf(this.f29743m), java.lang.Integer.valueOf(lc0Var.f29743m)) && n51.f.a(this.f29744n, lc0Var.f29744n) && n51.f.a(java.lang.Boolean.valueOf(this.f29745o), java.lang.Boolean.valueOf(lc0Var.f29745o)) && n51.f.a(java.lang.Integer.valueOf(this.f29746p), java.lang.Integer.valueOf(lc0Var.f29746p)) && n51.f.a(this.f29747q, lc0Var.f29747q) && n51.f.a(java.lang.Boolean.valueOf(this.f29748r), java.lang.Boolean.valueOf(lc0Var.f29748r));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.lc0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29747q;
        java.util.LinkedList linkedList2 = this.f29744n;
        boolean[] zArr = this.f29749s;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f29737d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f29738e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f29739f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f29740g);
            }
            if (zArr[5]) {
                fVar.a(5, this.f29741h);
            }
            if (zArr[6]) {
                fVar.a(6, this.f29742i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f29743m);
            }
            fVar.g(8, 8, linkedList2);
            if (zArr[9]) {
                fVar.a(9, this.f29745o);
            }
            if (zArr[10]) {
                fVar.e(10, this.f29746p);
            }
            fVar.g(11, 8, linkedList);
            if (!zArr[12]) {
                return 0;
            }
            fVar.a(12, this.f29748r);
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f29737d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f29738e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f29739f);
            }
            if (zArr[4]) {
                a17 += b36.f.a(4, this.f29740g);
            }
            if (zArr[5]) {
                a17 += b36.f.a(5, this.f29741h);
            }
            if (zArr[6]) {
                a17 += b36.f.a(6, this.f29742i);
            }
            if (zArr[7]) {
                a17 += b36.f.e(7, this.f29743m);
            }
            int g17 = a17 + b36.f.g(8, 8, linkedList2);
            if (zArr[9]) {
                g17 += b36.f.a(9, this.f29745o);
            }
            if (zArr[10]) {
                g17 += b36.f.e(10, this.f29746p);
            }
            int g18 = g17 + b36.f.g(11, 8, linkedList);
            return zArr[12] ? g18 + b36.f.a(12, this.f29748r) : g18;
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
                this.f29737d = aVar2.c(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29738e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29739f = aVar2.c(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29740g = aVar2.c(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f29741h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f29742i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f29743m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.jc0 jc0Var = new bw5.jc0();
                    if (bArr != null && bArr.length > 0) {
                        jc0Var.parseFrom(bArr);
                    }
                    linkedList2.add(jc0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                this.f29745o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f29746p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.kc0 kc0Var = new bw5.kc0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kc0Var.parseFrom(bArr2);
                    }
                    linkedList.add(kc0Var);
                }
                zArr[11] = true;
                return 0;
            case 12:
                this.f29748r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            default:
                return -1;
        }
    }
}
