package r45;

/* loaded from: classes10.dex */
public class p64 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f464325d;

    /* renamed from: e, reason: collision with root package name */
    public r45.o64 f464326e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464327f;

    /* renamed from: g, reason: collision with root package name */
    public r45.v75 f464328g;

    /* renamed from: h, reason: collision with root package name */
    public r45.r64 f464329h;

    static {
        new r45.p64();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.p64 mo11468x92b714fd(byte[] bArr) {
        return (r45.p64) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p64)) {
            return false;
        }
        r45.p64 p64Var = (r45.p64) fVar;
        return n51.f.a(this.f464325d, p64Var.f464325d) && n51.f.a(this.f464326e, p64Var.f464326e) && n51.f.a(this.f464327f, p64Var.f464327f) && n51.f.a(this.f464328g, p64Var.f464328g) && n51.f.a(this.f464329h, p64Var.f464329h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.p64();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f464325d;
            if (str != null) {
                fVar.j(1, str);
            }
            r45.o64 o64Var = this.f464326e;
            if (o64Var != null) {
                fVar.i(2, o64Var.mo75928xcd1e8d8());
                this.f464326e.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f464327f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.v75 v75Var = this.f464328g;
            if (v75Var != null) {
                fVar.i(4, v75Var.mo75928xcd1e8d8());
                this.f464328g.mo75956x3d5d1f78(fVar);
            }
            r45.r64 r64Var = this.f464329h;
            if (r64Var != null) {
                fVar.i(5, r64Var.mo75928xcd1e8d8());
                this.f464329h.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f464325d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            r45.o64 o64Var2 = this.f464326e;
            if (o64Var2 != null) {
                j17 += b36.f.i(2, o64Var2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f464327f;
            if (str4 != null) {
                j17 += b36.f.j(3, str4);
            }
            r45.v75 v75Var2 = this.f464328g;
            if (v75Var2 != null) {
                j17 += b36.f.i(4, v75Var2.mo75928xcd1e8d8());
            }
            r45.r64 r64Var2 = this.f464329h;
            return r64Var2 != null ? j17 + b36.f.i(5, r64Var2.mo75928xcd1e8d8()) : j17;
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f464325d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size = j18.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j18.get(i18);
                r45.o64 o64Var3 = new r45.o64();
                if (bArr != null && bArr.length > 0) {
                    o64Var3.mo11468x92b714fd(bArr);
                }
                this.f464326e = o64Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            this.f464327f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size2 = j19.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j19.get(i19);
                r45.v75 v75Var3 = new r45.v75();
                if (bArr2 != null && bArr2.length > 0) {
                    v75Var3.mo11468x92b714fd(bArr2);
                }
                this.f464328g = v75Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size3 = j27.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j27.get(i27);
            r45.r64 r64Var3 = new r45.r64();
            if (bArr3 != null && bArr3.length > 0) {
                r64Var3.mo11468x92b714fd(bArr3);
            }
            this.f464329h = r64Var3;
        }
        return 0;
    }
}
