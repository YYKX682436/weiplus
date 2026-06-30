package r45;

/* loaded from: classes4.dex */
public class fs4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456120d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456121e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456122f;

    /* renamed from: g, reason: collision with root package name */
    public r45.hf2 f456123g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.fs4)) {
            return false;
        }
        r45.fs4 fs4Var = (r45.fs4) fVar;
        return n51.f.a(this.f456120d, fs4Var.f456120d) && n51.f.a(this.f456121e, fs4Var.f456121e) && n51.f.a(this.f456122f, fs4Var.f456122f) && n51.f.a(this.f456123g, fs4Var.f456123g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456120d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456121e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456122f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            r45.hf2 hf2Var = this.f456123g;
            if (hf2Var != null) {
                fVar.i(4, hf2Var.mo75928xcd1e8d8());
                this.f456123g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f456120d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f456121e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456122f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            r45.hf2 hf2Var2 = this.f456123g;
            return hf2Var2 != null ? j17 + b36.f.i(4, hf2Var2.mo75928xcd1e8d8()) : j17;
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
        r45.fs4 fs4Var = (r45.fs4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            fs4Var.f456120d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            fs4Var.f456121e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            fs4Var.f456122f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.hf2 hf2Var3 = new r45.hf2();
            if (bArr != null && bArr.length > 0) {
                hf2Var3.mo11468x92b714fd(bArr);
            }
            fs4Var.f456123g = hf2Var3;
        }
        return 0;
    }
}
