package r45;

/* loaded from: classes2.dex */
public class mv3 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.gq f462376d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bz3 f462377e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rl6 f462378f;

    /* renamed from: g, reason: collision with root package name */
    public r45.rl6 f462379g;

    /* renamed from: h, reason: collision with root package name */
    public r45.i74 f462380h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f462381i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f462382m;

    /* renamed from: n, reason: collision with root package name */
    public r45.lv3 f462383n;

    /* renamed from: o, reason: collision with root package name */
    public r45.kv3 f462384o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mv3)) {
            return false;
        }
        r45.mv3 mv3Var = (r45.mv3) fVar;
        return n51.f.a(this.f462376d, mv3Var.f462376d) && n51.f.a(this.f462377e, mv3Var.f462377e) && n51.f.a(this.f462378f, mv3Var.f462378f) && n51.f.a(this.f462379g, mv3Var.f462379g) && n51.f.a(this.f462380h, mv3Var.f462380h) && n51.f.a(this.f462381i, mv3Var.f462381i) && n51.f.a(this.f462382m, mv3Var.f462382m) && n51.f.a(this.f462383n, mv3Var.f462383n) && n51.f.a(this.f462384o, mv3Var.f462384o);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f462381i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.gq gqVar = this.f462376d;
            if (gqVar != null) {
                fVar.i(1, gqVar.mo75928xcd1e8d8());
                this.f462376d.mo75956x3d5d1f78(fVar);
            }
            r45.bz3 bz3Var = this.f462377e;
            if (bz3Var != null) {
                fVar.i(2, bz3Var.mo75928xcd1e8d8());
                this.f462377e.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var = this.f462378f;
            if (rl6Var != null) {
                fVar.i(3, rl6Var.mo75928xcd1e8d8());
                this.f462378f.mo75956x3d5d1f78(fVar);
            }
            r45.rl6 rl6Var2 = this.f462379g;
            if (rl6Var2 != null) {
                fVar.i(4, rl6Var2.mo75928xcd1e8d8());
                this.f462379g.mo75956x3d5d1f78(fVar);
            }
            r45.i74 i74Var = this.f462380h;
            if (i74Var != null) {
                fVar.i(5, i74Var.mo75928xcd1e8d8());
                this.f462380h.mo75956x3d5d1f78(fVar);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str = this.f462382m;
            if (str != null) {
                fVar.j(7, str);
            }
            r45.lv3 lv3Var = this.f462383n;
            if (lv3Var != null) {
                fVar.i(8, lv3Var.mo75928xcd1e8d8());
                this.f462383n.mo75956x3d5d1f78(fVar);
            }
            r45.kv3 kv3Var = this.f462384o;
            if (kv3Var != null) {
                fVar.i(9, kv3Var.mo75928xcd1e8d8());
                this.f462384o.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.gq gqVar2 = this.f462376d;
            int i18 = gqVar2 != null ? 0 + b36.f.i(1, gqVar2.mo75928xcd1e8d8()) : 0;
            r45.bz3 bz3Var2 = this.f462377e;
            if (bz3Var2 != null) {
                i18 += b36.f.i(2, bz3Var2.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var3 = this.f462378f;
            if (rl6Var3 != null) {
                i18 += b36.f.i(3, rl6Var3.mo75928xcd1e8d8());
            }
            r45.rl6 rl6Var4 = this.f462379g;
            if (rl6Var4 != null) {
                i18 += b36.f.i(4, rl6Var4.mo75928xcd1e8d8());
            }
            r45.i74 i74Var2 = this.f462380h;
            if (i74Var2 != null) {
                i18 += b36.f.i(5, i74Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(6, 8, linkedList);
            java.lang.String str2 = this.f462382m;
            if (str2 != null) {
                g17 += b36.f.j(7, str2);
            }
            r45.lv3 lv3Var2 = this.f462383n;
            if (lv3Var2 != null) {
                g17 += b36.f.i(8, lv3Var2.mo75928xcd1e8d8());
            }
            r45.kv3 kv3Var2 = this.f462384o;
            return kv3Var2 != null ? g17 + b36.f.i(9, kv3Var2.mo75928xcd1e8d8()) : g17;
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
        r45.mv3 mv3Var = (r45.mv3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    r45.gq gqVar3 = new r45.gq();
                    if (bArr2 != null && bArr2.length > 0) {
                        gqVar3.mo11468x92b714fd(bArr2);
                    }
                    mv3Var.f462376d = gqVar3;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.bz3 bz3Var3 = new r45.bz3();
                    if (bArr3 != null && bArr3.length > 0) {
                        bz3Var3.mo11468x92b714fd(bArr3);
                    }
                    mv3Var.f462377e = bz3Var3;
                }
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.rl6 rl6Var5 = new r45.rl6();
                    if (bArr4 != null && bArr4.length > 0) {
                        rl6Var5.mo11468x92b714fd(bArr4);
                    }
                    mv3Var.f462378f = rl6Var5;
                }
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.rl6 rl6Var6 = new r45.rl6();
                    if (bArr5 != null && bArr5.length > 0) {
                        rl6Var6.mo11468x92b714fd(bArr5);
                    }
                    mv3Var.f462379g = rl6Var6;
                }
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.i74 i74Var3 = new r45.i74();
                    if (bArr6 != null && bArr6.length > 0) {
                        i74Var3.mo11468x92b714fd(bArr6);
                    }
                    mv3Var.f462380h = i74Var3;
                }
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr7 = (byte[]) j29.get(i38);
                    r45.gq gqVar4 = new r45.gq();
                    if (bArr7 != null && bArr7.length > 0) {
                        gqVar4.mo11468x92b714fd(bArr7);
                    }
                    mv3Var.f462381i.add(gqVar4);
                }
                return 0;
            case 7:
                mv3Var.f462382m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr8 = (byte[]) j37.get(i39);
                    r45.lv3 lv3Var3 = new r45.lv3();
                    if (bArr8 != null && bArr8.length > 0) {
                        lv3Var3.mo11468x92b714fd(bArr8);
                    }
                    mv3Var.f462383n = lv3Var3;
                }
                return 0;
            case 9:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr9 = (byte[]) j38.get(i47);
                    r45.kv3 kv3Var3 = new r45.kv3();
                    if (bArr9 != null && bArr9.length > 0) {
                        kv3Var3.mo11468x92b714fd(bArr9);
                    }
                    mv3Var.f462384o = kv3Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
