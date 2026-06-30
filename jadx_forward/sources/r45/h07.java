package r45;

/* loaded from: classes2.dex */
public class h07 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.j32 f457263d;

    /* renamed from: f, reason: collision with root package name */
    public int f457265f;

    /* renamed from: h, reason: collision with root package name */
    public int f457267h;

    /* renamed from: o, reason: collision with root package name */
    public int f457271o;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457273q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f457275s;

    /* renamed from: t, reason: collision with root package name */
    public long f457276t;

    /* renamed from: u, reason: collision with root package name */
    public long f457277u;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457264e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f457266g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f457268i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f457269m = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f457270n = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.LinkedList f457272p = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f457274r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.h07)) {
            return false;
        }
        r45.h07 h07Var = (r45.h07) fVar;
        return n51.f.a(this.f457263d, h07Var.f457263d) && n51.f.a(this.f457264e, h07Var.f457264e) && n51.f.a(java.lang.Integer.valueOf(this.f457265f), java.lang.Integer.valueOf(h07Var.f457265f)) && n51.f.a(this.f457266g, h07Var.f457266g) && n51.f.a(java.lang.Integer.valueOf(this.f457267h), java.lang.Integer.valueOf(h07Var.f457267h)) && n51.f.a(this.f457268i, h07Var.f457268i) && n51.f.a(this.f457269m, h07Var.f457269m) && n51.f.a(this.f457270n, h07Var.f457270n) && n51.f.a(java.lang.Integer.valueOf(this.f457271o), java.lang.Integer.valueOf(h07Var.f457271o)) && n51.f.a(this.f457272p, h07Var.f457272p) && n51.f.a(this.f457273q, h07Var.f457273q) && n51.f.a(this.f457274r, h07Var.f457274r) && n51.f.a(this.f457275s, h07Var.f457275s) && n51.f.a(java.lang.Long.valueOf(this.f457276t), java.lang.Long.valueOf(h07Var.f457276t)) && n51.f.a(java.lang.Long.valueOf(this.f457277u), java.lang.Long.valueOf(h07Var.f457277u));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457274r;
        java.util.LinkedList linkedList2 = this.f457272p;
        java.util.LinkedList linkedList3 = this.f457270n;
        java.util.LinkedList linkedList4 = this.f457269m;
        java.util.LinkedList linkedList5 = this.f457268i;
        java.util.LinkedList linkedList6 = this.f457266g;
        java.util.LinkedList linkedList7 = this.f457264e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.j32 j32Var = this.f457263d;
            if (j32Var != null) {
                fVar.i(1, j32Var.mo75928xcd1e8d8());
                this.f457263d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList7);
            fVar.e(3, this.f457265f);
            fVar.g(4, 8, linkedList6);
            fVar.e(5, this.f457267h);
            fVar.g(6, 8, linkedList5);
            fVar.g(7, 8, linkedList4);
            fVar.g(8, 8, linkedList3);
            fVar.e(9, this.f457271o);
            fVar.g(10, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f457273q;
            if (gVar != null) {
                fVar.b(11, gVar);
            }
            fVar.g(12, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f457275s;
            if (gVar2 != null) {
                fVar.b(13, gVar2);
            }
            fVar.h(14, this.f457276t);
            fVar.h(15, this.f457277u);
            return 0;
        }
        if (i17 == 1) {
            r45.j32 j32Var2 = this.f457263d;
            int i18 = (j32Var2 != null ? b36.f.i(1, j32Var2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList7) + b36.f.e(3, this.f457265f) + b36.f.g(4, 8, linkedList6) + b36.f.e(5, this.f457267h) + b36.f.g(6, 8, linkedList5) + b36.f.g(7, 8, linkedList4) + b36.f.g(8, 8, linkedList3) + b36.f.e(9, this.f457271o) + b36.f.g(10, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f457273q;
            if (gVar3 != null) {
                i18 += b36.f.b(11, gVar3);
            }
            int g17 = i18 + b36.f.g(12, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f457275s;
            if (gVar4 != null) {
                g17 += b36.f.b(13, gVar4);
            }
            return g17 + b36.f.h(14, this.f457276t) + b36.f.h(15, this.f457277u);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList7.clear();
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
        r45.h07 h07Var = (r45.h07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.j32 j32Var3 = new r45.j32();
                    if (bArr2 != null && bArr2.length > 0) {
                        j32Var3.mo11468x92b714fd(bArr2);
                    }
                    h07Var.f457263d = j32Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr3 != null && bArr3.length > 0) {
                        c19792x256d2725.mo11468x92b714fd(bArr3);
                    }
                    h07Var.f457264e.add(c19792x256d2725);
                }
                return 0;
            case 3:
                h07Var.f457265f = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr4 != null && bArr4.length > 0) {
                        c19792x256d27252.mo11468x92b714fd(bArr4);
                    }
                    h07Var.f457266g.add(c19792x256d27252);
                }
                return 0;
            case 5:
                h07Var.f457267h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.lc5 lc5Var = new r45.lc5();
                    if (bArr5 != null && bArr5.length > 0) {
                        lc5Var.mo11468x92b714fd(bArr5);
                    }
                    h07Var.f457268i.add(lc5Var);
                }
                return 0;
            case 7:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.lc5 lc5Var2 = new r45.lc5();
                    if (bArr6 != null && bArr6.length > 0) {
                        lc5Var2.mo11468x92b714fd(bArr6);
                    }
                    h07Var.f457269m.add(lc5Var2);
                }
                return 0;
            case 8:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27253 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                    if (bArr7 != null && bArr7.length > 0) {
                        c19792x256d27253.mo11468x92b714fd(bArr7);
                    }
                    h07Var.f457270n.add(c19792x256d27253);
                }
                return 0;
            case 9:
                h07Var.f457271o = aVar2.g(intValue);
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.dr0 dr0Var = new r45.dr0();
                    if (bArr8 != null && bArr8.length > 0) {
                        dr0Var.mo11468x92b714fd(bArr8);
                    }
                    h07Var.f457272p.add(dr0Var);
                }
                return 0;
            case 11:
                h07Var.f457273q = aVar2.d(intValue);
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.dr0 dr0Var2 = new r45.dr0();
                    if (bArr9 != null && bArr9.length > 0) {
                        dr0Var2.mo11468x92b714fd(bArr9);
                    }
                    h07Var.f457274r.add(dr0Var2);
                }
                return 0;
            case 13:
                h07Var.f457275s = aVar2.d(intValue);
                return 0;
            case 14:
                h07Var.f457276t = aVar2.i(intValue);
                return 0;
            case 15:
                h07Var.f457277u = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
