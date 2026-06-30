package r45;

/* loaded from: classes4.dex */
public class gq3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f457012d;

    /* renamed from: e, reason: collision with root package name */
    public int f457013e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f457014f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f457015g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gq3)) {
            return false;
        }
        r45.gq3 gq3Var = (r45.gq3) fVar;
        return n51.f.a(this.f76492x92037252, gq3Var.f76492x92037252) && n51.f.a(this.f457012d, gq3Var.f457012d) && n51.f.a(java.lang.Integer.valueOf(this.f457013e), java.lang.Integer.valueOf(gq3Var.f457013e)) && n51.f.a(this.f457014f, gq3Var.f457014f) && n51.f.a(this.f457015g, gq3Var.f457015g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457015g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f457012d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f457013e);
            java.lang.String str2 = this.f457014f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str3 = this.f457012d;
            if (str3 != null) {
                i18 += b36.f.j(2, str3);
            }
            int e17 = i18 + b36.f.e(3, this.f457013e);
            java.lang.String str4 = this.f457014f;
            if (str4 != null) {
                e17 += b36.f.j(4, str4);
            }
            return e17 + b36.f.g(5, 1, linkedList);
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
        r45.gq3 gq3Var = (r45.gq3) objArr[1];
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
                gq3Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            gq3Var.f457012d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            gq3Var.f457013e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            gq3Var.f457014f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        gq3Var.f457015g.add(aVar2.k(intValue));
        return 0;
    }
}
