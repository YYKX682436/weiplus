package r45;

/* loaded from: classes2.dex */
public class xi2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f471662d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f471663e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ts4 f471664f;

    /* renamed from: g, reason: collision with root package name */
    public r45.d7 f471665g;

    /* renamed from: h, reason: collision with root package name */
    public r45.fc6 f471666h;

    /* renamed from: i, reason: collision with root package name */
    public long f471667i;

    /* renamed from: m, reason: collision with root package name */
    public r45.sd1 f471668m;

    /* renamed from: n, reason: collision with root package name */
    public r45.sd1 f471669n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.xi2)) {
            return false;
        }
        r45.xi2 xi2Var = (r45.xi2) fVar;
        return n51.f.a(this.f76492x92037252, xi2Var.f76492x92037252) && n51.f.a(this.f471662d, xi2Var.f471662d) && n51.f.a(this.f471663e, xi2Var.f471663e) && n51.f.a(this.f471664f, xi2Var.f471664f) && n51.f.a(this.f471665g, xi2Var.f471665g) && n51.f.a(this.f471666h, xi2Var.f471666h) && n51.f.a(java.lang.Long.valueOf(this.f471667i), java.lang.Long.valueOf(xi2Var.f471667i)) && n51.f.a(this.f471668m, xi2Var.f471668m) && n51.f.a(this.f471669n, xi2Var.f471669n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f471662d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f471663e;
            if (c19782x23db1cfa != null) {
                fVar.i(3, c19782x23db1cfa.mo75928xcd1e8d8());
                this.f471663e.mo75956x3d5d1f78(fVar);
            }
            r45.ts4 ts4Var = this.f471664f;
            if (ts4Var != null) {
                fVar.i(21, ts4Var.mo75928xcd1e8d8());
                this.f471664f.mo75956x3d5d1f78(fVar);
            }
            r45.d7 d7Var = this.f471665g;
            if (d7Var != null) {
                fVar.i(22, d7Var.mo75928xcd1e8d8());
                this.f471665g.mo75956x3d5d1f78(fVar);
            }
            r45.fc6 fc6Var = this.f471666h;
            if (fc6Var != null) {
                fVar.i(23, fc6Var.mo75928xcd1e8d8());
                this.f471666h.mo75956x3d5d1f78(fVar);
            }
            fVar.h(27, this.f471667i);
            r45.sd1 sd1Var = this.f471668m;
            if (sd1Var != null) {
                fVar.i(28, sd1Var.mo75928xcd1e8d8());
                this.f471668m.mo75956x3d5d1f78(fVar);
            }
            r45.sd1 sd1Var2 = this.f471669n;
            if (sd1Var2 != null) {
                fVar.i(29, sd1Var2.mo75928xcd1e8d8());
                this.f471669n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = this.f471663e;
            if (c19782x23db1cfa2 != null) {
                i18 += b36.f.i(3, c19782x23db1cfa2.mo75928xcd1e8d8());
            }
            r45.ts4 ts4Var2 = this.f471664f;
            if (ts4Var2 != null) {
                i18 += b36.f.i(21, ts4Var2.mo75928xcd1e8d8());
            }
            r45.d7 d7Var2 = this.f471665g;
            if (d7Var2 != null) {
                i18 += b36.f.i(22, d7Var2.mo75928xcd1e8d8());
            }
            r45.fc6 fc6Var2 = this.f471666h;
            if (fc6Var2 != null) {
                i18 += b36.f.i(23, fc6Var2.mo75928xcd1e8d8());
            }
            int h17 = i18 + b36.f.h(27, this.f471667i);
            r45.sd1 sd1Var3 = this.f471668m;
            if (sd1Var3 != null) {
                h17 += b36.f.i(28, sd1Var3.mo75928xcd1e8d8());
            }
            r45.sd1 sd1Var4 = this.f471669n;
            return sd1Var4 != null ? h17 + b36.f.i(29, sd1Var4.mo75928xcd1e8d8()) : h17;
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
        r45.xi2 xi2Var = (r45.xi2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                xi2Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                if (bArr3 != null && bArr3.length > 0) {
                    c19792x256d2725.mo11468x92b714fd(bArr3);
                }
                xi2Var.f471662d.add(c19792x256d2725);
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa();
                if (bArr4 != null && bArr4.length > 0) {
                    c19782x23db1cfa3.mo11468x92b714fd(bArr4);
                }
                xi2Var.f471663e = c19782x23db1cfa3;
            }
            return 0;
        }
        switch (intValue) {
            case 21:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.ts4 ts4Var3 = new r45.ts4();
                    if (bArr5 != null && bArr5.length > 0) {
                        ts4Var3.mo11468x92b714fd(bArr5);
                    }
                    xi2Var.f471664f = ts4Var3;
                }
                return 0;
            case 22:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.d7 d7Var3 = new r45.d7();
                    if (bArr6 != null && bArr6.length > 0) {
                        d7Var3.mo11468x92b714fd(bArr6);
                    }
                    xi2Var.f471665g = d7Var3;
                }
                return 0;
            case 23:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.fc6 fc6Var3 = new r45.fc6();
                    if (bArr7 != null && bArr7.length > 0) {
                        fc6Var3.mo11468x92b714fd(bArr7);
                    }
                    xi2Var.f471666h = fc6Var3;
                }
                return 0;
            default:
                switch (intValue) {
                    case 27:
                        xi2Var.f471667i = aVar2.i(intValue);
                        return 0;
                    case 28:
                        java.util.LinkedList j37 = aVar2.j(intValue);
                        int size7 = j37.size();
                        for (int i39 = 0; i39 < size7; i39++) {
                            byte[] bArr8 = (byte[]) j37.get(i39);
                            r45.sd1 sd1Var5 = new r45.sd1();
                            if (bArr8 != null && bArr8.length > 0) {
                                sd1Var5.mo11468x92b714fd(bArr8);
                            }
                            xi2Var.f471668m = sd1Var5;
                        }
                        return 0;
                    case 29:
                        java.util.LinkedList j38 = aVar2.j(intValue);
                        int size8 = j38.size();
                        for (int i47 = 0; i47 < size8; i47++) {
                            byte[] bArr9 = (byte[]) j38.get(i47);
                            r45.sd1 sd1Var6 = new r45.sd1();
                            if (bArr9 != null && bArr9.length > 0) {
                                sd1Var6.mo11468x92b714fd(bArr9);
                            }
                            xi2Var.f471669n = sd1Var6;
                        }
                        return 0;
                    default:
                        return -1;
                }
        }
    }
}
