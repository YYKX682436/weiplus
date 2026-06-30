package bw5;

/* loaded from: classes2.dex */
public class ql extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ae f32152d;

    /* renamed from: e, reason: collision with root package name */
    public int f32153e;

    /* renamed from: f, reason: collision with root package name */
    public int f32154f;

    /* renamed from: g, reason: collision with root package name */
    public int f32155g;

    /* renamed from: h, reason: collision with root package name */
    public int f32156h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.yk f32157i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f32158m;

    /* renamed from: n, reason: collision with root package name */
    public int f32159n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f32160o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32161p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32162q;

    /* renamed from: s, reason: collision with root package name */
    public long f32164s;

    /* renamed from: t, reason: collision with root package name */
    public long f32165t;

    /* renamed from: u, reason: collision with root package name */
    public bw5.w30 f32166u;

    /* renamed from: v, reason: collision with root package name */
    public bw5.tk f32167v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.rl f32168w;

    /* renamed from: x, reason: collision with root package name */
    public bw5.rm f32169x;

    /* renamed from: y, reason: collision with root package name */
    public int f32170y;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f32163r = new java.util.LinkedList();

    /* renamed from: z, reason: collision with root package name */
    public final boolean[] f32171z = new boolean[26];

    static {
        new bw5.ql();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ql parseFrom(byte[] bArr) {
        return (bw5.ql) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ql)) {
            return false;
        }
        bw5.ql qlVar = (bw5.ql) fVar;
        return n51.f.a(this.f32152d, qlVar.f32152d) && n51.f.a(java.lang.Integer.valueOf(this.f32153e), java.lang.Integer.valueOf(qlVar.f32153e)) && n51.f.a(java.lang.Integer.valueOf(this.f32154f), java.lang.Integer.valueOf(qlVar.f32154f)) && n51.f.a(java.lang.Integer.valueOf(this.f32155g), java.lang.Integer.valueOf(qlVar.f32155g)) && n51.f.a(java.lang.Integer.valueOf(this.f32156h), java.lang.Integer.valueOf(qlVar.f32156h)) && n51.f.a(this.f32157i, qlVar.f32157i) && n51.f.a(this.f32158m, qlVar.f32158m) && n51.f.a(java.lang.Integer.valueOf(this.f32159n), java.lang.Integer.valueOf(qlVar.f32159n)) && n51.f.a(this.f32160o, qlVar.f32160o) && n51.f.a(this.f32161p, qlVar.f32161p) && n51.f.a(java.lang.Boolean.valueOf(this.f32162q), java.lang.Boolean.valueOf(qlVar.f32162q)) && n51.f.a(this.f32163r, qlVar.f32163r) && n51.f.a(java.lang.Long.valueOf(this.f32164s), java.lang.Long.valueOf(qlVar.f32164s)) && n51.f.a(java.lang.Long.valueOf(this.f32165t), java.lang.Long.valueOf(qlVar.f32165t)) && n51.f.a(this.f32166u, qlVar.f32166u) && n51.f.a(this.f32167v, qlVar.f32167v) && n51.f.a(this.f32168w, qlVar.f32168w) && n51.f.a(this.f32169x, qlVar.f32169x) && n51.f.a(java.lang.Integer.valueOf(this.f32170y), java.lang.Integer.valueOf(qlVar.f32170y));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ql();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32163r;
        int i18 = 0;
        boolean[] zArr = this.f32171z;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ae aeVar = this.f32152d;
            if (aeVar != null && zArr[1]) {
                fVar.i(1, aeVar.computeSize());
                this.f32152d.writeFields(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f32153e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f32154f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f32155g);
            }
            if (zArr[5]) {
                fVar.e(5, this.f32156h);
            }
            bw5.yk ykVar = this.f32157i;
            if (ykVar != null && zArr[6]) {
                fVar.i(6, ykVar.computeSize());
                this.f32157i.writeFields(fVar);
            }
            java.lang.String str = this.f32158m;
            if (str != null && zArr[9]) {
                fVar.j(9, str);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32159n);
            }
            java.lang.String str2 = this.f32160o;
            if (str2 != null && zArr[11]) {
                fVar.j(11, str2);
            }
            com.tencent.mm.protobuf.g gVar = this.f32161p;
            if (gVar != null && zArr[12]) {
                fVar.b(12, gVar);
            }
            if (zArr[13]) {
                fVar.a(13, this.f32162q);
            }
            fVar.g(14, 8, linkedList);
            if (zArr[16]) {
                fVar.h(16, this.f32164s);
            }
            if (zArr[18]) {
                fVar.h(18, this.f32165t);
            }
            bw5.w30 w30Var = this.f32166u;
            if (w30Var != null && zArr[19]) {
                fVar.i(19, w30Var.computeSize());
                this.f32166u.writeFields(fVar);
            }
            bw5.tk tkVar = this.f32167v;
            if (tkVar != null && zArr[21]) {
                fVar.i(21, tkVar.computeSize());
                this.f32167v.writeFields(fVar);
            }
            bw5.rl rlVar = this.f32168w;
            if (rlVar != null && zArr[22]) {
                fVar.i(22, rlVar.computeSize());
                this.f32168w.writeFields(fVar);
            }
            bw5.rm rmVar = this.f32169x;
            if (rmVar != null && zArr[23]) {
                fVar.i(23, rmVar.computeSize());
                this.f32169x.writeFields(fVar);
            }
            if (zArr[25]) {
                fVar.e(25, this.f32170y);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ae aeVar2 = this.f32152d;
            if (aeVar2 != null && zArr[1]) {
                i18 = b36.f.i(1, aeVar2.computeSize()) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f32153e);
            }
            if (zArr[3]) {
                i18 += b36.f.e(3, this.f32154f);
            }
            if (zArr[4]) {
                i18 += b36.f.e(4, this.f32155g);
            }
            if (zArr[5]) {
                i18 += b36.f.e(5, this.f32156h);
            }
            bw5.yk ykVar2 = this.f32157i;
            if (ykVar2 != null && zArr[6]) {
                i18 += b36.f.i(6, ykVar2.computeSize());
            }
            java.lang.String str3 = this.f32158m;
            if (str3 != null && zArr[9]) {
                i18 += b36.f.j(9, str3);
            }
            if (zArr[10]) {
                i18 += b36.f.e(10, this.f32159n);
            }
            java.lang.String str4 = this.f32160o;
            if (str4 != null && zArr[11]) {
                i18 += b36.f.j(11, str4);
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32161p;
            if (gVar2 != null && zArr[12]) {
                i18 += b36.f.b(12, gVar2);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f32162q);
            }
            int g17 = i18 + b36.f.g(14, 8, linkedList);
            if (zArr[16]) {
                g17 += b36.f.h(16, this.f32164s);
            }
            if (zArr[18]) {
                g17 += b36.f.h(18, this.f32165t);
            }
            bw5.w30 w30Var2 = this.f32166u;
            if (w30Var2 != null && zArr[19]) {
                g17 += b36.f.i(19, w30Var2.computeSize());
            }
            bw5.tk tkVar2 = this.f32167v;
            if (tkVar2 != null && zArr[21]) {
                g17 += b36.f.i(21, tkVar2.computeSize());
            }
            bw5.rl rlVar2 = this.f32168w;
            if (rlVar2 != null && zArr[22]) {
                g17 += b36.f.i(22, rlVar2.computeSize());
            }
            bw5.rm rmVar2 = this.f32169x;
            if (rmVar2 != null && zArr[23]) {
                g17 += b36.f.i(23, rmVar2.computeSize());
            }
            return zArr[25] ? g17 + b36.f.e(25, this.f32170y) : g17;
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
                    bw5.ae aeVar3 = new bw5.ae();
                    if (bArr != null && bArr.length > 0) {
                        aeVar3.parseFrom(bArr);
                    }
                    this.f32152d = aeVar3;
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f32153e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f32154f = aVar2.g(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f32155g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f32156h = aVar2.g(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.yk ykVar3 = new bw5.yk();
                    if (bArr2 != null && bArr2.length > 0) {
                        ykVar3.parseFrom(bArr2);
                    }
                    this.f32157i = ykVar3;
                }
                zArr[6] = true;
                return 0;
            case 7:
            case 8:
            case 15:
            case 17:
            case 20:
            case 24:
            default:
                return -1;
            case 9:
                this.f32158m = aVar2.k(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f32159n = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32160o = aVar2.k(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32161p = aVar2.d(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32162q = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.yk ykVar4 = new bw5.yk();
                    if (bArr3 != null && bArr3.length > 0) {
                        ykVar4.parseFrom(bArr3);
                    }
                    linkedList.add(ykVar4);
                }
                zArr[14] = true;
                return 0;
            case 16:
                this.f32164s = aVar2.i(intValue);
                zArr[16] = true;
                return 0;
            case 18:
                this.f32165t = aVar2.i(intValue);
                zArr[18] = true;
                return 0;
            case 19:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.w30 w30Var3 = new bw5.w30();
                    if (bArr4 != null && bArr4.length > 0) {
                        w30Var3.parseFrom(bArr4);
                    }
                    this.f32166u = w30Var3;
                }
                zArr[19] = true;
                return 0;
            case 21:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.tk tkVar3 = new bw5.tk();
                    if (bArr5 != null && bArr5.length > 0) {
                        tkVar3.parseFrom(bArr5);
                    }
                    this.f32167v = tkVar3;
                }
                zArr[21] = true;
                return 0;
            case 22:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.rl rlVar3 = new bw5.rl();
                    if (bArr6 != null && bArr6.length > 0) {
                        rlVar3.parseFrom(bArr6);
                    }
                    this.f32168w = rlVar3;
                }
                zArr[22] = true;
                return 0;
            case 23:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.rm rmVar3 = new bw5.rm();
                    if (bArr7 != null && bArr7.length > 0) {
                        rmVar3.parseFrom(bArr7);
                    }
                    this.f32169x = rmVar3;
                }
                zArr[23] = true;
                return 0;
            case 25:
                this.f32170y = aVar2.g(intValue);
                zArr[25] = true;
                return 0;
        }
    }
}
