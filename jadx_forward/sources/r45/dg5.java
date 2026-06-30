package r45;

/* loaded from: classes15.dex */
public class dg5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f453970d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f453972f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f453973g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f453974h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f453976m;

    /* renamed from: n, reason: collision with root package name */
    public int f453977n;

    /* renamed from: o, reason: collision with root package name */
    public int f453978o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f453979p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f453980q;

    /* renamed from: r, reason: collision with root package name */
    public r45.qx4 f453981r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453982s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f453983t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f453984u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f453985v;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f453971e = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f453975i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.dg5)) {
            return false;
        }
        r45.dg5 dg5Var = (r45.dg5) fVar;
        return n51.f.a(this.f76492x92037252, dg5Var.f76492x92037252) && n51.f.a(java.lang.Boolean.valueOf(this.f453970d), java.lang.Boolean.valueOf(dg5Var.f453970d)) && n51.f.a(this.f453971e, dg5Var.f453971e) && n51.f.a(this.f453972f, dg5Var.f453972f) && n51.f.a(this.f453973g, dg5Var.f453973g) && n51.f.a(this.f453974h, dg5Var.f453974h) && n51.f.a(this.f453975i, dg5Var.f453975i) && n51.f.a(java.lang.Boolean.valueOf(this.f453976m), java.lang.Boolean.valueOf(dg5Var.f453976m)) && n51.f.a(java.lang.Integer.valueOf(this.f453977n), java.lang.Integer.valueOf(dg5Var.f453977n)) && n51.f.a(java.lang.Integer.valueOf(this.f453978o), java.lang.Integer.valueOf(dg5Var.f453978o)) && n51.f.a(this.f453979p, dg5Var.f453979p) && n51.f.a(this.f453980q, dg5Var.f453980q) && n51.f.a(this.f453981r, dg5Var.f453981r) && n51.f.a(this.f453982s, dg5Var.f453982s) && n51.f.a(java.lang.Boolean.valueOf(this.f453983t), java.lang.Boolean.valueOf(dg5Var.f453983t)) && n51.f.a(this.f453984u, dg5Var.f453984u) && n51.f.a(java.lang.Boolean.valueOf(this.f453985v), java.lang.Boolean.valueOf(dg5Var.f453985v));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f453975i;
        java.util.LinkedList linkedList2 = this.f453971e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.a(2, this.f453970d);
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f453972f;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f453973g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            java.lang.String str3 = this.f453974h;
            if (str3 != null) {
                fVar.j(6, str3);
            }
            fVar.g(7, 8, linkedList);
            fVar.a(8, this.f453976m);
            fVar.e(9, this.f453977n);
            fVar.e(10, this.f453978o);
            java.lang.String str4 = this.f453979p;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            java.lang.String str5 = this.f453980q;
            if (str5 != null) {
                fVar.j(12, str5);
            }
            r45.qx4 qx4Var = this.f453981r;
            if (qx4Var != null) {
                fVar.i(13, qx4Var.mo75928xcd1e8d8());
                this.f453981r.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f453982s;
            if (gVar != null) {
                fVar.b(14, gVar);
            }
            fVar.a(15, this.f453983t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f453984u;
            if (gVar2 != null) {
                fVar.b(16, gVar2);
            }
            fVar.a(17, this.f453985v);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.a(2, this.f453970d) + b36.f.g(3, 8, linkedList2);
            java.lang.String str6 = this.f453972f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f453973g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f453974h;
            if (str8 != null) {
                i18 += b36.f.j(6, str8);
            }
            int g17 = i18 + b36.f.g(7, 8, linkedList) + b36.f.a(8, this.f453976m) + b36.f.e(9, this.f453977n) + b36.f.e(10, this.f453978o);
            java.lang.String str9 = this.f453979p;
            if (str9 != null) {
                g17 += b36.f.j(11, str9);
            }
            java.lang.String str10 = this.f453980q;
            if (str10 != null) {
                g17 += b36.f.j(12, str10);
            }
            r45.qx4 qx4Var2 = this.f453981r;
            if (qx4Var2 != null) {
                g17 += b36.f.i(13, qx4Var2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f453982s;
            if (gVar3 != null) {
                g17 += b36.f.b(14, gVar3);
            }
            int a17 = g17 + b36.f.a(15, this.f453983t);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f453984u;
            if (gVar4 != null) {
                a17 += b36.f.b(16, gVar4);
            }
            return a17 + b36.f.a(17, this.f453985v);
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
        r45.dg5 dg5Var = (r45.dg5) objArr[1];
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
                    dg5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                dg5Var.f453970d = aVar2.c(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.px4 px4Var = new r45.px4();
                    if (bArr3 != null && bArr3.length > 0) {
                        px4Var.mo11468x92b714fd(bArr3);
                    }
                    dg5Var.f453971e.add(px4Var);
                }
                return 0;
            case 4:
                dg5Var.f453972f = aVar2.k(intValue);
                return 0;
            case 5:
                dg5Var.f453973g = aVar2.k(intValue);
                return 0;
            case 6:
                dg5Var.f453974h = aVar2.k(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.mx4 mx4Var = new r45.mx4();
                    if (bArr4 != null && bArr4.length > 0) {
                        mx4Var.mo11468x92b714fd(bArr4);
                    }
                    dg5Var.f453975i.add(mx4Var);
                }
                return 0;
            case 8:
                dg5Var.f453976m = aVar2.c(intValue);
                return 0;
            case 9:
                dg5Var.f453977n = aVar2.g(intValue);
                return 0;
            case 10:
                dg5Var.f453978o = aVar2.g(intValue);
                return 0;
            case 11:
                dg5Var.f453979p = aVar2.k(intValue);
                return 0;
            case 12:
                dg5Var.f453980q = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.qx4 qx4Var3 = new r45.qx4();
                    if (bArr5 != null && bArr5.length > 0) {
                        qx4Var3.mo11468x92b714fd(bArr5);
                    }
                    dg5Var.f453981r = qx4Var3;
                }
                return 0;
            case 14:
                dg5Var.f453982s = aVar2.d(intValue);
                return 0;
            case 15:
                dg5Var.f453983t = aVar2.c(intValue);
                return 0;
            case 16:
                dg5Var.f453984u = aVar2.d(intValue);
                return 0;
            case 17:
                dg5Var.f453985v = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
