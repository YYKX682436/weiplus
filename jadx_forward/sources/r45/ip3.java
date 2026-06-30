package r45;

/* loaded from: classes8.dex */
public class ip3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f458782d;

    /* renamed from: e, reason: collision with root package name */
    public int f458783e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f458784f;

    /* renamed from: g, reason: collision with root package name */
    public int f458785g;

    /* renamed from: h, reason: collision with root package name */
    public int f458786h;

    /* renamed from: i, reason: collision with root package name */
    public int f458787i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ip3)) {
            return false;
        }
        r45.ip3 ip3Var = (r45.ip3) fVar;
        return n51.f.a(this.f76492x92037252, ip3Var.f76492x92037252) && n51.f.a(java.lang.Boolean.valueOf(this.f458782d), java.lang.Boolean.valueOf(ip3Var.f458782d)) && n51.f.a(java.lang.Integer.valueOf(this.f458783e), java.lang.Integer.valueOf(ip3Var.f458783e)) && n51.f.a(java.lang.Boolean.valueOf(this.f458784f), java.lang.Boolean.valueOf(ip3Var.f458784f)) && n51.f.a(java.lang.Integer.valueOf(this.f458785g), java.lang.Integer.valueOf(ip3Var.f458785g)) && n51.f.a(java.lang.Integer.valueOf(this.f458786h), java.lang.Integer.valueOf(ip3Var.f458786h)) && n51.f.a(java.lang.Integer.valueOf(this.f458787i), java.lang.Integer.valueOf(ip3Var.f458787i));
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
            fVar.a(2, this.f458782d);
            fVar.e(3, this.f458783e);
            fVar.a(4, this.f458784f);
            fVar.e(5, this.f458785g);
            fVar.e(6, this.f458786h);
            fVar.e(7, this.f458787i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.a(2, this.f458782d) + b36.f.e(3, this.f458783e) + b36.f.a(4, this.f458784f) + b36.f.e(5, this.f458785g) + b36.f.e(6, this.f458786h) + b36.f.e(7, this.f458787i);
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
        r45.ip3 ip3Var = (r45.ip3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    ip3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ip3Var.f458782d = aVar2.c(intValue);
                return 0;
            case 3:
                ip3Var.f458783e = aVar2.g(intValue);
                return 0;
            case 4:
                ip3Var.f458784f = aVar2.c(intValue);
                return 0;
            case 5:
                ip3Var.f458785g = aVar2.g(intValue);
                return 0;
            case 6:
                ip3Var.f458786h = aVar2.g(intValue);
                return 0;
            case 7:
                ip3Var.f458787i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
