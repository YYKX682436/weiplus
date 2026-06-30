package r45;

/* loaded from: classes9.dex */
public class wl6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470795e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nm6 f470796f;

    /* renamed from: g, reason: collision with root package name */
    public r45.q74 f470797g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wl6)) {
            return false;
        }
        r45.wl6 wl6Var = (r45.wl6) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470794d), java.lang.Integer.valueOf(wl6Var.f470794d)) && n51.f.a(this.f470795e, wl6Var.f470795e) && n51.f.a(this.f470796f, wl6Var.f470796f) && n51.f.a(this.f470797g, wl6Var.f470797g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470794d);
            java.lang.String str = this.f470795e;
            if (str != null) {
                fVar.j(2, str);
            }
            r45.nm6 nm6Var = this.f470796f;
            if (nm6Var != null) {
                fVar.i(3, nm6Var.mo75928xcd1e8d8());
                this.f470796f.mo75956x3d5d1f78(fVar);
            }
            r45.q74 q74Var = this.f470797g;
            if (q74Var != null) {
                fVar.i(4, q74Var.mo75928xcd1e8d8());
                this.f470797g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f470794d) + 0;
            java.lang.String str2 = this.f470795e;
            if (str2 != null) {
                e17 += b36.f.j(2, str2);
            }
            r45.nm6 nm6Var2 = this.f470796f;
            if (nm6Var2 != null) {
                e17 += b36.f.i(3, nm6Var2.mo75928xcd1e8d8());
            }
            r45.q74 q74Var2 = this.f470797g;
            return q74Var2 != null ? e17 + b36.f.i(4, q74Var2.mo75928xcd1e8d8()) : e17;
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
        r45.wl6 wl6Var = (r45.wl6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wl6Var.f470794d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            wl6Var.f470795e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                r45.nm6 nm6Var3 = new r45.nm6();
                if (bArr != null && bArr.length > 0) {
                    nm6Var3.mo11468x92b714fd(bArr);
                }
                wl6Var.f470796f = nm6Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            r45.q74 q74Var3 = new r45.q74();
            if (bArr2 != null && bArr2.length > 0) {
                q74Var3.mo11468x92b714fd(bArr2);
            }
            wl6Var.f470797g = q74Var3;
        }
        return 0;
    }
}
