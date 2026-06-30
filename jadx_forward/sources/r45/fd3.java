package r45;

/* loaded from: classes15.dex */
public class fd3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f implements r45.k66 {

    /* renamed from: d, reason: collision with root package name */
    public int f455755d;

    /* renamed from: e, reason: collision with root package name */
    public int f455756e;

    /* renamed from: f, reason: collision with root package name */
    public int f455757f;

    /* renamed from: g, reason: collision with root package name */
    public int f455758g;

    /* renamed from: n, reason: collision with root package name */
    public int f455762n;

    /* renamed from: o, reason: collision with root package name */
    public int f455763o;

    /* renamed from: p, reason: collision with root package name */
    public int f455764p;

    /* renamed from: q, reason: collision with root package name */
    public int f455765q;

    /* renamed from: r, reason: collision with root package name */
    public int f455766r;

    /* renamed from: s, reason: collision with root package name */
    public int f455767s;

    /* renamed from: w, reason: collision with root package name */
    public r45.gw3 f455771w;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f455759h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f455760i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f455761m = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f455768t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f455769u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.LinkedList f455770v = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fd3)) {
            return false;
        }
        r45.fd3 fd3Var = (r45.fd3) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f455755d), java.lang.Integer.valueOf(fd3Var.f455755d)) && n51.f.a(java.lang.Integer.valueOf(this.f455756e), java.lang.Integer.valueOf(fd3Var.f455756e)) && n51.f.a(java.lang.Integer.valueOf(this.f455757f), java.lang.Integer.valueOf(fd3Var.f455757f)) && n51.f.a(java.lang.Integer.valueOf(this.f455758g), java.lang.Integer.valueOf(fd3Var.f455758g)) && n51.f.a(this.f455759h, fd3Var.f455759h) && n51.f.a(this.f455760i, fd3Var.f455760i) && n51.f.a(this.f455761m, fd3Var.f455761m) && n51.f.a(java.lang.Integer.valueOf(this.f455762n), java.lang.Integer.valueOf(fd3Var.f455762n)) && n51.f.a(java.lang.Integer.valueOf(this.f455763o), java.lang.Integer.valueOf(fd3Var.f455763o)) && n51.f.a(java.lang.Integer.valueOf(this.f455764p), java.lang.Integer.valueOf(fd3Var.f455764p)) && n51.f.a(java.lang.Integer.valueOf(this.f455765q), java.lang.Integer.valueOf(fd3Var.f455765q)) && n51.f.a(java.lang.Integer.valueOf(this.f455766r), java.lang.Integer.valueOf(fd3Var.f455766r)) && n51.f.a(java.lang.Integer.valueOf(this.f455767s), java.lang.Integer.valueOf(fd3Var.f455767s)) && n51.f.a(this.f455768t, fd3Var.f455768t) && n51.f.a(this.f455769u, fd3Var.f455769u) && n51.f.a(this.f455770v, fd3Var.f455770v) && n51.f.a(this.f455771w, fd3Var.f455771w);
    }

    @Override // r45.k66
    /* renamed from: getRet */
    public final int mo161589xb588696b() {
        return this.f455755d;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f455770v;
        java.util.LinkedList linkedList2 = this.f455769u;
        java.util.LinkedList linkedList3 = this.f455768t;
        java.util.LinkedList linkedList4 = this.f455761m;
        java.util.LinkedList linkedList5 = this.f455760i;
        java.util.LinkedList linkedList6 = this.f455759h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f455755d);
            fVar.e(2, this.f455756e);
            fVar.e(3, this.f455757f);
            fVar.e(4, this.f455758g);
            fVar.g(5, 8, linkedList6);
            fVar.g(6, 8, linkedList5);
            fVar.g(7, 8, linkedList4);
            fVar.e(8, this.f455762n);
            fVar.e(9, this.f455763o);
            fVar.e(10, this.f455764p);
            fVar.e(11, this.f455765q);
            fVar.e(12, this.f455766r);
            fVar.e(13, this.f455767s);
            fVar.g(14, 8, linkedList3);
            fVar.g(15, 8, linkedList2);
            fVar.g(16, 8, linkedList);
            r45.gw3 gw3Var = this.f455771w;
            if (gw3Var != null) {
                fVar.i(17, gw3Var.mo75928xcd1e8d8());
                this.f455771w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f455755d) + 0 + b36.f.e(2, this.f455756e) + b36.f.e(3, this.f455757f) + b36.f.e(4, this.f455758g) + b36.f.g(5, 8, linkedList6) + b36.f.g(6, 8, linkedList5) + b36.f.g(7, 8, linkedList4) + b36.f.e(8, this.f455762n) + b36.f.e(9, this.f455763o) + b36.f.e(10, this.f455764p) + b36.f.e(11, this.f455765q) + b36.f.e(12, this.f455766r) + b36.f.e(13, this.f455767s) + b36.f.g(14, 8, linkedList3) + b36.f.g(15, 8, linkedList2) + b36.f.g(16, 8, linkedList);
            r45.gw3 gw3Var2 = this.f455771w;
            return gw3Var2 != null ? e17 + b36.f.i(17, gw3Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.fd3 fd3Var = (r45.fd3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                fd3Var.f455755d = aVar2.g(intValue);
                return 0;
            case 2:
                fd3Var.f455756e = aVar2.g(intValue);
                return 0;
            case 3:
                fd3Var.f455757f = aVar2.g(intValue);
                return 0;
            case 4:
                fd3Var.f455758g = aVar2.g(intValue);
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.nf6 nf6Var = new r45.nf6();
                    if (bArr2 != null && bArr2.length > 0) {
                        nf6Var.mo11468x92b714fd(bArr2);
                    }
                    fd3Var.f455759h.add(nf6Var);
                }
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.nf6 nf6Var2 = new r45.nf6();
                    if (bArr3 != null && bArr3.length > 0) {
                        nf6Var2.mo11468x92b714fd(bArr3);
                    }
                    fd3Var.f455760i.add(nf6Var2);
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.nf6 nf6Var3 = new r45.nf6();
                    if (bArr4 != null && bArr4.length > 0) {
                        nf6Var3.mo11468x92b714fd(bArr4);
                    }
                    fd3Var.f455761m.add(nf6Var3);
                }
                return 0;
            case 8:
                fd3Var.f455762n = aVar2.g(intValue);
                return 0;
            case 9:
                fd3Var.f455763o = aVar2.g(intValue);
                return 0;
            case 10:
                fd3Var.f455764p = aVar2.g(intValue);
                return 0;
            case 11:
                fd3Var.f455765q = aVar2.g(intValue);
                return 0;
            case 12:
                fd3Var.f455766r = aVar2.g(intValue);
                return 0;
            case 13:
                fd3Var.f455767s = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.nf6 nf6Var4 = new r45.nf6();
                    if (bArr5 != null && bArr5.length > 0) {
                        nf6Var4.mo11468x92b714fd(bArr5);
                    }
                    fd3Var.f455768t.add(nf6Var4);
                }
                return 0;
            case 15:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.nf6 nf6Var5 = new r45.nf6();
                    if (bArr6 != null && bArr6.length > 0) {
                        nf6Var5.mo11468x92b714fd(bArr6);
                    }
                    fd3Var.f455769u.add(nf6Var5);
                }
                return 0;
            case 16:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    r45.nf6 nf6Var6 = new r45.nf6();
                    if (bArr7 != null && bArr7.length > 0) {
                        nf6Var6.mo11468x92b714fd(bArr7);
                    }
                    fd3Var.f455770v.add(nf6Var6);
                }
                return 0;
            case 17:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    r45.gw3 gw3Var3 = new r45.gw3();
                    if (bArr8 != null && bArr8.length > 0) {
                        gw3Var3.mo11468x92b714fd(bArr8);
                    }
                    fd3Var.f455771w = gw3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
