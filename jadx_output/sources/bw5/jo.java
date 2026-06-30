package bw5;

/* loaded from: classes2.dex */
public class jo extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f29057d;

    /* renamed from: e, reason: collision with root package name */
    public long f29058e;

    /* renamed from: f, reason: collision with root package name */
    public int f29059f;

    /* renamed from: g, reason: collision with root package name */
    public int f29060g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.lo f29061h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.mo f29062i;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f29064n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f29065o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f29066p;

    /* renamed from: q, reason: collision with root package name */
    public long f29067q;

    /* renamed from: r, reason: collision with root package name */
    public int f29068r;

    /* renamed from: s, reason: collision with root package name */
    public long f29069s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f29063m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final boolean[] f29070t = new boolean[18];

    static {
        new bw5.jo();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.jo parseFrom(byte[] bArr) {
        return (bw5.jo) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.jo)) {
            return false;
        }
        bw5.jo joVar = (bw5.jo) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f29057d), java.lang.Integer.valueOf(joVar.f29057d)) && n51.f.a(java.lang.Long.valueOf(this.f29058e), java.lang.Long.valueOf(joVar.f29058e)) && n51.f.a(java.lang.Integer.valueOf(this.f29059f), java.lang.Integer.valueOf(joVar.f29059f)) && n51.f.a(java.lang.Integer.valueOf(this.f29060g), java.lang.Integer.valueOf(joVar.f29060g)) && n51.f.a(this.f29061h, joVar.f29061h) && n51.f.a(this.f29062i, joVar.f29062i) && n51.f.a(this.f29063m, joVar.f29063m) && n51.f.a(this.f29064n, joVar.f29064n) && n51.f.a(this.f29065o, joVar.f29065o) && n51.f.a(this.f29066p, joVar.f29066p) && n51.f.a(java.lang.Long.valueOf(this.f29067q), java.lang.Long.valueOf(joVar.f29067q)) && n51.f.a(java.lang.Integer.valueOf(this.f29068r), java.lang.Integer.valueOf(joVar.f29068r)) && n51.f.a(java.lang.Long.valueOf(this.f29069s), java.lang.Long.valueOf(joVar.f29069s));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.jo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f29063m;
        boolean[] zArr = this.f29070t;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f29057d);
            }
            if (zArr[2]) {
                fVar.h(2, this.f29058e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f29059f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f29060g);
            }
            bw5.lo loVar = this.f29061h;
            if (loVar != null && zArr[6]) {
                fVar.i(6, loVar.computeSize());
                this.f29061h.writeFields(fVar);
            }
            bw5.mo moVar = this.f29062i;
            if (moVar != null && zArr[7]) {
                fVar.i(7, moVar.computeSize());
                this.f29062i.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            java.lang.String str = this.f29064n;
            if (str != null && zArr[10]) {
                fVar.j(10, str);
            }
            java.lang.String str2 = this.f29065o;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            java.lang.String str3 = this.f29066p;
            if (str3 != null && zArr[12]) {
                fVar.j(12, str3);
            }
            if (zArr[15]) {
                fVar.h(15, this.f29067q);
            }
            if (zArr[16]) {
                fVar.e(16, this.f29068r);
            }
            if (!zArr[17]) {
                return 0;
            }
            fVar.h(17, this.f29069s);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f29057d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.h(2, this.f29058e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f29059f);
            }
            if (zArr[4]) {
                e17 += b36.f.e(4, this.f29060g);
            }
            bw5.lo loVar2 = this.f29061h;
            if (loVar2 != null && zArr[6]) {
                e17 += b36.f.i(6, loVar2.computeSize());
            }
            bw5.mo moVar2 = this.f29062i;
            if (moVar2 != null && zArr[7]) {
                e17 += b36.f.i(7, moVar2.computeSize());
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList);
            java.lang.String str4 = this.f29064n;
            if (str4 != null && zArr[10]) {
                g17 += b36.f.j(10, str4);
            }
            java.lang.String str5 = this.f29065o;
            if (str5 != null && zArr[11]) {
                g17 += b36.f.j(11, str5);
            }
            java.lang.String str6 = this.f29066p;
            if (str6 != null && zArr[12]) {
                g17 += b36.f.j(12, str6);
            }
            if (zArr[15]) {
                g17 += b36.f.h(15, this.f29067q);
            }
            if (zArr[16]) {
                g17 += b36.f.e(16, this.f29068r);
            }
            return zArr[17] ? g17 + b36.f.h(17, this.f29069s) : g17;
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
                this.f29057d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f29058e = aVar2.i(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f29059f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f29060g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
            case 9:
            case 13:
            case 14:
            default:
                return -1;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.lo loVar3 = new bw5.lo();
                    if (bArr != null && bArr.length > 0) {
                        loVar3.parseFrom(bArr);
                    }
                    this.f29061h = loVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.mo moVar3 = new bw5.mo();
                    if (bArr2 != null && bArr2.length > 0) {
                        moVar3.parseFrom(bArr2);
                    }
                    this.f29062i = moVar3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.t30 t30Var = new bw5.t30();
                    if (bArr3 != null && bArr3.length > 0) {
                        t30Var.parseFrom(bArr3);
                    }
                    linkedList.add(t30Var);
                }
                zArr[8] = true;
                return 0;
            case 10:
                this.f29064n = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f29065o = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f29066p = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 15:
                this.f29067q = aVar2.i(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f29068r = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                this.f29069s = aVar2.i(intValue);
                zArr[17] = true;
                return 0;
        }
    }
}
