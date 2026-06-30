package r45;

/* loaded from: classes8.dex */
public class wm3 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f470804d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470805e;

    /* renamed from: f, reason: collision with root package name */
    public int f470806f;

    /* renamed from: g, reason: collision with root package name */
    public int f470807g;

    /* renamed from: h, reason: collision with root package name */
    public int f470808h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f470809i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wm3)) {
            return false;
        }
        r45.wm3 wm3Var = (r45.wm3) fVar;
        return n51.f.a(this.f76494x2de60e5e, wm3Var.f76494x2de60e5e) && n51.f.a(this.f470804d, wm3Var.f470804d) && n51.f.a(this.f470805e, wm3Var.f470805e) && n51.f.a(java.lang.Integer.valueOf(this.f470806f), java.lang.Integer.valueOf(wm3Var.f470806f)) && n51.f.a(java.lang.Integer.valueOf(this.f470807g), java.lang.Integer.valueOf(wm3Var.f470807g)) && n51.f.a(java.lang.Integer.valueOf(this.f470808h), java.lang.Integer.valueOf(wm3Var.f470808h)) && n51.f.a(this.f470809i, wm3Var.f470809i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470804d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f470805e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f470806f);
            fVar.e(5, this.f470807g);
            fVar.e(6, this.f470808h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f470809i;
            if (gVar != null) {
                fVar.b(7, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f470804d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f470805e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            int e17 = i18 + b36.f.e(4, this.f470806f) + b36.f.e(5, this.f470807g) + b36.f.e(6, this.f470808h);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f470809i;
            return gVar2 != null ? e17 + b36.f.b(7, gVar2) : e17;
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
        r45.wm3 wm3Var = (r45.wm3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr != null && bArr.length > 0) {
                        heVar3.mo11468x92b714fd(bArr);
                    }
                    wm3Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                wm3Var.f470804d = aVar2.k(intValue);
                return 0;
            case 3:
                wm3Var.f470805e = aVar2.k(intValue);
                return 0;
            case 4:
                wm3Var.f470806f = aVar2.g(intValue);
                return 0;
            case 5:
                wm3Var.f470807g = aVar2.g(intValue);
                return 0;
            case 6:
                wm3Var.f470808h = aVar2.g(intValue);
                return 0;
            case 7:
                wm3Var.f470809i = aVar2.d(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
