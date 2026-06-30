package r45;

/* loaded from: classes9.dex */
public class lh5 extends r45.js5 {

    /* renamed from: f, reason: collision with root package name */
    public long f461019f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f461020g;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f461022i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f461023m;

    /* renamed from: n, reason: collision with root package name */
    public r45.b16 f461024n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f461025o;

    /* renamed from: p, reason: collision with root package name */
    public r45.q f461026p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tw4 f461027q;

    /* renamed from: d, reason: collision with root package name */
    public int f461017d = 268513600;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f461018e = "请求不成功，请稍候再试";

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f461021h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lh5)) {
            return false;
        }
        r45.lh5 lh5Var = (r45.lh5) fVar;
        return n51.f.a(this.f76492x92037252, lh5Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461017d), java.lang.Integer.valueOf(lh5Var.f461017d)) && n51.f.a(this.f461018e, lh5Var.f461018e) && n51.f.a(java.lang.Long.valueOf(this.f461019f), java.lang.Long.valueOf(lh5Var.f461019f)) && n51.f.a(this.f461020g, lh5Var.f461020g) && n51.f.a(this.f461021h, lh5Var.f461021h) && n51.f.a(this.f461022i, lh5Var.f461022i) && n51.f.a(this.f461023m, lh5Var.f461023m) && n51.f.a(this.f461024n, lh5Var.f461024n) && n51.f.a(this.f461025o, lh5Var.f461025o) && n51.f.a(this.f461026p, lh5Var.f461026p) && n51.f.a(this.f461027q, lh5Var.f461027q);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461021h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461017d);
            java.lang.String str = this.f461018e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.h(4, this.f461019f);
            java.lang.String str2 = this.f461020g;
            if (str2 != null) {
                fVar.j(5, str2);
            }
            fVar.g(6, 8, linkedList);
            java.lang.String str3 = this.f461022i;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f461023m;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            r45.b16 b16Var = this.f461024n;
            if (b16Var != null) {
                fVar.i(9, b16Var.mo75928xcd1e8d8());
                this.f461024n.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str5 = this.f461025o;
            if (str5 != null) {
                fVar.j(10, str5);
            }
            r45.q qVar = this.f461026p;
            if (qVar != null) {
                fVar.i(11, qVar.mo75928xcd1e8d8());
                this.f461026p.mo75956x3d5d1f78(fVar);
            }
            r45.tw4 tw4Var = this.f461027q;
            if (tw4Var == null) {
                return 0;
            }
            fVar.i(12, tw4Var.mo75928xcd1e8d8());
            this.f461027q.mo75956x3d5d1f78(fVar);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f461017d);
            java.lang.String str6 = this.f461018e;
            if (str6 != null) {
                i18 += b36.f.j(3, str6);
            }
            int h17 = i18 + b36.f.h(4, this.f461019f);
            java.lang.String str7 = this.f461020g;
            if (str7 != null) {
                h17 += b36.f.j(5, str7);
            }
            int g17 = h17 + b36.f.g(6, 8, linkedList);
            java.lang.String str8 = this.f461022i;
            if (str8 != null) {
                g17 += b36.f.j(7, str8);
            }
            java.lang.String str9 = this.f461023m;
            if (str9 != null) {
                g17 += b36.f.j(8, str9);
            }
            r45.b16 b16Var2 = this.f461024n;
            if (b16Var2 != null) {
                g17 += b36.f.i(9, b16Var2.mo75928xcd1e8d8());
            }
            java.lang.String str10 = this.f461025o;
            if (str10 != null) {
                g17 += b36.f.j(10, str10);
            }
            r45.q qVar2 = this.f461026p;
            if (qVar2 != null) {
                g17 += b36.f.i(11, qVar2.mo75928xcd1e8d8());
            }
            r45.tw4 tw4Var2 = this.f461027q;
            return tw4Var2 != null ? g17 + b36.f.i(12, tw4Var2.mo75928xcd1e8d8()) : g17;
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
        r45.lh5 lh5Var = (r45.lh5) objArr[1];
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
                    lh5Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                lh5Var.f461017d = aVar2.g(intValue);
                return 0;
            case 3:
                lh5Var.f461018e = aVar2.k(intValue);
                return 0;
            case 4:
                lh5Var.f461019f = aVar2.i(intValue);
                return 0;
            case 5:
                lh5Var.f461020g = aVar2.k(intValue);
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    r45.o oVar = new r45.o();
                    if (bArr3 != null && bArr3.length > 0) {
                        oVar.mo11468x92b714fd(bArr3);
                    }
                    lh5Var.f461021h.add(oVar);
                }
                return 0;
            case 7:
                lh5Var.f461022i = aVar2.k(intValue);
                return 0;
            case 8:
                lh5Var.f461023m = aVar2.k(intValue);
                return 0;
            case 9:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr4 = (byte[]) j19.get(i28);
                    r45.b16 b16Var3 = new r45.b16();
                    if (bArr4 != null && bArr4.length > 0) {
                        b16Var3.mo11468x92b714fd(bArr4);
                    }
                    lh5Var.f461024n = b16Var3;
                }
                return 0;
            case 10:
                lh5Var.f461025o = aVar2.k(intValue);
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr5 = (byte[]) j27.get(i29);
                    r45.q qVar3 = new r45.q();
                    if (bArr5 != null && bArr5.length > 0) {
                        qVar3.mo11468x92b714fd(bArr5);
                    }
                    lh5Var.f461026p = qVar3;
                }
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr6 = (byte[]) j28.get(i37);
                    r45.tw4 tw4Var3 = new r45.tw4();
                    if (bArr6 != null && bArr6.length > 0) {
                        tw4Var3.mo11468x92b714fd(bArr6);
                    }
                    lh5Var.f461027q = tw4Var3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
