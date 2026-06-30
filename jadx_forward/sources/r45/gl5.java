package r45;

/* loaded from: classes4.dex */
public class gl5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456866d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456867e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456868f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456869g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456870h;

    /* renamed from: i, reason: collision with root package name */
    public int f456871i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f456872m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f456873n;

    /* renamed from: o, reason: collision with root package name */
    public int f456874o;

    static {
        new r45.gl5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gl5)) {
            return false;
        }
        r45.gl5 gl5Var = (r45.gl5) fVar;
        return n51.f.a(this.f456866d, gl5Var.f456866d) && n51.f.a(this.f456867e, gl5Var.f456867e) && n51.f.a(this.f456868f, gl5Var.f456868f) && n51.f.a(this.f456869g, gl5Var.f456869g) && n51.f.a(this.f456870h, gl5Var.f456870h) && n51.f.a(java.lang.Integer.valueOf(this.f456871i), java.lang.Integer.valueOf(gl5Var.f456871i)) && n51.f.a(this.f456872m, gl5Var.f456872m) && n51.f.a(this.f456873n, gl5Var.f456873n) && n51.f.a(java.lang.Integer.valueOf(this.f456874o), java.lang.Integer.valueOf(gl5Var.f456874o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.gl5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f456866d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f456867e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f456868f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f456869g;
            if (gVar != null) {
                fVar.b(4, gVar);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f456870h;
            if (gVar2 != null) {
                fVar.b(5, gVar2);
            }
            fVar.e(6, this.f456871i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar3 = this.f456872m;
            if (gVar3 != null) {
                fVar.b(7, gVar3);
            }
            java.lang.String str4 = this.f456873n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f456874o);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f456866d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f456867e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f456868f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar4 = this.f456869g;
            if (gVar4 != null) {
                j17 += b36.f.b(4, gVar4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar5 = this.f456870h;
            if (gVar5 != null) {
                j17 += b36.f.b(5, gVar5);
            }
            int e17 = j17 + b36.f.e(6, this.f456871i);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar6 = this.f456872m;
            if (gVar6 != null) {
                e17 += b36.f.b(7, gVar6);
            }
            java.lang.String str8 = this.f456873n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.e(9, this.f456874o);
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
        switch (intValue) {
            case 1:
                this.f456866d = aVar2.k(intValue);
                return 0;
            case 2:
                this.f456867e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f456868f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f456869g = aVar2.d(intValue);
                return 0;
            case 5:
                this.f456870h = aVar2.d(intValue);
                return 0;
            case 6:
                this.f456871i = aVar2.g(intValue);
                return 0;
            case 7:
                this.f456872m = aVar2.d(intValue);
                return 0;
            case 8:
                this.f456873n = aVar2.k(intValue);
                return 0;
            case 9:
                this.f456874o = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.gl5) super.mo11468x92b714fd(bArr);
    }
}
