package r45;

/* loaded from: classes8.dex */
public class s07 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f466903d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f466904e;

    /* renamed from: f, reason: collision with root package name */
    public r45.y07 f466905f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f466906g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.s07)) {
            return false;
        }
        r45.s07 s07Var = (r45.s07) fVar;
        return n51.f.a(this.f76494x2de60e5e, s07Var.f76494x2de60e5e) && n51.f.a(this.f466903d, s07Var.f466903d) && n51.f.a(this.f466904e, s07Var.f466904e) && n51.f.a(this.f466905f, s07Var.f466905f) && n51.f.a(this.f466906g, s07Var.f466906g);
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
            java.lang.String str = this.f466903d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f466904e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            r45.y07 y07Var = this.f466905f;
            if (y07Var != null) {
                fVar.i(4, y07Var.mo75928xcd1e8d8());
                this.f466905f.mo75956x3d5d1f78(fVar);
            }
            fVar.g(5, 8, this.f466906g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f466903d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            java.lang.String str4 = this.f466904e;
            if (str4 != null) {
                i18 += b36.f.j(3, str4);
            }
            r45.y07 y07Var2 = this.f466905f;
            if (y07Var2 != null) {
                i18 += b36.f.i(4, y07Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(5, 8, this.f466906g);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f466906g.clear();
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
        r45.s07 s07Var = (r45.s07) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                s07Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            s07Var.f466903d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            s07Var.f466904e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.y07 y07Var3 = new r45.y07();
                if (bArr3 != null && bArr3.length > 0) {
                    y07Var3.mo11468x92b714fd(bArr3);
                }
                s07Var.f466905f = y07Var3;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.r07 r07Var = new r45.r07();
            if (bArr4 != null && bArr4.length > 0) {
                r07Var.mo11468x92b714fd(bArr4);
            }
            s07Var.f466906g.add(r07Var);
        }
        return 0;
    }
}
