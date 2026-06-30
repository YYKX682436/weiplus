package r45;

/* loaded from: classes4.dex */
public class rx extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f466788d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466789e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466790f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466791g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f466792h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f466793i;

    /* renamed from: m, reason: collision with root package name */
    public int f466794m;

    /* renamed from: n, reason: collision with root package name */
    public r45.e77 f466795n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f466796o;

    /* renamed from: p, reason: collision with root package name */
    public r45.yt5 f466797p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.rx)) {
            return false;
        }
        r45.rx rxVar = (r45.rx) fVar;
        return n51.f.a(this.f76492x92037252, rxVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f466788d), java.lang.Integer.valueOf(rxVar.f466788d)) && n51.f.a(this.f466789e, rxVar.f466789e) && n51.f.a(this.f466790f, rxVar.f466790f) && n51.f.a(this.f466791g, rxVar.f466791g) && n51.f.a(java.lang.Boolean.valueOf(this.f466792h), java.lang.Boolean.valueOf(rxVar.f466792h)) && n51.f.a(this.f466793i, rxVar.f466793i) && n51.f.a(java.lang.Integer.valueOf(this.f466794m), java.lang.Integer.valueOf(rxVar.f466794m)) && n51.f.a(this.f466795n, rxVar.f466795n) && n51.f.a(java.lang.Boolean.valueOf(this.f466796o), java.lang.Boolean.valueOf(rxVar.f466796o)) && n51.f.a(this.f466797p, rxVar.f466797p);
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
            fVar.e(2, this.f466788d);
            java.lang.String str = this.f466789e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f466790f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f466791g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.a(6, this.f466792h);
            java.lang.String str4 = this.f466793i;
            if (str4 != null) {
                fVar.j(7, str4);
            }
            fVar.e(8, this.f466794m);
            r45.e77 e77Var = this.f466795n;
            if (e77Var != null) {
                fVar.i(9, e77Var.mo75928xcd1e8d8());
                this.f466795n.mo75956x3d5d1f78(fVar);
            }
            fVar.a(10, this.f466796o);
            r45.yt5 yt5Var = this.f466797p;
            if (yt5Var != null) {
                fVar.i(11, yt5Var.mo75928xcd1e8d8());
                this.f466797p.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466788d);
            java.lang.String str5 = this.f466789e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f466790f;
            if (str6 != null) {
                i18 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f466791g;
            if (str7 != null) {
                i18 += b36.f.j(5, str7);
            }
            int a17 = i18 + b36.f.a(6, this.f466792h);
            java.lang.String str8 = this.f466793i;
            if (str8 != null) {
                a17 += b36.f.j(7, str8);
            }
            int e17 = a17 + b36.f.e(8, this.f466794m);
            r45.e77 e77Var2 = this.f466795n;
            if (e77Var2 != null) {
                e17 += b36.f.i(9, e77Var2.mo75928xcd1e8d8());
            }
            int a18 = e17 + b36.f.a(10, this.f466796o);
            r45.yt5 yt5Var2 = this.f466797p;
            return yt5Var2 != null ? a18 + b36.f.i(11, yt5Var2.mo75928xcd1e8d8()) : a18;
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
        r45.rx rxVar = (r45.rx) objArr[1];
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
                    rxVar.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                rxVar.f466788d = aVar2.g(intValue);
                return 0;
            case 3:
                rxVar.f466789e = aVar2.k(intValue);
                return 0;
            case 4:
                rxVar.f466790f = aVar2.k(intValue);
                return 0;
            case 5:
                rxVar.f466791g = aVar2.k(intValue);
                return 0;
            case 6:
                rxVar.f466792h = aVar2.c(intValue);
                return 0;
            case 7:
                rxVar.f466793i = aVar2.k(intValue);
                return 0;
            case 8:
                rxVar.f466794m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.e77 e77Var3 = new r45.e77();
                    if (bArr2 != null && bArr2.length > 0) {
                        e77Var3.mo11468x92b714fd(bArr2);
                    }
                    rxVar.f466795n = e77Var3;
                }
                return 0;
            case 10:
                rxVar.f466796o = aVar2.c(intValue);
                return 0;
            case 11:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    r45.yt5 yt5Var3 = new r45.yt5();
                    if (bArr3 != null && bArr3.length > 0) {
                        yt5Var3.mo11468x92b714fd(bArr3);
                    }
                    rxVar.f466797p = yt5Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
