package r45;

/* loaded from: classes10.dex */
public class x84 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public long f471399e;

    /* renamed from: f, reason: collision with root package name */
    public int f471400f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f471401g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f471402h;

    /* renamed from: i, reason: collision with root package name */
    public r45.ia4 f471403i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471404m;

    /* renamed from: o, reason: collision with root package name */
    public long f471406o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f471398d = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public int f471405n = 1;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x84)) {
            return false;
        }
        r45.x84 x84Var = (r45.x84) fVar;
        return n51.f.a(this.f471398d, x84Var.f471398d) && n51.f.a(java.lang.Long.valueOf(this.f471399e), java.lang.Long.valueOf(x84Var.f471399e)) && n51.f.a(java.lang.Integer.valueOf(this.f471400f), java.lang.Integer.valueOf(x84Var.f471400f)) && n51.f.a(this.f471401g, x84Var.f471401g) && n51.f.a(this.f471402h, x84Var.f471402h) && n51.f.a(this.f471403i, x84Var.f471403i) && n51.f.a(this.f471404m, x84Var.f471404m) && n51.f.a(java.lang.Integer.valueOf(this.f471405n), java.lang.Integer.valueOf(x84Var.f471405n)) && n51.f.a(java.lang.Long.valueOf(this.f471406o), java.lang.Long.valueOf(x84Var.f471406o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471398d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            fVar.h(2, this.f471399e);
            fVar.e(3, this.f471400f);
            java.lang.String str = this.f471401g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f471402h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.ia4 ia4Var = this.f471403i;
            if (ia4Var != null) {
                fVar.i(6, ia4Var.mo75928xcd1e8d8());
                this.f471403i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f471404m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f471405n);
            fVar.h(100, this.f471406o);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0 + b36.f.h(2, this.f471399e) + b36.f.e(3, this.f471400f);
            java.lang.String str4 = this.f471401g;
            if (str4 != null) {
                g17 += b36.f.j(4, str4);
            }
            java.lang.String str5 = this.f471402h;
            if (str5 != null) {
                g17 += b36.f.j(5, str5);
            }
            r45.ia4 ia4Var2 = this.f471403i;
            if (ia4Var2 != null) {
                g17 += b36.f.i(6, ia4Var2.mo75928xcd1e8d8());
            }
            java.lang.String str6 = this.f471404m;
            if (str6 != null) {
                g17 += b36.f.j(7, str6);
            }
            return g17 + b36.f.e(8, this.f471405n) + b36.f.h(100, this.f471406o);
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
        r45.x84 x84Var = (r45.x84) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 100) {
            x84Var.f471406o = aVar2.i(intValue);
            return 0;
        }
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.w84 w84Var = new r45.w84();
                    if (bArr2 != null && bArr2.length > 0) {
                        w84Var.mo11468x92b714fd(bArr2);
                    }
                    x84Var.f471398d.add(w84Var);
                }
                return 0;
            case 2:
                x84Var.f471399e = aVar2.i(intValue);
                return 0;
            case 3:
                x84Var.f471400f = aVar2.g(intValue);
                return 0;
            case 4:
                x84Var.f471401g = aVar2.k(intValue);
                return 0;
            case 5:
                x84Var.f471402h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.ia4 ia4Var3 = new r45.ia4();
                    if (bArr3 != null && bArr3.length > 0) {
                        ia4Var3.mo11468x92b714fd(bArr3);
                    }
                    x84Var.f471403i = ia4Var3;
                }
                return 0;
            case 7:
                x84Var.f471404m = aVar2.k(intValue);
                return 0;
            case 8:
                x84Var.f471405n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
