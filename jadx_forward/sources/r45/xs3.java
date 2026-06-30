package r45;

/* loaded from: classes7.dex */
public class xs3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ud7 f471907d;

    /* renamed from: e, reason: collision with root package name */
    public r45.vd7 f471908e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rd7 f471909f;

    /* renamed from: g, reason: collision with root package name */
    public r45.bg7 f471910g;

    /* renamed from: h, reason: collision with root package name */
    public r45.dg7 f471911h;

    /* renamed from: i, reason: collision with root package name */
    public r45.td7 f471912i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xs3)) {
            return false;
        }
        r45.xs3 xs3Var = (r45.xs3) fVar;
        return n51.f.a(this.f76492x92037252, xs3Var.f76492x92037252) && n51.f.a(this.f471907d, xs3Var.f471907d) && n51.f.a(this.f471908e, xs3Var.f471908e) && n51.f.a(this.f471909f, xs3Var.f471909f) && n51.f.a(this.f471910g, xs3Var.f471910g) && n51.f.a(this.f471911h, xs3Var.f471911h) && n51.f.a(this.f471912i, xs3Var.f471912i);
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
            r45.ud7 ud7Var = this.f471907d;
            if (ud7Var != null) {
                fVar.i(2, ud7Var.mo75928xcd1e8d8());
                this.f471907d.mo75956x3d5d1f78(fVar);
            }
            r45.vd7 vd7Var = this.f471908e;
            if (vd7Var != null) {
                fVar.i(3, vd7Var.mo75928xcd1e8d8());
                this.f471908e.mo75956x3d5d1f78(fVar);
            }
            r45.rd7 rd7Var = this.f471909f;
            if (rd7Var != null) {
                fVar.i(4, rd7Var.mo75928xcd1e8d8());
                this.f471909f.mo75956x3d5d1f78(fVar);
            }
            r45.bg7 bg7Var = this.f471910g;
            if (bg7Var != null) {
                fVar.i(5, bg7Var.mo75928xcd1e8d8());
                this.f471910g.mo75956x3d5d1f78(fVar);
            }
            r45.dg7 dg7Var = this.f471911h;
            if (dg7Var != null) {
                fVar.i(6, dg7Var.mo75928xcd1e8d8());
                this.f471911h.mo75956x3d5d1f78(fVar);
            }
            r45.td7 td7Var = this.f471912i;
            if (td7Var != null) {
                fVar.i(7, td7Var.mo75928xcd1e8d8());
                this.f471912i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.ud7 ud7Var2 = this.f471907d;
            if (ud7Var2 != null) {
                i18 += b36.f.i(2, ud7Var2.mo75928xcd1e8d8());
            }
            r45.vd7 vd7Var2 = this.f471908e;
            if (vd7Var2 != null) {
                i18 += b36.f.i(3, vd7Var2.mo75928xcd1e8d8());
            }
            r45.rd7 rd7Var2 = this.f471909f;
            if (rd7Var2 != null) {
                i18 += b36.f.i(4, rd7Var2.mo75928xcd1e8d8());
            }
            r45.bg7 bg7Var2 = this.f471910g;
            if (bg7Var2 != null) {
                i18 += b36.f.i(5, bg7Var2.mo75928xcd1e8d8());
            }
            r45.dg7 dg7Var2 = this.f471911h;
            if (dg7Var2 != null) {
                i18 += b36.f.i(6, dg7Var2.mo75928xcd1e8d8());
            }
            r45.td7 td7Var2 = this.f471912i;
            return td7Var2 != null ? i18 + b36.f.i(7, td7Var2.mo75928xcd1e8d8()) : i18;
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
        r45.xs3 xs3Var = (r45.xs3) objArr[1];
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
                    xs3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.ud7 ud7Var3 = new r45.ud7();
                    if (bArr2 != null && bArr2.length > 0) {
                        ud7Var3.mo11468x92b714fd(bArr2);
                    }
                    xs3Var.f471907d = ud7Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.vd7 vd7Var3 = new r45.vd7();
                    if (bArr3 != null && bArr3.length > 0) {
                        vd7Var3.mo11468x92b714fd(bArr3);
                    }
                    xs3Var.f471908e = vd7Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    r45.rd7 rd7Var3 = new r45.rd7();
                    if (bArr4 != null && bArr4.length > 0) {
                        rd7Var3.mo11468x92b714fd(bArr4);
                    }
                    xs3Var.f471909f = rd7Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    r45.bg7 bg7Var3 = new r45.bg7();
                    if (bArr5 != null && bArr5.length > 0) {
                        bg7Var3.mo11468x92b714fd(bArr5);
                    }
                    xs3Var.f471910g = bg7Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    r45.dg7 dg7Var3 = new r45.dg7();
                    if (bArr6 != null && bArr6.length > 0) {
                        dg7Var3.mo11468x92b714fd(bArr6);
                    }
                    xs3Var.f471911h = dg7Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    r45.td7 td7Var3 = new r45.td7();
                    if (bArr7 != null && bArr7.length > 0) {
                        td7Var3.mo11468x92b714fd(bArr7);
                    }
                    xs3Var.f471912i = td7Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
