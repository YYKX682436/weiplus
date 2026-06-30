package r45;

/* loaded from: classes4.dex */
public class td6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.ud6 f467862d;

    /* renamed from: e, reason: collision with root package name */
    public r45.sd6 f467863e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rd6 f467864f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.td6)) {
            return false;
        }
        r45.td6 td6Var = (r45.td6) fVar;
        return n51.f.a(this.f467862d, td6Var.f467862d) && n51.f.a(this.f467863e, td6Var.f467863e) && n51.f.a(this.f467864f, td6Var.f467864f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ud6 ud6Var = this.f467862d;
            if (ud6Var != null) {
                fVar.i(1, ud6Var.mo75928xcd1e8d8());
                this.f467862d.mo75956x3d5d1f78(fVar);
            }
            r45.sd6 sd6Var = this.f467863e;
            if (sd6Var != null) {
                fVar.i(2, sd6Var.mo75928xcd1e8d8());
                this.f467863e.mo75956x3d5d1f78(fVar);
            }
            r45.rd6 rd6Var = this.f467864f;
            if (rd6Var != null) {
                fVar.i(3, rd6Var.mo75928xcd1e8d8());
                this.f467864f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ud6 ud6Var2 = this.f467862d;
            int i18 = ud6Var2 != null ? 0 + b36.f.i(1, ud6Var2.mo75928xcd1e8d8()) : 0;
            r45.sd6 sd6Var2 = this.f467863e;
            if (sd6Var2 != null) {
                i18 += b36.f.i(2, sd6Var2.mo75928xcd1e8d8());
            }
            r45.rd6 rd6Var2 = this.f467864f;
            return rd6Var2 != null ? i18 + b36.f.i(3, rd6Var2.mo75928xcd1e8d8()) : i18;
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
        r45.td6 td6Var = (r45.td6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ud6 ud6Var3 = new r45.ud6();
                if (bArr != null && bArr.length > 0) {
                    ud6Var3.mo11468x92b714fd(bArr);
                }
                td6Var.f467862d = ud6Var3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.sd6 sd6Var3 = new r45.sd6();
                if (bArr2 != null && bArr2.length > 0) {
                    sd6Var3.mo11468x92b714fd(bArr2);
                }
                td6Var.f467863e = sd6Var3;
            }
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.rd6 rd6Var3 = new r45.rd6();
            if (bArr3 != null && bArr3.length > 0) {
                rd6Var3.mo11468x92b714fd(bArr3);
            }
            td6Var.f467864f = rd6Var3;
        }
        return 0;
    }
}
