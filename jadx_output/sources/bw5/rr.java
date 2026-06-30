package bw5;

/* loaded from: classes2.dex */
public class rr extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f32658d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.iu f32659e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.dz f32660f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.bg0 f32661g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f32662h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f32663i;

    /* renamed from: n, reason: collision with root package name */
    public bw5.i3 f32665n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32666o;

    /* renamed from: q, reason: collision with root package name */
    public bw5.hg0 f32668q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ag0 f32669r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.dg0 f32670s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.jg0 f32671t;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f32664m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f32667p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f32672u = new boolean[17];

    static {
        new bw5.rr();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rr parseFrom(byte[] bArr) {
        return (bw5.rr) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rr)) {
            return false;
        }
        bw5.rr rrVar = (bw5.rr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f32658d), java.lang.Integer.valueOf(rrVar.f32658d)) && n51.f.a(this.f32659e, rrVar.f32659e) && n51.f.a(this.f32660f, rrVar.f32660f) && n51.f.a(this.f32661g, rrVar.f32661g) && n51.f.a(this.f32662h, rrVar.f32662h) && n51.f.a(this.f32663i, rrVar.f32663i) && n51.f.a(this.f32664m, rrVar.f32664m) && n51.f.a(this.f32665n, rrVar.f32665n) && n51.f.a(java.lang.Boolean.valueOf(this.f32666o), java.lang.Boolean.valueOf(rrVar.f32666o)) && n51.f.a(this.f32667p, rrVar.f32667p) && n51.f.a(this.f32668q, rrVar.f32668q) && n51.f.a(this.f32669r, rrVar.f32669r) && n51.f.a(this.f32670s, rrVar.f32670s) && n51.f.a(this.f32671t, rrVar.f32671t);
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.rr();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f32667p;
        java.util.LinkedList linkedList2 = this.f32664m;
        boolean[] zArr = this.f32672u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f32658d);
            }
            bw5.iu iuVar = this.f32659e;
            if (iuVar != null && zArr[3]) {
                fVar.i(3, iuVar.computeSize());
                this.f32659e.writeFields(fVar);
            }
            bw5.dz dzVar = this.f32660f;
            if (dzVar != null && zArr[4]) {
                fVar.i(4, dzVar.computeSize());
                this.f32660f.writeFields(fVar);
            }
            bw5.bg0 bg0Var = this.f32661g;
            if (bg0Var != null && zArr[5]) {
                fVar.i(5, bg0Var.computeSize());
                this.f32661g.writeFields(fVar);
            }
            java.lang.String str = this.f32662h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f32663i;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            fVar.g(8, 8, linkedList2);
            bw5.i3 i3Var = this.f32665n;
            if (i3Var != null && zArr[9]) {
                fVar.i(9, i3Var.computeSize());
                this.f32665n.writeFields(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f32666o);
            }
            fVar.g(12, 8, linkedList);
            bw5.hg0 hg0Var = this.f32668q;
            if (hg0Var != null && zArr[13]) {
                fVar.i(13, hg0Var.computeSize());
                this.f32668q.writeFields(fVar);
            }
            bw5.ag0 ag0Var = this.f32669r;
            if (ag0Var != null && zArr[14]) {
                fVar.i(14, ag0Var.computeSize());
                this.f32669r.writeFields(fVar);
            }
            bw5.dg0 dg0Var = this.f32670s;
            if (dg0Var != null && zArr[15]) {
                fVar.i(15, dg0Var.computeSize());
                this.f32670s.writeFields(fVar);
            }
            bw5.jg0 jg0Var = this.f32671t;
            if (jg0Var != null && zArr[16]) {
                fVar.i(16, jg0Var.computeSize());
                this.f32671t.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f32658d) + 0 : 0;
            bw5.iu iuVar2 = this.f32659e;
            if (iuVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, iuVar2.computeSize());
            }
            bw5.dz dzVar2 = this.f32660f;
            if (dzVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, dzVar2.computeSize());
            }
            bw5.bg0 bg0Var2 = this.f32661g;
            if (bg0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, bg0Var2.computeSize());
            }
            java.lang.String str3 = this.f32662h;
            if (str3 != null && zArr[6]) {
                e17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f32663i;
            if (str4 != null && zArr[7]) {
                e17 += b36.f.j(7, str4);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList2);
            bw5.i3 i3Var2 = this.f32665n;
            if (i3Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, i3Var2.computeSize());
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f32666o);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList);
            bw5.hg0 hg0Var2 = this.f32668q;
            if (hg0Var2 != null && zArr[13]) {
                g18 += b36.f.i(13, hg0Var2.computeSize());
            }
            bw5.ag0 ag0Var2 = this.f32669r;
            if (ag0Var2 != null && zArr[14]) {
                g18 += b36.f.i(14, ag0Var2.computeSize());
            }
            bw5.dg0 dg0Var2 = this.f32670s;
            if (dg0Var2 != null && zArr[15]) {
                g18 += b36.f.i(15, dg0Var2.computeSize());
            }
            bw5.jg0 jg0Var2 = this.f32671t;
            return (jg0Var2 == null || !zArr[16]) ? g18 : g18 + b36.f.i(16, jg0Var2.computeSize());
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
                this.f32658d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
            case 11:
            default:
                return -1;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.iu iuVar3 = new bw5.iu();
                    if (bArr != null && bArr.length > 0) {
                        iuVar3.parseFrom(bArr);
                    }
                    this.f32659e = iuVar3;
                }
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.dz dzVar3 = new bw5.dz();
                    if (bArr2 != null && bArr2.length > 0) {
                        dzVar3.parseFrom(bArr2);
                    }
                    this.f32660f = dzVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    bw5.bg0 bg0Var3 = new bw5.bg0();
                    if (bArr3 != null && bArr3.length > 0) {
                        bg0Var3.parseFrom(bArr3);
                    }
                    this.f32661g = bg0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f32662h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f32663i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.h3 h3Var = new bw5.h3();
                    if (bArr4 != null && bArr4.length > 0) {
                        h3Var.parseFrom(bArr4);
                    }
                    linkedList2.add(h3Var);
                }
                zArr[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j28.get(i29);
                    bw5.i3 i3Var3 = new bw5.i3();
                    if (bArr5 != null && bArr5.length > 0) {
                        i3Var3.parseFrom(bArr5);
                    }
                    this.f32665n = i3Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f32666o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.eg0 eg0Var = new bw5.eg0();
                    if (bArr6 != null && bArr6.length > 0) {
                        eg0Var.parseFrom(bArr6);
                    }
                    linkedList.add(eg0Var);
                }
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr7 = (byte[]) j37.get(i38);
                    bw5.hg0 hg0Var3 = new bw5.hg0();
                    if (bArr7 != null && bArr7.length > 0) {
                        hg0Var3.parseFrom(bArr7);
                    }
                    this.f32668q = hg0Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i39 = 0; i39 < size8; i39++) {
                    byte[] bArr8 = (byte[]) j38.get(i39);
                    bw5.ag0 ag0Var3 = new bw5.ag0();
                    if (bArr8 != null && bArr8.length > 0) {
                        ag0Var3.parseFrom(bArr8);
                    }
                    this.f32669r = ag0Var3;
                }
                zArr[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i47 = 0; i47 < size9; i47++) {
                    byte[] bArr9 = (byte[]) j39.get(i47);
                    bw5.dg0 dg0Var3 = new bw5.dg0();
                    if (bArr9 != null && bArr9.length > 0) {
                        dg0Var3.parseFrom(bArr9);
                    }
                    this.f32670s = dg0Var3;
                }
                zArr[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i48 = 0; i48 < size10; i48++) {
                    byte[] bArr10 = (byte[]) j47.get(i48);
                    bw5.jg0 jg0Var3 = new bw5.jg0();
                    if (bArr10 != null && bArr10.length > 0) {
                        jg0Var3.parseFrom(bArr10);
                    }
                    this.f32671t = jg0Var3;
                }
                zArr[16] = true;
                return 0;
        }
    }
}
