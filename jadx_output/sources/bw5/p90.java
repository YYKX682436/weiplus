package bw5;

/* loaded from: classes2.dex */
public class p90 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f31507d;

    /* renamed from: e, reason: collision with root package name */
    public int f31508e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.o90 f31509f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.o50 f31510g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.o50 f31511h;

    /* renamed from: i, reason: collision with root package name */
    public int f31512i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.e80 f31513m;

    /* renamed from: n, reason: collision with root package name */
    public int f31514n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.mc0 f31515o;

    /* renamed from: p, reason: collision with root package name */
    public bw5.o50 f31516p;

    /* renamed from: q, reason: collision with root package name */
    public bw5.o50 f31517q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.n90 f31518r;

    /* renamed from: s, reason: collision with root package name */
    public long f31519s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31520t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f31521u;

    /* renamed from: v, reason: collision with root package name */
    public int f31522v;

    /* renamed from: w, reason: collision with root package name */
    public bw5.e80 f31523w;

    /* renamed from: y, reason: collision with root package name */
    public int f31525y;

    /* renamed from: z, reason: collision with root package name */
    public bw5.o90 f31526z;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.LinkedList f31524x = new java.util.LinkedList();
    public final boolean[] A = new boolean[21];

    static {
        new bw5.p90();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.p90 parseFrom(byte[] bArr) {
        return (bw5.p90) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p90)) {
            return false;
        }
        bw5.p90 p90Var = (bw5.p90) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f31507d), java.lang.Integer.valueOf(p90Var.f31507d)) && n51.f.a(java.lang.Integer.valueOf(this.f31508e), java.lang.Integer.valueOf(p90Var.f31508e)) && n51.f.a(this.f31509f, p90Var.f31509f) && n51.f.a(this.f31510g, p90Var.f31510g) && n51.f.a(this.f31511h, p90Var.f31511h) && n51.f.a(java.lang.Integer.valueOf(this.f31512i), java.lang.Integer.valueOf(p90Var.f31512i)) && n51.f.a(this.f31513m, p90Var.f31513m) && n51.f.a(java.lang.Integer.valueOf(this.f31514n), java.lang.Integer.valueOf(p90Var.f31514n)) && n51.f.a(this.f31515o, p90Var.f31515o) && n51.f.a(this.f31516p, p90Var.f31516p) && n51.f.a(this.f31517q, p90Var.f31517q) && n51.f.a(this.f31518r, p90Var.f31518r) && n51.f.a(java.lang.Long.valueOf(this.f31519s), java.lang.Long.valueOf(p90Var.f31519s)) && n51.f.a(java.lang.Boolean.valueOf(this.f31520t), java.lang.Boolean.valueOf(p90Var.f31520t)) && n51.f.a(this.f31521u, p90Var.f31521u) && n51.f.a(java.lang.Integer.valueOf(this.f31522v), java.lang.Integer.valueOf(p90Var.f31522v)) && n51.f.a(this.f31523w, p90Var.f31523w) && n51.f.a(this.f31524x, p90Var.f31524x) && n51.f.a(java.lang.Integer.valueOf(this.f31525y), java.lang.Integer.valueOf(p90Var.f31525y)) && n51.f.a(this.f31526z, p90Var.f31526z);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p90();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f31524x;
        boolean[] zArr = this.A;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f31507d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f31508e);
            }
            bw5.o90 o90Var = this.f31509f;
            if (o90Var != null && zArr[3]) {
                fVar.i(3, o90Var.computeSize());
                this.f31509f.writeFields(fVar);
            }
            bw5.o50 o50Var = this.f31510g;
            if (o50Var != null && zArr[4]) {
                fVar.i(4, o50Var.computeSize());
                this.f31510g.writeFields(fVar);
            }
            bw5.o50 o50Var2 = this.f31511h;
            if (o50Var2 != null && zArr[5]) {
                fVar.i(5, o50Var2.computeSize());
                this.f31511h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.e(6, this.f31512i);
            }
            bw5.e80 e80Var = this.f31513m;
            if (e80Var != null && zArr[7]) {
                fVar.i(7, e80Var.computeSize());
                this.f31513m.writeFields(fVar);
            }
            if (zArr[8]) {
                fVar.e(8, this.f31514n);
            }
            bw5.mc0 mc0Var = this.f31515o;
            if (mc0Var != null && zArr[9]) {
                fVar.i(9, mc0Var.computeSize());
                this.f31515o.writeFields(fVar);
            }
            bw5.o50 o50Var3 = this.f31516p;
            if (o50Var3 != null && zArr[10]) {
                fVar.i(10, o50Var3.computeSize());
                this.f31516p.writeFields(fVar);
            }
            bw5.o50 o50Var4 = this.f31517q;
            if (o50Var4 != null && zArr[11]) {
                fVar.i(11, o50Var4.computeSize());
                this.f31517q.writeFields(fVar);
            }
            bw5.n90 n90Var = this.f31518r;
            if (n90Var != null && zArr[12]) {
                fVar.i(12, n90Var.computeSize());
                this.f31518r.writeFields(fVar);
            }
            if (zArr[13]) {
                fVar.h(13, this.f31519s);
            }
            if (zArr[14]) {
                fVar.a(14, this.f31520t);
            }
            java.lang.String str = this.f31521u;
            if (str != null && zArr[15]) {
                fVar.j(15, str);
            }
            if (zArr[16]) {
                fVar.e(16, this.f31522v);
            }
            bw5.e80 e80Var2 = this.f31523w;
            if (e80Var2 != null && zArr[17]) {
                fVar.i(17, e80Var2.computeSize());
                this.f31523w.writeFields(fVar);
            }
            fVar.g(18, 8, linkedList);
            if (zArr[19]) {
                fVar.e(19, this.f31525y);
            }
            bw5.o90 o90Var2 = this.f31526z;
            if (o90Var2 != null && zArr[20]) {
                fVar.i(20, o90Var2.computeSize());
                this.f31526z.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f31507d) + 0 : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f31508e);
            }
            bw5.o90 o90Var3 = this.f31509f;
            if (o90Var3 != null && zArr[3]) {
                e17 += b36.f.i(3, o90Var3.computeSize());
            }
            bw5.o50 o50Var5 = this.f31510g;
            if (o50Var5 != null && zArr[4]) {
                e17 += b36.f.i(4, o50Var5.computeSize());
            }
            bw5.o50 o50Var6 = this.f31511h;
            if (o50Var6 != null && zArr[5]) {
                e17 += b36.f.i(5, o50Var6.computeSize());
            }
            if (zArr[6]) {
                e17 += b36.f.e(6, this.f31512i);
            }
            bw5.e80 e80Var3 = this.f31513m;
            if (e80Var3 != null && zArr[7]) {
                e17 += b36.f.i(7, e80Var3.computeSize());
            }
            if (zArr[8]) {
                e17 += b36.f.e(8, this.f31514n);
            }
            bw5.mc0 mc0Var2 = this.f31515o;
            if (mc0Var2 != null && zArr[9]) {
                e17 += b36.f.i(9, mc0Var2.computeSize());
            }
            bw5.o50 o50Var7 = this.f31516p;
            if (o50Var7 != null && zArr[10]) {
                e17 += b36.f.i(10, o50Var7.computeSize());
            }
            bw5.o50 o50Var8 = this.f31517q;
            if (o50Var8 != null && zArr[11]) {
                e17 += b36.f.i(11, o50Var8.computeSize());
            }
            bw5.n90 n90Var2 = this.f31518r;
            if (n90Var2 != null && zArr[12]) {
                e17 += b36.f.i(12, n90Var2.computeSize());
            }
            if (zArr[13]) {
                e17 += b36.f.h(13, this.f31519s);
            }
            if (zArr[14]) {
                e17 += b36.f.a(14, this.f31520t);
            }
            java.lang.String str2 = this.f31521u;
            if (str2 != null && zArr[15]) {
                e17 += b36.f.j(15, str2);
            }
            if (zArr[16]) {
                e17 += b36.f.e(16, this.f31522v);
            }
            bw5.e80 e80Var4 = this.f31523w;
            if (e80Var4 != null && zArr[17]) {
                e17 += b36.f.i(17, e80Var4.computeSize());
            }
            int g17 = e17 + b36.f.g(18, 8, linkedList);
            if (zArr[19]) {
                g17 += b36.f.e(19, this.f31525y);
            }
            bw5.o90 o90Var4 = this.f31526z;
            return (o90Var4 == null || !zArr[20]) ? g17 : g17 + b36.f.i(20, o90Var4.computeSize());
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
                this.f31507d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f31508e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.o90 o90Var5 = new bw5.o90();
                    if (bArr != null && bArr.length > 0) {
                        o90Var5.parseFrom(bArr);
                    }
                    this.f31509f = o90Var5;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.o50 o50Var9 = new bw5.o50();
                    if (bArr2 != null && bArr2.length > 0) {
                        o50Var9.parseFrom(bArr2);
                    }
                    this.f31510g = o50Var9;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.o50 o50Var10 = new bw5.o50();
                    if (bArr3 != null && bArr3.length > 0) {
                        o50Var10.parseFrom(bArr3);
                    }
                    this.f31511h = o50Var10;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f31512i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.e80 e80Var5 = new bw5.e80();
                    if (bArr4 != null && bArr4.length > 0) {
                        e80Var5.parseFrom(bArr4);
                    }
                    this.f31513m = e80Var5;
                }
                zArr[7] = true;
                return 0;
            case 8:
                this.f31514n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr5 != null && bArr5.length > 0) {
                        mc0Var3.parseFrom(bArr5);
                    }
                    this.f31515o = mc0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.o50 o50Var11 = new bw5.o50();
                    if (bArr6 != null && bArr6.length > 0) {
                        o50Var11.parseFrom(bArr6);
                    }
                    this.f31516p = o50Var11;
                }
                zArr[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.o50 o50Var12 = new bw5.o50();
                    if (bArr7 != null && bArr7.length > 0) {
                        o50Var12.parseFrom(bArr7);
                    }
                    this.f31517q = o50Var12;
                }
                zArr[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.n90 n90Var3 = new bw5.n90();
                    if (bArr8 != null && bArr8.length > 0) {
                        n90Var3.parseFrom(bArr8);
                    }
                    this.f31518r = n90Var3;
                }
                zArr[12] = true;
                return 0;
            case 13:
                this.f31519s = aVar2.i(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f31520t = aVar2.c(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f31521u = aVar2.k(intValue);
                zArr[15] = true;
                return 0;
            case 16:
                this.f31522v = aVar2.g(intValue);
                zArr[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.e80 e80Var6 = new bw5.e80();
                    if (bArr9 != null && bArr9.length > 0) {
                        e80Var6.parseFrom(bArr9);
                    }
                    this.f31523w = e80Var6;
                }
                zArr[17] = true;
                return 0;
            case 18:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.n90 n90Var4 = new bw5.n90();
                    if (bArr10 != null && bArr10.length > 0) {
                        n90Var4.parseFrom(bArr10);
                    }
                    linkedList.add(n90Var4);
                }
                zArr[18] = true;
                return 0;
            case 19:
                this.f31525y = aVar2.g(intValue);
                zArr[19] = true;
                return 0;
            case 20:
                java.util.LinkedList j48 = aVar2.j(intValue);
                int size11 = j48.size();
                for (int i49 = 0; i49 < size11; i49++) {
                    byte[] bArr11 = (byte[]) j48.get(i49);
                    bw5.o90 o90Var6 = new bw5.o90();
                    if (bArr11 != null && bArr11.length > 0) {
                        o90Var6.parseFrom(bArr11);
                    }
                    this.f31526z = o90Var6;
                }
                zArr[20] = true;
                return 0;
            default:
                return -1;
        }
    }
}
