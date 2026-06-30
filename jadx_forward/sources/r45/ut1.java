package r45;

/* loaded from: classes8.dex */
public class ut1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f469165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469166e;

    /* renamed from: f, reason: collision with root package name */
    public long f469167f;

    /* renamed from: g, reason: collision with root package name */
    public long f469168g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469169h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f469170i;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 14940;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivegetnewsongplayinfo";
        lVar.f152197a = this;
        lVar.f152198b = new r45.vt1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ut1)) {
            return false;
        }
        r45.ut1 ut1Var = (r45.ut1) fVar;
        return n51.f.a(this.f76494x2de60e5e, ut1Var.f76494x2de60e5e) && n51.f.a(this.f469165d, ut1Var.f469165d) && n51.f.a(this.f469166e, ut1Var.f469166e) && n51.f.a(java.lang.Long.valueOf(this.f469167f), java.lang.Long.valueOf(ut1Var.f469167f)) && n51.f.a(java.lang.Long.valueOf(this.f469168g), java.lang.Long.valueOf(ut1Var.f469168g)) && n51.f.a(this.f469169h, ut1Var.f469169h) && n51.f.a(this.f469170i, ut1Var.f469170i);
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
            r45.kv0 kv0Var = this.f469165d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f469165d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f469166e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f469167f);
            fVar.h(5, this.f469168g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469169h;
            if (gVar != null) {
                fVar.b(6, gVar);
            }
            java.lang.String str2 = this.f469170i;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f469165d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str3 = this.f469166e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            int h17 = i18 + b36.f.h(4, this.f469167f) + b36.f.h(5, this.f469168g);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469169h;
            if (gVar2 != null) {
                h17 += b36.f.b(6, gVar2);
            }
            java.lang.String str4 = this.f469170i;
            return str4 != null ? h17 + b36.f.j(7, str4) : h17;
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
        r45.ut1 ut1Var = (r45.ut1) objArr[1];
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
                    ut1Var.f76494x2de60e5e = heVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.kv0 kv0Var3 = new r45.kv0();
                    if (bArr2 != null && bArr2.length > 0) {
                        kv0Var3.mo11468x92b714fd(bArr2);
                    }
                    ut1Var.f469165d = kv0Var3;
                }
                return 0;
            case 3:
                ut1Var.f469166e = aVar2.k(intValue);
                return 0;
            case 4:
                ut1Var.f469167f = aVar2.i(intValue);
                return 0;
            case 5:
                ut1Var.f469168g = aVar2.i(intValue);
                return 0;
            case 6:
                ut1Var.f469169h = aVar2.d(intValue);
                return 0;
            case 7:
                ut1Var.f469170i = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
