package bw5;

/* loaded from: classes9.dex */
public class s8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32843d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.x7 f32844e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.x7 f32845f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.x7 f32846g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.x7 f32847h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f32848i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.x7 f32849m;

    /* renamed from: n, reason: collision with root package name */
    public bw5.x7 f32850n;

    /* renamed from: o, reason: collision with root package name */
    public bw5.x7 f32851o;

    /* renamed from: p, reason: collision with root package name */
    public int f32852p;

    /* renamed from: q, reason: collision with root package name */
    public int f32853q;

    /* renamed from: r, reason: collision with root package name */
    public int f32854r;

    /* renamed from: s, reason: collision with root package name */
    public int f32855s;

    /* renamed from: t, reason: collision with root package name */
    public long f32856t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32857u = new boolean[15];

    static {
        new bw5.s8();
    }

    public bw5.x7 b() {
        return this.f32857u[2] ? this.f32844e : new bw5.x7();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.s8 parseFrom(byte[] bArr) {
        return (bw5.s8) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.s8)) {
            return false;
        }
        bw5.s8 s8Var = (bw5.s8) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32843d), java.lang.Integer.valueOf(s8Var.f32843d)) && n51.f.a(this.f32844e, s8Var.f32844e) && n51.f.a(this.f32845f, s8Var.f32845f) && n51.f.a(this.f32846g, s8Var.f32846g) && n51.f.a(this.f32847h, s8Var.f32847h) && n51.f.a(this.f32848i, s8Var.f32848i) && n51.f.a(this.f32849m, s8Var.f32849m) && n51.f.a(this.f32850n, s8Var.f32850n) && n51.f.a(this.f32851o, s8Var.f32851o) && n51.f.a(java.lang.Integer.valueOf(this.f32852p), java.lang.Integer.valueOf(s8Var.f32852p)) && n51.f.a(java.lang.Integer.valueOf(this.f32853q), java.lang.Integer.valueOf(s8Var.f32853q)) && n51.f.a(java.lang.Integer.valueOf(this.f32854r), java.lang.Integer.valueOf(s8Var.f32854r)) && n51.f.a(java.lang.Integer.valueOf(this.f32855s), java.lang.Integer.valueOf(s8Var.f32855s)) && n51.f.a(java.lang.Long.valueOf(this.f32856t), java.lang.Long.valueOf(s8Var.f32856t));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.s8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f32857u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32843d);
            }
            bw5.x7 x7Var = this.f32844e;
            if (x7Var != null && zArr[2]) {
                fVar.i(2, x7Var.computeSize());
                this.f32844e.writeFields(fVar);
            }
            bw5.x7 x7Var2 = this.f32845f;
            if (x7Var2 != null && zArr[3]) {
                fVar.i(3, x7Var2.computeSize());
                this.f32845f.writeFields(fVar);
            }
            bw5.x7 x7Var3 = this.f32846g;
            if (x7Var3 != null && zArr[4]) {
                fVar.i(4, x7Var3.computeSize());
                this.f32846g.writeFields(fVar);
            }
            bw5.x7 x7Var4 = this.f32847h;
            if (x7Var4 != null && zArr[5]) {
                fVar.i(5, x7Var4.computeSize());
                this.f32847h.writeFields(fVar);
            }
            bw5.x7 x7Var5 = this.f32848i;
            if (x7Var5 != null && zArr[6]) {
                fVar.i(6, x7Var5.computeSize());
                this.f32848i.writeFields(fVar);
            }
            bw5.x7 x7Var6 = this.f32849m;
            if (x7Var6 != null && zArr[7]) {
                fVar.i(7, x7Var6.computeSize());
                this.f32849m.writeFields(fVar);
            }
            bw5.x7 x7Var7 = this.f32850n;
            if (x7Var7 != null && zArr[8]) {
                fVar.i(8, x7Var7.computeSize());
                this.f32850n.writeFields(fVar);
            }
            bw5.x7 x7Var8 = this.f32851o;
            if (x7Var8 != null && zArr[9]) {
                fVar.i(9, x7Var8.computeSize());
                this.f32851o.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.e(10, this.f32852p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f32853q);
            }
            if (zArr[12]) {
                fVar.e(12, this.f32854r);
            }
            if (zArr[13]) {
                fVar.e(13, this.f32855s);
            }
            if (!zArr[14]) {
                return 0;
            }
            fVar.h(14, this.f32856t);
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f32843d) : 0;
            bw5.x7 x7Var9 = this.f32844e;
            if (x7Var9 != null && zArr[2]) {
                e17 += b36.f.i(2, x7Var9.computeSize());
            }
            bw5.x7 x7Var10 = this.f32845f;
            if (x7Var10 != null && zArr[3]) {
                e17 += b36.f.i(3, x7Var10.computeSize());
            }
            bw5.x7 x7Var11 = this.f32846g;
            if (x7Var11 != null && zArr[4]) {
                e17 += b36.f.i(4, x7Var11.computeSize());
            }
            bw5.x7 x7Var12 = this.f32847h;
            if (x7Var12 != null && zArr[5]) {
                e17 += b36.f.i(5, x7Var12.computeSize());
            }
            bw5.x7 x7Var13 = this.f32848i;
            if (x7Var13 != null && zArr[6]) {
                e17 += b36.f.i(6, x7Var13.computeSize());
            }
            bw5.x7 x7Var14 = this.f32849m;
            if (x7Var14 != null && zArr[7]) {
                e17 += b36.f.i(7, x7Var14.computeSize());
            }
            bw5.x7 x7Var15 = this.f32850n;
            if (x7Var15 != null && zArr[8]) {
                e17 += b36.f.i(8, x7Var15.computeSize());
            }
            bw5.x7 x7Var16 = this.f32851o;
            if (x7Var16 != null && zArr[9]) {
                e17 += b36.f.i(9, x7Var16.computeSize());
            }
            if (zArr[10]) {
                e17 += b36.f.e(10, this.f32852p);
            }
            if (zArr[11]) {
                e17 += b36.f.e(11, this.f32853q);
            }
            if (zArr[12]) {
                e17 += b36.f.e(12, this.f32854r);
            }
            if (zArr[13]) {
                e17 += b36.f.e(13, this.f32855s);
            }
            return zArr[14] ? e17 + b36.f.h(14, this.f32856t) : e17;
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
                this.f32843d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.x7 x7Var17 = new bw5.x7();
                    if (bArr != null && bArr.length > 0) {
                        x7Var17.parseFrom(bArr);
                    }
                    this.f32844e = x7Var17;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.x7 x7Var18 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var18.parseFrom(bArr2);
                    }
                    this.f32845f = x7Var18;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.x7 x7Var19 = new bw5.x7();
                    if (bArr3 != null && bArr3.length > 0) {
                        x7Var19.parseFrom(bArr3);
                    }
                    this.f32846g = x7Var19;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.x7 x7Var20 = new bw5.x7();
                    if (bArr4 != null && bArr4.length > 0) {
                        x7Var20.parseFrom(bArr4);
                    }
                    this.f32847h = x7Var20;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.x7 x7Var21 = new bw5.x7();
                    if (bArr5 != null && bArr5.length > 0) {
                        x7Var21.parseFrom(bArr5);
                    }
                    this.f32848i = x7Var21;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.x7 x7Var22 = new bw5.x7();
                    if (bArr6 != null && bArr6.length > 0) {
                        x7Var22.parseFrom(bArr6);
                    }
                    this.f32849m = x7Var22;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.x7 x7Var23 = new bw5.x7();
                    if (bArr7 != null && bArr7.length > 0) {
                        x7Var23.parseFrom(bArr7);
                    }
                    this.f32850n = x7Var23;
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.x7 x7Var24 = new bw5.x7();
                    if (bArr8 != null && bArr8.length > 0) {
                        x7Var24.parseFrom(bArr8);
                    }
                    this.f32851o = x7Var24;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f32852p = aVar2.g(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f32853q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f32854r = aVar2.g(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f32855s = aVar2.g(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f32856t = aVar2.i(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
