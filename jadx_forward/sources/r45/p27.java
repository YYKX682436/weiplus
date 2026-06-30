package r45;

/* loaded from: classes8.dex */
public class p27 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464221d;

    /* renamed from: e, reason: collision with root package name */
    public long f464222e;

    /* renamed from: f, reason: collision with root package name */
    public int f464223f;

    /* renamed from: g, reason: collision with root package name */
    public int f464224g;

    /* renamed from: h, reason: collision with root package name */
    public int f464225h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p27)) {
            return false;
        }
        r45.p27 p27Var = (r45.p27) fVar;
        return n51.f.a(this.f76492x92037252, p27Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464221d), java.lang.Integer.valueOf(p27Var.f464221d)) && n51.f.a(java.lang.Long.valueOf(this.f464222e), java.lang.Long.valueOf(p27Var.f464222e)) && n51.f.a(java.lang.Integer.valueOf(this.f464223f), java.lang.Integer.valueOf(p27Var.f464223f)) && n51.f.a(java.lang.Integer.valueOf(this.f464224g), java.lang.Integer.valueOf(p27Var.f464224g)) && n51.f.a(java.lang.Integer.valueOf(this.f464225h), java.lang.Integer.valueOf(p27Var.f464225h));
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
            fVar.e(2, this.f464221d);
            fVar.h(3, this.f464222e);
            fVar.e(4, this.f464223f);
            fVar.e(5, this.f464224g);
            fVar.e(6, this.f464225h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f464221d) + b36.f.h(3, this.f464222e) + b36.f.e(4, this.f464223f) + b36.f.e(5, this.f464224g) + b36.f.e(6, this.f464225h);
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
        r45.p27 p27Var = (r45.p27) objArr[1];
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
                    p27Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                p27Var.f464221d = aVar2.g(intValue);
                return 0;
            case 3:
                p27Var.f464222e = aVar2.i(intValue);
                return 0;
            case 4:
                p27Var.f464223f = aVar2.g(intValue);
                return 0;
            case 5:
                p27Var.f464224g = aVar2.g(intValue);
                return 0;
            case 6:
                p27Var.f464225h = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
