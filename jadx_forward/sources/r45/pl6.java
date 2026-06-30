package r45;

/* loaded from: classes2.dex */
public class pl6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.db7 f464697d;

    /* renamed from: e, reason: collision with root package name */
    public long f464698e;

    /* renamed from: f, reason: collision with root package name */
    public long f464699f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464700g;

    /* renamed from: h, reason: collision with root package name */
    public long f464701h;

    /* renamed from: i, reason: collision with root package name */
    public long f464702i;

    /* renamed from: m, reason: collision with root package name */
    public long f464703m;

    /* renamed from: n, reason: collision with root package name */
    public long f464704n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f464705o = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pl6)) {
            return false;
        }
        r45.pl6 pl6Var = (r45.pl6) fVar;
        return n51.f.a(this.f464697d, pl6Var.f464697d) && n51.f.a(java.lang.Long.valueOf(this.f464698e), java.lang.Long.valueOf(pl6Var.f464698e)) && n51.f.a(java.lang.Long.valueOf(this.f464699f), java.lang.Long.valueOf(pl6Var.f464699f)) && n51.f.a(this.f464700g, pl6Var.f464700g) && n51.f.a(java.lang.Long.valueOf(this.f464701h), java.lang.Long.valueOf(pl6Var.f464701h)) && n51.f.a(java.lang.Long.valueOf(this.f464702i), java.lang.Long.valueOf(pl6Var.f464702i)) && n51.f.a(java.lang.Long.valueOf(this.f464703m), java.lang.Long.valueOf(pl6Var.f464703m)) && n51.f.a(java.lang.Long.valueOf(this.f464704n), java.lang.Long.valueOf(pl6Var.f464704n)) && n51.f.a(this.f464705o, pl6Var.f464705o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464705o;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.db7 db7Var = this.f464697d;
            if (db7Var != null) {
                fVar.i(1, db7Var.mo75928xcd1e8d8());
                this.f464697d.mo75956x3d5d1f78(fVar);
            }
            fVar.h(2, this.f464698e);
            fVar.h(3, this.f464699f);
            java.lang.String str = this.f464700g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.h(5, this.f464701h);
            fVar.h(6, this.f464702i);
            fVar.h(7, this.f464703m);
            fVar.h(8, this.f464704n);
            fVar.g(9, 6, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.db7 db7Var2 = this.f464697d;
            int i18 = (db7Var2 != null ? 0 + b36.f.i(1, db7Var2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f464698e) + b36.f.h(3, this.f464699f);
            java.lang.String str2 = this.f464700g;
            if (str2 != null) {
                i18 += b36.f.j(4, str2);
            }
            return i18 + b36.f.h(5, this.f464701h) + b36.f.h(6, this.f464702i) + b36.f.h(7, this.f464703m) + b36.f.h(8, this.f464704n) + b36.f.g(9, 6, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.pl6 pl6Var = (r45.pl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.db7 db7Var3 = new r45.db7();
                    if (bArr2 != null && bArr2.length > 0) {
                        db7Var3.mo11468x92b714fd(bArr2);
                    }
                    pl6Var.f464697d = db7Var3;
                }
                return 0;
            case 2:
                pl6Var.f464698e = aVar2.i(intValue);
                return 0;
            case 3:
                pl6Var.f464699f = aVar2.i(intValue);
                return 0;
            case 4:
                pl6Var.f464700g = aVar2.k(intValue);
                return 0;
            case 5:
                pl6Var.f464701h = aVar2.i(intValue);
                return 0;
            case 6:
                pl6Var.f464702i = aVar2.i(intValue);
                return 0;
            case 7:
                pl6Var.f464703m = aVar2.i(intValue);
                return 0;
            case 8:
                pl6Var.f464704n = aVar2.i(intValue);
                return 0;
            case 9:
                pl6Var.f464705o.add(aVar2.d(intValue));
                return 0;
            default:
                return -1;
        }
    }
}
