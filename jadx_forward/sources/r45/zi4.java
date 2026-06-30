package r45;

/* loaded from: classes2.dex */
public class zi4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f473627d;

    /* renamed from: e, reason: collision with root package name */
    public long f473628e;

    /* renamed from: f, reason: collision with root package name */
    public long f473629f;

    /* renamed from: g, reason: collision with root package name */
    public long f473630g;

    /* renamed from: h, reason: collision with root package name */
    public long f473631h;

    /* renamed from: i, reason: collision with root package name */
    public long f473632i;

    /* renamed from: m, reason: collision with root package name */
    public long f473633m;

    /* renamed from: o, reason: collision with root package name */
    public long f473635o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f473636p;

    /* renamed from: q, reason: collision with root package name */
    public double f473637q;

    /* renamed from: t, reason: collision with root package name */
    public r45.vo6 f473640t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f473641u;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f473634n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f473638r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f473639s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.zi4)) {
            return false;
        }
        r45.zi4 zi4Var = (r45.zi4) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f473627d), java.lang.Long.valueOf(zi4Var.f473627d)) && n51.f.a(java.lang.Long.valueOf(this.f473628e), java.lang.Long.valueOf(zi4Var.f473628e)) && n51.f.a(java.lang.Long.valueOf(this.f473629f), java.lang.Long.valueOf(zi4Var.f473629f)) && n51.f.a(java.lang.Long.valueOf(this.f473630g), java.lang.Long.valueOf(zi4Var.f473630g)) && n51.f.a(java.lang.Long.valueOf(this.f473631h), java.lang.Long.valueOf(zi4Var.f473631h)) && n51.f.a(java.lang.Long.valueOf(this.f473632i), java.lang.Long.valueOf(zi4Var.f473632i)) && n51.f.a(java.lang.Long.valueOf(this.f473633m), java.lang.Long.valueOf(zi4Var.f473633m)) && n51.f.a(this.f473634n, zi4Var.f473634n) && n51.f.a(java.lang.Long.valueOf(this.f473635o), java.lang.Long.valueOf(zi4Var.f473635o)) && n51.f.a(java.lang.Boolean.valueOf(this.f473636p), java.lang.Boolean.valueOf(zi4Var.f473636p)) && n51.f.a(java.lang.Double.valueOf(this.f473637q), java.lang.Double.valueOf(zi4Var.f473637q)) && n51.f.a(this.f473638r, zi4Var.f473638r) && n51.f.a(this.f473639s, zi4Var.f473639s) && n51.f.a(this.f473640t, zi4Var.f473640t) && n51.f.a(this.f473641u, zi4Var.f473641u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f473639s;
        java.util.LinkedList linkedList2 = this.f473638r;
        java.util.LinkedList linkedList3 = this.f473634n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f473627d);
            fVar.h(2, this.f473628e);
            fVar.h(3, this.f473629f);
            fVar.h(4, this.f473630g);
            fVar.h(5, this.f473631h);
            fVar.h(6, this.f473632i);
            fVar.h(7, this.f473633m);
            fVar.g(8, 8, linkedList3);
            fVar.h(9, this.f473635o);
            fVar.a(10, this.f473636p);
            fVar.c(11, this.f473637q);
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            r45.vo6 vo6Var = this.f473640t;
            if (vo6Var != null) {
                fVar.i(14, vo6Var.mo75928xcd1e8d8());
                this.f473640t.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f473641u;
            if (str != null) {
                fVar.j(15, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f473627d) + 0 + b36.f.h(2, this.f473628e) + b36.f.h(3, this.f473629f) + b36.f.h(4, this.f473630g) + b36.f.h(5, this.f473631h) + b36.f.h(6, this.f473632i) + b36.f.h(7, this.f473633m) + b36.f.g(8, 8, linkedList3) + b36.f.h(9, this.f473635o) + b36.f.a(10, this.f473636p) + b36.f.c(11, this.f473637q) + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            r45.vo6 vo6Var2 = this.f473640t;
            if (vo6Var2 != null) {
                h17 += b36.f.i(14, vo6Var2.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f473641u;
            return str2 != null ? h17 + b36.f.j(15, str2) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.zi4 zi4Var = (r45.zi4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                zi4Var.f473627d = aVar2.i(intValue);
                return 0;
            case 2:
                zi4Var.f473628e = aVar2.i(intValue);
                return 0;
            case 3:
                zi4Var.f473629f = aVar2.i(intValue);
                return 0;
            case 4:
                zi4Var.f473630g = aVar2.i(intValue);
                return 0;
            case 5:
                zi4Var.f473631h = aVar2.i(intValue);
                return 0;
            case 6:
                zi4Var.f473632i = aVar2.i(intValue);
                return 0;
            case 7:
                zi4Var.f473633m = aVar2.i(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.db7 db7Var = new r45.db7();
                    if (bArr2 != null && bArr2.length > 0) {
                        db7Var.mo11468x92b714fd(bArr2);
                    }
                    zi4Var.f473634n.add(db7Var);
                }
                return 0;
            case 9:
                zi4Var.f473635o = aVar2.i(intValue);
                return 0;
            case 10:
                zi4Var.f473636p = aVar2.c(intValue);
                return 0;
            case 11:
                zi4Var.f473637q = aVar2.e(intValue);
                return 0;
            case 12:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.db7 db7Var2 = new r45.db7();
                    if (bArr3 != null && bArr3.length > 0) {
                        db7Var2.mo11468x92b714fd(bArr3);
                    }
                    zi4Var.f473638r.add(db7Var2);
                }
                return 0;
            case 13:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.xp6 xp6Var = new r45.xp6();
                    if (bArr4 != null && bArr4.length > 0) {
                        xp6Var.mo11468x92b714fd(bArr4);
                    }
                    zi4Var.f473639s.add(xp6Var);
                }
                return 0;
            case 14:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.vo6 vo6Var3 = new r45.vo6();
                    if (bArr5 != null && bArr5.length > 0) {
                        vo6Var3.mo11468x92b714fd(bArr5);
                    }
                    zi4Var.f473640t = vo6Var3;
                }
                return 0;
            case 15:
                zi4Var.f473641u = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
