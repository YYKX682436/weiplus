package r45;

/* loaded from: classes4.dex */
public class wh5 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.yj6 f470698d;

    /* renamed from: e, reason: collision with root package name */
    public r45.yt5 f470699e;

    /* renamed from: f, reason: collision with root package name */
    public r45.s77 f470700f;

    /* renamed from: g, reason: collision with root package name */
    public long f470701g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wh5)) {
            return false;
        }
        r45.wh5 wh5Var = (r45.wh5) fVar;
        return n51.f.a(this.f76492x92037252, wh5Var.f76492x92037252) && n51.f.a(this.f470698d, wh5Var.f470698d) && n51.f.a(this.f470699e, wh5Var.f470699e) && n51.f.a(this.f470700f, wh5Var.f470700f) && n51.f.a(java.lang.Long.valueOf(this.f470701g), java.lang.Long.valueOf(wh5Var.f470701g));
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
            r45.yj6 yj6Var = this.f470698d;
            if (yj6Var != null) {
                fVar.i(2, yj6Var.mo75928xcd1e8d8());
                this.f470698d.mo75956x3d5d1f78(fVar);
            }
            r45.yt5 yt5Var = this.f470699e;
            if (yt5Var != null) {
                fVar.i(3, yt5Var.mo75928xcd1e8d8());
                this.f470699e.mo75956x3d5d1f78(fVar);
            }
            r45.s77 s77Var = this.f470700f;
            if (s77Var != null) {
                fVar.i(4, s77Var.mo75928xcd1e8d8());
                this.f470700f.mo75956x3d5d1f78(fVar);
            }
            fVar.h(5, this.f470701g);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.yj6 yj6Var2 = this.f470698d;
            if (yj6Var2 != null) {
                i18 += b36.f.i(2, yj6Var2.mo75928xcd1e8d8());
            }
            r45.yt5 yt5Var2 = this.f470699e;
            if (yt5Var2 != null) {
                i18 += b36.f.i(3, yt5Var2.mo75928xcd1e8d8());
            }
            r45.s77 s77Var2 = this.f470700f;
            if (s77Var2 != null) {
                i18 += b36.f.i(4, s77Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.h(5, this.f470701g);
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
        r45.wh5 wh5Var = (r45.wh5) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                wh5Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.yj6 yj6Var3 = new r45.yj6();
                if (bArr2 != null && bArr2.length > 0) {
                    yj6Var3.mo11468x92b714fd(bArr2);
                }
                wh5Var.f470698d = yj6Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.yt5 yt5Var3 = new r45.yt5();
                if (bArr3 != null && bArr3.length > 0) {
                    yt5Var3.mo11468x92b714fd(bArr3);
                }
                wh5Var.f470699e = yt5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            wh5Var.f470701g = aVar2.i(intValue);
            return 0;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.s77 s77Var3 = new r45.s77();
            if (bArr4 != null && bArr4.length > 0) {
                s77Var3.mo11468x92b714fd(bArr4);
            }
            wh5Var.f470700f = s77Var3;
        }
        return 0;
    }
}
