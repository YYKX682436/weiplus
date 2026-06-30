package r45;

/* loaded from: classes4.dex */
public class vi3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f469817d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469818e;

    /* renamed from: f, reason: collision with root package name */
    public int f469819f;

    /* renamed from: g, reason: collision with root package name */
    public int f469820g;

    /* renamed from: h, reason: collision with root package name */
    public r45.j45 f469821h;

    /* renamed from: i, reason: collision with root package name */
    public int f469822i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vi3)) {
            return false;
        }
        r45.vi3 vi3Var = (r45.vi3) fVar;
        return n51.f.a(this.f76492x92037252, vi3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f469817d), java.lang.Integer.valueOf(vi3Var.f469817d)) && n51.f.a(this.f469818e, vi3Var.f469818e) && n51.f.a(java.lang.Integer.valueOf(this.f469819f), java.lang.Integer.valueOf(vi3Var.f469819f)) && n51.f.a(java.lang.Integer.valueOf(this.f469820g), java.lang.Integer.valueOf(vi3Var.f469820g)) && n51.f.a(this.f469821h, vi3Var.f469821h) && n51.f.a(java.lang.Integer.valueOf(this.f469822i), java.lang.Integer.valueOf(vi3Var.f469822i));
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
            fVar.e(2, this.f469817d);
            java.lang.String str = this.f469818e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f469819f);
            fVar.e(5, this.f469820g);
            r45.j45 j45Var = this.f469821h;
            if (j45Var != null) {
                fVar.i(6, j45Var.mo75928xcd1e8d8());
                this.f469821h.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f469822i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f469817d);
            java.lang.String str2 = this.f469818e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            int e17 = i18 + b36.f.e(4, this.f469819f) + b36.f.e(5, this.f469820g);
            r45.j45 j45Var2 = this.f469821h;
            if (j45Var2 != null) {
                e17 += b36.f.i(6, j45Var2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f469822i);
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
        r45.vi3 vi3Var = (r45.vi3) objArr[1];
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
                    vi3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                vi3Var.f469817d = aVar2.g(intValue);
                return 0;
            case 3:
                vi3Var.f469818e = aVar2.k(intValue);
                return 0;
            case 4:
                vi3Var.f469819f = aVar2.g(intValue);
                return 0;
            case 5:
                vi3Var.f469820g = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.j45 j45Var3 = new r45.j45();
                    if (bArr2 != null && bArr2.length > 0) {
                        j45Var3.mo11468x92b714fd(bArr2);
                    }
                    vi3Var.f469821h = j45Var3;
                }
                return 0;
            case 7:
                vi3Var.f469822i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
