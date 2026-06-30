package m53;

/* loaded from: classes8.dex */
public class g4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public m53.h4 f405239d;

    /* renamed from: e, reason: collision with root package name */
    public m53.h4 f405240e;

    /* renamed from: f, reason: collision with root package name */
    public m53.h4 f405241f;

    /* renamed from: g, reason: collision with root package name */
    public m53.h4 f405242g;

    /* renamed from: h, reason: collision with root package name */
    public m53.h4 f405243h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f405244i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof m53.g4)) {
            return false;
        }
        m53.g4 g4Var = (m53.g4) fVar;
        return n51.f.a(this.f405239d, g4Var.f405239d) && n51.f.a(this.f405240e, g4Var.f405240e) && n51.f.a(this.f405241f, g4Var.f405241f) && n51.f.a(this.f405242g, g4Var.f405242g) && n51.f.a(this.f405243h, g4Var.f405243h) && n51.f.a(this.f405244i, g4Var.f405244i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            m53.h4 h4Var = this.f405239d;
            if (h4Var != null) {
                fVar.i(1, h4Var.mo75928xcd1e8d8());
                this.f405239d.mo75956x3d5d1f78(fVar);
            }
            m53.h4 h4Var2 = this.f405240e;
            if (h4Var2 != null) {
                fVar.i(2, h4Var2.mo75928xcd1e8d8());
                this.f405240e.mo75956x3d5d1f78(fVar);
            }
            m53.h4 h4Var3 = this.f405241f;
            if (h4Var3 != null) {
                fVar.i(3, h4Var3.mo75928xcd1e8d8());
                this.f405241f.mo75956x3d5d1f78(fVar);
            }
            m53.h4 h4Var4 = this.f405242g;
            if (h4Var4 != null) {
                fVar.i(4, h4Var4.mo75928xcd1e8d8());
                this.f405242g.mo75956x3d5d1f78(fVar);
            }
            m53.h4 h4Var5 = this.f405243h;
            if (h4Var5 != null) {
                fVar.i(6, h4Var5.mo75928xcd1e8d8());
                this.f405243h.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f405244i;
            if (str != null) {
                fVar.j(5, str);
            }
            return 0;
        }
        if (i17 == 1) {
            m53.h4 h4Var6 = this.f405239d;
            int i18 = h4Var6 != null ? 0 + b36.f.i(1, h4Var6.mo75928xcd1e8d8()) : 0;
            m53.h4 h4Var7 = this.f405240e;
            if (h4Var7 != null) {
                i18 += b36.f.i(2, h4Var7.mo75928xcd1e8d8());
            }
            m53.h4 h4Var8 = this.f405241f;
            if (h4Var8 != null) {
                i18 += b36.f.i(3, h4Var8.mo75928xcd1e8d8());
            }
            m53.h4 h4Var9 = this.f405242g;
            if (h4Var9 != null) {
                i18 += b36.f.i(4, h4Var9.mo75928xcd1e8d8());
            }
            m53.h4 h4Var10 = this.f405243h;
            if (h4Var10 != null) {
                i18 += b36.f.i(6, h4Var10.mo75928xcd1e8d8());
            }
            java.lang.String str2 = this.f405244i;
            return str2 != null ? i18 + b36.f.j(5, str2) : i18;
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
        m53.g4 g4Var = (m53.g4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    m53.h4 h4Var11 = new m53.h4();
                    if (bArr != null && bArr.length > 0) {
                        h4Var11.mo11468x92b714fd(bArr);
                    }
                    g4Var.f405239d = h4Var11;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    m53.h4 h4Var12 = new m53.h4();
                    if (bArr2 != null && bArr2.length > 0) {
                        h4Var12.mo11468x92b714fd(bArr2);
                    }
                    g4Var.f405240e = h4Var12;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    m53.h4 h4Var13 = new m53.h4();
                    if (bArr3 != null && bArr3.length > 0) {
                        h4Var13.mo11468x92b714fd(bArr3);
                    }
                    g4Var.f405241f = h4Var13;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    m53.h4 h4Var14 = new m53.h4();
                    if (bArr4 != null && bArr4.length > 0) {
                        h4Var14.mo11468x92b714fd(bArr4);
                    }
                    g4Var.f405242g = h4Var14;
                }
                return 0;
            case 5:
                g4Var.f405244i = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    m53.h4 h4Var15 = new m53.h4();
                    if (bArr5 != null && bArr5.length > 0) {
                        h4Var15.mo11468x92b714fd(bArr5);
                    }
                    g4Var.f405243h = h4Var15;
                }
                return 0;
            default:
                return -1;
        }
    }
}
