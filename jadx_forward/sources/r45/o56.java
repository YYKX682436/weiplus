package r45;

/* loaded from: classes14.dex */
public class o56 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.gc f463482d;

    /* renamed from: e, reason: collision with root package name */
    public int f463483e;

    /* renamed from: f, reason: collision with root package name */
    public r45.fc f463484f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f463485g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f463486h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f463487i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f463488m;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f463490o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f463491p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ic f463492q;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f463494s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ty6 f463495t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f463496u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f463497v;

    /* renamed from: w, reason: collision with root package name */
    public r45.ec f463498w;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f463489n = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f463493r = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o56)) {
            return false;
        }
        r45.o56 o56Var = (r45.o56) fVar;
        return n51.f.a(this.f76492x92037252, o56Var.f76492x92037252) && n51.f.a(this.f463482d, o56Var.f463482d) && n51.f.a(java.lang.Integer.valueOf(this.f463483e), java.lang.Integer.valueOf(o56Var.f463483e)) && n51.f.a(this.f463484f, o56Var.f463484f) && n51.f.a(this.f463485g, o56Var.f463485g) && n51.f.a(this.f463486h, o56Var.f463486h) && n51.f.a(this.f463487i, o56Var.f463487i) && n51.f.a(this.f463488m, o56Var.f463488m) && n51.f.a(this.f463489n, o56Var.f463489n) && n51.f.a(this.f463490o, o56Var.f463490o) && n51.f.a(this.f463491p, o56Var.f463491p) && n51.f.a(this.f463492q, o56Var.f463492q) && n51.f.a(this.f463493r, o56Var.f463493r) && n51.f.a(this.f463494s, o56Var.f463494s) && n51.f.a(this.f463495t, o56Var.f463495t) && n51.f.a(java.lang.Boolean.valueOf(this.f463496u), java.lang.Boolean.valueOf(o56Var.f463496u)) && n51.f.a(this.f463497v, o56Var.f463497v) && n51.f.a(this.f463498w, o56Var.f463498w);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f463493r;
        java.util.LinkedList linkedList2 = this.f463489n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.gc gcVar = this.f463482d;
            if (gcVar != null) {
                fVar.i(2, gcVar.mo75928xcd1e8d8());
                this.f463482d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f463483e);
            r45.fc fcVar = this.f463484f;
            if (fcVar != null) {
                fVar.i(4, fcVar.mo75928xcd1e8d8());
                this.f463484f.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f463485g;
            if (str != null) {
                fVar.j(5, str);
            }
            java.lang.String str2 = this.f463486h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f463487i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f463488m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.g(9, 8, linkedList2);
            java.lang.String str5 = this.f463490o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f463491p;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            r45.ic icVar = this.f463492q;
            if (icVar != null) {
                fVar.i(12, icVar.mo75928xcd1e8d8());
                this.f463492q.mo75956x3d5d1f78(fVar);
            }
            fVar.g(13, 8, linkedList);
            java.lang.String str7 = this.f463494s;
            if (str7 != null) {
                fVar.j(14, str7);
            }
            r45.ty6 ty6Var = this.f463495t;
            if (ty6Var != null) {
                fVar.i(15, ty6Var.mo75928xcd1e8d8());
                this.f463495t.mo75956x3d5d1f78(fVar);
            }
            fVar.a(16, this.f463496u);
            java.lang.String str8 = this.f463497v;
            if (str8 != null) {
                fVar.j(17, str8);
            }
            r45.ec ecVar = this.f463498w;
            if (ecVar != null) {
                fVar.i(19, ecVar.mo75928xcd1e8d8());
                this.f463498w.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            r45.gc gcVar2 = this.f463482d;
            if (gcVar2 != null) {
                i18 += b36.f.i(2, gcVar2.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f463483e);
            r45.fc fcVar2 = this.f463484f;
            if (fcVar2 != null) {
                e17 += b36.f.i(4, fcVar2.mo75928xcd1e8d8());
            }
            java.lang.String str9 = this.f463485g;
            if (str9 != null) {
                e17 += b36.f.j(5, str9);
            }
            java.lang.String str10 = this.f463486h;
            if (str10 != null) {
                e17 += b36.f.j(6, str10);
            }
            java.lang.String str11 = this.f463487i;
            if (str11 != null) {
                e17 += b36.f.j(7, str11);
            }
            java.lang.String str12 = this.f463488m;
            if (str12 != null) {
                e17 += b36.f.j(8, str12);
            }
            int g17 = e17 + b36.f.g(9, 8, linkedList2);
            java.lang.String str13 = this.f463490o;
            if (str13 != null) {
                g17 += b36.f.j(10, str13);
            }
            java.lang.String str14 = this.f463491p;
            if (str14 != null) {
                g17 += b36.f.j(11, str14);
            }
            r45.ic icVar2 = this.f463492q;
            if (icVar2 != null) {
                g17 += b36.f.i(12, icVar2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(13, 8, linkedList);
            java.lang.String str15 = this.f463494s;
            if (str15 != null) {
                g18 += b36.f.j(14, str15);
            }
            r45.ty6 ty6Var2 = this.f463495t;
            if (ty6Var2 != null) {
                g18 += b36.f.i(15, ty6Var2.mo75928xcd1e8d8());
            }
            int a17 = g18 + b36.f.a(16, this.f463496u);
            java.lang.String str16 = this.f463497v;
            if (str16 != null) {
                a17 += b36.f.j(17, str16);
            }
            r45.ec ecVar2 = this.f463498w;
            return ecVar2 != null ? a17 + b36.f.i(19, ecVar2.mo75928xcd1e8d8()) : a17;
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
        r45.o56 o56Var = (r45.o56) objArr[1];
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
                    o56Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gc gcVar3 = new r45.gc();
                    if (bArr3 != null && bArr3.length > 0) {
                        gcVar3.mo11468x92b714fd(bArr3);
                    }
                    o56Var.f463482d = gcVar3;
                }
                return 0;
            case 3:
                o56Var.f463483e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.fc fcVar3 = new r45.fc();
                    if (bArr4 != null && bArr4.length > 0) {
                        fcVar3.mo11468x92b714fd(bArr4);
                    }
                    o56Var.f463484f = fcVar3;
                }
                return 0;
            case 5:
                o56Var.f463485g = aVar2.k(intValue);
                return 0;
            case 6:
                o56Var.f463486h = aVar2.k(intValue);
                return 0;
            case 7:
                o56Var.f463487i = aVar2.k(intValue);
                return 0;
            case 8:
                o56Var.f463488m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.hc hcVar = new r45.hc();
                    if (bArr5 != null && bArr5.length > 0) {
                        hcVar.mo11468x92b714fd(bArr5);
                    }
                    o56Var.f463489n.add(hcVar);
                }
                return 0;
            case 10:
                o56Var.f463490o = aVar2.k(intValue);
                return 0;
            case 11:
                o56Var.f463491p = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.ic icVar3 = new r45.ic();
                    if (bArr6 != null && bArr6.length > 0) {
                        icVar3.mo11468x92b714fd(bArr6);
                    }
                    o56Var.f463492q = icVar3;
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.ic icVar4 = new r45.ic();
                    if (bArr7 != null && bArr7.length > 0) {
                        icVar4.mo11468x92b714fd(bArr7);
                    }
                    o56Var.f463493r.add(icVar4);
                }
                return 0;
            case 14:
                o56Var.f463494s = aVar2.k(intValue);
                return 0;
            case 15:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.ty6 ty6Var3 = new r45.ty6();
                    if (bArr8 != null && bArr8.length > 0) {
                        ty6Var3.mo11468x92b714fd(bArr8);
                    }
                    o56Var.f463495t = ty6Var3;
                }
                return 0;
            case 16:
                o56Var.f463496u = aVar2.c(intValue);
                return 0;
            case 17:
                o56Var.f463497v = aVar2.k(intValue);
                return 0;
            case 18:
            default:
                return -1;
            case 19:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.ec ecVar3 = new r45.ec();
                    if (bArr9 != null && bArr9.length > 0) {
                        ecVar3.mo11468x92b714fd(bArr9);
                    }
                    o56Var.f463498w = ecVar3;
                }
                return 0;
        }
    }
}
