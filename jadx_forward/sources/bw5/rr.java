package bw5;

/* loaded from: classes2.dex */
public class rr extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f114191d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.iu f114192e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.dz f114193f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.bg0 f114194g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f114195h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f114196i;

    /* renamed from: n, reason: collision with root package name */
    public bw5.i3 f114198n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f114199o;

    /* renamed from: q, reason: collision with root package name */
    public bw5.hg0 f114201q;

    /* renamed from: r, reason: collision with root package name */
    public bw5.ag0 f114202r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.dg0 f114203s;

    /* renamed from: t, reason: collision with root package name */
    public bw5.jg0 f114204t;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f114197m = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f114200p = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f114205u = new boolean[17];

    static {
        new bw5.rr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.rr mo11468x92b714fd(byte[] bArr) {
        return (bw5.rr) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.rr)) {
            return false;
        }
        bw5.rr rrVar = (bw5.rr) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f114191d), java.lang.Integer.valueOf(rrVar.f114191d)) && n51.f.a(this.f114192e, rrVar.f114192e) && n51.f.a(this.f114193f, rrVar.f114193f) && n51.f.a(this.f114194g, rrVar.f114194g) && n51.f.a(this.f114195h, rrVar.f114195h) && n51.f.a(this.f114196i, rrVar.f114196i) && n51.f.a(this.f114197m, rrVar.f114197m) && n51.f.a(this.f114198n, rrVar.f114198n) && n51.f.a(java.lang.Boolean.valueOf(this.f114199o), java.lang.Boolean.valueOf(rrVar.f114199o)) && n51.f.a(this.f114200p, rrVar.f114200p) && n51.f.a(this.f114201q, rrVar.f114201q) && n51.f.a(this.f114202r, rrVar.f114202r) && n51.f.a(this.f114203s, rrVar.f114203s) && n51.f.a(this.f114204t, rrVar.f114204t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.rr();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114200p;
        java.util.LinkedList linkedList2 = this.f114197m;
        boolean[] zArr = this.f114205u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f114191d);
            }
            bw5.iu iuVar = this.f114192e;
            if (iuVar != null && zArr[3]) {
                fVar.i(3, iuVar.mo75928xcd1e8d8());
                this.f114192e.mo75956x3d5d1f78(fVar);
            }
            bw5.dz dzVar = this.f114193f;
            if (dzVar != null && zArr[4]) {
                fVar.i(4, dzVar.mo75928xcd1e8d8());
                this.f114193f.mo75956x3d5d1f78(fVar);
            }
            bw5.bg0 bg0Var = this.f114194g;
            if (bg0Var != null && zArr[5]) {
                fVar.i(5, bg0Var.mo75928xcd1e8d8());
                this.f114194g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f114195h;
            if (str != null && zArr[6]) {
                fVar.j(6, str);
            }
            java.lang.String str2 = this.f114196i;
            if (str2 != null && zArr[7]) {
                fVar.j(7, str2);
            }
            fVar.g(8, 8, linkedList2);
            bw5.i3 i3Var = this.f114198n;
            if (i3Var != null && zArr[9]) {
                fVar.i(9, i3Var.mo75928xcd1e8d8());
                this.f114198n.mo75956x3d5d1f78(fVar);
            }
            if (zArr[10]) {
                fVar.a(10, this.f114199o);
            }
            fVar.g(12, 8, linkedList);
            bw5.hg0 hg0Var = this.f114201q;
            if (hg0Var != null && zArr[13]) {
                fVar.i(13, hg0Var.mo75928xcd1e8d8());
                this.f114201q.mo75956x3d5d1f78(fVar);
            }
            bw5.ag0 ag0Var = this.f114202r;
            if (ag0Var != null && zArr[14]) {
                fVar.i(14, ag0Var.mo75928xcd1e8d8());
                this.f114202r.mo75956x3d5d1f78(fVar);
            }
            bw5.dg0 dg0Var = this.f114203s;
            if (dg0Var != null && zArr[15]) {
                fVar.i(15, dg0Var.mo75928xcd1e8d8());
                this.f114203s.mo75956x3d5d1f78(fVar);
            }
            bw5.jg0 jg0Var = this.f114204t;
            if (jg0Var != null && zArr[16]) {
                fVar.i(16, jg0Var.mo75928xcd1e8d8());
                this.f114204t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? b36.f.e(1, this.f114191d) + 0 : 0;
            bw5.iu iuVar2 = this.f114192e;
            if (iuVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, iuVar2.mo75928xcd1e8d8());
            }
            bw5.dz dzVar2 = this.f114193f;
            if (dzVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, dzVar2.mo75928xcd1e8d8());
            }
            bw5.bg0 bg0Var2 = this.f114194g;
            if (bg0Var2 != null && zArr[5]) {
                e17 += b36.f.i(5, bg0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f114195h;
            if (str3 != null && zArr[6]) {
                e17 += b36.f.j(6, str3);
            }
            java.lang.String str4 = this.f114196i;
            if (str4 != null && zArr[7]) {
                e17 += b36.f.j(7, str4);
            }
            int g17 = e17 + b36.f.g(8, 8, linkedList2);
            bw5.i3 i3Var2 = this.f114198n;
            if (i3Var2 != null && zArr[9]) {
                g17 += b36.f.i(9, i3Var2.mo75928xcd1e8d8());
            }
            if (zArr[10]) {
                g17 += b36.f.a(10, this.f114199o);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList);
            bw5.hg0 hg0Var2 = this.f114201q;
            if (hg0Var2 != null && zArr[13]) {
                g18 += b36.f.i(13, hg0Var2.mo75928xcd1e8d8());
            }
            bw5.ag0 ag0Var2 = this.f114202r;
            if (ag0Var2 != null && zArr[14]) {
                g18 += b36.f.i(14, ag0Var2.mo75928xcd1e8d8());
            }
            bw5.dg0 dg0Var2 = this.f114203s;
            if (dg0Var2 != null && zArr[15]) {
                g18 += b36.f.i(15, dg0Var2.mo75928xcd1e8d8());
            }
            bw5.jg0 jg0Var2 = this.f114204t;
            return (jg0Var2 == null || !zArr[16]) ? g18 : g18 + b36.f.i(16, jg0Var2.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f114191d = aVar2.g(intValue);
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
                        iuVar3.mo11468x92b714fd(bArr);
                    }
                    this.f114192e = iuVar3;
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
                        dzVar3.mo11468x92b714fd(bArr2);
                    }
                    this.f114193f = dzVar3;
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
                        bg0Var3.mo11468x92b714fd(bArr3);
                    }
                    this.f114194g = bg0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f114195h = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f114196i = aVar2.k(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j27.get(i28);
                    bw5.h3 h3Var = new bw5.h3();
                    if (bArr4 != null && bArr4.length > 0) {
                        h3Var.mo11468x92b714fd(bArr4);
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
                        i3Var3.mo11468x92b714fd(bArr5);
                    }
                    this.f114198n = i3Var3;
                }
                zArr[9] = true;
                return 0;
            case 10:
                this.f114199o = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr6 = (byte[]) j29.get(i37);
                    bw5.eg0 eg0Var = new bw5.eg0();
                    if (bArr6 != null && bArr6.length > 0) {
                        eg0Var.mo11468x92b714fd(bArr6);
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
                        hg0Var3.mo11468x92b714fd(bArr7);
                    }
                    this.f114201q = hg0Var3;
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
                        ag0Var3.mo11468x92b714fd(bArr8);
                    }
                    this.f114202r = ag0Var3;
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
                        dg0Var3.mo11468x92b714fd(bArr9);
                    }
                    this.f114203s = dg0Var3;
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
                        jg0Var3.mo11468x92b714fd(bArr10);
                    }
                    this.f114204t = jg0Var3;
                }
                zArr[16] = true;
                return 0;
        }
    }
}
