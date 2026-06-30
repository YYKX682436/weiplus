package r45;

/* loaded from: classes8.dex */
public class ac3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f451448d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451449e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f451450f;

    /* renamed from: g, reason: collision with root package name */
    public int f451451g;

    /* renamed from: h, reason: collision with root package name */
    public int f451452h;

    /* renamed from: i, reason: collision with root package name */
    public r45.iu f451453i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f451454m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ac3)) {
            return false;
        }
        r45.ac3 ac3Var = (r45.ac3) fVar;
        return n51.f.a(this.f76492x92037252, ac3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f451448d), java.lang.Integer.valueOf(ac3Var.f451448d)) && n51.f.a(this.f451449e, ac3Var.f451449e) && n51.f.a(java.lang.Boolean.valueOf(this.f451450f), java.lang.Boolean.valueOf(ac3Var.f451450f)) && n51.f.a(java.lang.Integer.valueOf(this.f451451g), java.lang.Integer.valueOf(ac3Var.f451451g)) && n51.f.a(java.lang.Integer.valueOf(this.f451452h), java.lang.Integer.valueOf(ac3Var.f451452h)) && n51.f.a(this.f451453i, ac3Var.f451453i) && n51.f.a(java.lang.Boolean.valueOf(this.f451454m), java.lang.Boolean.valueOf(ac3Var.f451454m));
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
            fVar.e(2, this.f451448d);
            java.lang.String str = this.f451449e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.a(4, this.f451450f);
            fVar.e(5, this.f451451g);
            fVar.e(6, this.f451452h);
            r45.iu iuVar = this.f451453i;
            if (iuVar != null) {
                fVar.i(7, iuVar.mo75928xcd1e8d8());
                this.f451453i.mo75956x3d5d1f78(fVar);
            }
            fVar.a(8, this.f451454m);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f451448d);
            java.lang.String str2 = this.f451449e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int a17 = i18 + b36.f.a(4, this.f451450f) + b36.f.e(5, this.f451451g) + b36.f.e(6, this.f451452h);
            r45.iu iuVar2 = this.f451453i;
            if (iuVar2 != null) {
                a17 += b36.f.i(7, iuVar2.mo75928xcd1e8d8());
            }
            return a17 + b36.f.a(8, this.f451454m);
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
        r45.ac3 ac3Var = (r45.ac3) objArr[1];
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
                    ac3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ac3Var.f451448d = aVar2.g(intValue);
                return 0;
            case 3:
                ac3Var.f451449e = aVar2.k(intValue);
                return 0;
            case 4:
                ac3Var.f451450f = aVar2.c(intValue);
                return 0;
            case 5:
                ac3Var.f451451g = aVar2.g(intValue);
                return 0;
            case 6:
                ac3Var.f451452h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.iu iuVar3 = new r45.iu();
                    if (bArr2 != null && bArr2.length > 0) {
                        iuVar3.mo11468x92b714fd(bArr2);
                    }
                    ac3Var.f451453i = iuVar3;
                }
                return 0;
            case 8:
                ac3Var.f451454m = aVar2.c(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
