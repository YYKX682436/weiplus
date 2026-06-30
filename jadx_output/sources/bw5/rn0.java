package bw5;

/* loaded from: classes11.dex */
public class rn0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f32607d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.yl0 f32608e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.in0 f32609f;

    /* renamed from: g, reason: collision with root package name */
    public long f32610g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.zl0 f32611h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.wl0 f32612i;

    /* renamed from: m, reason: collision with root package name */
    public bw5.wn0 f32613m;

    /* renamed from: o, reason: collision with root package name */
    public bw5.dm0 f32615o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f32616p;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f32614n = new java.util.LinkedList();

    /* renamed from: q, reason: collision with root package name */
    public final boolean[] f32617q = new boolean[12];

    static {
        new bw5.rn0();
    }

    public bw5.yl0 b() {
        return this.f32617q[2] ? this.f32608e : new bw5.yl0();
    }

    public bw5.dm0 c() {
        return this.f32617q[9] ? this.f32615o : new bw5.dm0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rn0)) {
            return false;
        }
        bw5.rn0 rn0Var = (bw5.rn0) fVar;
        return n51.f.a(this.f32607d, rn0Var.f32607d) && n51.f.a(this.f32608e, rn0Var.f32608e) && n51.f.a(this.f32609f, rn0Var.f32609f) && n51.f.a(java.lang.Long.valueOf(this.f32610g), java.lang.Long.valueOf(rn0Var.f32610g)) && n51.f.a(this.f32611h, rn0Var.f32611h) && n51.f.a(this.f32612i, rn0Var.f32612i) && n51.f.a(this.f32613m, rn0Var.f32613m) && n51.f.a(this.f32614n, rn0Var.f32614n) && n51.f.a(this.f32615o, rn0Var.f32615o) && n51.f.a(this.f32616p, rn0Var.f32616p);
    }

    public bw5.in0 d() {
        return this.f32617q[3] ? this.f32609f : new bw5.in0();
    }

    public bw5.wn0 e() {
        return this.f32617q[7] ? this.f32613m : new bw5.wn0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public bw5.rn0 parseFrom(byte[] bArr) {
        return (bw5.rn0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rn0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32614n;
        int i18 = 0;
        boolean[] zArr = this.f32617q;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f32607d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.yl0 yl0Var = this.f32608e;
            if (yl0Var != null && zArr[2]) {
                fVar.i(2, yl0Var.computeSize());
                this.f32608e.writeFields(fVar);
            }
            bw5.in0 in0Var = this.f32609f;
            if (in0Var != null && zArr[3]) {
                fVar.i(3, in0Var.computeSize());
                this.f32609f.writeFields(fVar);
            }
            if (zArr[4]) {
                fVar.h(4, this.f32610g);
            }
            bw5.zl0 zl0Var = this.f32611h;
            if (zl0Var != null && zArr[5]) {
                fVar.i(5, zl0Var.computeSize());
                this.f32611h.writeFields(fVar);
            }
            bw5.wl0 wl0Var = this.f32612i;
            if (wl0Var != null && zArr[6]) {
                fVar.i(6, wl0Var.computeSize());
                this.f32612i.writeFields(fVar);
            }
            bw5.wn0 wn0Var = this.f32613m;
            if (wn0Var != null && zArr[7]) {
                fVar.i(7, wn0Var.computeSize());
                this.f32613m.writeFields(fVar);
            }
            fVar.g(8, 8, linkedList);
            bw5.dm0 dm0Var = this.f32615o;
            if (dm0Var != null && zArr[9]) {
                fVar.i(9, dm0Var.computeSize());
                this.f32615o.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.f32616p;
            if (gVar != null && zArr[11]) {
                fVar.b(11, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f32607d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.yl0 yl0Var2 = this.f32608e;
            if (yl0Var2 != null && zArr[2]) {
                i18 += b36.f.i(2, yl0Var2.computeSize());
            }
            bw5.in0 in0Var2 = this.f32609f;
            if (in0Var2 != null && zArr[3]) {
                i18 += b36.f.i(3, in0Var2.computeSize());
            }
            if (zArr[4]) {
                i18 += b36.f.h(4, this.f32610g);
            }
            bw5.zl0 zl0Var2 = this.f32611h;
            if (zl0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, zl0Var2.computeSize());
            }
            bw5.wl0 wl0Var2 = this.f32612i;
            if (wl0Var2 != null && zArr[6]) {
                i18 += b36.f.i(6, wl0Var2.computeSize());
            }
            bw5.wn0 wn0Var2 = this.f32613m;
            if (wn0Var2 != null && zArr[7]) {
                i18 += b36.f.i(7, wn0Var2.computeSize());
            }
            int g17 = i18 + b36.f.g(8, 8, linkedList);
            bw5.dm0 dm0Var2 = this.f32615o;
            if (dm0Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, dm0Var2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.f32616p;
            return (gVar2 == null || !zArr[11]) ? g17 : g17 + b36.f.b(11, gVar2);
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
                this.f32607d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.yl0 yl0Var3 = new bw5.yl0();
                    if (bArr != null && bArr.length > 0) {
                        yl0Var3.parseFrom(bArr);
                    }
                    this.f32608e = yl0Var3;
                }
                zArr[2] = true;
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    bw5.in0 in0Var3 = new bw5.in0();
                    if (bArr2 != null && bArr2.length > 0) {
                        in0Var3.parseFrom(bArr2);
                    }
                    this.f32609f = in0Var3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                this.f32610g = aVar2.i(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    bw5.zl0 zl0Var3 = new bw5.zl0();
                    if (bArr3 != null && bArr3.length > 0) {
                        zl0Var3.parseFrom(bArr3);
                    }
                    this.f32611h = zl0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    bw5.wl0 wl0Var3 = new bw5.wl0();
                    if (bArr4 != null && bArr4.length > 0) {
                        wl0Var3.parseFrom(bArr4);
                    }
                    this.f32612i = wl0Var3;
                }
                zArr[6] = true;
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    bw5.wn0 wn0Var3 = new bw5.wn0();
                    if (bArr5 != null && bArr5.length > 0) {
                        wn0Var3.parseFrom(bArr5);
                    }
                    this.f32613m = wn0Var3;
                }
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    bw5.gn0 gn0Var = new bw5.gn0();
                    if (bArr6 != null && bArr6.length > 0) {
                        gn0Var.parseFrom(bArr6);
                    }
                    linkedList.add(gn0Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    bw5.dm0 dm0Var3 = new bw5.dm0();
                    if (bArr7 != null && bArr7.length > 0) {
                        dm0Var3.parseFrom(bArr7);
                    }
                    this.f32615o = dm0Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
            default:
                return -1;
            case 11:
                this.f32616p = aVar2.d(intValue);
                zArr[11] = true;
                return 0;
        }
    }
}
