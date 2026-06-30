package r45;

/* loaded from: classes2.dex */
public class pr4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public long f464861d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464862e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464863f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464864g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f464865h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.pr4)) {
            return false;
        }
        r45.pr4 pr4Var = (r45.pr4) fVar;
        return n51.f.a(this.f76492x92037252, pr4Var.f76492x92037252) && n51.f.a(java.lang.Long.valueOf(this.f464861d), java.lang.Long.valueOf(pr4Var.f464861d)) && n51.f.a(this.f464862e, pr4Var.f464862e) && n51.f.a(this.f464863f, pr4Var.f464863f) && n51.f.a(this.f464864g, pr4Var.f464864g) && n51.f.a(this.f464865h, pr4Var.f464865h);
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
            fVar.h(2, this.f464861d);
            java.lang.String str = this.f464862e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f464863f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f464864g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f464865h;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.h(2, this.f464861d);
            java.lang.String str5 = this.f464862e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f464863f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f464864g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f464865h;
            return str8 != null ? i18 + b36.f.j(6, str8) : i18;
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
        r45.pr4 pr4Var = (r45.pr4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr != null && bArr.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr);
                    }
                    pr4Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                pr4Var.f464861d = aVar2.i(intValue);
                return 0;
            case 3:
                pr4Var.f464862e = aVar2.k(intValue);
                return 0;
            case 4:
                pr4Var.f464863f = aVar2.k(intValue);
                return 0;
            case 5:
                pr4Var.f464864g = aVar2.k(intValue);
                return 0;
            case 6:
                pr4Var.f464865h = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
