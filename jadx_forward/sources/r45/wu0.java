package r45;

/* loaded from: classes2.dex */
public class wu0 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f470997e;

    /* renamed from: f, reason: collision with root package name */
    public int f470998f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470999g;

    /* renamed from: h, reason: collision with root package name */
    public int f471000h;

    /* renamed from: m, reason: collision with root package name */
    public r45.dg4 f471002m;

    /* renamed from: n, reason: collision with root package name */
    public r45.wx0 f471003n;

    /* renamed from: o, reason: collision with root package name */
    public long f471004o;

    /* renamed from: p, reason: collision with root package name */
    public r45.sd1 f471005p;

    /* renamed from: q, reason: collision with root package name */
    public r45.sd1 f471006q;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470996d = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f471001i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wu0)) {
            return false;
        }
        r45.wu0 wu0Var = (r45.wu0) fVar;
        return n51.f.a(this.f76492x92037252, wu0Var.f76492x92037252) && n51.f.a(this.f470996d, wu0Var.f470996d) && n51.f.a(this.f470997e, wu0Var.f470997e) && n51.f.a(java.lang.Integer.valueOf(this.f470998f), java.lang.Integer.valueOf(wu0Var.f470998f)) && n51.f.a(this.f470999g, wu0Var.f470999g) && n51.f.a(java.lang.Integer.valueOf(this.f471000h), java.lang.Integer.valueOf(wu0Var.f471000h)) && n51.f.a(this.f471001i, wu0Var.f471001i) && n51.f.a(this.f471002m, wu0Var.f471002m) && n51.f.a(this.f471003n, wu0Var.f471003n) && n51.f.a(java.lang.Long.valueOf(this.f471004o), java.lang.Long.valueOf(wu0Var.f471004o)) && n51.f.a(this.f471005p, wu0Var.f471005p) && n51.f.a(this.f471006q, wu0Var.f471006q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471001i;
        java.util.LinkedList linkedList2 = this.f470996d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f470997e;
            if (c19782x23db1cfa != null) {
                fVar.i(3, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f470997e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f470998f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470999g;
            if (gVar != null) {
                fVar.b(5, gVar);
            }
            fVar.e(6, this.f471000h);
            fVar.g(7, 8, linkedList);
            r45.dg4 dg4Var = this.f471002m;
            if (dg4Var != null) {
                fVar.i(8, dg4Var.mo75928xcd1e8d8());
                this.f471002m.mo75956x3d5d1f78(fVar);
            }
            r45.wx0 wx0Var = this.f471003n;
            if (wx0Var != null) {
                fVar.i(9, wx0Var.mo75928xcd1e8d8());
                this.f471003n.mo75956x3d5d1f78(fVar);
            }
            fVar.h(10, this.f471004o);
            r45.sd1 sd1Var = this.f471005p;
            if (sd1Var != null) {
                fVar.i(11, sd1Var.mo75928xcd1e8d8());
                this.f471005p.mo75956x3d5d1f78(fVar);
            }
            r45.sd1 sd1Var2 = this.f471006q;
            if (sd1Var2 != null) {
                fVar.i(12, sd1Var2.mo75928xcd1e8d8());
                this.f471006q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f470997e;
            if (c19782x23db1cfa2 != null) {
                i18 += b36.f.i(3, c19782x23db1cfa2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f470998f);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470999g;
            if (gVar2 != null) {
                e17 += b36.f.b(5, gVar2);
            }
            int e18 = e17 + b36.f.e(6, this.f471000h) + b36.f.g(7, 8, linkedList);
            r45.dg4 dg4Var2 = this.f471002m;
            if (dg4Var2 != null) {
                e18 += b36.f.i(8, dg4Var2.mo75928xcd1e8d8());
            }
            r45.wx0 wx0Var2 = this.f471003n;
            if (wx0Var2 != null) {
                e18 += b36.f.i(9, wx0Var2.mo75928xcd1e8d8());
            }
            int h17 = e18 + b36.f.h(10, this.f471004o);
            r45.sd1 sd1Var3 = this.f471005p;
            if (sd1Var3 != null) {
                h17 += b36.f.i(11, sd1Var3.mo75928xcd1e8d8());
            }
            r45.sd1 sd1Var4 = this.f471006q;
            return sd1Var4 != null ? h17 + b36.f.i(12, sd1Var4.mo75928xcd1e8d8()) : h17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.wu0 wu0Var = (r45.wu0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    wu0Var.f76492x92037252 = ieVar3;
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
                    wu0Var.f470996d.add(c19792x256d2725);
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                    if (bArr4 != null && bArr4.length > 0) {
                        c19782x23db1cfa3.mo11468x92b714fd(bArr4);
                    }
                    wu0Var.f470997e = c19782x23db1cfa3;
                }
                return 0;
            case 4:
                wu0Var.f470998f = aVar2.g(intValue);
                return 0;
            case 5:
                wu0Var.f470999g = aVar2.d(intValue);
                return 0;
            case 6:
                wu0Var.f471000h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ig4 ig4Var = new r45.ig4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ig4Var.mo11468x92b714fd(bArr5);
                    }
                    wu0Var.f471001i.add(ig4Var);
                }
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.dg4 dg4Var3 = new r45.dg4();
                    if (bArr6 != null && bArr6.length > 0) {
                        dg4Var3.mo11468x92b714fd(bArr6);
                    }
                    wu0Var.f471002m = dg4Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.wx0 wx0Var3 = new r45.wx0();
                    if (bArr7 != null && bArr7.length > 0) {
                        wx0Var3.mo11468x92b714fd(bArr7);
                    }
                    wu0Var.f471003n = wx0Var3;
                }
                return 0;
            case 10:
                wu0Var.f471004o = aVar2.i(intValue);
                return 0;
            case 11:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.sd1 sd1Var5 = new r45.sd1();
                    if (bArr8 != null && bArr8.length > 0) {
                        sd1Var5.mo11468x92b714fd(bArr8);
                    }
                    wu0Var.f471005p = sd1Var5;
                }
                return 0;
            case 12:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.sd1 sd1Var6 = new r45.sd1();
                    if (bArr9 != null && bArr9.length > 0) {
                        sd1Var6.mo11468x92b714fd(bArr9);
                    }
                    wu0Var.f471006q = sd1Var6;
                }
                return 0;
            default:
                return -1;
        }
    }
}
