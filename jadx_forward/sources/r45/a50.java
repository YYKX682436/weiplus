package r45;

/* loaded from: classes2.dex */
public class a50 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f451259d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f451260e;

    /* renamed from: f, reason: collision with root package name */
    public r45.r75 f451261f;

    /* renamed from: g, reason: collision with root package name */
    public r45.yt5 f451262g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ms5 f451263h;

    /* renamed from: i, reason: collision with root package name */
    public int f451264i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.a50)) {
            return false;
        }
        r45.a50 a50Var = (r45.a50) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f451259d), java.lang.Integer.valueOf(a50Var.f451259d)) && n51.f.a(this.f451260e, a50Var.f451260e) && n51.f.a(this.f451261f, a50Var.f451261f) && n51.f.a(this.f451262g, a50Var.f451262g) && n51.f.a(this.f451263h, a50Var.f451263h) && n51.f.a(java.lang.Integer.valueOf(this.f451264i), java.lang.Integer.valueOf(a50Var.f451264i));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f451259d);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f451260e;
            if (gVar != null) {
                fVar.b(2, gVar);
            }
            r45.r75 r75Var = this.f451261f;
            if (r75Var != null) {
                fVar.i(3, r75Var.mo75928xcd1e8d8());
                this.f451261f.mo75956x3d5d1f78(fVar);
            }
            r45.yt5 yt5Var = this.f451262g;
            if (yt5Var != null) {
                fVar.i(4, yt5Var.mo75928xcd1e8d8());
                this.f451262g.mo75956x3d5d1f78(fVar);
            }
            r45.ms5 ms5Var = this.f451263h;
            if (ms5Var != null) {
                fVar.i(5, ms5Var.mo75928xcd1e8d8());
                this.f451263h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(6, this.f451264i);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f451259d) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f451260e;
            if (gVar2 != null) {
                e17 += b36.f.b(2, gVar2);
            }
            r45.r75 r75Var2 = this.f451261f;
            if (r75Var2 != null) {
                e17 += b36.f.i(3, r75Var2.mo75928xcd1e8d8());
            }
            r45.yt5 yt5Var2 = this.f451262g;
            if (yt5Var2 != null) {
                e17 += b36.f.i(4, yt5Var2.mo75928xcd1e8d8());
            }
            r45.ms5 ms5Var2 = this.f451263h;
            if (ms5Var2 != null) {
                e17 += b36.f.i(5, ms5Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(6, this.f451264i);
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
        r45.a50 a50Var = (r45.a50) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                a50Var.f451259d = aVar2.g(intValue);
                return 0;
            case 2:
                a50Var.f451260e = aVar2.d(intValue);
                return 0;
            case 3:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.r75 r75Var3 = new r45.r75();
                    if (bArr != null && bArr.length > 0) {
                        r75Var3.mo11468x92b714fd(bArr);
                    }
                    a50Var.f451261f = r75Var3;
                }
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr2 != null && bArr2.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr2);
                    }
                    a50Var.f451262g = yt5Var3;
                }
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j19.get(i27);
                    r45.ms5 ms5Var3 = new r45.ms5();
                    if (bArr3 != null && bArr3.length > 0) {
                        ms5Var3.mo11468x92b714fd(bArr3);
                    }
                    a50Var.f451263h = ms5Var3;
                }
                return 0;
            case 6:
                a50Var.f451264i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
