package r45;

/* loaded from: classes4.dex */
public class g93 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456542d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456543e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456544f;

    /* renamed from: g, reason: collision with root package name */
    public long f456545g;

    /* renamed from: h, reason: collision with root package name */
    public long f456546h;

    /* renamed from: i, reason: collision with root package name */
    public long f456547i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456548m;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.g93)) {
            return false;
        }
        r45.g93 g93Var = (r45.g93) fVar;
        return n51.f.a(this.f76494x2de60e5e, g93Var.f76494x2de60e5e) && n51.f.a(this.f456542d, g93Var.f456542d) && n51.f.a(this.f456543e, g93Var.f456543e) && n51.f.a(this.f456544f, g93Var.f456544f) && n51.f.a(java.lang.Long.valueOf(this.f456545g), java.lang.Long.valueOf(g93Var.f456545g)) && n51.f.a(java.lang.Long.valueOf(this.f456546h), java.lang.Long.valueOf(g93Var.f456546h)) && n51.f.a(java.lang.Long.valueOf(this.f456547i), java.lang.Long.valueOf(g93Var.f456547i)) && n51.f.a(this.f456548m, g93Var.f456548m);
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
            java.lang.String str = this.f456542d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f456543e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f456544f;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            fVar.h(5, this.f456545g);
            fVar.h(6, this.f456546h);
            fVar.h(7, this.f456547i);
            java.lang.String str4 = this.f456548m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str5 = this.f456542d;
            if (str5 != null) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f456543e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f456544f;
            if (str7 != null) {
                i18 += b36.f.j(4, str7);
            }
            int h17 = i18 + b36.f.h(5, this.f456545g) + b36.f.h(6, this.f456546h) + b36.f.h(7, this.f456547i);
            java.lang.String str8 = this.f456548m;
            return str8 != null ? h17 + b36.f.j(8, str8) : h17;
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
        r45.g93 g93Var = (r45.g93) objArr[1];
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
                    g93Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                g93Var.f456542d = aVar2.k(intValue);
                return 0;
            case 3:
                g93Var.f456543e = aVar2.k(intValue);
                return 0;
            case 4:
                g93Var.f456544f = aVar2.k(intValue);
                return 0;
            case 5:
                g93Var.f456545g = aVar2.i(intValue);
                return 0;
            case 6:
                g93Var.f456546h = aVar2.i(intValue);
                return 0;
            case 7:
                g93Var.f456547i = aVar2.i(intValue);
                return 0;
            case 8:
                g93Var.f456548m = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
