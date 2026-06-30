package v53;

/* loaded from: classes8.dex */
public class b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f514856d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f514857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f514858f;

    /* renamed from: g, reason: collision with root package name */
    public int f514859g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f514860h;

    /* renamed from: i, reason: collision with root package name */
    public v53.l f514861i;

    /* renamed from: m, reason: collision with root package name */
    public int f514862m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.b)) {
            return false;
        }
        v53.b bVar = (v53.b) fVar;
        return n51.f.a(this.f514856d, bVar.f514856d) && n51.f.a(this.f514857e, bVar.f514857e) && n51.f.a(this.f514858f, bVar.f514858f) && n51.f.a(java.lang.Integer.valueOf(this.f514859g), java.lang.Integer.valueOf(bVar.f514859g)) && n51.f.a(this.f514860h, bVar.f514860h) && n51.f.a(this.f514861i, bVar.f514861i) && n51.f.a(java.lang.Integer.valueOf(this.f514862m), java.lang.Integer.valueOf(bVar.f514862m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f514856d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f514857e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f514858f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.e(4, this.f514859g);
            java.lang.String str4 = this.f514860h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            v53.l lVar = this.f514861i;
            if (lVar != null) {
                fVar.i(6, lVar.mo75928xcd1e8d8());
                this.f514861i.mo75956x3d5d1f78(fVar);
            }
            fVar.e(7, this.f514862m);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f514856d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f514857e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f514858f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            int e17 = j17 + b36.f.e(4, this.f514859g);
            java.lang.String str8 = this.f514860h;
            if (str8 != null) {
                e17 += b36.f.j(5, str8);
            }
            v53.l lVar2 = this.f514861i;
            if (lVar2 != null) {
                e17 += b36.f.i(6, lVar2.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(7, this.f514862m);
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
        v53.b bVar = (v53.b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                bVar.f514856d = aVar2.k(intValue);
                return 0;
            case 2:
                bVar.f514857e = aVar2.k(intValue);
                return 0;
            case 3:
                bVar.f514858f = aVar2.k(intValue);
                return 0;
            case 4:
                bVar.f514859g = aVar2.g(intValue);
                return 0;
            case 5:
                bVar.f514860h = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    v53.l lVar3 = new v53.l();
                    if (bArr != null && bArr.length > 0) {
                        lVar3.mo11468x92b714fd(bArr);
                    }
                    bVar.f514861i = lVar3;
                }
                return 0;
            case 7:
                bVar.f514862m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
