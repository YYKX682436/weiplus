package r45;

/* loaded from: classes8.dex */
public class ef3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f454918d;

    /* renamed from: e, reason: collision with root package name */
    public int f454919e;

    /* renamed from: h, reason: collision with root package name */
    public int f454922h;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f454920f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f454921g = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f454923i = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ef3)) {
            return false;
        }
        r45.ef3 ef3Var = (r45.ef3) fVar;
        return n51.f.a(this.f76492x92037252, ef3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f454918d), java.lang.Integer.valueOf(ef3Var.f454918d)) && n51.f.a(java.lang.Integer.valueOf(this.f454919e), java.lang.Integer.valueOf(ef3Var.f454919e)) && n51.f.a(this.f454920f, ef3Var.f454920f) && n51.f.a(this.f454921g, ef3Var.f454921g) && n51.f.a(java.lang.Integer.valueOf(this.f454922h), java.lang.Integer.valueOf(ef3Var.f454922h)) && n51.f.a(this.f454923i, ef3Var.f454923i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454923i;
        java.util.LinkedList linkedList2 = this.f454921g;
        java.util.LinkedList linkedList3 = this.f454920f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f454918d);
            fVar.e(3, this.f454919e);
            fVar.g(4, 2, linkedList3);
            fVar.g(5, 8, linkedList2);
            fVar.e(6, this.f454922h);
            fVar.g(7, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f454918d) + b36.f.e(3, this.f454919e) + b36.f.g(4, 2, linkedList3) + b36.f.g(5, 8, linkedList2) + b36.f.e(6, this.f454922h) + b36.f.g(7, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.ef3 ef3Var = (r45.ef3) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.ie ieVar3 = new r45.ie();
                    if (bArr2 != null && bArr2.length > 0) {
                        ieVar3.mo11468x92b714fd(bArr2);
                    }
                    ef3Var.f76492x92037252 = ieVar3;
                }
                return 0;
            case 2:
                ef3Var.f454918d = aVar2.g(intValue);
                return 0;
            case 3:
                ef3Var.f454919e = aVar2.g(intValue);
                return 0;
            case 4:
                ef3Var.f454920f.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
                return 0;
            case 5:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    r45.lm0 lm0Var = new r45.lm0();
                    if (bArr3 != null && bArr3.length > 0) {
                        lm0Var.mo11468x92b714fd(bArr3);
                    }
                    ef3Var.f454921g.add(lm0Var);
                }
                return 0;
            case 6:
                ef3Var.f454922h = aVar2.g(intValue);
                return 0;
            case 7:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    r45.w8 w8Var = new r45.w8();
                    if (bArr4 != null && bArr4.length > 0) {
                        w8Var.mo11468x92b714fd(bArr4);
                    }
                    ef3Var.f454923i.add(w8Var);
                }
                return 0;
            default:
                return -1;
        }
    }
}
