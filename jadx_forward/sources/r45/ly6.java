package r45;

/* loaded from: classes11.dex */
public class ly6 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461513d;

    /* renamed from: e, reason: collision with root package name */
    public int f461514e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461516g;

    /* renamed from: h, reason: collision with root package name */
    public int f461517h;

    /* renamed from: m, reason: collision with root package name */
    public int f461519m;

    /* renamed from: o, reason: collision with root package name */
    public r45.cu5 f461521o;

    /* renamed from: p, reason: collision with root package name */
    public r45.cu5 f461522p;

    /* renamed from: q, reason: collision with root package name */
    public int f461523q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f461524r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f461525s;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f461515f = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public java.util.LinkedList f461518i = new java.util.LinkedList();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f461520n = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ly6)) {
            return false;
        }
        r45.ly6 ly6Var = (r45.ly6) fVar;
        return n51.f.a(this.f76494x2de60e5e, ly6Var.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f461513d), java.lang.Integer.valueOf(ly6Var.f461513d)) && n51.f.a(java.lang.Integer.valueOf(this.f461514e), java.lang.Integer.valueOf(ly6Var.f461514e)) && n51.f.a(this.f461515f, ly6Var.f461515f) && n51.f.a(this.f461516g, ly6Var.f461516g) && n51.f.a(java.lang.Integer.valueOf(this.f461517h), java.lang.Integer.valueOf(ly6Var.f461517h)) && n51.f.a(this.f461518i, ly6Var.f461518i) && n51.f.a(java.lang.Integer.valueOf(this.f461519m), java.lang.Integer.valueOf(ly6Var.f461519m)) && n51.f.a(this.f461520n, ly6Var.f461520n) && n51.f.a(this.f461521o, ly6Var.f461521o) && n51.f.a(this.f461522p, ly6Var.f461522p) && n51.f.a(java.lang.Integer.valueOf(this.f461523q), java.lang.Integer.valueOf(ly6Var.f461523q)) && n51.f.a(this.f461524r, ly6Var.f461524r) && n51.f.a(this.f461525s, ly6Var.f461525s);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461520n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461513d);
            fVar.e(3, this.f461514e);
            fVar.g(4, 8, this.f461515f);
            java.lang.String str = this.f461516g;
            if (str != null) {
                fVar.j(5, str);
            }
            fVar.e(6, this.f461517h);
            fVar.k(7, 2, this.f461518i);
            fVar.e(8, this.f461519m);
            fVar.g(9, 8, linkedList);
            r45.cu5 cu5Var = this.f461521o;
            if (cu5Var != null) {
                fVar.i(10, cu5Var.mo75928xcd1e8d8());
                this.f461521o.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var2 = this.f461522p;
            if (cu5Var2 != null) {
                fVar.i(11, cu5Var2.mo75928xcd1e8d8());
                this.f461522p.mo75956x3d5d1f78(fVar);
            }
            fVar.e(12, this.f461523q);
            java.lang.String str2 = this.f461524r;
            if (str2 != null) {
                fVar.j(13, str2);
            }
            java.lang.String str3 = this.f461525s;
            if (str3 == null) {
                return 0;
            }
            fVar.j(14, str3);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f461513d) + b36.f.e(3, this.f461514e) + b36.f.g(4, 8, this.f461515f);
            java.lang.String str4 = this.f461516g;
            if (str4 != null) {
                i18 += b36.f.j(5, str4);
            }
            int e17 = i18 + b36.f.e(6, this.f461517h) + b36.f.k(7, 2, this.f461518i) + b36.f.e(8, this.f461519m) + b36.f.g(9, 8, linkedList);
            r45.cu5 cu5Var3 = this.f461521o;
            if (cu5Var3 != null) {
                e17 += b36.f.i(10, cu5Var3.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var4 = this.f461522p;
            if (cu5Var4 != null) {
                e17 += b36.f.i(11, cu5Var4.mo75928xcd1e8d8());
            }
            int e18 = e17 + b36.f.e(12, this.f461523q);
            java.lang.String str5 = this.f461524r;
            if (str5 != null) {
                e18 += b36.f.j(13, str5);
            }
            java.lang.String str6 = this.f461525s;
            return str6 != null ? e18 + b36.f.j(14, str6) : e18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f461515f.clear();
            this.f461518i.clear();
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
        r45.ly6 ly6Var = (r45.ly6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.he heVar3 = new r45.he();
                    if (bArr2 != null && bArr2.length > 0) {
                        heVar3.mo11468x92b714fd(bArr2);
                    }
                    ly6Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                ly6Var.f461513d = aVar2.g(intValue);
                return 0;
            case 3:
                ly6Var.f461514e = aVar2.g(intValue);
                return 0;
            case 4:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.gy6 gy6Var = new r45.gy6();
                    if (bArr3 != null && bArr3.length > 0) {
                        gy6Var.mo11468x92b714fd(bArr3);
                    }
                    ly6Var.f461515f.add(gy6Var);
                }
                return 0;
            case 5:
                ly6Var.f461516g = aVar2.k(intValue);
                return 0;
            case 6:
                ly6Var.f461517h = aVar2.g(intValue);
                return 0;
            case 7:
                byte[] bArr4 = aVar2.d(intValue).f273689a;
                d36.b unknownTagHandler = com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(unknownTagHandler, "unknownTagHandler");
                e36.a aVar3 = new e36.a(bArr4, 0, bArr4.length);
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                while (aVar3.f329129c < aVar3.f329128b) {
                    linkedList2.add(java.lang.Integer.valueOf(aVar3.f()));
                }
                ly6Var.f461518i = linkedList2;
                return 0;
            case 8:
                ly6Var.f461519m = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr5 = (byte[]) j19.get(i28);
                    r45.iy6 iy6Var = new r45.iy6();
                    if (bArr5 != null && bArr5.length > 0) {
                        iy6Var.mo11468x92b714fd(bArr5);
                    }
                    ly6Var.f461520n.add(iy6Var);
                }
                return 0;
            case 10:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr6 = (byte[]) j27.get(i29);
                    r45.cu5 cu5Var5 = new r45.cu5();
                    if (bArr6 != null && bArr6.length > 0) {
                        cu5Var5.b(bArr6);
                    }
                    ly6Var.f461521o = cu5Var5;
                }
                return 0;
            case 11:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr7 = (byte[]) j28.get(i37);
                    r45.cu5 cu5Var6 = new r45.cu5();
                    if (bArr7 != null && bArr7.length > 0) {
                        cu5Var6.b(bArr7);
                    }
                    ly6Var.f461522p = cu5Var6;
                }
                return 0;
            case 12:
                ly6Var.f461523q = aVar2.g(intValue);
                return 0;
            case 13:
                ly6Var.f461524r = aVar2.k(intValue);
                return 0;
            case 14:
                ly6Var.f461525s = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
