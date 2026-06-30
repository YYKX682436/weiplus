package r45;

/* loaded from: classes2.dex */
public class xr0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f471884d;

    /* renamed from: e, reason: collision with root package name */
    public int f471885e;

    /* renamed from: f, reason: collision with root package name */
    public long f471886f;

    /* renamed from: g, reason: collision with root package name */
    public long f471887g;

    /* renamed from: h, reason: collision with root package name */
    public int f471888h;

    /* renamed from: i, reason: collision with root package name */
    public int f471889i;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xr0)) {
            return false;
        }
        r45.xr0 xr0Var = (r45.xr0) fVar;
        return n51.f.a(this.f76492x92037252, xr0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f471884d), java.lang.Integer.valueOf(xr0Var.f471884d)) && n51.f.a(java.lang.Integer.valueOf(this.f471885e), java.lang.Integer.valueOf(xr0Var.f471885e)) && n51.f.a(java.lang.Long.valueOf(this.f471886f), java.lang.Long.valueOf(xr0Var.f471886f)) && n51.f.a(java.lang.Long.valueOf(this.f471887g), java.lang.Long.valueOf(xr0Var.f471887g)) && n51.f.a(java.lang.Integer.valueOf(this.f471888h), java.lang.Integer.valueOf(xr0Var.f471888h)) && n51.f.a(java.lang.Integer.valueOf(this.f471889i), java.lang.Integer.valueOf(xr0Var.f471889i));
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
            fVar.e(2, this.f471884d);
            fVar.e(3, this.f471885e);
            fVar.h(4, this.f471886f);
            fVar.h(5, this.f471887g);
            fVar.e(6, this.f471888h);
            fVar.e(7, this.f471889i);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f471884d) + b36.f.e(3, this.f471885e) + b36.f.h(4, this.f471886f) + b36.f.h(5, this.f471887g) + b36.f.e(6, this.f471888h) + b36.f.e(7, this.f471889i);
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
        r45.xr0 xr0Var = (r45.xr0) objArr[1];
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
                    xr0Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                xr0Var.f471884d = aVar2.g(intValue);
                return 0;
            case 3:
                xr0Var.f471885e = aVar2.g(intValue);
                return 0;
            case 4:
                xr0Var.f471886f = aVar2.i(intValue);
                return 0;
            case 5:
                xr0Var.f471887g = aVar2.i(intValue);
                return 0;
            case 6:
                xr0Var.f471888h = aVar2.g(intValue);
                return 0;
            case 7:
                xr0Var.f471889i = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
