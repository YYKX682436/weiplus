package r45;

/* loaded from: classes10.dex */
public class vx1 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.kv0 f470167d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f470168e;

    /* renamed from: f, reason: collision with root package name */
    public long f470169f;

    /* renamed from: g, reason: collision with root package name */
    public long f470170g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f470171h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f470172i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f470173m;

    /* renamed from: n, reason: collision with root package name */
    public int f470174n;

    public com.p314xaae8f345.mm.p944x882e457a.i b() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 9223;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderlivektvsearchmusicsmartbox";
        lVar.f152197a = this;
        lVar.f152198b = new r45.wx1();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i wi6 = ((pc2.e) ((zy2.x5) i95.n0.c(zy2.x5.class))).wi();
        wi6.p(a17);
        return wi6;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vx1)) {
            return false;
        }
        r45.vx1 vx1Var = (r45.vx1) fVar;
        return n51.f.a(this.f76494x2de60e5e, vx1Var.f76494x2de60e5e) && n51.f.a(this.f470167d, vx1Var.f470167d) && n51.f.a(this.f470168e, vx1Var.f470168e) && n51.f.a(java.lang.Long.valueOf(this.f470169f), java.lang.Long.valueOf(vx1Var.f470169f)) && n51.f.a(java.lang.Long.valueOf(this.f470170g), java.lang.Long.valueOf(vx1Var.f470170g)) && n51.f.a(this.f470171h, vx1Var.f470171h) && n51.f.a(this.f470172i, vx1Var.f470172i) && n51.f.a(this.f470173m, vx1Var.f470173m) && n51.f.a(java.lang.Integer.valueOf(this.f470174n), java.lang.Integer.valueOf(vx1Var.f470174n));
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
            r45.kv0 kv0Var = this.f470167d;
            if (kv0Var != null) {
                fVar.i(2, kv0Var.mo75928xcd1e8d8());
                this.f470167d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f470168e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f470169f);
            fVar.h(5, this.f470170g);
            java.lang.String str2 = this.f470171h;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f470172i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f470173m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.e(9, this.f470174n);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.kv0 kv0Var2 = this.f470167d;
            if (kv0Var2 != null) {
                i18 += b36.f.i(2, kv0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str5 = this.f470168e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int h17 = i18 + b36.f.h(4, this.f470169f) + b36.f.h(5, this.f470170g);
            java.lang.String str6 = this.f470171h;
            if (str6 != null) {
                h17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f470172i;
            if (str7 != null) {
                h17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f470173m;
            if (str8 != null) {
                h17 += b36.f.j(8, str8);
            }
            return h17 + b36.f.e(9, this.f470174n);
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
        r45.vx1 vx1Var = (r45.vx1) objArr[1];
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
                    vx1Var.f76494x2de60e5e = heVar3;
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
                    vx1Var.f470167d = kv0Var3;
                }
                return 0;
            case 3:
                vx1Var.f470168e = aVar2.k(intValue);
                return 0;
            case 4:
                vx1Var.f470169f = aVar2.i(intValue);
                return 0;
            case 5:
                vx1Var.f470170g = aVar2.i(intValue);
                return 0;
            case 6:
                vx1Var.f470171h = aVar2.k(intValue);
                return 0;
            case 7:
                vx1Var.f470172i = aVar2.k(intValue);
                return 0;
            case 8:
                vx1Var.f470173m = aVar2.k(intValue);
                return 0;
            case 9:
                vx1Var.f470174n = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
