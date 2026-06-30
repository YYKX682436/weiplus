package r45;

/* loaded from: classes8.dex */
public class hu4 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f457981d;

    /* renamed from: f, reason: collision with root package name */
    public int f457983f;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f457982e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f457984g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hu4)) {
            return false;
        }
        r45.hu4 hu4Var = (r45.hu4) fVar;
        return n51.f.a(this.f76492x92037252, hu4Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f457981d), java.lang.Integer.valueOf(hu4Var.f457981d)) && n51.f.a(this.f457982e, hu4Var.f457982e) && n51.f.a(java.lang.Integer.valueOf(this.f457983f), java.lang.Integer.valueOf(hu4Var.f457983f)) && n51.f.a(this.f457984g, hu4Var.f457984g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457984g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f457981d);
            fVar.g(3, 8, this.f457982e);
            fVar.e(4, this.f457983f);
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            return (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f457981d) + b36.f.g(3, 8, this.f457982e) + b36.f.e(4, this.f457983f) + b36.f.g(5, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f457982e.clear();
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
        r45.hu4 hu4Var = (r45.hu4) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                hu4Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            hu4Var.f457981d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.ku4 ku4Var = new r45.ku4();
                if (bArr3 != null && bArr3.length > 0) {
                    ku4Var.mo11468x92b714fd(bArr3);
                }
                hu4Var.f457982e.add(ku4Var);
            }
            return 0;
        }
        if (intValue == 4) {
            hu4Var.f457983f = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr4 = (byte[]) j19.get(i27);
            r45.e53 e53Var = new r45.e53();
            if (bArr4 != null && bArr4.length > 0) {
                e53Var.mo11468x92b714fd(bArr4);
            }
            hu4Var.f457984g.add(e53Var);
        }
        return 0;
    }
}
