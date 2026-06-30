package r45;

/* loaded from: classes2.dex */
public class me0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f461918d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461919e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f461920f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461921g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f461922h;

    /* renamed from: i, reason: collision with root package name */
    public int f461923i;

    /* renamed from: m, reason: collision with root package name */
    public int f461924m;

    /* renamed from: n, reason: collision with root package name */
    public r45.pe0 f461925n;

    /* renamed from: o, reason: collision with root package name */
    public r45.oe0 f461926o;

    /* renamed from: p, reason: collision with root package name */
    public r45.bz3 f461927p;

    /* renamed from: q, reason: collision with root package name */
    public r45.qe0 f461928q;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.me0)) {
            return false;
        }
        r45.me0 me0Var = (r45.me0) fVar;
        return n51.f.a(this.f461918d, me0Var.f461918d) && n51.f.a(this.f461919e, me0Var.f461919e) && n51.f.a(this.f461920f, me0Var.f461920f) && n51.f.a(this.f461921g, me0Var.f461921g) && n51.f.a(this.f461922h, me0Var.f461922h) && n51.f.a(java.lang.Integer.valueOf(this.f461923i), java.lang.Integer.valueOf(me0Var.f461923i)) && n51.f.a(java.lang.Integer.valueOf(this.f461924m), java.lang.Integer.valueOf(me0Var.f461924m)) && n51.f.a(this.f461925n, me0Var.f461925n) && n51.f.a(this.f461926o, me0Var.f461926o) && n51.f.a(this.f461927p, me0Var.f461927p) && n51.f.a(this.f461928q, me0Var.f461928q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461918d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f461919e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f461920f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f461921g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f461922h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            fVar.e(6, this.f461923i);
            fVar.e(7, this.f461924m);
            r45.pe0 pe0Var = this.f461925n;
            if (pe0Var != null) {
                fVar.i(8, pe0Var.mo75928xcd1e8d8());
                this.f461925n.mo75956x3d5d1f78(fVar);
            }
            r45.oe0 oe0Var = this.f461926o;
            if (oe0Var != null) {
                fVar.i(9, oe0Var.mo75928xcd1e8d8());
                this.f461926o.mo75956x3d5d1f78(fVar);
            }
            r45.bz3 bz3Var = this.f461927p;
            if (bz3Var != null) {
                fVar.i(10, bz3Var.mo75928xcd1e8d8());
                this.f461927p.mo75956x3d5d1f78(fVar);
            }
            r45.qe0 qe0Var = this.f461928q;
            if (qe0Var != null) {
                fVar.i(11, qe0Var.mo75928xcd1e8d8());
                this.f461928q.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str5 = this.f461919e;
            if (str5 != null) {
                g17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f461920f;
            if (str6 != null) {
                g17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f461921g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f461922h;
            if (str8 != null) {
                g17 += b36.f.j(5, str8);
            }
            int e17 = g17 + b36.f.e(6, this.f461923i) + b36.f.e(7, this.f461924m);
            r45.pe0 pe0Var2 = this.f461925n;
            if (pe0Var2 != null) {
                e17 += b36.f.i(8, pe0Var2.mo75928xcd1e8d8());
            }
            r45.oe0 oe0Var2 = this.f461926o;
            if (oe0Var2 != null) {
                e17 += b36.f.i(9, oe0Var2.mo75928xcd1e8d8());
            }
            r45.bz3 bz3Var2 = this.f461927p;
            if (bz3Var2 != null) {
                e17 += b36.f.i(10, bz3Var2.mo75928xcd1e8d8());
            }
            r45.qe0 qe0Var2 = this.f461928q;
            return qe0Var2 != null ? e17 + b36.f.i(11, qe0Var2.mo75928xcd1e8d8()) : e17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.me0 me0Var = (r45.me0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ne0 ne0Var = new r45.ne0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ne0Var.mo11468x92b714fd(bArr2);
                    }
                    me0Var.f461918d.add(ne0Var);
                }
                return 0;
            case 2:
                me0Var.f461919e = aVar2.k(intValue);
                return 0;
            case 3:
                me0Var.f461920f = aVar2.k(intValue);
                return 0;
            case 4:
                me0Var.f461921g = aVar2.k(intValue);
                return 0;
            case 5:
                me0Var.f461922h = aVar2.k(intValue);
                return 0;
            case 6:
                me0Var.f461923i = aVar2.g(intValue);
                return 0;
            case 7:
                me0Var.f461924m = aVar2.g(intValue);
                return 0;
            case 8:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.pe0 pe0Var3 = new r45.pe0();
                    if (bArr3 != null && bArr3.length > 0) {
                        pe0Var3.mo11468x92b714fd(bArr3);
                    }
                    me0Var.f461925n = pe0Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.oe0 oe0Var3 = new r45.oe0();
                    if (bArr4 != null && bArr4.length > 0) {
                        oe0Var3.mo11468x92b714fd(bArr4);
                    }
                    me0Var.f461926o = oe0Var3;
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr5 != null && bArr5.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr5);
                    }
                    me0Var.f461927p = bz3Var3;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    r45.qe0 qe0Var3 = new r45.qe0();
                    if (bArr6 != null && bArr6.length > 0) {
                        qe0Var3.mo11468x92b714fd(bArr6);
                    }
                    me0Var.f461928q = qe0Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
