package r45;

/* loaded from: classes11.dex */
public class gi extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456788d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f456789e;

    /* renamed from: f, reason: collision with root package name */
    public int f456790f;

    /* renamed from: g, reason: collision with root package name */
    public int f456791g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f456792h;

    /* renamed from: i, reason: collision with root package name */
    public int f456793i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456794m;

    /* renamed from: n, reason: collision with root package name */
    public r45.du5 f456795n;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f456796o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f456797p;

    /* renamed from: q, reason: collision with root package name */
    public r45.hu5 f456798q;

    /* renamed from: r, reason: collision with root package name */
    public int f456799r;

    /* renamed from: s, reason: collision with root package name */
    public r45.cu5 f456800s;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gi)) {
            return false;
        }
        r45.gi giVar = (r45.gi) fVar;
        return n51.f.a(this.f76492x92037252, giVar.f76492x92037252) && n51.f.a(this.f456788d, giVar.f456788d) && n51.f.a(this.f456789e, giVar.f456789e) && n51.f.a(java.lang.Integer.valueOf(this.f456790f), java.lang.Integer.valueOf(giVar.f456790f)) && n51.f.a(java.lang.Integer.valueOf(this.f456791g), java.lang.Integer.valueOf(giVar.f456791g)) && n51.f.a(this.f456792h, giVar.f456792h) && n51.f.a(java.lang.Integer.valueOf(this.f456793i), java.lang.Integer.valueOf(giVar.f456793i)) && n51.f.a(this.f456794m, giVar.f456794m) && n51.f.a(this.f456795n, giVar.f456795n) && n51.f.a(this.f456796o, giVar.f456796o) && n51.f.a(this.f456797p, giVar.f456797p) && n51.f.a(this.f456798q, giVar.f456798q) && n51.f.a(java.lang.Integer.valueOf(this.f456799r), java.lang.Integer.valueOf(giVar.f456799r)) && n51.f.a(this.f456800s, giVar.f456800s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f456788d;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.cu5 cu5Var = this.f456789e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f456789e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f456790f);
            fVar.e(5, this.f456791g);
            java.lang.String str2 = this.f456792h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            fVar.e(7, this.f456793i);
            java.lang.String str3 = this.f456794m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            r45.du5 du5Var = this.f456795n;
            if (du5Var != null) {
                fVar.i(9, du5Var.mo75928xcd1e8d8());
                this.f456795n.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f456796o;
            if (cu5Var2 != null) {
                fVar.i(10, cu5Var2.mo75928xcd1e8d8());
                this.f456796o.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f456797p;
            if (cu5Var3 != null) {
                fVar.i(11, cu5Var3.mo75928xcd1e8d8());
                this.f456797p.mo75956x3d5d1f78(fVar);
            }
            r45.hu5 hu5Var = this.f456798q;
            if (hu5Var != null) {
                fVar.i(12, hu5Var.mo75928xcd1e8d8());
                this.f456798q.mo75956x3d5d1f78(fVar);
            }
            fVar.e(13, this.f456799r);
            r45.cu5 cu5Var4 = this.f456800s;
            if (cu5Var4 != null) {
                fVar.i(14, cu5Var4.mo75928xcd1e8d8());
                this.f456800s.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0;
            java.lang.String str4 = this.f456788d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            r45.cu5 cu5Var5 = this.f456789e;
            if (cu5Var5 != null) {
                i18 += b36.f.i(3, cu5Var5.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(4, this.f456790f) + b36.f.e(5, this.f456791g);
            java.lang.String str5 = this.f456792h;
            if (str5 != null) {
                e17 += b36.f.j(6, str5);
            }
            int e18 = e17 + b36.f.e(7, this.f456793i);
            java.lang.String str6 = this.f456794m;
            if (str6 != null) {
                e18 += b36.f.j(8, str6);
            }
            r45.du5 du5Var2 = this.f456795n;
            if (du5Var2 != null) {
                e18 += b36.f.i(9, du5Var2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f456796o;
            if (cu5Var6 != null) {
                e18 += b36.f.i(10, cu5Var6.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var7 = this.f456797p;
            if (cu5Var7 != null) {
                e18 += b36.f.i(11, cu5Var7.mo75928xcd1e8d8());
            }
            r45.hu5 hu5Var2 = this.f456798q;
            if (hu5Var2 != null) {
                e18 += b36.f.i(12, hu5Var2.mo75928xcd1e8d8());
            }
            int e19 = e18 + b36.f.e(13, this.f456799r);
            r45.cu5 cu5Var8 = this.f456800s;
            return cu5Var8 != null ? e19 + b36.f.i(14, cu5Var8.mo75928xcd1e8d8()) : e19;
        }
        if (i17 == 2) {
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
        r45.gi giVar = (r45.gi) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    giVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                giVar.f456788d = aVar2.k(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.cu5 cu5Var9 = new r45.cu5();
                    if (bArr2 != null && bArr2.length > 0) {
                        cu5Var9.b(bArr2);
                    }
                    giVar.f456789e = cu5Var9;
                }
                return 0;
            case 4:
                giVar.f456790f = aVar2.g(intValue);
                return 0;
            case 5:
                giVar.f456791g = aVar2.g(intValue);
                return 0;
            case 6:
                giVar.f456792h = aVar2.k(intValue);
                return 0;
            case 7:
                giVar.f456793i = aVar2.g(intValue);
                return 0;
            case 8:
                giVar.f456794m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.du5 du5Var3 = new r45.du5();
                    if (bArr3 != null && bArr3.length > 0) {
                        du5Var3.b(bArr3);
                    }
                    giVar.f456795n = du5Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var10 = new r45.cu5();
                    if (bArr4 != null && bArr4.length > 0) {
                        cu5Var10.b(bArr4);
                    }
                    giVar.f456796o = cu5Var10;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var11 = new r45.cu5();
                    if (bArr5 != null && bArr5.length > 0) {
                        cu5Var11.b(bArr5);
                    }
                    giVar.f456797p = cu5Var11;
                }
                return 0;
            case 12:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.hu5 hu5Var3 = new r45.hu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        hu5Var3.mo11468x92b714fd(bArr6);
                    }
                    giVar.f456798q = hu5Var3;
                }
                return 0;
            case 13:
                giVar.f456799r = aVar2.g(intValue);
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.cu5 cu5Var12 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var12.b(bArr7);
                    }
                    giVar.f456800s = cu5Var12;
                }
                return 0;
            default:
                return -1;
        }
    }
}
