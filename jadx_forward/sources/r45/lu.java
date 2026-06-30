package r45;

/* loaded from: classes2.dex */
public class lu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bz3 f461356d;

    /* renamed from: e, reason: collision with root package name */
    public r45.rl6 f461357e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461359g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461360h;

    /* renamed from: i, reason: collision with root package name */
    public r45.yt5 f461361i;

    /* renamed from: m, reason: collision with root package name */
    public int f461362m;

    /* renamed from: n, reason: collision with root package name */
    public int f461363n;

    /* renamed from: o, reason: collision with root package name */
    public int f461364o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f461365p;

    /* renamed from: q, reason: collision with root package name */
    public r45.rl6 f461366q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461367r;

    /* renamed from: t, reason: collision with root package name */
    public r45.rl6 f461369t;

    /* renamed from: u, reason: collision with root package name */
    public r45.rl6 f461370u;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f461358f = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f461368s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lu)) {
            return false;
        }
        r45.lu luVar = (r45.lu) fVar;
        return n51.f.a(this.f461356d, luVar.f461356d) && n51.f.a(this.f461357e, luVar.f461357e) && n51.f.a(this.f461358f, luVar.f461358f) && n51.f.a(this.f461359g, luVar.f461359g) && n51.f.a(this.f461360h, luVar.f461360h) && n51.f.a(this.f461361i, luVar.f461361i) && n51.f.a(java.lang.Integer.valueOf(this.f461362m), java.lang.Integer.valueOf(luVar.f461362m)) && n51.f.a(java.lang.Integer.valueOf(this.f461363n), java.lang.Integer.valueOf(luVar.f461363n)) && n51.f.a(java.lang.Integer.valueOf(this.f461364o), java.lang.Integer.valueOf(luVar.f461364o)) && n51.f.a(this.f461365p, luVar.f461365p) && n51.f.a(this.f461366q, luVar.f461366q) && n51.f.a(this.f461367r, luVar.f461367r) && n51.f.a(this.f461368s, luVar.f461368s) && n51.f.a(this.f461369t, luVar.f461369t) && n51.f.a(this.f461370u, luVar.f461370u);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461368s;
        java.util.LinkedList linkedList2 = this.f461358f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bz3 bz3Var = this.f461356d;
            if (bz3Var != null) {
                fVar.i(1, bz3Var.mo75928xcd1e8d8());
                this.f461356d.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var = this.f461357e;
            if (rl6Var != null) {
                fVar.i(2, rl6Var.mo75928xcd1e8d8());
                this.f461357e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            java.lang.String str = this.f461359g;
            if (str != null) {
                fVar.j(4, str);
            }
            java.lang.String str2 = this.f461360h;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.yt5 yt5Var = this.f461361i;
            if (yt5Var != null) {
                fVar.i(6, yt5Var.mo75928xcd1e8d8());
                this.f461361i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f461362m);
            fVar.e(8, this.f461363n);
            fVar.e(9, this.f461364o);
            java.lang.String str3 = this.f461365p;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            r45.rl6 rl6Var2 = this.f461366q;
            if (rl6Var2 != null) {
                fVar.i(11, rl6Var2.mo75928xcd1e8d8());
                this.f461366q.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f461367r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.g(13, 8, linkedList);
            r45.rl6 rl6Var3 = this.f461369t;
            if (rl6Var3 != null) {
                fVar.i(14, rl6Var3.mo75928xcd1e8d8());
                this.f461369t.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var4 = this.f461370u;
            if (rl6Var4 != null) {
                fVar.i(15, rl6Var4.mo75928xcd1e8d8());
                this.f461370u.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.bz3 bz3Var2 = this.f461356d;
            int i18 = bz3Var2 != null ? b36.f.i(1, bz3Var2.mo75928xcd1e8d8()) + 0 : 0;
            r45.rl6 rl6Var5 = this.f461357e;
            if (rl6Var5 != null) {
                i18 += b36.f.i(2, rl6Var5.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList2);
            java.lang.String str5 = this.f461359g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f461360h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            r45.yt5 yt5Var2 = this.f461361i;
            if (yt5Var2 != null) {
                g17 += b36.f.i(6, yt5Var2.mo75928xcd1e8d8());
            }
            int e17 = g17 + b36.f.e(7, this.f461362m) + b36.f.e(8, this.f461363n) + b36.f.e(9, this.f461364o);
            java.lang.String str7 = this.f461365p;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            r45.rl6 rl6Var6 = this.f461366q;
            if (rl6Var6 != null) {
                e17 += b36.f.i(11, rl6Var6.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f461367r;
            if (str8 != null) {
                e17 += b36.f.j(12, str8);
            }
            int g18 = e17 + b36.f.g(13, 8, linkedList);
            r45.rl6 rl6Var7 = this.f461369t;
            if (rl6Var7 != null) {
                g18 += b36.f.i(14, rl6Var7.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var8 = this.f461370u;
            return rl6Var8 != null ? g18 + b36.f.i(15, rl6Var8.mo75928xcd1e8d8()) : g18;
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
        r45.lu luVar = (r45.lu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr2 != null && bArr2.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr2);
                    }
                    luVar.f461356d = bz3Var3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.rl6 rl6Var9 = new r45.rl6();
                    if (bArr3 != null && bArr3.length > 0) {
                        rl6Var9.mo11468x92b714fd(bArr3);
                    }
                    luVar.f461357e = rl6Var9;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var10 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var10.mo11468x92b714fd(bArr4);
                    }
                    luVar.f461358f.add(rl6Var10);
                }
                return 0;
            case 4:
                luVar.f461359g = aVar2.k(intValue);
                return 0;
            case 5:
                luVar.f461360h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr5 != null && bArr5.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr5);
                    }
                    luVar.f461361i = yt5Var3;
                }
                return 0;
            case 7:
                luVar.f461362m = aVar2.g(intValue);
                return 0;
            case 8:
                luVar.f461363n = aVar2.g(intValue);
                return 0;
            case 9:
                luVar.f461364o = aVar2.g(intValue);
                return 0;
            case 10:
                luVar.f461365p = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.rl6 rl6Var11 = new r45.rl6();
                    if (bArr6 != null && bArr6.length > 0) {
                        rl6Var11.mo11468x92b714fd(bArr6);
                    }
                    luVar.f461366q = rl6Var11;
                }
                return 0;
            case 12:
                luVar.f461367r = aVar2.k(intValue);
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.dr4 dr4Var = new r45.dr4();
                    if (bArr7 != null && bArr7.length > 0) {
                        dr4Var.mo11468x92b714fd(bArr7);
                    }
                    luVar.f461368s.add(dr4Var);
                }
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.rl6 rl6Var12 = new r45.rl6();
                    if (bArr8 != null && bArr8.length > 0) {
                        rl6Var12.mo11468x92b714fd(bArr8);
                    }
                    luVar.f461369t = rl6Var12;
                }
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.rl6 rl6Var13 = new r45.rl6();
                    if (bArr9 != null && bArr9.length > 0) {
                        rl6Var13.mo11468x92b714fd(bArr9);
                    }
                    luVar.f461370u = rl6Var13;
                }
                return 0;
            default:
                return -1;
        }
    }
}
