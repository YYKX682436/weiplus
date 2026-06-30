package r45;

/* loaded from: classes12.dex */
public class sr6 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467484d;

    /* renamed from: e, reason: collision with root package name */
    public r45.xb f467485e;

    /* renamed from: f, reason: collision with root package name */
    public r45.i1 f467486f;

    /* renamed from: g, reason: collision with root package name */
    public r45.vt4 f467487g;

    /* renamed from: h, reason: collision with root package name */
    public r45.wc f467488h;

    /* renamed from: i, reason: collision with root package name */
    public r45.jx3 f467489i;

    /* renamed from: m, reason: collision with root package name */
    public r45.ys f467490m;

    /* renamed from: n, reason: collision with root package name */
    public r45.cu5 f467491n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.sr6)) {
            return false;
        }
        r45.sr6 sr6Var = (r45.sr6) fVar;
        return n51.f.a(this.f76492x92037252, sr6Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467484d), java.lang.Integer.valueOf(sr6Var.f467484d)) && n51.f.a(this.f467485e, sr6Var.f467485e) && n51.f.a(this.f467486f, sr6Var.f467486f) && n51.f.a(this.f467487g, sr6Var.f467487g) && n51.f.a(this.f467488h, sr6Var.f467488h) && n51.f.a(this.f467489i, sr6Var.f467489i) && n51.f.a(this.f467490m, sr6Var.f467490m) && n51.f.a(this.f467491n, sr6Var.f467491n);
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
            fVar.e(2, this.f467484d);
            r45.xb xbVar = this.f467485e;
            if (xbVar != null) {
                fVar.i(3, xbVar.mo75928xcd1e8d8());
                this.f467485e.mo75956x3d5d1f78(fVar);
            }
            r45.i1 i1Var = this.f467486f;
            if (i1Var != null) {
                fVar.i(4, i1Var.mo75928xcd1e8d8());
                this.f467486f.mo75956x3d5d1f78(fVar);
            }
            r45.vt4 vt4Var = this.f467487g;
            if (vt4Var != null) {
                fVar.i(5, vt4Var.mo75928xcd1e8d8());
                this.f467487g.mo75956x3d5d1f78(fVar);
            }
            r45.wc wcVar = this.f467488h;
            if (wcVar != null) {
                fVar.i(6, wcVar.mo75928xcd1e8d8());
                this.f467488h.mo75956x3d5d1f78(fVar);
            }
            r45.jx3 jx3Var = this.f467489i;
            if (jx3Var != null) {
                fVar.i(7, jx3Var.mo75928xcd1e8d8());
                this.f467489i.mo75956x3d5d1f78(fVar);
            }
            r45.ys ysVar = this.f467490m;
            if (ysVar != null) {
                fVar.i(8, ysVar.mo75928xcd1e8d8());
                this.f467490m.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var = this.f467491n;
            if (cu5Var != null) {
                fVar.i(9, cu5Var.mo75928xcd1e8d8());
                this.f467491n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467484d);
            r45.xb xbVar2 = this.f467485e;
            if (xbVar2 != null) {
                i18 += b36.f.i(3, xbVar2.mo75928xcd1e8d8());
            }
            r45.i1 i1Var2 = this.f467486f;
            if (i1Var2 != null) {
                i18 += b36.f.i(4, i1Var2.mo75928xcd1e8d8());
            }
            r45.vt4 vt4Var2 = this.f467487g;
            if (vt4Var2 != null) {
                i18 += b36.f.i(5, vt4Var2.mo75928xcd1e8d8());
            }
            r45.wc wcVar2 = this.f467488h;
            if (wcVar2 != null) {
                i18 += b36.f.i(6, wcVar2.mo75928xcd1e8d8());
            }
            r45.jx3 jx3Var2 = this.f467489i;
            if (jx3Var2 != null) {
                i18 += b36.f.i(7, jx3Var2.mo75928xcd1e8d8());
            }
            r45.ys ysVar2 = this.f467490m;
            if (ysVar2 != null) {
                i18 += b36.f.i(8, ysVar2.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var2 = this.f467491n;
            return cu5Var2 != null ? i18 + b36.f.i(9, cu5Var2.mo75928xcd1e8d8()) : i18;
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
        r45.sr6 sr6Var = (r45.sr6) objArr[1];
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
                    sr6Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                sr6Var.f467484d = aVar2.g(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.xb xbVar3 = new r45.xb();
                    if (bArr2 != null && bArr2.length > 0) {
                        xbVar3.mo11468x92b714fd(bArr2);
                    }
                    sr6Var.f467485e = xbVar3;
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.i1 i1Var3 = new r45.i1();
                    if (bArr3 != null && bArr3.length > 0) {
                        i1Var3.mo11468x92b714fd(bArr3);
                    }
                    sr6Var.f467486f = i1Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.vt4 vt4Var3 = new r45.vt4();
                    if (bArr4 != null && bArr4.length > 0) {
                        vt4Var3.mo11468x92b714fd(bArr4);
                    }
                    sr6Var.f467487g = vt4Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.wc wcVar3 = new r45.wc();
                    if (bArr5 != null && bArr5.length > 0) {
                        wcVar3.mo11468x92b714fd(bArr5);
                    }
                    sr6Var.f467488h = wcVar3;
                }
                return 0;
            case 7:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.jx3 jx3Var3 = new r45.jx3();
                    if (bArr6 != null && bArr6.length > 0) {
                        jx3Var3.mo11468x92b714fd(bArr6);
                    }
                    sr6Var.f467489i = jx3Var3;
                }
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.ys ysVar3 = new r45.ys();
                    if (bArr7 != null && bArr7.length > 0) {
                        ysVar3.mo11468x92b714fd(bArr7);
                    }
                    sr6Var.f467490m = ysVar3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    r45.cu5 cu5Var3 = new r45.cu5();
                    if (bArr8 != null && bArr8.length > 0) {
                        cu5Var3.b(bArr8);
                    }
                    sr6Var.f467491n = cu5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
