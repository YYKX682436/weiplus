package r45;

/* loaded from: classes4.dex */
public class q36 extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.cu5 f465166d;

    /* renamed from: e, reason: collision with root package name */
    public int f465167e;

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f465168f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cu5 f465169g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.q36)) {
            return false;
        }
        r45.q36 q36Var = (r45.q36) fVar;
        return n51.f.a(this.f76494x2de60e5e, q36Var.f76494x2de60e5e) && n51.f.a(this.f465166d, q36Var.f465166d) && n51.f.a(java.lang.Integer.valueOf(this.f465167e), java.lang.Integer.valueOf(q36Var.f465167e)) && n51.f.a(this.f465168f, q36Var.f465168f) && n51.f.a(this.f465169g, q36Var.f465169g);
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
            r45.cu5 cu5Var = this.f465166d;
            if (cu5Var != null) {
                fVar.i(2, cu5Var.mo75928xcd1e8d8());
                this.f465166d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(3, this.f465167e);
            r45.cu5 cu5Var2 = this.f465168f;
            if (cu5Var2 != null) {
                fVar.i(4, cu5Var2.mo75928xcd1e8d8());
                this.f465168f.mo75956x3d5d1f78(fVar);
            }
            r45.cu5 cu5Var3 = this.f465169g;
            if (cu5Var3 != null) {
                fVar.i(5, cu5Var3.mo75928xcd1e8d8());
                this.f465169g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            r45.cu5 cu5Var4 = this.f465166d;
            if (cu5Var4 != null) {
                i18 += b36.f.i(2, cu5Var4.mo75928xcd1e8d8());
            }
            int e17 = i18 + b36.f.e(3, this.f465167e);
            r45.cu5 cu5Var5 = this.f465168f;
            if (cu5Var5 != null) {
                e17 += b36.f.i(4, cu5Var5.mo75928xcd1e8d8());
            }
            r45.cu5 cu5Var6 = this.f465169g;
            return cu5Var6 != null ? e17 + b36.f.i(5, cu5Var6.mo75928xcd1e8d8()) : e17;
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
        r45.q36 q36Var = (r45.q36) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                q36Var.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var7 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var7.b(bArr2);
                }
                q36Var.f465166d = cu5Var7;
            }
            return 0;
        }
        if (intValue == 3) {
            q36Var.f465167e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr3 = (byte[]) j19.get(i28);
                r45.cu5 cu5Var8 = new r45.cu5();
                if (bArr3 != null && bArr3.length > 0) {
                    cu5Var8.b(bArr3);
                }
                q36Var.f465168f = cu5Var8;
            }
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr4 = (byte[]) j27.get(i29);
            r45.cu5 cu5Var9 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var9.b(bArr4);
            }
            q36Var.f465169g = cu5Var9;
        }
        return 0;
    }
}
