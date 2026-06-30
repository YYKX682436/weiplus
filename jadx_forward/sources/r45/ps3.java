package r45;

/* loaded from: classes2.dex */
public class ps3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f464907d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f464908e;

    /* renamed from: f, reason: collision with root package name */
    public int f464909f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f464910g;

    /* renamed from: h, reason: collision with root package name */
    public r45.q35 f464911h;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f464913m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f464914n;

    /* renamed from: o, reason: collision with root package name */
    public int f464915o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f464916p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f464917q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f464918r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f464919s;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f464912i = new java.util.LinkedList();

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f464920t = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ps3)) {
            return false;
        }
        r45.ps3 ps3Var = (r45.ps3) fVar;
        return n51.f.a(this.f76492x92037252, ps3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f464907d), java.lang.Integer.valueOf(ps3Var.f464907d)) && n51.f.a(this.f464908e, ps3Var.f464908e) && n51.f.a(java.lang.Integer.valueOf(this.f464909f), java.lang.Integer.valueOf(ps3Var.f464909f)) && n51.f.a(this.f464910g, ps3Var.f464910g) && n51.f.a(this.f464911h, ps3Var.f464911h) && n51.f.a(this.f464912i, ps3Var.f464912i) && n51.f.a(this.f464913m, ps3Var.f464913m) && n51.f.a(this.f464914n, ps3Var.f464914n) && n51.f.a(java.lang.Integer.valueOf(this.f464915o), java.lang.Integer.valueOf(ps3Var.f464915o)) && n51.f.a(this.f464916p, ps3Var.f464916p) && n51.f.a(this.f464917q, ps3Var.f464917q) && n51.f.a(this.f464918r, ps3Var.f464918r) && n51.f.a(this.f464919s, ps3Var.f464919s) && n51.f.a(this.f464920t, ps3Var.f464920t);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f464920t;
        java.util.LinkedList linkedList2 = this.f464912i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f464907d);
            java.lang.String str = this.f464908e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.e(4, this.f464909f);
            java.lang.String str2 = this.f464910g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            r45.q35 q35Var = this.f464911h;
            if (q35Var != null) {
                fVar.i(6, q35Var.mo75928xcd1e8d8());
                this.f464911h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(7, 8, linkedList2);
            java.lang.String str3 = this.f464913m;
            if (str3 != null) {
                fVar.j(8, str3);
            }
            java.lang.String str4 = this.f464914n;
            if (str4 != null) {
                fVar.j(9, str4);
            }
            fVar.e(10, this.f464915o);
            java.lang.String str5 = this.f464916p;
            if (str5 != null) {
                fVar.j(11, str5);
            }
            java.lang.String str6 = this.f464917q;
            if (str6 != null) {
                fVar.j(12, str6);
            }
            java.lang.String str7 = this.f464918r;
            if (str7 != null) {
                fVar.j(13, str7);
            }
            java.lang.String str8 = this.f464919s;
            if (str8 != null) {
                fVar.j(14, str8);
            }
            fVar.g(16, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? b36.f.i(1, ieVar2.mo75928xcd1e8d8()) + 0 : 0) + b36.f.e(2, this.f464907d);
            java.lang.String str9 = this.f464908e;
            if (str9 != null) {
                i18 += b36.f.j(3, str9);
            }
            int e17 = i18 + b36.f.e(4, this.f464909f);
            java.lang.String str10 = this.f464910g;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            r45.q35 q35Var2 = this.f464911h;
            if (q35Var2 != null) {
                e17 += b36.f.i(6, q35Var2.mo75928xcd1e8d8());
            }
            int g17 = e17 + b36.f.g(7, 8, linkedList2);
            java.lang.String str11 = this.f464913m;
            if (str11 != null) {
                g17 += b36.f.j(8, str11);
            }
            java.lang.String str12 = this.f464914n;
            if (str12 != null) {
                g17 += b36.f.j(9, str12);
            }
            int e18 = g17 + b36.f.e(10, this.f464915o);
            java.lang.String str13 = this.f464916p;
            if (str13 != null) {
                e18 += b36.f.j(11, str13);
            }
            java.lang.String str14 = this.f464917q;
            if (str14 != null) {
                e18 += b36.f.j(12, str14);
            }
            java.lang.String str15 = this.f464918r;
            if (str15 != null) {
                e18 += b36.f.j(13, str15);
            }
            java.lang.String str16 = this.f464919s;
            if (str16 != null) {
                e18 += b36.f.j(14, str16);
            }
            return e18 + b36.f.g(16, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.ps3 ps3Var = (r45.ps3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    ps3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ps3Var.f464907d = aVar2.g(intValue);
                return 0;
            case 3:
                ps3Var.f464908e = aVar2.k(intValue);
                return 0;
            case 4:
                ps3Var.f464909f = aVar2.g(intValue);
                return 0;
            case 5:
                ps3Var.f464910g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.q35 q35Var3 = new r45.q35();
                    if (bArr3 != null && bArr3.length > 0) {
                        q35Var3.mo11468x92b714fd(bArr3);
                    }
                    ps3Var.f464911h = q35Var3;
                }
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.xp4 xp4Var = new r45.xp4();
                    if (bArr4 != null && bArr4.length > 0) {
                        xp4Var.mo11468x92b714fd(bArr4);
                    }
                    ps3Var.f464912i.add(xp4Var);
                }
                return 0;
            case 8:
                ps3Var.f464913m = aVar2.k(intValue);
                return 0;
            case 9:
                ps3Var.f464914n = aVar2.k(intValue);
                return 0;
            case 10:
                ps3Var.f464915o = aVar2.g(intValue);
                return 0;
            case 11:
                ps3Var.f464916p = aVar2.k(intValue);
                return 0;
            case 12:
                ps3Var.f464917q = aVar2.k(intValue);
                return 0;
            case 13:
                ps3Var.f464918r = aVar2.k(intValue);
                return 0;
            case 14:
                ps3Var.f464919s = aVar2.k(intValue);
                return 0;
            case 15:
            default:
                return -1;
            case 16:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ee7 ee7Var = new r45.ee7();
                    if (bArr5 != null && bArr5.length > 0) {
                        ee7Var.mo11468x92b714fd(bArr5);
                    }
                    ps3Var.f464920t.add(ee7Var);
                }
                return 0;
        }
    }
}
