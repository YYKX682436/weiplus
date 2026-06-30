package r45;

/* loaded from: classes4.dex */
public class ss0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f467492d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f467493e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f467494f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f467495g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ss0)) {
            return false;
        }
        r45.ss0 ss0Var = (r45.ss0) fVar;
        return n51.f.a(this.f76492x92037252, ss0Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f467492d), java.lang.Integer.valueOf(ss0Var.f467492d)) && n51.f.a(this.f467493e, ss0Var.f467493e) && n51.f.a(this.f467494f, ss0Var.f467494f) && n51.f.a(this.f467495g, ss0Var.f467495g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f467495g;
        java.util.LinkedList linkedList2 = this.f467494f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f467492d);
            java.lang.String str = this.f467493e;
            if (str != null) {
                fVar.j(3, str);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f467492d);
            java.lang.String str2 = this.f467493e;
            if (str2 != null) {
                i18 += b36.f.j(3, str2);
            }
            return i18 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
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
        r45.ss0 ss0Var = (r45.ss0) objArr[1];
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
                ss0Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ss0Var.f467492d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            ss0Var.f467493e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            ss0Var.f467494f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        ss0Var.f467495g.add(aVar2.k(intValue));
        return 0;
    }
}
