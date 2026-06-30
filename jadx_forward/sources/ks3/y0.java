package ks3;

/* loaded from: classes4.dex */
public class y0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f393306d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f393307e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f393308f;

    /* renamed from: g, reason: collision with root package name */
    public ks3.x0 f393309g;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f393313n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f393314o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f393315p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f393316q;

    /* renamed from: t, reason: collision with root package name */
    public ks3.h1 f393319t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f393310h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f393311i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f393312m = new java.util.LinkedList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.LinkedList f393317r = new java.util.LinkedList();

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f393318s = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof ks3.y0)) {
            return false;
        }
        ks3.y0 y0Var = (ks3.y0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f393306d), java.lang.Integer.valueOf(y0Var.f393306d)) && n51.f.a(this.f393307e, y0Var.f393307e) && n51.f.a(this.f393308f, y0Var.f393308f) && n51.f.a(this.f393309g, y0Var.f393309g) && n51.f.a(this.f393310h, y0Var.f393310h) && n51.f.a(this.f393311i, y0Var.f393311i) && n51.f.a(this.f393312m, y0Var.f393312m) && n51.f.a(this.f393313n, y0Var.f393313n) && n51.f.a(this.f393314o, y0Var.f393314o) && n51.f.a(this.f393315p, y0Var.f393315p) && n51.f.a(this.f393316q, y0Var.f393316q) && n51.f.a(this.f393317r, y0Var.f393317r) && n51.f.a(this.f393318s, y0Var.f393318s) && n51.f.a(this.f393319t, y0Var.f393319t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f393318s;
        java.util.LinkedList linkedList2 = this.f393317r;
        java.util.LinkedList linkedList3 = this.f393312m;
        java.util.LinkedList linkedList4 = this.f393311i;
        java.util.LinkedList linkedList5 = this.f393310h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f393306d);
            java.lang.String str = this.f393307e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f393308f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            ks3.x0 x0Var = this.f393309g;
            if (x0Var != null) {
                fVar.i(4, x0Var.mo75928xcd1e8d8());
                this.f393309g.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, linkedList5);
            fVar.g(6, 8, linkedList4);
            fVar.g(7, 8, linkedList3);
            java.lang.String str3 = this.f393313n;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f393314o;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            java.lang.String str5 = this.f393315p;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            java.lang.String str6 = this.f393316q;
            if (str6 != null) {
                fVar.j(11, str6);
            }
            fVar.g(12, 8, linkedList2);
            fVar.g(13, 8, linkedList);
            ks3.h1 h1Var = this.f393319t;
            if (h1Var != null) {
                fVar.i(14, h1Var.mo75928xcd1e8d8());
                this.f393319t.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f393306d) + 0;
            java.lang.String str7 = this.f393307e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f393308f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            ks3.x0 x0Var2 = this.f393309g;
            if (x0Var2 != null) {
                e17 += b36.f.i(4, x0Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(5, 8, linkedList5) + b36.f.g(6, 8, linkedList4) + b36.f.g(7, 8, linkedList3);
            java.lang.String str9 = this.f393313n;
            if (str9 != null) {
                g17 += b36.f.j(8, str9);
            }
            java.lang.String str10 = this.f393314o;
            if (str10 != null) {
                g17 += b36.f.j(9, str10);
            }
            java.lang.String str11 = this.f393315p;
            if (str11 != null) {
                g17 += b36.f.j(10, str11);
            }
            java.lang.String str12 = this.f393316q;
            if (str12 != null) {
                g17 += b36.f.j(11, str12);
            }
            int g18 = g17 + b36.f.g(12, 8, linkedList2) + b36.f.g(13, 8, linkedList);
            ks3.h1 h1Var2 = this.f393319t;
            return h1Var2 != null ? g18 + b36.f.i(14, h1Var2.mo75928xcd1e8d8()) : g18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        ks3.y0 y0Var = (ks3.y0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                y0Var.f393306d = aVar2.g(intValue);
                return 0;
            case 2:
                y0Var.f393307e = aVar2.k(intValue);
                return 0;
            case 3:
                y0Var.f393308f = aVar2.k(intValue);
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    ks3.x0 x0Var3 = new ks3.x0();
                    if (bArr2 != null && bArr2.length > 0) {
                        x0Var3.mo11468x92b714fd(bArr2);
                    }
                    y0Var.f393309g = x0Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    ks3.x0 x0Var4 = new ks3.x0();
                    if (bArr3 != null && bArr3.length > 0) {
                        x0Var4.mo11468x92b714fd(bArr3);
                    }
                    y0Var.f393310h.add(x0Var4);
                }
                return 0;
            case 6:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    ks3.x0 x0Var5 = new ks3.x0();
                    if (bArr4 != null && bArr4.length > 0) {
                        x0Var5.mo11468x92b714fd(bArr4);
                    }
                    y0Var.f393311i.add(x0Var5);
                }
                return 0;
            case 7:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    ks3.x0 x0Var6 = new ks3.x0();
                    if (bArr5 != null && bArr5.length > 0) {
                        x0Var6.mo11468x92b714fd(bArr5);
                    }
                    y0Var.f393312m.add(x0Var6);
                }
                return 0;
            case 8:
                y0Var.f393313n = aVar2.k(intValue);
                return 0;
            case 9:
                y0Var.f393314o = aVar2.k(intValue);
                return 0;
            case 10:
                y0Var.f393315p = aVar2.k(intValue);
                return 0;
            case 11:
                y0Var.f393316q = aVar2.k(intValue);
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    ks3.w0 w0Var = new ks3.w0();
                    if (bArr6 != null && bArr6.length > 0) {
                        w0Var.mo11468x92b714fd(bArr6);
                    }
                    y0Var.f393317r.add(w0Var);
                }
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    ks3.w0 w0Var2 = new ks3.w0();
                    if (bArr7 != null && bArr7.length > 0) {
                        w0Var2.mo11468x92b714fd(bArr7);
                    }
                    y0Var.f393318s.add(w0Var2);
                }
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    ks3.h1 h1Var3 = new ks3.h1();
                    if (bArr8 != null && bArr8.length > 0) {
                        h1Var3.mo11468x92b714fd(bArr8);
                    }
                    y0Var.f393319t = h1Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
