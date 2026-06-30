package r45;

/* loaded from: classes7.dex */
public class ux1 extends r45.js5 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f469247e;

    /* renamed from: f, reason: collision with root package name */
    public int f469248f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f469246d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f469249g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ux1)) {
            return false;
        }
        r45.ux1 ux1Var = (r45.ux1) fVar;
        return n51.f.a(this.f76492x92037252, ux1Var.f76492x92037252) && n51.f.a(this.f469246d, ux1Var.f469246d) && n51.f.a(this.f469247e, ux1Var.f469247e) && n51.f.a(java.lang.Integer.valueOf(this.f469248f), java.lang.Integer.valueOf(ux1Var.f469248f)) && n51.f.a(this.f469249g, ux1Var.f469249g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469249g;
        java.util.LinkedList linkedList2 = this.f469246d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f469247e;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            fVar.e(4, this.f469248f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, linkedList2);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f469247e;
            if (gVar2 != null) {
                i18 += b36.f.b(3, gVar2);
            }
            return i18 + b36.f.e(4, this.f469248f) + b36.f.g(5, 8, linkedList);
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
        r45.ux1 ux1Var = (r45.ux1) objArr[1];
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
                ux1Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ay1 ay1Var = new r45.ay1();
                if (bArr3 != null && bArr3.length > 0) {
                    ay1Var.mo11468x92b714fd(bArr3);
                }
                ux1Var.f469246d.add(ay1Var);
            }
            return 0;
        }
        if (intValue == 3) {
            ux1Var.f469247e = aVar2.d(intValue);
            return 0;
        }
        if (intValue == 4) {
            ux1Var.f469248f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.cy1 cy1Var = new r45.cy1();
            if (bArr4 != null && bArr4.length > 0) {
                cy1Var.mo11468x92b714fd(bArr4);
            }
            ux1Var.f469249g.add(cy1Var);
        }
        return 0;
    }
}
