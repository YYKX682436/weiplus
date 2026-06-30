package r45;

/* loaded from: classes4.dex */
public class ke0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460150d;

    /* renamed from: e, reason: collision with root package name */
    public r45.he0 f460151e;

    /* renamed from: f, reason: collision with root package name */
    public r45.he0 f460152f;

    /* renamed from: g, reason: collision with root package name */
    public int f460153g;

    /* renamed from: h, reason: collision with root package name */
    public int f460154h;

    /* renamed from: i, reason: collision with root package name */
    public int f460155i;

    /* renamed from: m, reason: collision with root package name */
    public int f460156m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ke0)) {
            return false;
        }
        r45.ke0 ke0Var = (r45.ke0) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460150d), java.lang.Integer.valueOf(ke0Var.f460150d)) && n51.f.a(this.f460151e, ke0Var.f460151e) && n51.f.a(this.f460152f, ke0Var.f460152f) && n51.f.a(java.lang.Integer.valueOf(this.f460153g), java.lang.Integer.valueOf(ke0Var.f460153g)) && n51.f.a(java.lang.Integer.valueOf(this.f460154h), java.lang.Integer.valueOf(ke0Var.f460154h)) && n51.f.a(java.lang.Integer.valueOf(this.f460155i), java.lang.Integer.valueOf(ke0Var.f460155i)) && n51.f.a(java.lang.Integer.valueOf(this.f460156m), java.lang.Integer.valueOf(ke0Var.f460156m));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460150d);
            r45.he0 he0Var = this.f460151e;
            if (he0Var != null) {
                fVar.i(2, he0Var.mo75928xcd1e8d8());
                this.f460151e.mo75956x3d5d1f78(fVar);
            }
            r45.he0 he0Var2 = this.f460152f;
            if (he0Var2 != null) {
                fVar.i(3, he0Var2.mo75928xcd1e8d8());
                this.f460152f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(4, this.f460153g);
            fVar.e(5, this.f460154h);
            fVar.e(6, this.f460155i);
            fVar.e(7, this.f460156m);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460150d) + 0;
            r45.he0 he0Var3 = this.f460151e;
            if (he0Var3 != null) {
                e17 += b36.f.i(2, he0Var3.mo75928xcd1e8d8());
            }
            r45.he0 he0Var4 = this.f460152f;
            if (he0Var4 != null) {
                e17 += b36.f.i(3, he0Var4.mo75928xcd1e8d8());
            }
            return e17 + b36.f.e(4, this.f460153g) + b36.f.e(5, this.f460154h) + b36.f.e(6, this.f460155i) + b36.f.e(7, this.f460156m);
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
        r45.ke0 ke0Var = (r45.ke0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ke0Var.f460150d = aVar2.g(intValue);
                return 0;
            case 2:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.he0 he0Var5 = new r45.he0();
                    if (bArr != null && bArr.length > 0) {
                        he0Var5.mo11468x92b714fd(bArr);
                    }
                    ke0Var.f460151e = he0Var5;
                }
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    r45.he0 he0Var6 = new r45.he0();
                    if (bArr2 != null && bArr2.length > 0) {
                        he0Var6.mo11468x92b714fd(bArr2);
                    }
                    ke0Var.f460152f = he0Var6;
                }
                return 0;
            case 4:
                ke0Var.f460153g = aVar2.g(intValue);
                return 0;
            case 5:
                ke0Var.f460154h = aVar2.g(intValue);
                return 0;
            case 6:
                ke0Var.f460155i = aVar2.g(intValue);
                return 0;
            case 7:
                ke0Var.f460156m = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
